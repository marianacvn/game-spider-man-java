package view;


import javax.swing.JFrame;


import model.Personagem;


public class TelaPrincipal extends JFrame{
	TelaPainel painel;
	Personagem personagem;
	
	
	
	public TelaPrincipal(Personagem personagem) {
		super("Homem-Aranha");
		
		setSize(548,718);
		setResizable(false);
		setLayout(null);
		setUndecorated(true);
		setLocationRelativeTo(null);
		
		this.personagem = personagem;
		
		painel = new TelaPainel(personagem);
		

		add(painel);
		
		
		setVisible(true);
	}


	public TelaPainel getPainel() {
		return painel;
	}


	public void setPainel(TelaPainel painel) {
		this.painel = painel;
	}
	
	
		
		
		
		
	}
		
		
	


