package stckPckg;

public class StackArray<E> implements StackArrayADT<E>{
	
	private E[] arr;
	private final int CAPACITY = 300;
	int ind = -1; // initial index position for stack element
	
	public StackArray() {
		arr = (E[]) new Object[CAPACITY];
	}
	
	
	public StackArray(int cap) {
		arr = (E[]) new Object[cap];
	}

	@Override
	public int size() {
		return ind+1;
	}

	@Override
	public boolean isEmpty() {
		return (ind == -1);
	}

	@Override
	public void push(E e) throws Exception {
		if(ind < arr.length) {
			arr[++ind] = e;
			
		} else {
			throw new Exception("Stack is full!");
		}
		
	}

	@Override
	public E pop() {
		if(this.isEmpty()) {
			return null;
		} else {
			E el= arr[ind];
			arr[ind] = null;
			ind--;
			return el;
		}
		
	}

	@Override
	public E top() {
		if(this.isEmpty()) {
			return null;
		} else {
			return arr[ind];
		}
		
	}

	

}
