/* Jason Vargas
 * Programming Fundamentals
 * Summer 2020
 * Program 4 - Set ADT
 */

class LinkedNode {
	int x; // The data value
	LinkedNode next; // Reference to the next LinkedNode

	public LinkedNode(int x) {
		this.x = x;
		next = null;
	}

	public int getValue() {
		return x;
	}

	public LinkedNode nextNode() {
		return next;
	}

	public void setNextNode(LinkedNode setNode) {
		next = setNode;
	}
}
