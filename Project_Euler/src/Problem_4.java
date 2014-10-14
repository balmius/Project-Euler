public class Problem_4 {
	
	public static void main(String args[]){
		int max = 100*100;
		String reverse;
		for (int i = 100; i<1000; i++){
			for (int j = 100; j<1000; j++){
				reverse = new StringBuffer(Integer.toString(i*j)).reverse().toString();
				if (Integer.toString(i*j).equals(reverse)){
					if (i*j > max){
						max = i*j;
					}
				}
			}
		}
		System.out.println(max);
	}
}
