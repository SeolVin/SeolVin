package arraytest;

public class ArrayTest2 {

	public static void main(String[] args) {
		String strVar1 = new String("�����") ;
		String strVar2 = new String("�����ڵ�������б�");
		
		if(strVar1 == strVar2) {
			System.out.println("strVar1�� strVar2�� ������ ����");
		} else {
			System.out.println("strVar1�� strVar2�� ������ �ٸ�");
		}
		
		if(strVar1.equals(strVar2)) {
			System.out.println("strVar1�� strVar2�� ���ڿ��� ����");
		}
	}
	
		String name = null;
		System.out.println(name.length());//name������ ���� ���
}
