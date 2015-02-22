package guiClient;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Dialog.ModalExclusionType;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JLabel;

public class Client {

		private JFrame frmCyprusPillota;
		//Drop Down List: //
		static JComboBox<String> Fili;
		static JComboBox<String> Bid;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Client window = new Client();
					window.frmCyprusPillota.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}



	public Client() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCyprusPillota = new JFrame();
		frmCyprusPillota.setResizable(false);
		frmCyprusPillota.setModalExclusionType(ModalExclusionType.TOOLKIT_EXCLUDE);
		frmCyprusPillota.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCyprusPillota.setTitle("Cyprus Pillota");
		frmCyprusPillota.setBounds(100, 100, 839, 756);
		
		
		
		
		// Drop Down List: //
		Fili = new JComboBox<String>();   
		Bid = new JComboBox<String>();
		setUpDropDownList();
		
		
		// Panels:  //
		JPanel table = new Table();
		table.setBackground(new Color(0, 128, 0));
		table.setForeground(new Color(0, 128, 0));
		JPanel hand = new Hand();
		
		JButton btnBit = new JButton("Bit");
		
		JLabel Name0 = new JLabel("Name0");
		
		JLabel Name1 = new JLabel("Name1");
		
		JLabel Name2 = new JLabel("Name2");
		
		JLabel Name3 = new JLabel("Name3");
		
		
		
		// Positioning: //
		GroupLayout groupLayout = new GroupLayout(frmCyprusPillota.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addGap(98)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(Name2)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(table, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(Fili, GroupLayout.PREFERRED_SIZE, 188, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(Bid, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnBit, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE)))
					.addGap(18)
					.addComponent(Name0)
					.addGap(110))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(388)
					.addComponent(Name1)
					.addContainerGap(407, Short.MAX_VALUE))
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addContainerGap(128, Short.MAX_VALUE)
					.addComponent(hand, GroupLayout.PREFERRED_SIZE, 631, GroupLayout.PREFERRED_SIZE)
					.addGap(80))
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addContainerGap(401, Short.MAX_VALUE)
					.addComponent(Name3)
					.addGap(394))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(53)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(Fili, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(Bid, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnBit))
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(Name1)
									.addGap(7)
									.addComponent(table, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(221)
									.addComponent(Name2)))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(Name3))
						.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
							.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(Name0)
							.addGap(220)))
					.addPreferredGap(ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
					.addComponent(hand, GroupLayout.PREFERRED_SIZE, 125, GroupLayout.PREFERRED_SIZE)
					.addGap(45))
		);
		frmCyprusPillota.getContentPane().setLayout(groupLayout);
		
	}
	
	
	
	private static void setUpDropDownList(){
	
		Fili.addItem("KOUPA");
		Fili.addItem("KARO");
		Fili.addItem("SPATHI");
		Fili.addItem("PIKKA");
		
		
		for(int i = 8;i<=80;i++ ){
			Bid.addItem(""+i);		
		}
	}
}
