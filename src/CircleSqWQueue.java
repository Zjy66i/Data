
public class CircleSqWQueue {
	private Object[] queueElem;
	private int front;
	private int rear;
	private int num;
	
	public CircleSqWQueue(int maxSize) {
		front = rear = 0;
		queueElem = new Object[maxSize];
	}
	
	public void offer(Object x)throws Exception{
		if(num == queueElem.length) {
			throw new Exception("¶ÓÁÐÒÑÂú");
		}
		else {
			queueElem[rear] = x;
			rear = (rear+1) % queueElem.length;
			++num;
		}
	}
	public Object poll() {
		if(num == 0) {
			return null;
		}
		else {
			Object x = queueElem[front];
			front = (front+1) % queueElem.length;
			--num;
			return x;
		}
	}

}
