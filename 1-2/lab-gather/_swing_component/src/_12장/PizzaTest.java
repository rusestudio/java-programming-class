package _12장;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

class PizzaFrame extends JFrame  implements ActionListener{
	
	private int sum,temp1,temp2,temp3;
	private JButton order_button, cancel_button;
	private JPanel down_panel;
	private JTextField text;
	
	WelcomePanel welcome_panel = new WelcomePanel();
	TypePanel type_panel = new TypePanel();
	ToppingPanel topping_panel = new ToppingPanel();
	SizePanel size_panel = new SizePanel();
	
	public PizzaFrame() {
		
		setSize(500,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Pizza Ordering System");
		
		order_button = new JButton("Order");
		order_button.addActionListener(this);
		cancel_button = new JButton("Cancel");
		cancel_button.addActionListener(this);
		
		text = new JTextField();
	    text.setEditable(false);
	    text.setColumns(6);
	    
	    down_panel = new JPanel();
	    down_panel.add(order_button);
	    down_panel.add(cancel_button);
	    down_panel.add(text);
	    
	    setLayout(new BorderLayout());
	    
	    add(welcome_panel, BorderLayout.NORTH);
	    add(down_panel, BorderLayout.SOUTH);
	    add(size_panel, BorderLayout.EAST);
	    add(type_panel, BorderLayout.WEST);
	    add(topping_panel, BorderLayout.CENTER);
	    
	    setVisible(true);
	    
	}
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==order_button) {
			text.setText(" "+ 20000);
		}
		if(e.getSource()==cancel_button) {
			temp1=0;
			temp2=0;
			temp3=0;
			sum=0;
			text.setText(" "+sum);
		}
	}
}

class WelcomePanel extends JPanel {
	
	private JLabel message;
	
    public WelcomePanel() {
        message = new JLabel("Welcome to Java Swing!");
        add(message);
    }
    
}

class TypePanel extends JPanel {
	
	private JRadioButton combo, potato, bulgogi;
	private ButtonGroup bg;
	
	    public TypePanel() {
	    	setLayout(new GridLayout(3,1));
	    	
	    	combo = new JRadioButton("Combo", true);
	    	potato = new JRadioButton("Potato");
	    	bulgogi = new JRadioButton("Bulgogi");
	    	
	    	ButtonGroup bg = new ButtonGroup();
	    	bg.add(combo);
	    	bg.add(potato);
	    	bg.add(bulgogi);
	    	
	    	setBorder(BorderFactory.createTitledBorder("Select Type"));
	    	add(combo);
	    	add(potato);
	    	add(bulgogi);
	    	
	    }
}

class ToppingPanel extends JPanel {
	
	private JCheckBox pepper, cheese, peperoni, bacon;
	private ButtonGroup bg;
	
	public ToppingPanel() {
		
		setLayout(new GridLayout( 4,1));
		
		pepper = new JCheckBox("Pepper",true);
		cheese = new JCheckBox("Cheese");
		peperoni = new JCheckBox("Pepperoni");
		bacon = new JCheckBox("Bacon");
		
		bg = new ButtonGroup();
		bg.add(pepper);
		bg.add(cheese);
		bg.add(peperoni);
		bg.add(bacon);
		
		setBorder(BorderFactory.createTitledBorder("Select Topping"));
		
		add(pepper);
		add(cheese);
		add(peperoni);
		add(bacon);
		
	}
	
}

class SizePanel extends JPanel {
	private JRadioButton small, medium, large;
	private ButtonGroup bg;
	
	public SizePanel() {
		
		setLayout(new GridLayout(3,1));
        
        small = new JRadioButton("Small", true);
        medium = new JRadioButton("Medium");
        large = new JRadioButton("Large");
        
        bg = new ButtonGroup();
        bg.add(small);
        bg.add(medium);
        bg.add(large);
        
        add(small);
        add(medium);
        add(large);
        
        setBorder(BorderFactory.createTitledBorder("Select Size"));
	}

}

public class PizzaTest {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         PizzaFrame pff = new PizzaFrame();
	}
	
}
