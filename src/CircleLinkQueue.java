
public class CircleLinkQueue {
	private Node rear;
	
	public void clear() {
		rear.next = rear;
	}
	
	public void offer(Object x )throws Exception{
		Node p = new Node(x);
		p.next = rear.next;
		rear.next = p;
		rear = p;
	}
	
	public void poll()throws Exception{
		Node p = rear.next.next;
		if(p == rear)
			rear.next = rear;
		else
			rear.next.next = p.next;
		
	}

}
