package controller;

public class Carro extends Thread {
	private ThreadCruzamento cruzamento;
	private String sentido;
	
	public Carro(ThreadCruzamento cruzamento, String sentido) {
		this.cruzamento = cruzamento;
		this.sentido = sentido;
	}
	
	@Override
	public void run() {
		cruzamento.atravessarCruzamento(sentido);
	}
}
