import java.util.Scanner;

public class TestCircleSqWQueue {

	public static void main(String[] args) throws Exception {
		System.out.print("��������Ҫ������ջ�Ĵ�С��");
		Scanner input = new Scanner(System.in);
		int i = input.nextInt();
		CircleSqWQueue s = new CircleSqWQueue(i);
		System.out.println("ջΪ��");
		
		for(int n = 0 ; n <= i ; n++ ) {
			System.out.print("����������������");
			int num1 = input.nextInt();
			s.offer(num1);
		}
		

	}

}
