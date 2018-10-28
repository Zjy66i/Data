//0174934 张峻瑜
import java.util.ArrayList;
import java.util.Scanner;
public class work2 {
	public static void main(String[] args) throws Exception{
		Scanner input = new Scanner(System.in);
		LinkList L1 = new LinkList();
		LinkList L2 = new LinkList();
		LinkList L3 = new LinkList();
		ArrayList <Object> array = new ArrayList<Object>();
		
		System.out.println("0174934 张峻瑜");
		System.out.println("请输入5个数字构成L1：");
		for(int i = 0;i<5;i++) {
			L1.add(input.nextInt());
		}
		System.out.println("请输入5个数字构成L2：");
		for(int i = 0;i<5;i++) {
			L2.add(input.nextInt());
		}
		
        Node p = L2.head.next;
		for(int i = 0;i<5;i++) {
			if(L1.indexOf(p.data)==-1 ) {
				L1.add(p.data);
			}else {
				L3.add(p.data);
			}
			p = p.next;
		}
		System.out.println("L1 交 L2为: ");
		L3.display();
		System.out.println();
		System.out.println("L1 并 L2为: ");
		L1.display();
	}

}