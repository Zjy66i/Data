

public class LinkList implements IList {
	public Node head;
	
	public LinkList() {
		head = new Node();
	}

	public LinkList(int n) throws Exception {
		this();
	}

	public void clear() {
		head.data = null;
		head.next = null;
	}

	public boolean isEmpty() {
		return head.next == null;
	}

	public int length() {
		Node p = head.next;
		int length = 0;
		while (p != head) {
			p = p.next;
			++length;
		}
		return length;
	}

	public Node get(int i) throws Exception {
		Node p = head.next;
		int j = 0;
		while (p != null && j < i) {
			p = p.next;
			++j;
		}
		if (j > i || p == null) {
			throw new Exception("第" + i + "个元素不存在");
		}
		return p;
	}

	public int indexOf(Object x) {
		
		Node p = head.next;
		int j = 0;
		while (p!=null&&!p.data.equals(x)) {
			p = p.next;
			++j;
		}
		if (p != null)
			return j;
		else
			return -1;
	}

	public void add(Object x) throws Exception {
		Node e = new Node(x);
		if (head.next == null) {
			head.next = e;
		} else {
			Node temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = e;
		}
	}
	public void insert(int i ,Object x) {
		Node p = head;
		int j = -1;
		while(p!=null&&j<i-1) {
			p = p.next;
			++j;
		}
		Node s = new Node(x);
		s.next = p.next;
		p.next = s;
	}

	public void display() {
		Node node = head.next;
		while (node != null) {
			System.out.print(node.data + " ");
			node = node.next;
		}
		//System.out.print(node.data + " ");
		//System.out.println();
	}
	public void remove(int i) {
		Node p = head;
		int j = -1;
		while(p.next!=null&&j<i-1) {
			p = p.next;
			++j;
		}
		p.next = p.next.next;
	}

}
