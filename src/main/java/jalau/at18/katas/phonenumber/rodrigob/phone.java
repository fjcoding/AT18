package jalau.at18.katas.phonenumber.rodrigob;
public class phone {

	public static void main(String[] args) {
		System.out.print(phoneNumber(new int [] {1,4,5,6,4,6,8,6,9,7}));
	}
	public static String phoneNumber(int [] numbers) {
		String out="(";
		for(int i=0;i<numbers.length;i++) {
			if(i<3) {
				out+=numbers[i];
			}
			if(i==3) {
				out+=") ";
			}
			if(i>=3 && i<6) {
				out+=numbers[i];
			}
			if(i==6) {
				out+="-";
			}
			if(i>=6) {
				out+=numbers[i];
			}
		}
		return out;
	}
}