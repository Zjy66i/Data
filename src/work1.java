//0174934 �ž��
import java.util.*;
public class work1 {
	public static void main(String[] args) {
		SqList L = new SqList(10);
		SqList P = new SqList(5);
		Scanner input = new Scanner(System.in);
        System.out.println("0174934 �ž��");
		System.out.println("�������������е�10������(�ÿո����)�����γɱ�L:");
		for (int i = 0; i < 10; i++) {
			L.list[i] = input.nextInt();
		}

		System.out.println("�������������е�(9����)5������(�ÿո����)�����γɱ�P");
		for (int i = 0; i < 5; i++) {
			P.list[i] = input.nextInt();
		}
		for(int i = 0;i<5;i++) {
			System.out.print(L.list [(int) P.list[i]]+" ");
		}
		System.out.println("�ó����Ӷ�Ϊn");
		

	}

}
