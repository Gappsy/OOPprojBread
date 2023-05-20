import javax.swing.*;
import java.awt.*;

public class AddEntry extends MainPanel{
	JFrame frame1 = new JFrame();
	JLabel label = new JLabel("Add an Item in Inventory");
	JPanel panelAdd = new JPanel();
	
	//JTextField for adding
	JTextField textFieldProdID = new JTextField();
	JTextField textFieldProdName = new JTextField();
	JTextField textFieldProdQty = new JTextField();
	JTextField textFieldProdPrice = new JTextField();
	// save button add window
	JButton buttonAddWin1 = new JButton("Save");
	JButton buttonExitWin1 = new JButton("Exit");
	
	JLabel labelProdID = new JLabel("Prod id:");
	JLabel labelProdName = new JLabel("Prod Name:");
	JLabel labelProdQty = new JLabel("Prod Qty:");
	JLabel labelProdPrice = new JLabel("Prod Price:");
	
	 
	AddEntry() {
		frame1.setVisible(true);
		frame1.setSize(300,300);
		frame1.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		frame1.setLocationRelativeTo(null);
		frame1.setResizable(false);
		frame1.setTitle(("Adding Product"));
		label.setBounds(10,10,500,50);
		label.setFont(new Font("Arial",Font.PLAIN,25));
		panelAdd.setBackground(new Color(178, 190, 181));
		panelAdd.setBounds(10,10,460,430);
		panelAdd.setBorder(border);
		
		// textField for product ID
		textFieldProdID.setBounds(80, 50, 100, 20);
		// textField for product name
		textFieldProdName.setBounds(80, 75, 100, 20);
		// textField for product quantity
		textFieldProdQty.setBounds(80, 100, 100, 20);
		// textField for product price
		textFieldProdPrice.setBounds(80, 125, 100, 20);
		// save button for add window
		buttonAddWin1.setBounds(40, 200, 100, 20);
		// exit button
		buttonExitWin1.setBounds(150, 200, 100, 20);
		
		// label for add product; id,name,quantity and price
		labelProdID.setBounds(35, 50, 100, 20);
		labelProdName.setBounds(10, 75, 100, 20);
		labelProdQty.setBounds(25, 100, 100, 20);
		labelProdPrice.setBounds(10, 125, 100, 20);
		
		
		frame1.add(buttonExitWin1);
		frame1.add(labelProdPrice);
		frame1.add(labelProdQty);
		frame1.add(labelProdName);
		frame1.add(labelProdID);
		frame1.add(buttonAddWin1);
		frame1.add(textFieldProdPrice);
		frame1.add(textFieldProdQty);
		frame1.add(textFieldProdName);
		frame1.add(textFieldProdID);
		frame1.add(panelAdd);
		panelAdd.add(label);
	}
}
