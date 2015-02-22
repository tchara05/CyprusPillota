package guiClient;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;

public class Table extends JPanel {
	
	
	// Cards Variable //
	public JLabel lblPlayedcard0;
	public JLabel lblPlayedcard1;
	public JLabel lblPlayedcard2;
	public JLabel lblPlayedcard3;

	public Table() {
		setForeground(new Color(0, 128, 0));
		
		
		
		// Cards Labels //
		JLabel lblPlayedcard = new JLabel("PlayedCard1");
		JLabel lblPlayedcard_1 = new JLabel("PlayedCard2");
		JLabel lblPlayedcard_2 = new JLabel("PlayedCard3");
		JLabel lblPlayedcard_3 = new JLabel("PlayedCard4");
		
		
		
		//Positioning //
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(80)
					.addComponent(lblPlayedcard, GroupLayout.PREFERRED_SIZE, 87, GroupLayout.PREFERRED_SIZE)
					.addGap(35)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblPlayedcard_1, GroupLayout.PREFERRED_SIZE, 87, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblPlayedcard_3, GroupLayout.PREFERRED_SIZE, 87, GroupLayout.PREFERRED_SIZE))
					.addGap(43)
					.addComponent(lblPlayedcard_2, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(78, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(39)
							.addComponent(lblPlayedcard_1, GroupLayout.PREFERRED_SIZE, 125, GroupLayout.PREFERRED_SIZE)
							.addGap(51)
							.addComponent(lblPlayedcard_3, GroupLayout.PREFERRED_SIZE, 125, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(130)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblPlayedcard, GroupLayout.PREFERRED_SIZE, 125, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblPlayedcard_2, GroupLayout.PREFERRED_SIZE, 125, GroupLayout.PREFERRED_SIZE))))
					.addContainerGap(55, Short.MAX_VALUE))
		);
		setLayout(groupLayout);

	}
}
