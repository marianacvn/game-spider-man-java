package view;

import javax.swing.JOptionPane;

public class Mensagem {
	
	public static int mensagem(String mensagem) {
		return JOptionPane.showConfirmDialog(null, mensagem, "", 0);
	}

}
