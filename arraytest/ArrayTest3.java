package arraytest;

public class ArrayTest3 {

	public static void main(String[] args) {
		int[] scores = null;
		// �� ������� �迭 ����
		scores = new int[] {50,99,80,70,45};
		
		int sum = 0;
		for(int i = 0; i<5; i++) {
			sum += scores[i];
		}
		System.out.println("����:" + sum);
		double avg = (double)sum/5;
		System.out.println("����:" + avg);
	}

}
