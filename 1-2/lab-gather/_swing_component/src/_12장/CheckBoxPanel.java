package _12장;

import java.awt.GridLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class CheckBoxPanel extends JPanel implements ItemListener{
	
	JCheckBox[] buttons = new JCheckBox[3];
	String[] fruits = {"apple", "grape","orange"};
	JLabel[] pictureLabel = new JLabel[3];
	ImageIcon[] icon = new ImageIcon[3];
	ImageIcon[] img = { new ImageIcon("imgs/img2.jpg"),new ImageIcon("imgs/img3.jpg"),
			new ImageIcon("imgs/img4.jpg")};
	
	
	public CheckBoxPanel() {
		super(new GridLayout(0,4));
		
		for(int i=0; i<3; i++) {
			buttons[i] = new JCheckBox(fruits[i]);
			buttons[i].addItemListener(this);
			pictureLabel[i]= new JLabel(fruits[i]+".img");
			icon[i]= img[i];
		}
		
		JPanel checkPanel = new JPanel(new GridLayout(0,1));
		for(int i=0;i<3; i++) {
			checkPanel.add(buttons[i]);
		}
		
		add(checkPanel);
		add(pictureLabel[0]);
		add(pictureLabel[1]);
		add(pictureLabel[2]);
	}
	
	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		ImageIcon img = null;
		Object source = e.getItemSelectable();
		
		for(int i=0; i<3; i++) {
			if(source==buttons[i]) {
				if(e.getStateChange()== ItemEvent.DESELECTED)
					pictureLabel[i].setIcon(null);
				else
					pictureLabel[i].setIcon(icon[i]);
				break;
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame f = new JFrame("Check box demo");
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		CheckBoxPanel p = new CheckBoxPanel();
		p.setOpaque(true);
		f.add(p);
		f.setSize(500,200);
		f.setVisible(true);

	}



	

}
