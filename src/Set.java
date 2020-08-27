
public class Set {
	LinkedNode front; // Reference to the first LinkedNode in the list
	int count; // Number of nodes in the list
	
	public Set() {
		front = null;
		count = 0;
	}
	
	void add(int x) {
		LinkedNode newNode = new LinkedNode(x);
		newNode.next = front;
		front = newNode;
		count++;
	}
	
	void del(int x) {
	
	}
	
	
	boolean exists(int x) {
		return false;
	}
	public String toString() {
		String str = "";

		LinkedNode cur = front;
		while (cur != null) {
			str += cur.x + " ";
			cur = cur.next;
		}

		return str;
	}

}
	