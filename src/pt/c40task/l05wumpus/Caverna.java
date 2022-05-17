package pt.c40task.l05wumpus;

public class Caverna {
	private int SIZEX = 4;
	private int SIZEY = 4;
	
	private Heroi h;
	private Controle ctrl;
	
	private Sala[][] salas = new Sala[4][4];
	
	public Caverna() {
		for(int i = 0; i < SIZEX; i++) {
			for(int j = 0; j < SIZEY; j++) {
				salas[i][j] = new Sala(i, j, this);
			}
		}
	}
	
	public void atualizarSala(int x, int y, char c) {
		this.salas[x][y].atualizar(c, this);
	}
	
	public void atualizarSala(int x, int y) {
		this.salas[x][y].atualizar();
	}
	
	public void criarFedor(int x, int y) {
		Fedor f = new Fedor(x, y, this);
		if(x+1 < SIZEX) {			
			this.salas[x+1][y].atualizar(f);
		}
		if(x-1 >= 0) {			
			this.salas[x-1][y].atualizar(f);
		}
		if(y+1 < SIZEY) {
			this.salas[x][y+1].atualizar(f);		
		}
		if(y-1 >= 0) {			
			this.salas[x][y-1].atualizar(f);
		}
	}
	
	public void criarBrisa(int x, int y) {
		Brisa b = new Brisa(x, y, this);
		
		if(x+1 < SIZEX) {			
			this.salas[x+1][y].atualizar(b);
		}
		if(x-1 >= 0) {			
			this.salas[x-1][y].atualizar(b);
		}
		if(y+1 < SIZEY) {			
			this.salas[x][y+1].atualizar(b);
		}
		if(y-1 >= 0) {			
			this.salas[x][y-1].atualizar(b);
		}
	}
	public Sala[][] getSalas(){
		return this.salas;
	}
	
	public void conectarHeroi(Heroi h) {
		this.h = h;
	}
	
	public Heroi getH() {
		return this.h;
	}
	
	public int getSIZEX() {
		return this.SIZEX;
	}
	
	public int getSIZEY() {
		return this.SIZEY;
	}
	
	void display() {
		for(int i = 0; i < SIZEX; i++) {
			for(int j = 0; j < SIZEY; j++) {
				System.out.print(salas[i][j].getSimbolo());
			}
			System.out.println();
		}
	}
}
