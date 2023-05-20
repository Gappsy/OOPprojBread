import javax.sound.sampled.*;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class MainPanel {
	
	//images
    ImageIcon image = new ImageIcon("bread.png"); //for icon
    ImageIcon frbg = new ImageIcon("frenchbg.png");
    
    //JtextField
    JTextField invoiceJfield = new JTextField();
    
    // JLabel
    private JPanel panel1;
    private JPanel panel2;
    private JPanel panel3;
    
    // JLabel
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    
    // main frame
    JFrame frame = new JFrame();
    
    //font and borders
    Font font = new Font("Times New Roman",Font.PLAIN,23);
    Border border = BorderFactory.createLineBorder(Color.black,3,true);
    
    //JButton for inventory
    protected JButton buttonAdd;
    private JButton buttonDelete;
    private JButton buttonEdit;
    private JButton buttonClear;
    
    // JButton for checkout page
    private JButton buttonPurchase;
    // private JButton buttonDeletePurchase;
    private JButton addQuantity;
    private JButton decQuantiy;
    
    
    //JTable for inventory
    String [][] data = {{"01","Pandesal","2","45"},{"02","Pan de coco","5","32"}};
    String [] colNames = {"ID","Product type", "Price", "Quantity"};
    JTable table = new JTable(data,colNames);
    JScrollPane scrollPane = new JScrollPane(table);
    
    // JTable for checkout
    String []colNames1 = {"ID","Price"};
    String [][] data1 = {{"",""},{"",""}};
    JTable table1;
    JScrollPane scrollPane1;
    
    JTextField textCash = new JTextField();
    JTextField textPrice = new JTextField();
    JTextField textChange = new JTextField();
    
    
    //JLabel for checkout page
    JLabel cashLabel = new JLabel("Cash");
    JLabel priceLabel = new JLabel("Price");
    JLabel changeLabel = new JLabel("Change");
    
    // The frame Constructor contains all the design
    MainPanel() {
    	// handles all the events 
    	Handler handler = new Handler();
    	
    	// panel1 for inventory
    	panel1 = new JPanel();
    	// panel2 for checkout
    	panel2 = new JPanel();
    	// panel3 for invoice
    	panel3 = new JPanel();
    	// label1 for inventory
    	label1 = new JLabel();
    	// label2 for checkout
    	label2 = new JLabel();
    	// label3 for invoice
    	label3 = new JLabel();
    	// inventory panel buttons
    	buttonAdd = new JButton("Add");
    	buttonDelete = new JButton("Delete");
    	buttonEdit = new JButton("Edit");
    	buttonClear = new JButton("Clear");
    	// checkout panel buttons
    	buttonPurchase = new JButton("Purchase");
    	//buttonDeletePurchase = new JButton("Delete");
    	addQuantity = new JButton("+");
    	decQuantiy = new JButton("-");
    	
    	// background music plays
   	try {
   		File audioFile = new File("Paris.wav");
   	    AudioInputStream audiosStream = AudioSystem.getAudioInputStream(audioFile);
   	    Clip clip = AudioSystem.getClip();
   	    clip.open(audiosStream);
   	    clip.start();
   	    clip.loop(Clip.LOOP_CONTINUOUSLY);
   	}
  	catch(Exception e) {
  		e.printStackTrace();
   	}
    	
    	frame.setContentPane(new JLabel(frbg));   // set bg image
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//exit upon x
        frame.setTitle("Bread Inventory");//title
        frame.setSize(1200,600); //sizing
        frame.setVisible(true); //if seen or not
        frame.setLocationRelativeTo(null);//pop out center
        frame.setResizable(false);
        
    	// panel 1 Inventory
        panel1.setBackground(new Color(178, 190, 181));
        panel1.setBounds(50,60,450,225);
        panel1.setBorder(border);
        //JLabel
        label1.setText("Inventory");
        label1.setFont(font);
        label1.setBounds(70,70,100,25);
        frame.add(label1);
        
        // Button for adding
        buttonAdd.setBounds(200,70,60,30);
        buttonAdd.addActionListener(handler);
        // Button for editing
        buttonEdit.setBounds(265,70,60,30);
        buttonEdit.addActionListener(handler);
        // Button for Deleting
        buttonDelete.setBounds(330,70,70,30);
        buttonDelete.addActionListener(handler);
        // Button for Clearing all inventory items
        buttonClear.setBounds(405, 70, 70,30);
        buttonClear.addActionListener(handler);
        
        
        // Adding add, edit ,delete and clear
        frame.add(buttonAdd);
        frame.add(buttonEdit);
        frame.add(buttonDelete);
        frame.add(buttonClear);

        // panel 2 Checkout
        panel2.setBackground(new Color(178, 190, 181));
        panel2.setBounds(50,300,450,225);
        panel2.setBorder(border);
        label2.setText("Checkout");
        label2.setFont(font);
        label2.setBounds(72,300,100,50);
        frame.add(label2);

        // cash label
        cashLabel.setBounds(63,350,50,20);
        frame.add(cashLabel);
        // Cash field
        textCash.setBounds(105,350,50,20);
        frame.add(textCash);
        
        // price label
        priceLabel.setBounds(63,373,50,20);
        frame.add(priceLabel);
        // Price Field
        textPrice.setBounds(105,375,50,20);
        textPrice.setEditable(false);
        frame.add(textPrice);
        
        //Change label
        changeLabel.setBounds(60,395,50,20);
        frame.add(changeLabel);
        // Change Field
        textChange.setBounds(105,400,50,20);
        textChange.setEditable(false);
        frame.add(textChange);
        
        // panel 3 Invoice
        panel3.setBackground(new Color(178, 190, 181));
        panel3.setBounds(550,60,350,465);
        panel3.setBorder(border);
        
//        // Delete button for check out page
//        buttonDeletePurchase.setBounds(385,310,70,30);
//        frame.add(buttonDeletePurchase);
        
        // purchase button for check out page
        buttonPurchase.setBounds(98,450,90,30);
        frame.add(buttonPurchase);
        
        // +1 to the product
        addQuantity.setBounds(190,350,45,30);
        frame.add(addQuantity);
        // -1 to the product
        decQuantiy.setBounds(190,388,45,30);
        frame.add(decQuantiy);
        
        // New table for checkout page
        table1 = new JTable(data1,colNames1);
        scrollPane1 = new JScrollPane(table1);
        scrollPane1.setBounds(250,350,240,160);
        scrollPane1.setBorder(border);
        scrollPane1.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        table1.setEnabled(false);
        frame.add(scrollPane1);
        
        // Label for Invoice
        label3.setText("Invoice");
        label3.setFont(font);
        label3.setBounds(695,40,100,100);
        
        // Table and ScrollPane
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane.setBounds(65,105,420,170);
        table.setFont(new Font("Cosmic Sans",Font.BOLD,15));
        table.setEnabled(false);
        scrollPane.setBorder(border);
        panel1.add(scrollPane);
        
        invoiceJfield.setBackground(Color.decode("#ffffff"));
        invoiceJfield.setBounds(575,130,300,370);
        invoiceJfield.setEditable(false);
        invoiceJfield.setBorder(border);
        
        frame.add(scrollPane);
        frame.add(label3);
        frame.add(invoiceJfield);
        frame.add(panel1);
        frame.add(panel2);
        frame.add(panel3);
        frame.setIconImage(image.getImage());//setting icon
        frame.pack();
    }
    private class Handler implements ActionListener {
    	
    	public void actionPerformed(ActionEvent event) {
    		if(event.getSource()==buttonAdd) {
    			new AddEntry();
    		}
    		else if(event.getSource()==buttonEdit) {
    			new EditEntry();
    		}
    		else if(event.getSource()==buttonDelete) {
    			new DeleteEntry();
    		}
    		else if(event.getSource()==buttonEdit) {
    			new EditEntry();
    		}
    	}
    }
    
}
