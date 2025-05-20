package _12장;

import java.awt.BorderLayout;
import java.awt.MediaTracker;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ComboBox extends JFrame implements ActionListener {
    
    JLabel label;
    ImageIcon[] img = { 
            new ImageIcon("imgs/img2.jpg"), 
            new ImageIcon("imgs/img3.jpg"),
            new ImageIcon("imgs/img4.jpg")
        };
 
    
    public ComboBox() {
        setTitle("콤보 박스");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);
        
        String[] animals = {"dog", "lion", "tiger"};
        JComboBox<String> animalList = new JComboBox<>(animals);
        animalList.setSelectedIndex(0);
        animalList.addActionListener(this);
        
        label = new JLabel();
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setIcon(img[animalList.getSelectedIndex()]); // Set the initial icon
        //changePicture(animals[animalList.getSelectedIndex()]);
        
        add(animalList, BorderLayout.PAGE_START);
        add(label, BorderLayout.PAGE_END);
        
        setVisible(true);
    }
    
    protected void changePicture(int index) {
        if (index >= 0 && index < img.length) {
            label.setIcon(img[index]);
            label.setText(null);  // Clear any text if the image is found
        } else {
            label.setIcon(null);
            label.setText("Image not found");
        }
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        JComboBox cb = (JComboBox) e.getSource();
        int selectedIndex = cb.getSelectedIndex();  // Get the selected index
        changePicture(selectedIndex); 
    }
    
    public static void main(String[] args) {
        new ComboBox();
    }
}
