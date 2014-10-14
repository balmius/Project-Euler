import java.util.Random;


public class Problem_9 {
	public static void main(String args[]){
		for (int a = 1; a<1000;a++){
			for (int b = a+1; b<1000;b++){ //sempre maior que a
				for (int c = b+1; c<1000;c++){ //sempre maior que b
					if (a*a + b*b == c*c){	
						if (a+b+c == 1000)
						System.out.println(a*b*c);
					}
				}
			}
		}
	}
}
