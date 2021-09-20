
public class ToCheckNumberIsPrime {

	public static void main(String[] args) {
		boolean flag = checkPrime(5);
System.out.println("numebr is prime :" +flag);
	}

	private static boolean checkPrime(int num) {
		boolean flag=true;
	
	if(num==0 || num==1) {
		flag=false;
	}else {
		for(int i=2;i<=num/2;i++) {
			if(num%i==0 ) {
				flag=false;
			}
			else {
				flag=true;
			}
		}
	}
		return flag;
	}

}
