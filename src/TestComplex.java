import java.util.*;
//0174934 �ž��
public class TestComplex {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.print("���������һ��������ʵ����");
	double x1 = input.nextDouble();
	System.out.print("���������һ���������鲿��");
	double y1 = input.nextDouble();
	
	if(x1 == 0) {
		System.out.println("���������һ�������ǣ�"+y1+"i");
	}
	if(y1 == 0) {
		System.out.println("���������һ�������ǣ�"+x1);
	}
	if(x1!=0&&y1<0) {
		System.out.println("������ĵ�һ�������ǣ�"+x1+y1+"i");
	}
	if(x1!=0&&y1>0) {
		System.out.println("������ĵ�һ�������ǣ�"+x1+"+"+y1+"i");
	}	
	
	System.out.print("��������ڶ���������");
	double x2 = input.nextDouble();
	System.out.print("��������ڶ����������鲿��");
	double y2 = input.nextDouble();
	
	if(x2 == 0) {
		System.out.println("��������ڶ��������ǣ�"+y2+"i");
	}
	if(y2 == 0) {
		System.out.println("��������ڶ��������ǣ�"+x2);
	}
	if(x2!=0&&y2<0) {
		System.out.println("������ĵڶ��������ǣ�"+x2+y2+"i");
	}
	if(x1!=0&&y2>0) {
		System.out.println("������ĵڶ��������ǣ�"+x2+"+"+y2+"i");
	}
			
	
	Complex s1 = new Complex(x1,y1);
	Complex s2 = new Complex(x2,y2);
	System.out.println("��ѡ����Ҫ���е�����(�������)����1����ͣ�2����3�����");
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
