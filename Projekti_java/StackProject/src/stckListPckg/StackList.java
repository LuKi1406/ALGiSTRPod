package stckListPckg;

import java.util.LinkedList;

import stckPckg.StackArrayADT;

public class StackList<E> implements StackArrayADT<E>{
	
	LinkedList<E> lista;
	private final int CAP = 5;
	
	public StackList() {
		lista = new LinkedList<>();
	}

	@Override
	public int size() {
		return lista.size();
	}

	@Override
	public boolean isEmpty() {
		return lista.isEmpty();
	}

	@Override
	public void push(E e) throws Exception {
		if(lista.size() < CAP) {
			lista.addFirst(e);
		} else {
			throw new Exception("Stack is full!");
		}
	}

	@Override
	public E pop() {
		if(this.isEmpty()) {
			return null;
		} else {
			return lista.removeFirst();
		}
		
	}

	@Override
	public E top() {
		if(this.isEmpty()) {
			return null;
		} else {
			return lista.getFirst();
		}
		
	}

}
