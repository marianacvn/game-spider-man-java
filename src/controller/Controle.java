package controller;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JOptionPane;

import model.Personagem;
import view.Mensagem;
import view.TelaPainel;
import view.TelaPrincipal;

public class Controle extends KeyAdapter implements MouseListener {
	TelaPrincipal principal;
	Graphics g;
	Personagem personagem;
	int up, down;
	
	public Controle( Personagem personagem) {
		super();
		this.personagem = personagem;
		
		principal = new TelaPrincipal(personagem);
		
		this.g = principal.getPainel().getG();
		
		principal.addKeyListener(this);
		principal.getPainel().getExitJLabel().addMouseListener(this);
		
		run();
	}
	
	
	
	
	
	public void run() {
		while(true) {
			principal.getPainel().repaint();
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}


	@Override
	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode() == KeyEvent.VK_UP ) {
			if(personagem.getPosY() > 180) {
				personagem.setPosY(personagem.getPosY()-1);
				
				switch (up) {
					case 0: {
						personagem.setAparencia(0);
						break;
					} 
					case 1: {
						personagem.setAparencia(1);
						break;
					}
					case 2: {
						personagem.setAparencia(2);
						break;
					}
					case 3: {
						personagem.setAparencia(3);
						break;
					}
					case 4: {
						personagem.setAparencia(4);
						break;
					}
					case 5: {
						personagem.setAparencia(5);
						break;
					}
				}
				if(up <= 5) {
					up++;
				} else {
					up = 0;
				}
			}
		} 
		if(e.getKeyCode() == KeyEvent.VK_DOWN ) {
			if(personagem.getPosY() < 640) {
				personagem.setPosY(personagem.getPosY()+1);
				switch (down) {
					case 0: {
						personagem.setAparencia(0);
						break;
					} 
					case 1: {
						personagem.setAparencia(1);
						break;
					}
					case 2: {
						personagem.setAparencia(2);
						break;
					}
					case 3: {
						personagem.setAparencia(3);
						break;
					}
					case 4: {
						personagem.setAparencia(4);
						break;
					}
					case 5: {
						personagem.setAparencia(5);
						break;
					}
				}
				if(down <= 5) {
					down++;
				} else {
					down = 0;
				}
		}
		
	}
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		if(e.getSource() == principal.getPainel().getExitJLabel()) {
			int op = Mensagem.mensagem("Deseja encerrar?");
			if(op == 0) {
				personagem.setPosY(610);
			} else {
				System.exit(0);
			}
			
			
		}
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


}
	
	
	
	

