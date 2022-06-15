package arraytest;

public class ArrayTest2 {

	public static void main(String[] args) {
		String strVar1 = new String("인평고") ;
		String strVar2 = new String("인평자동차고등학교");
		
		if(strVar1 == strVar2) {
			System.out.println("strVar1과 strVar2는 참조가 같음");
		} else {
			System.out.println("strVar1과 strVar2는 참조가 다름");
		}
		
		if(strVar1.equals(strVar2)) {
			System.out.println("strVar1과 strVar2는 문자열이 같음");
		}
	}
	
		String name = null;
		System.out.println(name.length());//name변수의 길이 출력
}
