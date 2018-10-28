
public class SqList implements IList {
	public Object [] list;
	public int size;
	
	public SqList(int i) {
		size = i;
		list = new Object[size];
	}

	public Object get(int i) {
		return list[i];
	}

	public int indexOf(Object x) {
		int j = 0;
		while(j<size&&!list[j].equals(x))
			j++;
		if(j<size)
			return j;
		else 
			return -1;
		
	}

}
