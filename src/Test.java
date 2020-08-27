
//Driver program
public class Test {

	public static void main(String[] args) {
		Set queue = new Set();
		queue.add(5);
		queue.add(8);
		queue.add(12);
		queue.add(14);
		queue.add(19);

		System.out.println(queue);
		
		queue.del(12);
		System.out.println(queue);

	}

}
