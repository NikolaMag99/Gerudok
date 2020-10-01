package gui;

import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.Box;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;

@SuppressWarnings("serial")
public class About extends JDialog {

	public About(JFrame parent) {
		super(parent, "Tim 203_17", true);
		setSize(500, 270);

		setLocationRelativeTo(parent);

		setLayout(new GridLayout(1, 2, 20, 20));

		JLabel lblPodaciNikola = new JLabel("Nikola Paunovic 57/18RN");
		ImageIcon imageNikola = new ImageIcon("images/nikola1.jpg");
		Image resizedImageNikola = imageNikola.getImage().getScaledInstance(200, 200, 1);
		JLabel lblNikola = new JLabel(new ImageIcon(resizedImageNikola));
		lblNikola.setAlignmentX(JLabel.CENTER_ALIGNMENT);
		lblPodaciNikola.setAlignmentX(CENTER_ALIGNMENT);
		Box boxNikola = Box.createVerticalBox();
		boxNikola.add(lblPodaciNikola);
		boxNikola.add(lblNikola);



		add(boxNikola);
		setLocationRelativeTo(parent);
	}
}
