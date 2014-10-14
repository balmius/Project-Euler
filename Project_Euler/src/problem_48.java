import java.math.BigInteger;


public class problem_48 {
	
	public static void main(String args[]){
		BigInteger soma2 = BigInteger.ZERO;
		for (int i = 1; i<=1000;i++){
			soma2 = soma2.add(BigInteger.valueOf(i).pow(i));
		}
		System.out.println(soma2.toString().substring(soma2.toString().length()-10));
	}
}

