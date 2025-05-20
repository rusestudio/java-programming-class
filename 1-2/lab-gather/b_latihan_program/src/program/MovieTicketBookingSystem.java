package program;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class MovieTicketBookingSystem {
    private JFrame frame;
    private JComboBox<String> movieDropdown;
    private JPanel seatPanel;
    private JTextArea bookingDetailsArea;
    private JTextArea seatSelectionDetailsArea; // New text area for real-time seat details
    private JButton bookButton, viewBookingsButton;
    private ArrayList<String> bookings;

    private String[] movies = {"Avatar 2", "Oppenheimer", "The Marvels", "Joker 2", "Interstellar"};
    private int[] availableSeats = {50, 40, 30, 20, 60};
    private double[] prices = {12.99, 14.99, 10.99, 9.99, 11.49};
    private boolean[][] seatsSelected; // Track currently selected seats
    private boolean[][] bookedSeats;   // Track permanently booked seats

    public MovieTicketBookingSystem() {
        bookings = new ArrayList<>();
        seatsSelected = new boolean[5][10];
        bookedSeats = new boolean[5][10]; // Initially all seats are unbooked
        createGUI();
    }

    private void createGUI() {
        frame = new JFrame("Movie Ticket Booking System");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 600);
        frame.setLayout(new BorderLayout());

        // Title
        JLabel titleLabel = new JLabel("Movie Ticket Booking System", JLabel.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 18));
        frame.add(titleLabel, BorderLayout.NORTH);

        // Center Panel
        JPanel centerPanel = new JPanel(new BorderLayout());

        // Movie selection and seat grid
        JPanel selectionPanel = new JPanel(new BorderLayout(10, 10));

        // Movie selection
        JPanel moviePanel = new JPanel(new BorderLayout(10, 10));
        moviePanel.add(new JLabel("Select Movie:"), BorderLayout.WEST);
        movieDropdown = new JComboBox<>(movies);
        moviePanel.add(movieDropdown, BorderLayout.CENTER);

        // Seat selection details area
        seatSelectionDetailsArea = new JTextArea(3, 30);
        seatSelectionDetailsArea.setEditable(false);
        seatSelectionDetailsArea.setText("Selected Seats: 0\nTotal Price: $0.00");
        moviePanel.add(seatSelectionDetailsArea, BorderLayout.SOUTH);

        selectionPanel.add(moviePanel, BorderLayout.NORTH);

        // Seat selection grid
        seatPanel = new JPanel(new GridLayout(5, 10)); // 5 rows x 10 columns
        createSeatGrid();
        selectionPanel.add(seatPanel, BorderLayout.CENTER);

        centerPanel.add(selectionPanel, BorderLayout.CENTER);

        // Booking details area
        bookingDetailsArea = new JTextArea();
        bookingDetailsArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(bookingDetailsArea);
        scrollPane.setPreferredSize(new Dimension(250, 400));
        centerPanel.add(scrollPane, BorderLayout.EAST);

        frame.add(centerPanel, BorderLayout.CENTER);

        // Button Panel
        JPanel buttonPanel = new JPanel();
        bookButton = new JButton("Book Tickets");
        viewBookingsButton = new JButton("View All Bookings");

        buttonPanel.add(bookButton);
        buttonPanel.add(viewBookingsButton);
        frame.add(buttonPanel, BorderLayout.SOUTH);

        // Add Listeners
        addListeners();

        frame.setVisible(true);
    }

    private void createSeatGrid() {
        for (int row = 0; row < 5; row++) {
            for (int col = 0; col < 10; col++) {
                JButton seatButton = new JButton();
                seatButton.setBackground(Color.GREEN);
                seatButton.setPreferredSize(new Dimension(30, 30));
                seatButton.setActionCommand(row + "," + col); // Action command will be the row,col
                seatButton.addActionListener(new SeatButtonListener(row, col, seatButton));
                seatPanel.add(seatButton);
            }
        }
    }

    private class SeatButtonListener implements ActionListener {
        private int row, col;
        private JButton button;

        public SeatButtonListener(int row, int col, JButton button) {
            this.row = row;
            this.col = col;
            this.button = button;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            if (bookedSeats[row][col]) {
                JOptionPane.showMessageDialog(frame, "This seat is already booked.");
                return;
            }

            if (seatsSelected[row][col]) {
                button.setBackground(Color.GREEN); // Deselected
                seatsSelected[row][col] = false;
            } else {
                button.setBackground(Color.RED); // Selected
                seatsSelected[row][col] = true;
            }

            updateSeatSelectionDetails(); // Update seat selection details
        }
    }

    private void updateSeatSelectionDetails() {
        int selectedSeats = 0;
        double totalPrice = 0;
        int selectedMovieIndex = movieDropdown.getSelectedIndex();
        double ticketPrice = prices[selectedMovieIndex];

        // Count selected seats and calculate total price
        for (int row = 0; row < 5; row++) {
            for (int col = 0; col < 10; col++) {
                if (seatsSelected[row][col]) {
                    selectedSeats++;
                    totalPrice += ticketPrice;
                }
            }
        }

        // Update text area with seat selection details
        seatSelectionDetailsArea.setText(String.format("Selected Seats: %d\nTotal Price: $%.2f",
                                                       selectedSeats, totalPrice));
    }

    private void addListeners() {
        // Book button listener
        bookButton.addActionListener(e -> bookTickets());

        // View bookings listener
        viewBookingsButton.addActionListener(e -> showAllBookings());
    }

    private void bookTickets() {
        int selectedMovieIndex = movieDropdown.getSelectedIndex();
        String selectedMovie = movies[selectedMovieIndex];
        double ticketPrice = prices[selectedMovieIndex];

        // Count selected seats
        int seatsToBook = 0;
        for (int row = 0; row < 5; row++) {
            for (int col = 0; col < 10; col++) {
                if (seatsSelected[row][col] && !bookedSeats[row][col]) {
                    seatsToBook++;
                }
            }
        }

        if (seatsToBook == 0) {
            JOptionPane.showMessageDialog(frame, "Please select at least one seat to book.");
            return;
        }

        if (availableSeats[selectedMovieIndex] >= seatsToBook) {
            availableSeats[selectedMovieIndex] -= seatsToBook;
            double totalPrice = seatsToBook * ticketPrice;
            String booking = String.format("Movie: %s, Seats: %d, Total Price: $%.2f",
                                            selectedMovie, seatsToBook, totalPrice);
            bookings.add(booking);
            bookingDetailsArea.append(booking + "\n");

            // Mark selected seats as booked
            for (int row = 0; row < 5; row++) {
                for (int col = 0; col < 10; col++) {
                    if (seatsSelected[row][col]) {
                        JButton button = (JButton) seatPanel.getComponent(row * 10 + col);
                        button.setBackground(Color.GRAY); // Indicate booked
                        button.setEnabled(false);         // Disable the button
                        bookedSeats[row][col] = true;     // Mark as permanently booked
                        seatsSelected[row][col] = false; // Reset selection
                    }
                }
            }

            JOptionPane.showMessageDialog(frame, "Booking Successful!\n" + booking);
            updateSeatSelectionDetails(); // Reset seat selection details
        } else {
            JOptionPane.showMessageDialog(frame, "Not enough seats available. Remaining: " +
                                          availableSeats[selectedMovieIndex]);
        }
    }

    private void showAllBookings() {
        if (bookings.isEmpty()) {
            bookingDetailsArea.setText("No bookings yet.");
        } else {
            StringBuilder allBookings = new StringBuilder("All Bookings:\n");
            for (String booking : bookings) {
                allBookings.append(booking).append("\n");
            }
            bookingDetailsArea.setText(allBookings.toString());
        }
    }
    
    
    public static void main(String[] args) {
       new MovieTicketBookingSystem();
    }
}
