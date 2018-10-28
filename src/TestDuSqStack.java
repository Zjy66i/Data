import java.util.Scanner;

public class TestDuSqStack {

	public static void main(String[] args) throws Exception {
		System.out.print("请输入你要创建的栈的大小：");
		Scanner input = new Scanner(System.in);
		int i = input.nextInt();
		DuSqStack s = new DuSqStack(i);
		
		for(int n = 0 ; n < i ; n++ ) {
			System.out.print("请输入你插入的数：");
			int num1 = input.nextInt();
			System.out.print("请输入你要插入的栈的序号：");
			int num2 = input.nextInt();
			s.push(num1, num2);
		}		
		s.dispaly();
		System.out.println();
		System.out.print("请输入你要出栈的序号：");
		int x = input.nextInt();
		Object str = s.pop(x);
		s.dispaly();

	}

}
