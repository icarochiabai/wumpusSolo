package pt.c40task.l05wumpus;
import java.util.Scanner;

public class Controle {
	private Heroi h;
	private Caverna cav;
	private Scanner keyboard = new Scanner(System.in);
	
	public Controle(Caverna c) {
		this.cav = c;
		c.getH().setControle(this);
		this.h = c.getH();
	}
	public char pegarComando() {
		System.out.println("Digite um comando: ");
		String command = keyboard.nextLine();
		if(command.length() > 1) {
			return '0';
		}
		return command.charAt(0);
	}
	public void realizarComando(char c) {
		if(c == 's') {
			if(this.h.getX() + 1 < this.cav.getSIZEX()) {				
				this.h.moverX(1);
			}
		}
		if(c == 'w') {
			if(this.h.getX() - 1 >= 0) {
				this.h.moverX(-1);
			}
		}
	}
}
