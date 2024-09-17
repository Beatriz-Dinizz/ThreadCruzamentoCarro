package view;

import controller.Carro;
import controller.ThreadCruzamento;

public class Principal {

	public static void main(String[] args) {
		ThreadCruzamento cruzamento = new ThreadCruzamento();
		
		Carro carro1 = new Carro(cruzamento, "Norte-Sul");
		Carro carro2 = new Carro(cruzamento, "Leste-Oeste");
		Carro carro3 = new Carro(cruzamento, "Sul-Norte");
		Carro carro4 = new Carro(cruzamento, "Oeste-Leste");
		
		carro1.start();
		carro2.start();
		carro3.start();
		carro4.start();		
	}
}
