package pt.c40task.l05wumpus;

public class Sala {
	private Entidade e;
	private int x, y;
	private boolean descoberta = false;
	private boolean heroiPresente = false;
	
	public Sala(int x, int y, Caverna cav) {
		this.x = x;
		this.y = y;
		this.e = new Nada(this.x, this.y, cav);
	}
	
	public void atualizar(char tipo, Caverna cav) {
		if(tipo == 'P') {
			this.e = new Heroi(this.x, this.y, cav);
			this.descoberta = true;
			this.heroiPresente = true;
		}
		else if(tipo == 'W') {
			this.e = new Wumpus(this.x, this.y, cav);
		}
		else if(tipo == 'B') {
			this.e = new Buraco(this.x, this.y, cav);
		}
		else if(tipo == 'O') {
			this.e = new Ouro(this.x, this.y, cav);
		}	
		else if(tipo == '_') {
			
		}
	}
	public boolean getB() {
		return this.descoberta;
	}
	public void atualizar(Entidade nova) {
		if(nova.getPrio() > this.e.getPrio()) {
			this.e = nova;
		}
	}
	public void atualizar() {
		this.descoberta = true;
	}
	
	public char getSimbolo() {
		if(this.descoberta) {
			if(heroiPresente) {	
				if(this.e.getPrio() >= 0) {					
					return this.e.getC();
				} else {
					return 'P';
				}
			} else {
				return this.e.getC();
			}
		}
		return '-';
	}
}
