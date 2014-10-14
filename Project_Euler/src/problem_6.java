import java.lang.Math;

public class problem_6 {
	public static void main(String args[]){
		int sum1 = 0;
		int sum2 = 0;
		for (int i = 0;i<=100;i++){
			sum1 = sum1 + i*i;
			sum2 = sum2 + i;
		}
		System.out.println((sum2*sum2) - sum1);
	}
}
