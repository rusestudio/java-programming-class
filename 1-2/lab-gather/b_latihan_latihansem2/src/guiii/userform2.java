package guiii;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.text.ParseException;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSlider;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerDateModel;
import javax.swing.text.MaskFormatter;

public class userform2 extends JFrame{

	public userform2() {
		setSize(400, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("회원가입");

		// JMenu
		JMenuBar menuBar = new JMenuBar();
		JMenu menu = new JMenu("Menu");
		JMenuItem menuItem1 = new JMenuItem("Help");
		JMenuItem menuItem2 = new JMenuItem("Settings");
		menu.add(menuItem1);
		menu.add(menuItem2);
		menuBar.add(menu);
		setJMenuBar(menuBar);

		// Main Panel with GridBagLayout for better alignment
		JPanel panel1 = new JPanel(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.insets = new Insets(5, 5, 5, 5);
		gbc.fill = GridBagConstraints.HORIZONTAL;

		// Name Field
		JLabel name = new JLabel("이름:");
		gbc.gridx = 0;
		gbc.gridy = 0;
		panel1.add(name, gbc);
		JTextField lname = new JTextField();
		gbc.gridx = 1;
		gbc.gridy = 0;
		gbc.gridwidth = 2;
		panel1.add(lname, gbc);

		// Gender (JComboBox)
		JLabel sex = new JLabel("성별:");
		gbc.gridx = 0;
		gbc.gridy = 1;
		gbc.gridwidth = 1;
		panel1.add(sex, gbc);
		String gender[] = { "여자", "남자" };
		JComboBox<String> lsex = new JComboBox<>(gender);
		gbc.gridx = 1;
		gbc.gridy = 1;
		gbc.gridwidth = 2;
		panel1.add(lsex, gbc);

		// Birthday (JSpinner for date)
		JLabel bday = new JLabel("생년월일:");
		gbc.gridx = 0;
		gbc.gridy = 2;
		gbc.gridwidth = 1;
		panel1.add(bday, gbc);
		JSpinner birthdaySpinner = new JSpinner(new SpinnerDateModel());
		JSpinner.DateEditor dateEditor = new JSpinner.DateEditor(birthdaySpinner, "yyyy-MM-dd");
		birthdaySpinner.setEditor(dateEditor);
		gbc.gridx = 1;
		gbc.gridy = 2;
		gbc.gridwidth = 2;
		panel1.add(birthdaySpinner, gbc);

		// Phone number (JFormattedTextField with mask)
		JLabel phone = new JLabel("전화번호:");
		gbc.gridx = 0;
		gbc.gridy = 3;
		gbc.gridwidth = 1;
		panel1.add(phone, gbc);
		try {
			MaskFormatter phoneFormatter = new MaskFormatter("###-###-####");
			phoneFormatter.setPlaceholderCharacter('_');
			JFormattedTextField phoneFormattedField = new JFormattedTextField(phoneFormatter);
			gbc.gridx = 1;
			gbc.gridy = 3;
			gbc.gridwidth = 2;
			panel1.add(phoneFormattedField, gbc);
		} catch (ParseException e) {
			e.printStackTrace();
		}

		// Interests (JList)
		JLabel interests = new JLabel("관심사:");
		gbc.gridx = 0;
		gbc.gridy = 4;
		gbc.gridwidth = 1;
		panel1.add(interests, gbc);
		String[] interestOptions = { "음악", "영화", "독서", "운동" };
		JList<String> interestList = new JList<>(interestOptions);
		gbc.gridx = 1;
		gbc.gridy = 4;
		gbc.gridwidth = 2;
		panel1.add(interestList, gbc);

		// Rating Slider (JSlider)
		JLabel ratingLabel = new JLabel("서비스 만족도 (1-10):");
		gbc.gridx = 0;
		gbc.gridy = 5;
		gbc.gridwidth = 1;
		panel1.add(ratingLabel, gbc);
		JSlider ratingSlider = new JSlider(1, 10, 5);
		ratingSlider.setMajorTickSpacing(1);
		ratingSlider.setPaintTicks(true);
		ratingSlider.setPaintLabels(true);
		gbc.gridx = 1;
		gbc.gridy = 5;
		gbc.gridwidth = 2;
		panel1.add(ratingSlider, gbc);

		// Add panel1 to the center
		add(BorderLayout.CENTER, panel1);

		// Panel for RadioButton and CheckBox
		JPanel panel2 = new JPanel(new FlowLayout());

		// Radio Buttons for subscription type
		JLabel subLabel = new JLabel("구독 타입:");
		panel2.add(subLabel);
		JRadioButton freeSub = new JRadioButton("Free");
		JRadioButton premiumSub = new JRadioButton("Premium");
		ButtonGroup subGroup = new ButtonGroup();
		subGroup.add(freeSub);
		subGroup.add(premiumSub);
		panel2.add(freeSub);
		panel2.add(premiumSub);

		// Checkbox for terms agreement
		JCheckBox termsCheck = new JCheckBox("이용 약관에 동의합니다.");
		panel2.add(termsCheck);

		add(BorderLayout.NORTH, panel2);

		// Panel for Join and Cancel buttons
		JPanel panel3 = new JPanel(new FlowLayout());
		JButton join = new JButton("Join");
		panel3.add(join);
		JButton cancel = new JButton("Cancel");
		panel3.add(cancel);

		add(BorderLayout.SOUTH, panel3);

		// Set the frame visible
		setVisible(true);
	}

	public static void main(String[] args) {
		new userform2();
	}

}
