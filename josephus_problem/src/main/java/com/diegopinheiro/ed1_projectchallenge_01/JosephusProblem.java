package com.diegopinheiro.ed1_projectchallenge_01;

public class JosephusProblem {

	public static Integer[] solve(int m, int n) {
		CircularLinkedList circle = new CircularLinkedList();
		Integer [] deaths = new Integer [n];
		CircularListNode aux;
		int unluckyNumber;
		
		for (int i=0; i<n; i++) {
			circle.addLast(i);
		}
		
		CircularListNode unluckyPerson = circle.getHead();
		
		for (int i=0; i<n; i++) {
			//encontrar o numero azarado e depois a pessoa pertecente ao numero azarado
			unluckyNumber = circle.get(unluckyPerson, m-1);
			unluckyPerson = circle.search(unluckyNumber);
			
			//atribuir o ponto de começo da contagem na proxima pessoa
			aux = unluckyPerson;
			unluckyPerson = circle.getSuccessor(aux);
			
			//matar
			circle.delete(aux);
			deaths[i] = unluckyNumber;
		}
		return deaths;
	}

}
