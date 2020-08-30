/* Jason Vargas
 * Programming Fundamentals
 * Summer 2020
 * Program 4 - Set ADT
 */

class Set {
	int count;
	LinkedNode currentNode;
	LinkedNode front;

	public Set() {
		count = 0;
		currentNode = null;
		front = null;
	}

	public int getCount() {
		return count;
	}

	// Adds a new node and does not allow for duplicates
	public void add(int value) {
		// If count is 0, that means we are adding our first node.
		if (count == 0) {
			front = new LinkedNode(value);
			// And current node also to the first value
			currentNode = front;
		} else {
			if (exists(value)) { // To avoid adding duplicates
				return;
			}
			// Create next node
			LinkedNode newNode = new LinkedNode(value);
			if (count == 1) {
				newNode.next = front;
			}
			// Then the next node for the current front to the next node
			currentNode.setNextNode(newNode);
			// And current node to next, which is why we set the next node to next in the
			// line above.
			currentNode = newNode;
		}

		count++;
	}

	// Removes the node at the given index.
	public void removeNode(int index) {

		if (count == 0) {
			return;
		}
		if (index == 0) {
			front = front.nextNode();
		} else {
			// Save the next node
			LinkedNode next = getNode(index).nextNode();
			// Remove the node at the index
			getNode(index - 1).setNextNode(next);
		}
		count--;
	}

	// Checks if the int is in linked list.
	public boolean exists(int value) {
		// If our count is 0, return false
		if (count == 0) {
			return false;
		}
		// Loop through linked list
		for (int i = 0; i < count; i++) {
			// And compare each value to the value the user wants.
			if (getNode(i).getValue() == value) {
				return true;
			}
		}
		return false;
	}

	public LinkedNode getNode(int index) {
		// If our linked node count is 0
		if (count == 0) {
			return null;
		}
		LinkedNode currentNode = front;
		for (int i = 0; i < count; i++) {
			// If i isn't 0, get the next node
			if (i != 0) {
				currentNode = currentNode.nextNode();
			}
			// Once i reaches the index we want
			if (i == index) {
				// We return it
				return currentNode;
			}

		}
		return null;
	}

	// Deletes the node with the value given
	public void del(int value) {
		// If our node size is 0, do nothing.
		if (count == 0) {
			return;
		}
		// Loop through all our nodes, then remove.
		for (int i = 0; i < count; i++) {
			if (getNode(i).getValue() == value) {
				removeNode(i);
				i = count - 1;
			}
		}
	}

	public String toString() {
		String str = "";
		if (count != 0) {
			// Loop through our linked nodes in reverse to output newest node first
			for (int i = count - 1; i > -1; i--) {
				LinkedNode current = getNode(i);
				str += current.getValue() + " ";
			}
		}
		return str;
	}

}