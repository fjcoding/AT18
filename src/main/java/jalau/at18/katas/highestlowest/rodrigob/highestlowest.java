package jalau.at18.katas.highestlowest.rodrigob;

public class highestlowest {

	public static void main(String[] args) {
		System.out.print(result("20 40 5 8 7 6 56"));
	}
	public static String result (String numbers) {
		String out;
		int aux;
		String [] divide=numbers.split(" ");
		int [] compare= new int [divide.length];
		for (int i=0;i<compare.length;i++) {
			compare[i]= Integer.parseInt(divide[i]);
		}
		for(int i=0;i<compare.length;i++) {
			for(int j=0;j<compare.length-1;j++) {
				if(compare[j]<compare[j+1]) {
					aux=compare[j];
					compare[j]=compare[j+1];
					compare[j+1]=aux;	
				}
			}	
		}
		return out = compare[0] +" "+compare[compare.length-1];
	}
}