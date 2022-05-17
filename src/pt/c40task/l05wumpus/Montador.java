package pt.c40task.l05wumpus;

public class Montador {
	private Caverna c; // Tem q ter o arquivo com as posicoes dos negocios
	private String[][] file;
	
	public Montador(Caverna cav, String[][] file) {
		this.c = cav;
		this.setFile(file);
	}
	
	public void setFile(String[][] file) {
		this.file = file;
	}
	
	public void adicionarEntidades() {
		for(int i = 0; i < this.file.length; i++) {
			char[] c = new char[3];
			for(int j = 0; j < this.file[i].length; j++) {
				c[j] = this.file[i][j].charAt(0);
			}

			this.c.atualizarSala(c[0] - '0' - 1, c[1] - '0' - 1, c[2]); // sobrecarregar sem o tipo pra descobrir a sala
		}
	}
}
