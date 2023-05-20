import java.awt.Color;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class EditEntry extends MainPanel{
	JFrame frame1 = new JFrame();
	JLabel label = new JLabel("Edit an Item in Inventory");
	JPanel panelAdd = new JPanel();
	EditEntry() {
		frame1.setVisible(true);
		frame1.setSize(300,300);
		frame1.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		frame1.setLocationRelativeTo(null);
		frame1.setResizable(false);
		frame1.setTitle(("Edit a Product"));
		label.setBounds(10,10,500,50);
		label.setFont(new Font("Arial",Font.PLAIN,25));
		panelAdd.setBackground(new Color(178, 190, 181));
		panelAdd.setBounds(10,10,460,430);
		panelAdd.setBorder(border);
	}
}
