
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Form  {
	// declare the SWING components
private JFrame frame;
	
	private String text;
	private String number;
	private static int num = 240;
	private static int res = 0;

	private JLabel NumOfSeats;
	private JLabel Reserved;
	private JLabel name;
	private JLabel price;
	private JLabel numberLabel;
	private JLabel resLabel;
	private JLabel totalRevenue;
	private JLabel textRevenue;
	
	
	private JPanel panelL;
	private JPanel panelB;
	private JPanel panelR;

	
	private JButton reserve;
	private ButtonGroup radioGroup;
	
	private JRadioButton Res;
	private JRadioButton Canc;
	
	private JTextField nameText;
	private JTextField priceText;

	
	private JTextArea list;
	private JScrollPane  scroll;

	GridBagConstraints gbc = new GridBagConstraints();
	
	
	public Form()
	{
		// Frame object
		frame = new JFrame();
		frame.setTitle("CBS");
		
		
		
// Panel Object		
		panelL = new JPanel(new GridBagLayout());
		panelL.setBorder(BorderFactory.createTitledBorder("Booking Input"));
		panelB = new JPanel(new GridBagLayout());
		panelB.setBorder(BorderFactory.createTitledBorder("Output Data"));
		panelR = new JPanel(new FlowLayout());
		panelR.setBorder(BorderFactory.createTitledBorder("Reservations"));
		frame.add(panelL);
		frame.add(panelR);
		frame.add(panelB);
		
		
		
		//setting layout
		GridLayout g = new GridLayout(2,2);
		frame.setLayout(g);
		
		//JButton
	    reserve= new JButton("Reserve");
		
		//JRadioButton
		Res = new JRadioButton("Reserve",true);
		Canc = new JRadioButton("Cancel",false);
		
		//Logical relationship between JRadioButtons
		radioGroup = new ButtonGroup();
		radioGroup.add(Res);
		radioGroup.add(Canc);
		
		//JLabel objects
		NumOfSeats = new JLabel("Number of seats:");
		Reserved = new JLabel("Number of reserved seats: ");
		name = new JLabel("Name");
		price = new JLabel("Price");
		numberLabel=new JLabel("240");
		resLabel = new JLabel("0");
		textRevenue = new JLabel("Total Revenue");
		totalRevenue = new JLabel("0");
		
		
		
		//JTextfield objects
		nameText = new JTextField(text,15);
		priceText = new JTextField(number,4);
		list = new JTextArea(10,30);
	
		
		
		
		
		
		//Adding objects to the frame
		gbc.gridx = 0;
		gbc.gridy = 0;
		panelL.add(Res,gbc);
		
		gbc.gridx = 1;
		gbc.gridy = 0;
		panelL.add(Canc,gbc);
		
		gbc.gridx = 0;
		gbc.gridy = 1;
		panelL.add(name,gbc);
		
		gbc.gridx = 0;
		gbc.gridy = 2;

		panelL.add(nameText,gbc);
		
		gbc.gridx = 1;
		gbc.gridy = 1;
		panelL.add(price,gbc);
		
		gbc.gridx = 1;
		gbc.gridy = 2;

		panelL.add(priceText,gbc);
		gbc.gridx = 0;
		gbc.gridy = 3;
		panelL.add(reserve,gbc);

		gbc.gridx = 0;
		gbc.gridy = 4;
		
		panelB.add(NumOfSeats,gbc);
		
		gbc.gridx = 1;
		gbc.gridy = 4;
		panelB.add(numberLabel,gbc);
		gbc.gridx = 0;
		gbc.gridy = 5;
		panelB.add(Reserved,gbc);
		
		gbc.gridx = 1;
		gbc.gridy = 5;
		panelB.add(resLabel, gbc);
		
		gbc.gridx = 0;
		gbc.gridy = 3;
	panelB.add(textRevenue, gbc);
	
	gbc.gridx = 1;
	gbc.gridy = 3;
	panelB.add(totalRevenue, gbc);
		
		scroll = new JScrollPane(list);
		scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		panelR.add(scroll);
	
	
		
	     reserve.addActionListener(new ActionListener(){
	            public void actionPerformed(ActionEvent e){
	                num--;
	                res++;
	                numberLabel.setText("" +num);
	                resLabel.setText("" + res);
	                text=nameText.getText();
	                number=priceText.getText();
	                list.append("NAME: "+text+"\n");
	                list.append("TICKET PRICE: "+number+"\n");
	            	}
	        });
		
		
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // to make sure that the program closes when the frame closes
		frame.setSize(700, 400);
	}
	
	
	}
	
	
	
	
	

