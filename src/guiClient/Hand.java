package guiClient;

import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.JLabel;

public class Hand extends JPanel {
	// Cards Variable: //
	 JLabel Card1;
	 JLabel Card2;
	 JLabel Card3;
	 JLabel card4;
	 JLabel Card5;
	 JLabel Card6;
	 JLabel Card7;
	 JLabel Card8;

	public Hand() {
	
		setLayout(new GridLayout(1, 0, 0, 0));

		//Cards Labels: //
		
		JLabel Card1 = new JLabel("1");
		JLabel Card2 = new JLabel("2");
		JLabel Card3 = new JLabel("3");
		JLabel card4 = new JLabel("4");
		JLabel Card5 = new JLabel("5");
		JLabel Card6 = new JLabel("6");
		JLabel Card7 = new JLabel("7");
		JLabel Card8 = new JLabel("8");
		
		// Possitioning: //
		add(Card1);
		add(Card2);
		add(Card3);
		add(card4);
		add(Card5);
		add(Card6);
		add(Card7);
		add(Card8);

	}

}
