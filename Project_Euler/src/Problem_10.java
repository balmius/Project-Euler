
public class Problem_10 {
		public static boolean prime(long x){
			for (long i = 2;i<x;i++){
				if (x%i == 0){
					return false;
				}
			}
			return true;
		}
		
		public static void main(String args[]){
			long soma = 0;
			for (long i = 2;i<2000000; i++){
				if (prime(i)){
					System.out.println(i);
					soma = soma + i;
					}
				}
			System.out.println(soma);
			}
		}

	
