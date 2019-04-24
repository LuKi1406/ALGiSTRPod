package stckPckg;

/**
 * Interface for abstract date structure Stack 
 * with array realisation
 * @author ime i prezime
 *
 * @param <E>
 */
public interface StackArrayADT<E> {
	
	
	
	/**
	 * Method that returns stack size or number of elements in the stack
	 * @return size of the stack
	 */
	public int size();
	
	/**
	 * Method that check if the stack is empty or not
	 * @return false for not empty, and true otherwise
	 */
	public boolean isEmpty();
	
	/**
	 * Method that push element into the first position to the stack
	 * @param e
	 * @throws Exception 
	 */
	public void push(E e) throws Exception;
	
	/**
	 * Method that gives first element and remove it from the stack
	 * @return element
	 */
	public E pop();
	
	/**
	 * Method that gives but not removes element -> first
	 * @return first element
	 */
	public E top();

}
