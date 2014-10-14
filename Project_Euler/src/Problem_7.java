public class Problem_7{
	public static boolean prime(int x){
		for (int i = 2;i<x;i++){
			if (x%i == 0){
				return false;
			}
		}
		return true;
	}
	
	public static void main(String args[]){
		int x = 2;		
		for (int i = 2, n_prime = 0; ; i++){
			if (prime(x)){
				n_prime++;
				if (n_prime ==10001){
						System.out.println(x);
				}
			}
			x++;	
		}
	}
}