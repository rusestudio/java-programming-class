package _12장;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.Border;



public class RadioButton extends JFrame implements ActionListener {
	
	private JRadioButton small,medium,large;
	private JLabel text;
	private JPanel topPanel,sizePanel, resultPanel;
	private Border border = BorderFactory.createTitledBorder("SIZE");
	
	public RadioButton(){
		 setTitle("라디오 버튼 테스트");
		 setSize(300, 150);
		 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 
		 topPanel= new JPanel();
		 JLabel label = new JLabel("what size of coffee to order?");
		 topPanel.add(label);
		 add(topPanel,BorderLayout.NORTH);
		 
		 sizePanel = new JPanel();
		 small = new JRadioButton("small");
		 medium = new JRadioButton("medium");
		 large = new JRadioButton("large");
		 
		 ButtonGroup size = new ButtonGroup();
		 size.add(small);
		 size.add(medium);
		 size.add(large);
		 
		 small.addActionListener(this);
		 medium.addActionListener(this);
		 large.addActionListener(this);
		 
		 sizePanel.add(small);
		 sizePanel.add(medium);
		 sizePanel.add(large);
		 sizePanel.setBorder(border);
		 add(sizePanel, BorderLayout.CENTER);
		 
		 resultPanel = new JPanel();
		 text = new JLabel("no choosen");
		 text.setForeground(Color.red);
		 resultPanel.add(text);
		 
		 add(resultPanel,BorderLayout.SOUTH);
		 setVisible(true);
		 
		 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         new RadioButton();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==small) {
			text.setText("small is choosen");
		}else if(e.getSource()==medium) {
			text.setText("medium is choosen");
		}else if(e.getSource()==large) {
			text.setText("large is choosen");
		}
	}

}
