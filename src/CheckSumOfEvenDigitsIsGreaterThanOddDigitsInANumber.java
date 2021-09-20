
public class CheckSumOfEvenDigitsIsGreaterThanOddDigitsInANumber {
	static boolean flag;
	public static boolean checkSumOfEvenDigitsIsGreaterThanOddDigits(int digit){
		int evensum=0,oddsum=0;
		int temp=digit;
		if(digit==0) {
	 flag=false;
		}
		while(digit>0) {
			int temp1=(digit%10);
			if(temp1%2==0) {
				evensum=evensum+temp1;
			}else if(temp1%2!=0) {
				oddsum=oddsum+temp1;
			}
			digit=digit/10;
		}
		if(evensum>oddsum) {
			flag=true;
		}else flag=false;
		return flag;
	}

	public static void main(String[] args) {
		System.out.println(checkSumOfEvenDigitsIsGreaterThanOddDigits(1212111));
		System.out.println(checkSumOfEvenDigitsIsGreaterThanOddDigits(121));
		System.out.println(checkSumOfEvenDigitsIsGreaterThanOddDigits(1212));
		

	}

}
