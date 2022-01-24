package SingFor;

public class Quiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum =0;
		for(int i=0; i<1000; i++) {
			if(i%3==0 && i%5!=0) {
				continue;
			} else {
				sum +=i;
			}
		}
		System.out.println("1부터 1000까지의 합:" +sum);
	}

}
