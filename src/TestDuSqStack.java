import java.util.Scanner;

public class TestDuSqStack {

	public static void main(String[] args) throws Exception {
		System.out.print("��������Ҫ������ջ�Ĵ�С��");
		Scanner input = new Scanner(System.in);
		int i = input.nextInt();
		DuSqStack s = new DuSqStack(i);
		
		for(int n = 0 ; n < i ; n++ ) {
			System.out.print("����������������");
			int num1 = input.nextInt();
			System.out.print("��������Ҫ�����ջ����ţ�");
			int num2 = input.nextInt();
			s.push(num1, num2);
		}		
		s.dispaly();
		System.out.println();
		System.out.print("��������Ҫ��ջ����ţ�");
		int x = input.nextInt();
		Object str = s.pop(x);
		s.dispaly();

	}

}
