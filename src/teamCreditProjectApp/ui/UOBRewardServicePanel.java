package teamCreditProjectApp.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;


import teamCreditProjectApp.dataAccess.RewardsCartDA;
import teamCreditProjectApp.entity.Login;
import teamCreditProjectApp.entity.RewardsCart;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class UOBRewardServicePanel extends MasterPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Create the panel.
	 */
	public UOBRewardServicePanel(JFrame mf,Login l1,String cardNumber) {
		super(mf,l1);
	
		
		setLayout(null);
		
		JInternalFrame internalFrame = new JInternalFrame("New JInternalFrame");
		internalFrame.setBounds(216, 120, 543, 396);
		add(internalFrame);
		internalFrame.setVisible(false);
		internalFrame.setClosable(true);
		
		JPanel panel = new JPanel();
		internalFrame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblDescription = new JLabel("Product Description");
		lblDescription.setForeground(Color.BLUE);
		lblDescription.setFont(new Font("Arial", Font.PLAIN, 25));
		lblDescription.setBounds(200, 35, 240, 20);
		panel.add(lblDescription);
		
		JLabel lblTermsAndConditions = new JLabel("Terms and Conditions");
		lblTermsAndConditions.setForeground(Color.BLUE);
		lblTermsAndConditions.setFont(new Font("Arial", Font.PLAIN, 25));
		lblTermsAndConditions.setBounds(200, 115, 269, 20);
		panel.add(lblTermsAndConditions);
		
		JLabel lblItemName = new JLabel("New label");
		lblItemName.setFont(new Font("Arial", Font.PLAIN, 20));
		lblItemName.setBounds(200, 63, 287, 36);
		panel.add(lblItemName);
		
		ArrayList<RewardsCart> alist = RewardsCartDA.retrieveAllRewardsCart();
		lblItemName.setText(alist.get(11).getItemName());
		
		JLabel lblItemPoints = new JLabel("New label");
		lblItemPoints.setForeground(Color.RED);
		lblItemPoints.setBounds(15, 164, 96, 20);
		panel.add(lblItemPoints);
		
		ArrayList<RewardsCart> blist = RewardsCartDA.retrieveAllRewardsCart();
		lblItemPoints.setText(blist.get(11).getItemPoints());
		
		JLabel lblItemType = new JLabel("");
		lblItemType.setForeground(Color.BLUE);
		lblItemType.setFont(new Font("Arial", Font.PLAIN, 25));
		lblItemType.setBounds(15, 138, 96, 20);
		panel.add(lblItemType);
		
		ArrayList<RewardsCart> clist = RewardsCartDA.retrieveAllRewardsCart();
		lblItemType.setText(clist.get(11).getItemType());
		
		JTextArea textItemDescription = new JTextArea();
		textItemDescription.setBounds(195, 164, 332, 104);
		panel.add(textItemDescription);
		
		ArrayList<RewardsCart> dlist = RewardsCartDA.retrieveAllRewardsCart();
		textItemDescription.setText("No refund or exchange of cash is allowed.\r\nNo replacement for lost or damaged \r\nvoucher allowed.");
		
		ArrayList<RewardsCart> elist_2 = RewardsCartDA.retrieveAllRewardsCart();
		//lblItemDescription.setText(elist_2.get(11).getItemPic());
		JLabel lblItemPic_2 = new JLabel("");
		lblItemPic_2.setIcon(new ImageIcon(OCBCRewardMainPanel.class.getResource("/Reward/img/" + elist_2.get(11).getItemPic())));
		lblItemPic_2.setBounds(4, 35, 194, 100);
		panel.add(lblItemPic_2);
		
		JButton btnRedeemcart = new JButton("Redeem Cart");
		btnRedeemcart.setFont(new Font("Arial", Font.PLAIN, 18));
		btnRedeemcart.setIcon(new ImageIcon(DBSRewardMainPanel.class.getResource("/Redeem/img/Cart.png")));
		btnRedeemcart.setBounds(289, 284, 176, 29);
		panel.add(btnRedeemcart);
				
				JLabel lblAll = new JLabel("ALL");
				lblAll.setFont(new Font("Arial", Font.PLAIN, 25));
				lblAll.setBounds(35, 215, 60, 20);
				add(lblAll);
				
				JLabel lblDine = new JLabel("DINE");
				lblDine.setFont(new Font("Arial", Font.PLAIN, 25));
				lblDine.setBounds(135, 215, 76, 20);
				add(lblDine);
				
				JLabel lblPlay = new JLabel("PLAY");
				lblPlay.setFont(new Font("Arial", Font.PLAIN, 25));
				lblPlay.setBounds(245, 215, 69, 20);
				add(lblPlay);
				
				JLabel lblService = new JLabel("SERVICE");
				lblService.setFont(new Font("Arial", Font.PLAIN, 25));
				lblService.setBounds(329, 215, 110, 20);
				add(lblService);
				
				JLabel lblShop = new JLabel("SHOP");
				lblShop.setFont(new Font("Arial", Font.PLAIN, 25));
				lblShop.setBounds(462, 215, 76, 20);
				add(lblShop);
				
				JLabel lblTravel = new JLabel("TRAVEL");
				lblTravel.setFont(new Font("Arial", Font.PLAIN, 25));
				lblTravel.setBounds(560, 215, 102, 20);
				add(lblTravel);
				
				JSeparator separator = new JSeparator();
				separator.setBounds(-15, 245, 1215, 4);
				add(separator);
				
				textField = new JTextField();
				textField.setBounds(462, 262, 193, 30);
				add(textField);
				textField.setColumns(10);
				
				JButton btnNewButton = new JButton("");
				btnNewButton.setIcon(new ImageIcon(UOBRewardServicePanel.class.getResource("/Redeem/img/Search.png")));
				btnNewButton.setBounds(658, 262, 30, 30);
				add(btnNewButton);
				
				JLabel lblNewLabel_2 = new JLabel("Range From:");
				lblNewLabel_2.setFont(new Font("Arial", Font.PLAIN, 25));
				lblNewLabel_2.setBounds(15, 262, 147, 30);
				add(lblNewLabel_2);
				
				textField_1 = new JTextField();
				textField_1.setBounds(184, 262, 60, 30);
				add(textField_1);
				textField_1.setColumns(10);
				
				JLabel label = new JLabel("-");
				label.setFont(new Font("Arial", Font.PLAIN, 30));
				label.setBounds(255, 262, 18, 30);
				add(label);
				
				textField_2 = new JTextField();
				textField_2.setColumns(10);
				textField_2.setBounds(272, 262, 60, 30);
				add(textField_2);
				
				JLabel lblPoints = new JLabel("Points");
				lblPoints.setFont(new Font("Arial", Font.PLAIN, 25));
				lblPoints.setBounds(355, 262, 93, 30);
				add(lblPoints);
				
				JSeparator separator_1 = new JSeparator();
				separator_1.setBounds(0, 299, 1200, 4);
				add(separator_1);
				
				JButton button = new JButton("");
				button.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String cardNumber = null;
						JPanel contentPane = new UOBRewardMainPanel(myFrame, cardNumber, l1);
						myFrame.setContentPane(contentPane);
						myFrame.setVisible(true);
					}
				});
				button.setIcon(new ImageIcon(UOBRewardServicePanel.class.getResource("/Redeem/img/All1.png")));
				button.setBounds(25, 139, 60, 60);
				add(button);
				
				JButton btnNewButton_1 = new JButton("");
				btnNewButton_1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						JPanel contentPane = new UOBRewardDinePanel(myFrame, l1,cardNumber);
						myFrame.setContentPane(contentPane);
						myFrame.setVisible(true);
					}
				});
				btnNewButton_1.setIcon(new ImageIcon(UOBRewardServicePanel.class.getResource("/Redeem/img/Dine1.png")));
				btnNewButton_1.setBounds(135, 139, 60, 60);
				add(btnNewButton_1);
				
				JButton button_1 = new JButton("");
				button_1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						JPanel contentPane = new UOBRewardPlayPanel(myFrame, l1,cardNumber);
						myFrame.setContentPane(contentPane);
						myFrame.setVisible(true);
					}
				});
				button_1.setIcon(new ImageIcon(UOBRewardServicePanel.class.getResource("/Redeem/img/Play1.png")));
				button_1.setBounds(245, 139, 60, 60);
				add(button_1);
				
				JButton button_2 = new JButton("");
				button_2.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						JPanel contentPane = new UOBRewardServicePanel(myFrame, l1,cardNumber);
						myFrame.setContentPane(contentPane);
						myFrame.setVisible(true);
					}
				});
				button_2.setIcon(new ImageIcon(UOBRewardServicePanel.class.getResource("/Redeem/img/Service1.png")));
				button_2.setBounds(355, 139, 60, 60);
				add(button_2);
				
				JButton btnNewButton_2 = new JButton("");
				btnNewButton_2.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						JPanel contentPane = new UOBRewardShopPanel(myFrame, l1,cardNumber);
						myFrame.setContentPane(contentPane);
						myFrame.setVisible(true);
					}
				});
				btnNewButton_2.setIcon(new ImageIcon(UOBRewardServicePanel.class.getResource("/Redeem/img/Shop1.png")));
				btnNewButton_2.setBounds(465, 139, 60, 60);
				add(btnNewButton_2);
				
				JButton btnNewButton_3 = new JButton("");
				btnNewButton_3.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						JPanel contentPane = new UOBRewardTravelPanel(myFrame, l1,cardNumber);
						myFrame.setContentPane(contentPane);
						myFrame.setVisible(true);
					}
				});
				btnNewButton_3.setIcon(new ImageIcon(UOBRewardServicePanel.class.getResource("/Redeem/img/Travel1.png")));
				btnNewButton_3.setBounds(575, 139, 60, 60);
				add(btnNewButton_3);
				
				JButton button_15 = new JButton("");
				button_15.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						internalFrame.setVisible(true);
					}
				});
				button_15.setIcon(new ImageIcon(UOBRewardServicePanel.class.getResource("/Reward/img/Spa Elements $20 voucher.jpg")));
				button_15.setBounds(10, 319, 110, 110);
				add(button_15);
				
				JLabel lblEssoSynergyS = new JLabel("Spa Elements $20 voucher");
				lblEssoSynergyS.setFont(new Font("Arial", Font.PLAIN, 20));
				lblEssoSynergyS.setBounds(10, 440, 133, 20);
				add(lblEssoSynergyS);
				
				JLabel lblPoints_14 = new JLabel("2000 Points");
				lblPoints_14.setForeground(Color.RED);
				lblPoints_14.setBounds(10, 460, 103, 20);
				add(lblPoints_14);

				
				JButton btnRedeemCart = new JButton("Redeem Cart");
				btnRedeemCart.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						JPanel contentPane = new RedeemCartPanel(myFrame, l1,cardNumber);
						myFrame.setContentPane(contentPane);
						myFrame.setVisible(true);
					}
				});
				btnRedeemCart.setHorizontalAlignment(SwingConstants.LEFT);
				btnRedeemCart.setFont(new Font("Arial", Font.PLAIN, 25));
				btnRedeemCart.setIcon(new ImageIcon(UOBRewardServicePanel.class.getResource("/Redeem/img/Cart.png")));
				btnRedeemCart.setBounds(720, 187, 249, 35);
				add(btnRedeemCart);
			
	}

}
