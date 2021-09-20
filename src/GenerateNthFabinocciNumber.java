
public class GenerateNthFabinocciNumber {
	
	public static int generatefabinocciNumber(int n) {
		if(n<=1) {
			return n;
		}
		return generatefabinocciNumber(n-1)+generatefabinocciNumber(n-2);
	}
	public static void main(String[] args) {
		
System.out.println(generatefabinocciNumber(5));
System.out.println(generatefabinocciNumber(6));
System.out.println(generatefabinocciNumber(7));
System.out.println(generatefabinocciNumber(8));
	}

}
