
public class ArrayCreateByValueListExample2 {

	public static void main(String[] args) {
		int[] scores;
		scores = new int[] {83,90,87};
		int sum1=0;
		for(int i=0;i<scores.length;i++) {
			sum1 += scores[i];
		}
		System.out.println("���� : "+sum1);
		
		//return�� �� ���� sum2�� ����
		int sum2 = add( new int[] {83,90,87} );
		System.out.println("���� : "+sum2);
	}

	private static int add(int[] is) {
		int sum=0;
		for(int i=0;i<is.length;i++) {
			sum += is[i];
		}		
		return sum;
	}
	
}
