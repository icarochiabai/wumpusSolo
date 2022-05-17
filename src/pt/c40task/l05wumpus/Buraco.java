package pt.c40task.l05wumpus;

public class Buraco extends Entidade{

	public Buraco(int x, int y, Caverna cav) {
		super(x, y, 'B', cav, 1);
		this.cav.criarBrisa(x, y);	
		// TODO Auto-generated constructor stub
	}

}
