import java.lang.Math;
import java.math.BigInteger;


public class problem_16 {
	public static void main(String args[]){
		String x = BigInteger.valueOf(2).pow(1000).toString();
		long sum = 0;
		for (int i = 0; i<x.length();i++){
			sum =sum + Integer.valueOf(String.valueOf(x.charAt(i)));
		}
		System.out.println(sum);
	}
}
