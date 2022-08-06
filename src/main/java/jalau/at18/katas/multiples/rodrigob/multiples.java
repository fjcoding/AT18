package jalau.at18.katas.multiples.rodrigob;
public class multiples {

	public static void main(String[] args) {
		System.out.print(sum(10));
	}
	public static int sum (int number) {
		int out=0;
		if(number<0) {
			return 0;
		}
		for(int i=0;i<number;i++) {
			if(i%3==0 || i%5==0) {
				out+=i;
			}
		}
		return out;	
	}
}