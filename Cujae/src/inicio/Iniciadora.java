package inicio;

import interfaces.PantallaPresentaci�n;

import java.awt.EventQueue;

public class Iniciadora {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PantallaPresentaci�n frame = new PantallaPresentaci�n();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
