
public class DuSqStack implements IStack {
	private Object[] stackElem;
	private int top0;
	private int top1;
	private int base0;
	private int base1;

	public DuSqStack(int maxSize) {
		top0 = base0 = 0;
		top1 = base1 = maxSize - 1;
		stackElem = new Object[maxSize];
	}

	public void push(Object x, int i) throws Exception {
		if (top0 > top1) {
			throw new Exception("ÒÑÂú");
		} else if (i == 0) {
			stackElem[top0++] = x;
		} else if (i == 1) {
			stackElem[top1--] = x;
		}
	}

	public Object pop(int i) throws Exception {
		Object x = null;
		if (i == 0) {
			if (top0 == base0) {
				throw new Exception("0Õ»Îª¿Õ");
			} else {
				x = stackElem[--top0];
			}
		} else if (i == 1) {
			if (top1 == base1) {
				throw new Exception("1Õ»Îª¿Õ");
			} else {
				x = stackElem[++top1];
			}

		}
		return x;
	}
	
	public void dispaly() {
		for(int i = 0;i<=this.top0 - 1;i++) {
			System.out.print(this.stackElem[i].toString()+" ");
		}
		for(int i = this.top1 + 1;i <= this.base1;i++) {
			System.out.print(this.stackElem[i].toString()+" ");
		}
	}

}
