package d0036d_lab2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ScrollBarTest extends JFrame{

	private static final int FRAME_WIDTH = 400;
	private static final int FRAME_HEIGHT = 250;
	
	private static final int AREA_ROWS = 10;
	private static final int AREA_COLUMNS =30;
	
	private static final double DEFAULT_RATE = 5;
	private static final double INITIAL_BALANCE = 1000;
	
	private JLabel rateLabel;
	private JTextField rateField;
	private JButton button;
	private JTextArea resultArea;
	private double balance;
	
	public InvestmentFrame3(){
		balance = INITIAL_BALANCE;
		resultArea = new JTextArea(AREA_ROWS, AREA_COLUMNS);
		resultArea = setText(balance + "/n");
		
	}
	
}
