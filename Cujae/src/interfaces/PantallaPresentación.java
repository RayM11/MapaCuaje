package interfaces;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JProgressBar;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PantallaPresentaci�n extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	
	public PantallaPresentaci�n() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 550, 454);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Iniciar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				PantallaMenuEsqueleto pME = new PantallaMenuEsqueleto();
				pME.setVisible(true);
				dispose();
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnNewButton.setBounds(216, 303, 139, 33);
		contentPane.add(btnNewButton);
		
		JProgressBar barraCargaPantallaPresentaci�n = new JProgressBar();
		barraCargaPantallaPresentaci�n.setFont(new Font("Tahoma", Font.BOLD, 11));
		barraCargaPantallaPresentaci�n.setForeground(Color.GREEN);
		barraCargaPantallaPresentaci�n.setStringPainted(true);
		barraCargaPantallaPresentaci�n.setBounds(181, 239, 194, 14);
		contentPane.add(barraCargaPantallaPresentaci�n);
		
		JLabel papelTapuis = new JLabel("d");
		papelTapuis.setIcon(new ImageIcon(PantallaPresentaci�n.class.getResource("/texturas/tapiz.jpg")));
		papelTapuis.setBounds(0, 0, 534, 221);
		contentPane.add(papelTapuis);
	}
}
