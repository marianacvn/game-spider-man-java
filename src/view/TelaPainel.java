package view;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import model.Personagem;

public class TelaPainel extends JPanel {
	BufferedImage graphicsImagem, predioImagem;
	JLabel exitJLabel;
	Personagem personagem;
	Graphics g;
	
	public TelaPainel(Personagem personagem) {
		setLocation(0,0);
		setSize(544,718);
		setLayout(null);
		
		this.personagem = personagem;
		exitJLabel = new JLabel(new ImageIcon("images/exit.png"));
		exitJLabel.setBounds(0, 0, 100, 29);
		try {
			predioImagem = ImageIO.read(new File("images/predio.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		graphicsImagem = new BufferedImage(544, 718, BufferedImage.TYPE_4BYTE_ABGR);
		g = graphicsImagem.getGraphics();
		
		add(exitJLabel);
		
		
		setVisible(true);
		
		
	}
	
	protected void paintComponent(Graphics g) {
		g.drawImage(graphicsImagem, 0, 0, null);
		g.drawImage(predioImagem, 0, 0, null);
		g.drawImage(personagem.getSprites()[personagem.getAparencia()], personagem.getPosX(), personagem.getPosY(), null);
	}

	public Graphics getG() {
		return g;
	}

	public BufferedImage getGraphicsImagem() {
		return graphicsImagem;
	}

	public BufferedImage getPredioImagem() {
		return predioImagem;
	}

	public JLabel getExitJLabel() {
		return exitJLabel;
	}

	public Personagem getPersonagem() {
		return personagem;
	}
	
	

}
