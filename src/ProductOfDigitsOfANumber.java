
public class ProductOfDigitsOfANumber {
	
	public static int product(int n) {
		int product=1;
	//	int temp=n;
		if(n==0) {
		product=0;
		}
		while(n>0) {
			product=product*(n%10);
			n=n/10;
		}
		return product;
	}

	public static void main(String[] args) {
		int multiple=product(152);
		System.out.println(multiple);
	}

}
