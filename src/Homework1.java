//0174934 张峻瑜
import java.util.Scanner;
public class Homework1 {

	public static void main(String[] args) throws Exception {
		Scanner input = new Scanner(System.in);
		LinkList L = new LinkList();
		System.out.println("0174934 张峻瑜");
		System.out.println("请输入5个数字：");

		for(int i = 0;i<5;i++) {
			L.add(input.nextInt());
		}
		System.out.print("请输入你要置换的数字（前一个）的位置：");
		int n = input.nextInt();
		
		Node p = L.get(n-1);
		L.remove(n-1);
		L.insert(n, p.data);
		L.display();
	}

}
