import java.util.Scanner;

public class TestCircleSqWQueue {

	public static void main(String[] args) throws Exception {
		System.out.print("请输入你要创建的栈的大小：");
		Scanner input = new Scanner(System.in);
		int i = input.nextInt();
		CircleSqWQueue s = new CircleSqWQueue(i);
		System.out.println("栈为空");
		
		for(int n = 0 ; n <= i ; n++ ) {
			System.out.print("请输入你插入的数：");
			int num1 = input.nextInt();
			s.offer(num1);
		}
		

	}

}
