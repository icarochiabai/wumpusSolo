package pt.c40task.l05wumpus;

public class Heroi extends Entidade{
	Controle ctrl;
	Caverna cav;
	public Heroi(int x, int y, Caverna cav) {
		super(x, y, 'P', cav, 0);
		cav.conectarHeroi(this);
		this.cav = cav;
		// TODO Auto-generated constructor stub
	}
	
	public void moverX(int v) {
		this.x += v;
	}
	
	public void moverY(int v) {
		this.y += v;
	}
	
	public void setControle(Controle ctrl) {
		this.ctrl = ctrl;
	}
	
	void display() {
		System.out.println(this.getX() + " " + this.getY());
	}
}
