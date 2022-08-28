package pkg1;

public class Class22 {
	public Class22() {
		System.out.println("this is default constructor");
	}

	public Class22 (int a) {
		this();
		System.out.println("this is one paramaratized construstor");
	}
	
	public Class22 (int a , int b ) {
		this(344);

		System.out.println("two paramarized constructor");
		
	}
	public static void main(String[]args) {
		Class22 ref1=new Class22(22,11);
	}
}

