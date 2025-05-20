package labw11;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class VendingMachine extends JFrame{
	
	private JTextField quantityField, moneyField;
	private JTextArea resultArea;
	private JComboBox<String> paymentMethodCombo;
	private ButtonGroup productGroup;
	private JRadioButton[] drinkButtons, snackButtons;
	private String[] drinks = {"콜라", "사이다", "오렌지주스", "커피", "물"};
	private String[] snacks = {"감자칩", "초콜릿", "에너지바"};
	private int[] drinkPrices = {1000, 1000, 1800, 1500, 500};
	private int[] snackPrices = {1500, 1000, 2000};
	//TODO: 필요한 필드 자유롭게 선언
	
	public VendingMachine() {
        
        setTitle("자판기");
        setSize(500, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //제품 패널
        JPanel productPanel = new JPanel(new GridLayout(2,1,0,5));
        productGroup = new ButtonGroup();
        
        JPanel drinkPanel = new JPanel(new GridLayout(0,3));
        //TODO: 음료 선택 패널 구현 
        drinkPanel.setBorder(BorderFactory.createTitledBorder("음료 선택"));
        //drinkGroup = new ButtonGroup();
        drinkButtons = new JRadioButton[drinks.length];
        for (int i = 0; i < drinks.length; i++) {
            drinkButtons[i] = new JRadioButton(drinks[i] + " (" + drinkPrices[i] + "원)");
            productGroup.add(drinkButtons[i]);
            drinkPanel.add(drinkButtons[i]);
        }
        
        JPanel snackPanel = new JPanel(new GridLayout(0,3));
        //TODO: 과자 선택 패널 구현
        snackPanel.setBorder(BorderFactory.createTitledBorder("과자 선택"));
        //snackGroup = new ButtonGroup();
        snackButtons = new JRadioButton[snacks.length];
        for (int i = 0; i < snacks.length; i++) {
            snackButtons[i] = new JRadioButton(snacks[i] + " (" + snackPrices[i] + "원)");
            productGroup.add(snackButtons[i]);
            snackPanel.add(snackButtons[i]);
        }
        
        productPanel.add(drinkPanel);
        productPanel.add(snackPanel);
        
        //수량 및 금액 입력
        JPanel inputPanel = new JPanel();
        inputPanel.add(new JLabel("수량:"));
        quantityField = new JTextField(5);
        inputPanel.add(quantityField);
        		
        inputPanel.add(new JLabel("결제 방식:"));	
        //TODO: 결제 방식 선택 콤보박스 구현
        paymentMethodCombo = new JComboBox<>(new String[]{"현금", "카드"});
        paymentMethodCombo.addActionListener(e -> {
            moneyField.setEnabled(paymentMethodCombo.getSelectedIndex() == 0);
            moneyField.setText("");
        });
        inputPanel.add(paymentMethodCombo);
        
        inputPanel.add(new JLabel("입금액(원):"));
        moneyField = new JTextField(10);
        inputPanel.add(moneyField);
        
        //TODO:결과 출력 영역(TextArea) 스크롤바 추가 하여 구현
        resultArea = new JTextArea(15, 40);
        resultArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(resultArea);
                
        //버튼 패널 
        JPanel buttonPanel = new JPanel();
        JButton orderButton = new JButton("계산");
        JButton resetButton = new JButton("취소");
        JButton exitButton = new JButton("종료");
        
        orderButton.addActionListener(e -> checkOut());
        resetButton.addActionListener(e -> resetForm());
        exitButton.addActionListener(e -> System.exit(0));
        
        buttonPanel.add(orderButton);
        buttonPanel.add(resetButton);
        buttonPanel.add(exitButton);
        
        //프레임에 추가
        JPanel panel = new JPanel(new BorderLayout());
        panel.add(productPanel, BorderLayout.CENTER);
        panel.add(inputPanel, BorderLayout.SOUTH);
        add(panel, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);//스크롤바 적용하여 구현한 결과 출력 영역을 프레임에 추가
        add(buttonPanel, BorderLayout.SOUTH);
        
        setVisible(true);
    }
	
	private void resetForm() {
		//TODO: 초기 화면
		//drinkGroup.clearSelection();
        productGroup.clearSelection();
        quantityField.setText("");
        moneyField.setText("");
        paymentMethodCombo.setSelectedIndex(0);
        moneyField.setEnabled(true);
        resultArea.setText("");
       
        
	}
	
	private void checkOut() {
		//TODO: 게산 버튼 클릭 시 동작하는 코드
		 String selectedItem = getSelectedItem();
	        if (selectedItem == null) {
	            resultArea.append("상품을 선택해 주세요.\n\n");
	            return;
	        }

	        String quantityStr = quantityField.getText();
	        if (!quantityStr.matches("\\d+")) {
	            resultArea.append("수량 또는 입금액이 올바르지 않습니다. 다시 입력해 주세요\n\n");
	            return;
	        }

	        int quantity = Integer.parseInt(quantityStr);
	        int price = getSelectedPrice();
	        int totalPrice = price * quantity;

        if (paymentMethodCombo.getSelectedIndex() == 0) { // 현금
            String moneyStr = moneyField.getText();
            if (!moneyStr.matches("\\d+")) {
                resultArea.append("수량 또는 입금액이 올바르지 않습니다. 다시 입력해 주세요\n\n");
                return;
            }
            int money = Integer.parseInt(moneyStr);
            if (money < totalPrice) {
                resultArea.append((totalPrice - money) + "원이 부족합니다. 다시 입력해 주세요\n\n");
                return;
            }
            printReceipt(selectedItem, quantity, totalPrice, money);
        } else { // 카드
            printReceipt(selectedItem, quantity, totalPrice, totalPrice);
        }

		
	}
	
	//TODO: 그외 필요한 코드 자유롭게 작성
	
	 private String getSelectedItem() {
	        for (int i = 0; i < drinkButtons.length; i++) {
	            if (drinkButtons[i].isSelected()) return drinks[i];
	        }
	        for (int i = 0; i < snackButtons.length; i++) {
	            if (snackButtons[i].isSelected()) return snacks[i];
	        }
	        return null;
	    }

	    private int getSelectedPrice() {
	        for (int i = 0; i < drinkButtons.length; i++) {
	            if (drinkButtons[i].isSelected()) return drinkPrices[i];
	        }
	        for (int i = 0; i < snackButtons.length; i++) {
	            if (snackButtons[i].isSelected()) return snackPrices[i];
	        }
	        return 0;
	    }
	    
	    private void printReceipt(String item, int quantity, int totalPrice, int money) {
	        StringBuilder receipt = new StringBuilder();
	        receipt.append("========== 영수증 ==========\n");
	        receipt.append("상품명\t수량\t금액\n");
	        receipt.append(item).append("\t").append(quantity).append("\t").append(totalPrice).append("원\n");
	        receipt.append("==========================\n");
	        receipt.append("총구매액\t").append(quantity).append("\t").append(totalPrice).append("원\n");
	        receipt.append("받은돈\t\t").append(money).append("원\n");
	        receipt.append("거스름돈\t\t").append(money - totalPrice).append("원\n\n");
	        resultArea.append(receipt.toString());
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        new VendingMachine();
	}

}
