
public class Problem_5 {
	public static boolean divisible(int x){
		for (int i = 1;i<=20;i++){
			if (x%i != 0){
				return false;
			}
		}
		return true;
	}
	
	public static void main(String args[]){
		for (int i = 2520; ; i++){
			if (divisible(i)){
				System.out.println(i);
				break;
			}
		}
	}
}
