package arraytest;

public class ArrayTest3 {

	public static void main(String[] args) {
		int[] scores = null;
		// 값 목록으로 배열 생성
		scores = new int[] {50,99,80,70,45};
		
		int sum = 0;
		for(int i = 0; i<5; i++) {
			sum += scores[i];
		}
		System.out.println("총점:" + sum);
		double avg = (double)sum/5;
		System.out.println("평점:" + avg);
	}

}
