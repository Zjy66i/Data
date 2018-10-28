//0174934 张峻瑜
import java.util.*;
public class work1 {
	public static void main(String[] args) {
		SqList L = new SqList(10);
		SqList P = new SqList(5);
		Scanner input = new Scanner(System.in);
        System.out.println("0174934 张峻瑜");
		System.out.println("请输入升序排列的10个整数(用空格隔开)用来形成表L:");
		for (int i = 0; i < 10; i++) {
			L.list[i] = input.nextInt();
		}

		System.out.println("请输入升序排列的(9以内)5个整数(用空格隔开)用来形成表P");
		for (int i = 0; i < 5; i++) {
			P.list[i] = input.nextInt();
		}
		for(int i = 0;i<5;i++) {
			System.out.print(L.list [(int) P.list[i]]+" ");
		}
		System.out.println("该程序复杂度为n");
		

	}

}
