package pl.rojek.inheritance;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import java.awt.FlowLayout;
import javax.swing.border.LineBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.Window.Type;

public class ObiectOrientedInheritance_s {

	private JFrame frmOjectOrientedUser;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField_20;
	private JTextField textField_21;
	private JTextField textField_22;
	private JTextField textField_23;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ObiectOrientedInheritance_s window = new ObiectOrientedInheritance_s();
					window.frmOjectOrientedUser.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ObiectOrientedInheritance_s() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmOjectOrientedUser = new JFrame();
		frmOjectOrientedUser.setType(Type.POPUP);
		frmOjectOrientedUser.setFont(new Font("Poor Richard", Font.PLAIN, 18));
		frmOjectOrientedUser.setForeground(Color.CYAN);
		frmOjectOrientedUser.setTitle("Oject Oriented User Inheritance by RojekT");
		frmOjectOrientedUser.setBounds(0, 0, 1380, 800);
		frmOjectOrientedUser.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmOjectOrientedUser.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel.getLayout();
		panel.setBorder(new LineBorder(new Color(102, 0, 153), 8, true));
		panel.setBounds(10, 11, 1344, 89);
		frmOjectOrientedUser.getContentPane().add(panel);
		
		JLabel lblNewLabel = new JLabel("Object Oriented Using Inheritance");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Lucida Fax", Font.BOLD | Font.ITALIC, 50));
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(102, 0, 153), 8, true));
		panel_1.setBounds(10, 111, 835, 639);
		frmOjectOrientedUser.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblFruit = new JLabel("Fruit");
		lblFruit.setHorizontalAlignment(SwingConstants.CENTER);
		lblFruit.setFont(new Font("Segoe UI Semibold", Font.BOLD, 24));
		lblFruit.setBounds(26, 11, 251, 62);
		panel_1.add(lblFruit);
		
		JLabel lblNewLabel_1 = new JLabel("Apply");
		lblNewLabel_1.setFont(new Font("Segoe UI Semilight", Font.BOLD, 20));
		lblNewLabel_1.setBounds(26, 84, 105, 36);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblBanana = new JLabel("Banana");
		lblBanana.setFont(new Font("Segoe UI Semilight", Font.BOLD, 20));
		lblBanana.setBounds(26, 131, 105, 36);
		panel_1.add(lblBanana);
		
		JLabel lblCherry = new JLabel("Cherry");
		lblCherry.setFont(new Font("Segoe UI Semilight", Font.BOLD, 20));
		lblCherry.setBounds(26, 178, 105, 36);
		panel_1.add(lblCherry);
		
		JLabel lblGrape = new JLabel("Grape");
		lblGrape.setFont(new Font("Segoe UI Semilight", Font.BOLD, 20));
		lblGrape.setBounds(26, 225, 105, 36);
		panel_1.add(lblGrape);
		
		JLabel lblMango = new JLabel("Mango");
		lblMango.setFont(new Font("Segoe UI Semilight", Font.BOLD, 20));
		lblMango.setBounds(26, 272, 105, 36);
		panel_1.add(lblMango);
		
		JLabel lblOrange = new JLabel("Orange");
		lblOrange.setFont(new Font("Segoe UI Semilight", Font.BOLD, 20));
		lblOrange.setBounds(26, 319, 105, 36);
		panel_1.add(lblOrange);
		
		
		
		textField = new JTextField();
		textField.addKeyListener(new KeyAdapter() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				Child_Inheritance JustNumbers =  new Child_Inheritance();
					JustNumbers.NumberOnly(e);
			}
		});
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setText("0");
		textField.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		textField.setBounds(217, 86, 132, 36);
		panel_1.add(textField);
		textField.setColumns(10);
		
		
		
		textField_1 = new JTextField();
		textField_1.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				Child_Inheritance JustNumbers =  new Child_Inheritance();
					JustNumbers.NumberOnly(e);
			}
		});
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setText("0");
		textField_1.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		textField_1.setColumns(10);
		textField_1.setBounds(217, 133, 132, 36);
		panel_1.add(textField_1);
		
		
		
		textField_2 = new JTextField();
		textField_2.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				Child_Inheritance JustNumbers =  new Child_Inheritance();
					JustNumbers.NumberOnly(e);
			}
		});
		textField_2 = new JTextField();
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_2.setText("0");
		textField_2.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		textField_2.setColumns(10);
		textField_2.setBounds(217, 180, 132, 36);
		panel_1.add(textField_2);
		
		
		
		textField_3 = new JTextField();
		textField_3.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				Child_Inheritance JustNumbers =  new Child_Inheritance();
					JustNumbers.NumberOnly(e);
			}
		});
		textField_3 = new JTextField();
		textField_3.setHorizontalAlignment(SwingConstants.CENTER);
		textField_3.setText("0");
		textField_3.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		textField_3.setColumns(10);
		textField_3.setBounds(217, 227, 132, 36);
		panel_1.add(textField_3);
		
		
		
		textField_4 = new JTextField();
		textField_4.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				Child_Inheritance JustNumbers =  new Child_Inheritance();
					JustNumbers.NumberOnly(e);
			}
		});
		textField_4 = new JTextField();
		textField_4.setHorizontalAlignment(SwingConstants.CENTER);
		textField_4.setText("0");
		textField_4.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		textField_4.setColumns(10);
		textField_4.setBounds(217, 274, 132, 36);
		panel_1.add(textField_4);
		
		
		
		textField_5 = new JTextField();
		textField_5.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				Child_Inheritance JustNumbers =  new Child_Inheritance();
					JustNumbers.NumberOnly(e);
			}
		});
		textField_5 = new JTextField();
		textField_5.setHorizontalAlignment(SwingConstants.CENTER);
		textField_5.setText("0");
		textField_5.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		textField_5.setColumns(10);
		textField_5.setBounds(217, 321, 132, 36);
		panel_1.add(textField_5);
		
		JLabel lblWine = new JLabel("Wine");
		lblWine.setHorizontalAlignment(SwingConstants.CENTER);
		lblWine.setFont(new Font("Segoe UI Semibold", Font.BOLD, 24));
		lblWine.setBounds(505, 11, 251, 62);
		panel_1.add(lblWine);
		
		JLabel lblSyrah = new JLabel("Syrah");
		lblSyrah.setFont(new Font("Segoe UI Semilight", Font.BOLD, 20));
		lblSyrah.setBounds(438, 84, 105, 36);
		panel_1.add(lblSyrah);
		
		JLabel lblMerlot = new JLabel("Merlot");
		lblMerlot.setFont(new Font("Segoe UI Semilight", Font.BOLD, 20));
		lblMerlot.setBounds(438, 131, 105, 36);
		panel_1.add(lblMerlot);
		
		JLabel lblRiesling = new JLabel("Riesling");
		lblRiesling.setFont(new Font("Segoe UI Semilight", Font.BOLD, 20));
		lblRiesling.setBounds(438, 178, 105, 36);
		panel_1.add(lblRiesling);
		
		JLabel lblPinotNoir = new JLabel("Pinot Noir");
		lblPinotNoir.setFont(new Font("Segoe UI Semilight", Font.BOLD, 20));
		lblPinotNoir.setBounds(438, 225, 172, 36);
		panel_1.add(lblPinotNoir);
		
		JLabel lblChardonnay = new JLabel("Chardonnay");
		lblChardonnay.setFont(new Font("Segoe UI Semilight", Font.BOLD, 20));
		lblChardonnay.setBounds(438, 272, 172, 36);
		panel_1.add(lblChardonnay);
		
		JLabel lblSauvignonBlanc = new JLabel("Sauvignon Blanc");
		lblSauvignonBlanc.setFont(new Font("Segoe UI Semilight", Font.BOLD, 20));
		lblSauvignonBlanc.setBounds(438, 319, 172, 36);
		panel_1.add(lblSauvignonBlanc);
		
		
		
		textField_6 = new JTextField();
		textField_6.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				Child_Inheritance JustNumbers =  new Child_Inheritance();
					JustNumbers.NumberOnly(e);
			}
		});
		textField_6 = new JTextField();
		textField_6.setHorizontalAlignment(SwingConstants.CENTER);
		textField_6.setText("0");
		textField_6.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		textField_6.setColumns(10);
		textField_6.setBounds(620, 86, 132, 36);
		panel_1.add(textField_6);
		
		
		
		textField_7 = new JTextField();
		textField_7.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				Child_Inheritance JustNumbers =  new Child_Inheritance();
					JustNumbers.NumberOnly(e);
			}
		});
		textField_7 = new JTextField();
		textField_7.setHorizontalAlignment(SwingConstants.CENTER);
		textField_7.setText("0");
		textField_7.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		textField_7.setColumns(10);
		textField_7.setBounds(620, 133, 132, 36);
		panel_1.add(textField_7);
		
		
		
		textField_8 = new JTextField();
		textField_8.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				Child_Inheritance JustNumbers =  new Child_Inheritance();
					JustNumbers.NumberOnly(e);
			}
		});
		textField_8 = new JTextField();
		textField_8.setHorizontalAlignment(SwingConstants.CENTER);
		textField_8.setText("0");
		textField_8.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		textField_8.setColumns(10);
		textField_8.setBounds(620, 180, 132, 36);
		panel_1.add(textField_8);
		
		
		
		textField_9 = new JTextField();
		textField_9.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				Child_Inheritance JustNumbers =  new Child_Inheritance();
					JustNumbers.NumberOnly(e);
			}
		});
		textField_9 = new JTextField();
		textField_9.setHorizontalAlignment(SwingConstants.CENTER);
		textField_9.setText("0");
		textField_9.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		textField_9.setColumns(10);
		textField_9.setBounds(620, 225, 132, 36);
		panel_1.add(textField_9);
		
		
		
		textField_10 = new JTextField();
		textField_10.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				Child_Inheritance JustNumbers =  new Child_Inheritance();
					JustNumbers.NumberOnly(e);
			}
		});
		textField_10 = new JTextField();
		textField_10.setHorizontalAlignment(SwingConstants.CENTER);
		textField_10.setText("0");
		textField_10.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		textField_10.setColumns(10);
		textField_10.setBounds(620, 274, 132, 36);
		panel_1.add(textField_10);
		
		
		
		textField_11 = new JTextField();
		textField_11.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				Child_Inheritance JustNumbers =  new Child_Inheritance();
					JustNumbers.NumberOnly(e);
			}
		});
		textField_11 = new JTextField();
		textField_11.setHorizontalAlignment(SwingConstants.CENTER);
		textField_11.setText("0");
		textField_11.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		textField_11.setColumns(10);
		textField_11.setBounds(620, 321, 132, 36);
		panel_1.add(textField_11);
		
		JLabel lblMilkShake = new JLabel("Milk Shake");
		lblMilkShake.setFont(new Font("Segoe UI Semilight", Font.BOLD, 20));
		lblMilkShake.setBounds(26, 481, 105, 36);
		panel_1.add(lblMilkShake);
		
		JLabel lblVanillaCone = new JLabel("Vanilla Cone");
		lblVanillaCone.setFont(new Font("Segoe UI Semilight", Font.BOLD, 20));
		lblVanillaCone.setBounds(26, 528, 142, 36);
		panel_1.add(lblVanillaCone);
		
		JLabel lblLassicVanilla = new JLabel("Classic Vanilla");
		lblLassicVanilla.setFont(new Font("Segoe UI Semilight", Font.BOLD, 20));
		lblLassicVanilla.setBounds(26, 575, 142, 36);
		panel_1.add(lblLassicVanilla);
		
		
		
		textField_12 = new JTextField();
		textField_12.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				Child_Inheritance JustNumbers =  new Child_Inheritance();
					JustNumbers.NumberOnly(e);
			}
		});
		textField_12 = new JTextField();
		textField_12.setHorizontalAlignment(SwingConstants.CENTER);
		textField_12.setText("0");
		textField_12.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		textField_12.setColumns(10);
		textField_12.setBounds(217, 481, 132, 36);
		panel_1.add(textField_12);
		
		
		
		textField_13 = new JTextField();
		textField_13.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				Child_Inheritance JustNumbers =  new Child_Inheritance();
					JustNumbers.NumberOnly(e);
			}
		});
		textField_13 = new JTextField();
		textField_13.setHorizontalAlignment(SwingConstants.CENTER);
		textField_13.setText("0");
		textField_13.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		textField_13.setColumns(10);
		textField_13.setBounds(217, 530, 132, 36);
		panel_1.add(textField_13);
		
		
		
		textField_14 = new JTextField();
		textField_14.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				Child_Inheritance JustNumbers =  new Child_Inheritance();
					JustNumbers.NumberOnly(e);
			}
		});
		textField_14 = new JTextField();
		textField_14.setHorizontalAlignment(SwingConstants.CENTER);
		textField_14.setText("0");
		textField_14.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		textField_14.setColumns(10);
		textField_14.setBounds(217, 577, 132, 36);
		panel_1.add(textField_14);
		
		JLabel lblVanillaMilkShake_1 = new JLabel("Vanilla Milk Shake");
		lblVanillaMilkShake_1.setFont(new Font("Segoe UI Semilight", Font.BOLD, 20));
		lblVanillaMilkShake_1.setBounds(438, 481, 172, 36);
		panel_1.add(lblVanillaMilkShake_1);
		
		JLabel lblChocolateMilkShake = new JLabel("Chocolate Milk Shake");
		lblChocolateMilkShake.setFont(new Font("Segoe UI Semilight", Font.BOLD, 20));
		lblChocolateMilkShake.setBounds(406, 528, 204, 36);
		panel_1.add(lblChocolateMilkShake);
		
		JLabel lblStrawberryMilkShake = new JLabel("Strawberry Milk Shake");
		lblStrawberryMilkShake.setFont(new Font("Segoe UI Semilight", Font.BOLD, 20));
		lblStrawberryMilkShake.setBounds(398, 575, 212, 36);
		panel_1.add(lblStrawberryMilkShake);
		
		
		
		textField_15 = new JTextField();
		textField_15.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				Child_Inheritance JustNumbers =  new Child_Inheritance();
					JustNumbers.NumberOnly(e);
			}
		});
		textField_15 = new JTextField();
		textField_15.setHorizontalAlignment(SwingConstants.CENTER);
		textField_15.setText("0");
		textField_15.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		textField_15.setColumns(10);
		textField_15.setBounds(624, 479, 132, 36);
		panel_1.add(textField_15);
		
		
		
		textField_16 = new JTextField();
		textField_16.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				Child_Inheritance JustNumbers =  new Child_Inheritance();
					JustNumbers.NumberOnly(e);
			}
		});
		textField_16 = new JTextField();
		textField_16.setHorizontalAlignment(SwingConstants.CENTER);
		textField_16.setText("0");
		textField_16.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		textField_16.setColumns(10);
		textField_16.setBounds(624, 528, 132, 36);
		panel_1.add(textField_16);
		
		
		
		textField_17 = new JTextField();
		textField_17.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				Child_Inheritance JustNumbers =  new Child_Inheritance();
					JustNumbers.NumberOnly(e);
			}
		});
		textField_17 = new JTextField();
		textField_17.setHorizontalAlignment(SwingConstants.CENTER);
		textField_17.setText("0");
		textField_17.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		textField_17.setColumns(10);
		textField_17.setBounds(624, 575, 132, 36);
		panel_1.add(textField_17);
		
		JLabel lbl_IceCream = new JLabel("IceCream");
		lbl_IceCream.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_IceCream.setFont(new Font("Segoe UI Semibold", Font.BOLD, 24));
		lbl_IceCream.setBounds(286, 387, 324, 83);
		panel_1.add(lbl_IceCream);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(102, 0, 153), 8, true));
		panel_2.setBounds(855, 111, 499, 206);
		frmOjectOrientedUser.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblCostOfFruits = new JLabel("Cost of Fruits");
		lblCostOfFruits.setFont(new Font("Segoe UI Semilight", Font.BOLD, 20));
		lblCostOfFruits.setBounds(41, 29, 153, 36);
		panel_2.add(lblCostOfFruits);
		
		JLabel lblCostOfWine = new JLabel("Cost of Wine");
		lblCostOfWine.setFont(new Font("Segoe UI Semilight", Font.BOLD, 20));
		lblCostOfWine.setBounds(41, 76, 153, 36);
		panel_2.add(lblCostOfWine);
		
		JLabel lblIceCream = new JLabel("Cost of Ice Cream");
		lblIceCream.setFont(new Font("Segoe UI Semilight", Font.BOLD, 20));
		lblIceCream.setBounds(41, 123, 178, 36);
		panel_2.add(lblIceCream);
		
		textField_18 = new JTextField();
		textField_18.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		textField_18.setColumns(10);
		textField_18.setBounds(249, 31, 132, 36);
		panel_2.add(textField_18);
		
		textField_19 = new JTextField();
		textField_19.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		textField_19.setColumns(10);
		textField_19.setBounds(249, 78, 132, 36);
		panel_2.add(textField_19);
		
		textField_20 = new JTextField();
		textField_20.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		textField_20.setColumns(10);
		textField_20.setBounds(249, 125, 132, 36);
		panel_2.add(textField_20);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(102, 0, 153), 8, true));
		panel_3.setBounds(855, 328, 499, 206);
		frmOjectOrientedUser.getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblSyrah_1 = new JLabel("Tax");
		lblSyrah_1.setFont(new Font("Segoe UI Semilight", Font.BOLD, 20));
		lblSyrah_1.setBounds(41, 34, 105, 36);
		panel_3.add(lblSyrah_1);
		
		JLabel lblMerlot_1 = new JLabel("Subtotal");
		lblMerlot_1.setFont(new Font("Segoe UI Semilight", Font.BOLD, 20));
		lblMerlot_1.setBounds(41, 81, 105, 36);
		panel_3.add(lblMerlot_1);
		
		JLabel lblRiesling_1 = new JLabel("Total");
		lblRiesling_1.setFont(new Font("Segoe UI Semilight", Font.BOLD, 20));
		lblRiesling_1.setBounds(41, 128, 105, 36);
		panel_3.add(lblRiesling_1);
		
		textField_21 = new JTextField();
		textField_21.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		textField_21.setColumns(10);
		textField_21.setBounds(249, 36, 132, 36);
		panel_3.add(textField_21);
		
		textField_22 = new JTextField();
		textField_22.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		textField_22.setColumns(10);
		textField_22.setBounds(249, 83, 132, 36);
		panel_3.add(textField_22);
		
		textField_23 = new JTextField();
		textField_23.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		textField_23.setColumns(10);
		textField_23.setBounds(249, 130, 132, 36);
		panel_3.add(textField_23);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new LineBorder(new Color(102, 0, 153), 8, true));
		panel_4.setBounds(855, 545, 499, 206);
		frmOjectOrientedUser.getContentPane().add(panel_4);
		panel_4.setLayout(null);
		
		JButton btnTotal = new JButton("Total");
		btnTotal.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				Child_Inheritance cost_of_Items = new Child_Inheritance();
				double iTax, iSubtotal, iTotal;
				
				cost_of_Items.Apple = cost_of_Items.pApple * Double.parseDouble(textField.getText());
				cost_of_Items.Banana = cost_of_Items.pBanana * Double.parseDouble(textField_1.getText());
				cost_of_Items.Cherry = cost_of_Items.pCherry * Double.parseDouble(textField_2.getText());
				cost_of_Items.Grape = cost_of_Items.pGrape * Double.parseDouble(textField_3.getText());
				cost_of_Items.Mango = cost_of_Items.pMango * Double.parseDouble(textField_4.getText());
				cost_of_Items.Orange = cost_of_Items.pOrange * Double.parseDouble(textField_5.getText());
				
				cost_of_Items.Syrah = cost_of_Items.pSyrah * Double.parseDouble(textField_6.getText());
				cost_of_Items.Merlot = cost_of_Items.pMerlot * Double.parseDouble(textField_7.getText());
				cost_of_Items.Riesling = cost_of_Items.pRiesling * Double.parseDouble(textField_8.getText());
				cost_of_Items.Pinot = cost_of_Items.pPinot * Double.parseDouble(textField_9.getText());
				cost_of_Items.Chardonnay = cost_of_Items.pChardonnay * Double.parseDouble(textField_10.getText());
				cost_of_Items.Sauvignon = cost_of_Items.pSauvignon * Double.parseDouble(textField_11.getText());
				
				cost_of_Items.MilkShake = cost_of_Items.pMilkShake * Double.parseDouble(textField_12.getText());
				cost_of_Items.VanillaCone = cost_of_Items.pVanillaCone * Double.parseDouble(textField_13.getText());
				cost_of_Items.ClasVanilla = cost_of_Items.pClasVanilla * Double.parseDouble(textField_14.getText());
				cost_of_Items.VanillaMilkShake = cost_of_Items.pVanillaMilkShake * Double.parseDouble(textField_15.getText());
				cost_of_Items.ChocMilkShake = cost_of_Items.pChocMilkShake * Double.parseDouble(textField_16.getText());
				cost_of_Items.StrawMilkShake = cost_of_Items.pStrawMilkShake * Double.parseDouble(textField_17.getText());
				
				iSubtotal = cost_of_Items.GetAmount();
				iTax = cost_of_Items.GetTax();
				iTotal = iSubtotal + iTax;
				
				String Subtotal = String.format("%.2f\u20AC", iSubtotal);
				textField_22.setText(Subtotal);
				
				String Tax = String.format( "%.2f\u20AC", iTax);
				textField_21.setText(Tax);
				
				String Total = String.format( "%.2f \u20AC", iTotal);
				textField_23.setText(Total);
				
				
				String iFruit = String.format("%.2f \u20AC", cost_of_Items.itemscost1 );
				textField_18.setText(iFruit);
				
				String iWine = String.format("%.2f \u20AC", cost_of_Items.itemscost2 );
				textField_19.setText(iWine);
				
				String iIceCream = String.format("%.2f \u20AC", cost_of_Items.itemscost3 );
				textField_20.setText(iIceCream);
				
			}
		});
		
		
		btnTotal.setFont(new Font("Segoe UI Semilight", Font.BOLD, 20));
		btnTotal.setForeground(Color.BLACK);
		btnTotal.setBackground(SystemColor.activeCaption);
		btnTotal.setBounds(38, 26, 410, 37);
		panel_4.add(btnTotal);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textField_18.setText(null);
				textField_19.setText(null);
				textField_20.setText(null);
				textField_21.setText(null);
				textField_22.setText(null);
				textField_23.setText(null);
				
				textField.setText("0");
				textField_1.setText("0");
				textField_2.setText("0");
				textField_3.setText("0");
				textField_4.setText("0");
				textField_5.setText("0");
				textField_6.setText("0");
				textField_7.setText("0");
				textField_8.setText("0");
				textField_9.setText("0");
				textField_10.setText("0");
				textField_11.setText("0");
				textField_12.setText("0");
				textField_13.setText("0");
				textField_14.setText("0");
				textField_15.setText("0");
				textField_16.setText("0");
				textField_17.setText("0");
				
				
			}
		});
		btnReset.setForeground(Color.BLACK);
		btnReset.setFont(new Font("Segoe UI Semilight", Font.BOLD, 20));
		btnReset.setBackground(SystemColor.activeCaption);
		btnReset.setBounds(38, 88, 410, 37);
		panel_4.add(btnReset);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Child_Inheritance qExit = new Child_Inheritance();
				double iTax, iSubtotal, iTotal;
				
				 
				
				qExit.iExitSystem();
			}
		});
		
		
		btnExit.setForeground(Color.BLACK);
		btnExit.setFont(new Font("Segoe UI Semilight", Font.BOLD, 20));
		btnExit.setBackground(SystemColor.activeCaption);
		btnExit.setBounds(38, 143, 410, 37);
		panel_4.add(btnExit);
		
		
	}
}
