package arraytest;

public class ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name ="박설빈";
		String hobby ="프로그래밍";
		String stu1 = new String("방밍귱");
		String stu2 = new String("방밍귱");
		System.out.println(name == hobby);
		System.out.println(stu1 == stu2);
		boolean equ = stu1.equals(stu2);
		System.out.println(equ);
		
		
	}	
}
