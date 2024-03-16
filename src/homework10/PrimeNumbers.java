package homework10;

public class PrimeNumbers {
	public static void main(String[] args) {
		int i;
		for(int e=1;e<=5;e++) {
			i=(int)(Math.random()*100)+2;
			if((i%2!=0)&&(i%3!=0)&&(i%5!=0)&&(i%7!=0)) {
				System.out.println(i+"是質數");
			}else if((i==2)||(i==3)||(i==5)||(i==7)){
				System.out.println(i+"是質數");
			}else {
				System.out.println(i+"不是質數");
			}
		}
	}
}
