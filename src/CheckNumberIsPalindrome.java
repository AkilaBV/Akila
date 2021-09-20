
public class CheckNumberIsPalindrome {
	static boolean flag;
	
	public static boolean checkPalindrome(int num) {
		int sum=0,temp=num,product=1;
		if (num==0) {
			flag=false;
		}else {
			
			while(num>0) {
				int r=num%10;
				sum=(sum*10)+r;
				num=num/10;
			}
		
		if(temp==sum) {
			flag=true;
					}else {
						flag=false;
					}
		}
		return flag;
		
	}

	public static void main(String[] args) {
		System.out.println(checkPalindrome(121));
		System.out.println(checkPalindrome(122));
		System.out.println(checkPalindrome(0));
		
	}

}
