package stckListPckg;

import java.util.Arrays;

public class AppClient {
	
	public static void main(String[] args) throws Exception {
		StackList<String> st2 = new StackList<>();
		System.out.println(st2.size());
		st2.push("Ovo je prvi ubačeni!");
		st2.push("Ovo je drugi ubačeni!");
		st2.push("Ovo je treći ubačeni!");
		st2.push("Ovo je četvrti ubačeni!");
		System.out.println(st2.size());
		System.out.println(st2.pop());
		st2.push("Novi u stogu...");
		st2.push("Opet neki string...");
//		st2.push("Što je s ovim?");
		
		String[] arr = {"Prvi", "drugi", "treći", "zadnji"};
		System.out.println(Arrays.toString(arr));
		arr = OperationsClass.reverseOrder(arr);
		System.out.println(Arrays.toString(arr));
	}

}
