//0174934 �ž��
import java.util.Scanner;
public class Homework1 {

	public static void main(String[] args) throws Exception {
		Scanner input = new Scanner(System.in);
		LinkList L = new LinkList();
		System.out.println("0174934 �ž��");
		System.out.println("������5�����֣�");

		for(int i = 0;i<5;i++) {
			L.add(input.nextInt());
		}
		System.out.print("��������Ҫ�û������֣�ǰһ������λ�ã�");
		int n = input.nextInt();
		
		Node p = L.get(n-1);
		L.remove(n-1);
		L.insert(n, p.data);
		L.display();
	}

}
