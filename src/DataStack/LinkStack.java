package DataStack;

public class LinkStack implements IStack{
	 private Node top;
	//
	
	public void clear(){
		top = null;
	}

	//
	public boolean isEmpty() {
		return top == null;
	}

	//
	public int length() {
		Node p = top;
		int length = 0;
		while (p != null) {
			p = p.next;
			++length;
		}
		return length;
	}

	//
	public Object peek() {
		if (!this.isEmpty())
			return top.data;
		else
			return null;
	}

	//
	public void push(Object x) {
		Node p = new Node(x);
		p.next = top;
		top = p;
	}

	//
	public Object pop() {
		if (this.isEmpty()) {
			return null;
		} else {
			Node p = top;
			top = top.next;
			return p.data;
		}
	}

}
