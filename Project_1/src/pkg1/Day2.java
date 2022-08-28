package pkg1;

public class Day2 {
	public int sum(int a , int b) {
		 int c;
		 c=a+b;
		 System.out.println("sum of a and b is "+c);
		 return c;
	}
	public int sub( int x, int y) {
		int z;
		z=x-y;
		System.out.println("sub result "+z);
		return z;
	}
	public void multi(int a1, int a2) {
		int a3;
		a3=a1*a2;
	 System.out.println("final result"+a3);
	}
	public static void main(String[]arsg) {
		Day2 ob=new Day2();
		int sumResult=ob.sum(10,2);		int subResult=ob.sub(10,2);
	ob.multi (subResult,sumResult);
	}

}
