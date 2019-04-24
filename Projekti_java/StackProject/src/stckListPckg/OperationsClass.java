package stckListPckg;

public class OperationsClass {
	
	public static <E> E[] reverseOrder(E[] arr) throws Exception {
		
		StackList<E> buffer = new StackList<>();
		int indx = 0;
		
		while(buffer.size() < arr.length) {
			buffer.push(arr[indx]);
			indx++;
		}
		indx = 0;
		while(!buffer.isEmpty()) {
			arr[indx] = buffer.pop();
			indx++;
		}
		
		return arr;
	}

}
