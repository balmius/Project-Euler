import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;


public class Problem_13 {
	public static String abrir_ficheiro() throws IOException{
		File file = new File("src/euler.txt");
		FileInputStream fin = new FileInputStream(file); 	
		BufferedReader br = new BufferedReader(new InputStreamReader(fin)); 
		String x;
		BigInteger soma = BigInteger.valueOf(0);
		while ((x = br.readLine())!=null){
			soma = soma.add(new BigInteger(x));
			
		}
		return soma.toString().substring(0,10);
	}
	
	public static void main(String args[]) throws IOException{
		System.out.println(abrir_ficheiro());
	}
}
