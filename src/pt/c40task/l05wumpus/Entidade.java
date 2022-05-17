package pt.c40task.l05wumpus;

public class Entidade {
	protected int x;
	protected int y;
	protected int prioridade;
	protected char c;
	protected Caverna cav;
	
	public Entidade(int x, int y, char simbolo, Caverna cav, int k) {
		this.x = x;
		this.y = y;
		this.c = simbolo;
		this.cav = cav;
		this.prioridade = k;
	}
	public int getX() {
		return this.x;
	}

	public int getY() {
		return this.y;
	}
	
	public char getC() {
		return this.c;
	}
	public void setC(char c) {
		this.c = c;
	}
	public int getPrio() {
		return this.prioridade;
	}
}
