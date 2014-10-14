import java.math.BigInteger;
import java.util.HashMap;


public class problem_29 {
	

	public static void main(String args[]){
		HashMap<BigInteger,String> map = new HashMap<BigInteger,String>();
		for (int a = 2; a<=100;a++){
			for (int b = 2; b<=100;b++){
				map.put(BigInteger.valueOf(a).pow(b),"");
				}
			}
		System.out.println(map.size());	
		}
		
	}

