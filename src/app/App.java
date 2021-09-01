package app;

import java.io.IOException;

import controller.Controle;
import model.Personagem;


public class App {
	public static void main(String[] args) {
		Personagem aranha = null;
		try {
			 aranha = new Personagem("images/spider.png", 0, 6, 1, 15, 610);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Controle c = new Controle(aranha);

		
	}

}
