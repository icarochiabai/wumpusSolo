package pt.c40task.l05wumpus;

public class Wumpus extends Entidade{
	public Wumpus(int x, int y, Caverna cav) {
		super(x, y, 'W', cav, 1);
		this.cav.criarFedor(this.x, this.y);
		// TODO Auto-generated constructor stub
	}
}
