package inicio;

import interfaces.PantallaPresentaci�n;

import java.awt.EventQueue;
import java.io.File;

import javax.swing.UIManager;

import auxiliar.Configuracion;
import auxiliar.Usuario;

public class Iniciadora {

	public static void establecerAdmin(){

		File admin = new File("data/admin.dat");

		if(!admin.exists()){
			Usuario u = new Usuario();
			u.crearAdmin("Virgilio66", "StormAproaching");
		}

	}

	public static void main(String[] args) {

		try {
			UIManager.setLookAndFeel("com.jtattoo.plaf.acryl.AcrylLookAndFeel"); 
		} catch (Throwable e) {
			e.printStackTrace();
		} 

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {

					Iniciadora.establecerAdmin();
					
					Configuracion configActual = new Configuracion();
					PantallaPresentaci�n frame = new PantallaPresentaci�n(configActual);
					frame.setVisible(true);

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
