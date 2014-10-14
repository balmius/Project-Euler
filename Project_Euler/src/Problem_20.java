import java.math.BigInteger;


public class Problem_20 {
	public static String factorial(int n){
		BigInteger factorial = BigInteger.ONE;
		for (int i = 1; i<=n;i++){
			factorial = factorial.multiply(BigInteger.valueOf(i));
		}
		return factorial.toString();
	}
	
	public static void main(String args[]){
		String x = factorial(100);
		int soma = 0;
		for (int i = 0; i<x.length();i++){
			soma = soma + Integer.parseInt(x.charAt(i)+"");
		}
		System.out.println(soma);
	}
}
