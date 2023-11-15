package p1;

public class Welcome {

	public static void main(String[] args) {
		int a=10;
		int b=5;
		System.out.println("before swapping a="+a);
		System.out.println("before swapping b="+b);
		int temp=a;
		a=b;
		b=temp;
		System.out.println("After swapping a="+a);
		System.out.println("After swapping b="+b);
	}

}
