package casa;

public class Casa {

	private String cor;
	private int totalDePortas;
	Porta[] portas = new Porta[3];
	
	
	public Casa() {
		setCor(cor);
		
	}	
	
	public String getCor() {
		System.out.println("Casa de cor: " + cor);
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}



	public void adicionaPorta() {
		if (portas != null) {
			Porta portas = new Porta();
		}
		 
	}



	public void pinta(String s) {
		
	}
}
