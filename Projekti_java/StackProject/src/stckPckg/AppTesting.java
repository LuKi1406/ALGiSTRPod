package stckPckg;

public class AppTesting {
	
	public static void main(String[] args) throws Exception {
		StackArray<Integer> st1 = new StackArray<>();
		System.out.println(st1.size());
		st1.push(34);
		System.out.println(st1.size());
		st1.push(123);
		st1.push(234);
		st1.push(867);
		System.out.println(st1.size());
		int var = st1.pop();
		System.out.println(var);
	}
	

}
