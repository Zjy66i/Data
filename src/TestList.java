//0174934 �ž��
import java.util.Scanner;

public class TestList {
	public static void main(String[] args) throws Exception {
		Scanner input = new Scanner(System.in);
		System.out.println("0174934 �ž��");		
		System.out.println("������������");
		int n = input.nextInt();
		
		LinkList L = new LinkList();	
		Node head=new Node(1);
		 Node p = head;
		 for(int i=2;i<=n;i++){
			p  =  (p.next=new Node(i));
			 }
		 p.next = head;
		 
		int[] array = new int [n];
		System.out.println("�밴˳������ÿ�������������룺");
		for(int i = 0 ;i < n; i++) {
			array[i] = input.nextInt();
		}

		System.out.println("������m�ĳ�ʼֵ��");
		int m = input.nextInt();

		System.out.println("���е�˳��Ϊ��");
		while (p!=p.next) {
			for (int i = 1; i < m; i++) {
				p=p.next;
			}
			System.out.print(p.next.data + " ");
			int k = (int) p.next.data;
			m = array[k - 1];
			p.next = p.next.next;
		}
		System.out.print(p.data + " ");
		

	}

}


