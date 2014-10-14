
public class Problem_2 {
	public static int fibonacci(int n){
		if (n<=1){
			return n;
		}
		else {
			return fibonacci(n-1)+fibonacci(n-2);
		}
	}
	public static void main(String args[]){
		long soma = 0;
		int i = 0;
		while (fibonacci(i)<4000000){
			if (fibonacci(i)%2 == 0){
				soma = soma + fibonacci(i);
			}
			i++;
		}
		System.out.println(soma);
	}
}
