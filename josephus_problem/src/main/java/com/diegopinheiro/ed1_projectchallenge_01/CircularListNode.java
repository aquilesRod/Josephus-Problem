package com.diegopinheiro.ed1_projectchallenge_01;

public class CircularListNode {
	
	private CircularListNode previous;
	private CircularListNode next;
	private Integer value;
	
	public CircularListNode(Integer value, CircularListNode next, CircularListNode previous) {
		this.value = value;
		this.next = next;
		this.previous = previous;
	}

	public CircularListNode getPrevious() {
		return previous;
	}

	public void setPrevious(CircularListNode previous) {
		this.previous = previous;
	}

	public CircularListNode getNext() {
		return next;
	}

	public void setNext(CircularListNode next) {
		this.next = next;
	}

	public Integer getValue() {
		return value;
	}

	public void setValue(Integer value) {
		this.value = value;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj instanceof CircularListNode) {
			CircularListNode other = (CircularListNode) obj;
			return this.value.equals(other.value);
		}
		return false;
	}

	@Override
	public String toString() {
		return String.valueOf(this.value);
	}
	
}
