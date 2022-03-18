package com.diegopinheiro.ed1_projectchallenge_01;

public class CircularLinkedList {
	
	private CircularListNode sentinel;

	public CircularLinkedList() {
		this.sentinel = new CircularListNode(null, null, null);
		this.sentinel.setNext(this.sentinel);
		this.sentinel.setPrevious(this.sentinel);
	}
	
	public void addLast(Integer value) {
		CircularListNode oldTail = this.sentinel.getPrevious();
		CircularListNode newTail = new CircularListNode(value, this.sentinel, oldTail);
		
		oldTail.setNext(newTail);
		this.sentinel.setPrevious(newTail);
	}
	
	public CircularListNode search(Integer value) {
		CircularListNode node = this.sentinel.getNext();
		
		while (node != this.sentinel) {
			if (value == node.getValue()) {
				return node;
			}
			node = node.getNext();
		}
		return null;
	}
	
	public void delete(CircularListNode nodeDelete) {
		CircularListNode previousNode = nodeDelete.getPrevious();
		CircularListNode nextNode = nodeDelete.getNext();
		
		previousNode.setNext(nextNode);
		nextNode.setPrevious(previousNode);
	}
	
	public int get(CircularListNode currentNode, Integer index) {
		if (isEmpty()) {
			return 0;
		}
		
		for(int i=0; i<index; i++) {
			currentNode = currentNode.getNext();
			if (currentNode == this.sentinel) {
				currentNode = currentNode.getNext();
			}
		}
		return currentNode.getValue();
	}
	
	public CircularListNode getSuccessor(CircularListNode currentNode) {
		if (currentNode.getNext() == this.sentinel) {
			return this.sentinel.getNext();
		}
		return currentNode.getNext();
	}
	
	public CircularListNode getHead() {
		return this.sentinel.getNext();
	}
	
	public boolean isEmpty() {
		return this.sentinel.getNext() == this.sentinel;
	}
	
}
