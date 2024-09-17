package controller;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ThreadCruzamento {
	private Lock cruzamento = new ReentrantLock();
	
	public void atravessarCruzamento(String sentido) {
		cruzamento.lock();
		
		try {
			long threadId = Thread.currentThread().getId();
			
			System.out.println("O carro " + threadId + " está passando no sentido: " + sentido);
			
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			cruzamento.unlock();
		}
	}
}
