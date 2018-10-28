import java.util.*;
//0174934 张峻瑜
public class TestComplex {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.print("请你输入第一个复数的实部：");
	double x1 = input.nextDouble();
	System.out.print("请你输入第一个复数的虚部：");
	double y1 = input.nextDouble();
	
	if(x1 == 0) {
		System.out.println("请你输入第一个复数是："+y1+"i");
	}
	if(y1 == 0) {
		System.out.println("请你输入第一个复数是："+x1);
	}
	if(x1!=0&&y1<0) {
		System.out.println("你输入的第一个复数是："+x1+y1+"i");
	}
	if(x1!=0&&y1>0) {
		System.out.println("你输入的第一个复数是："+x1+"+"+y1+"i");
	}	
	
	System.out.print("请你输入第二个复数：");
	double x2 = input.nextDouble();
	System.out.print("请你输入第二个复数的虚部：");
	double y2 = input.nextDouble();
	
	if(x2 == 0) {
		System.out.println("请你输入第二个复数是："+y2+"i");
	}
	if(y2 == 0) {
		System.out.println("请你输入第二个复数是："+x2);
	}
	if(x2!=0&&y2<0) {
		System.out.println("你输入的第二个复数是："+x2+y2+"i");
	}
	if(x1!=0&&y2>0) {
		System.out.println("你输入的第二个复数是："+x2+"+"+y2+"i");
	}
			
	
	Complex s1 = new Complex(x1,y1);
	Complex s2 = new Complex(x2,y2);
	System.out.println("请选择你要进行的运算(输入序号)：（1）求和（2）求差（3）求积");
	int x = input.nextInt();
	
	if(x==1) {
		s1.add(s2);
		double m = s1.getReal();
		double n = s1.getImag();
		
		if(m!=0&&n>0) {
		System.out.println(m+"+"+n+"i");
		}
		if(m==0) {
			System.out.println(n+"i");
		}
		if(m!=0&&n<0) {
			System.out.println(m+""+n+"i");
		}
		
	}
	if(x==2) {
		s1.min(s2);
		double m = s1.getReal();
		double n = s1.getImag();
		
		if(m!=0&&n>0) {
		System.out.println(m+"+"+n+"i");
		}
		if(m==0) {
			System.out.println(n+"i");
		}
		if(m!=0&&n<0) {
			System.out.println(n+""+m+"i");
		}
		
	}
	if(x==3) {
		s1.mutip(s2);
		double m = s1.getReal();
		double n = s1.getImag();
		
		if(m!=0&&n>0) {
		System.out.println(m+"+"+n+"i");
		}
		if(m==0) {
			System.out.println(n+"i");
		}
		if(m!=0&&n<0) {
			System.out.println(m+""+n+"i");
		}
	 }
			
  }


}
