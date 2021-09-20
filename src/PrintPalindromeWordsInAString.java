
public class PrintPalindromeWordsInAString {
	public static void main(String args[]) {
	String sen="bob is pap dad and pop brother";
	boolean flag=false;;
	
	String strArr[]=sen.split(" ");
	for(String each: strArr) {
		for(int i=0,j=each.length()-1;i<each.length() && j>=0;i++,j--) {
			if(each.charAt(i)!=each.charAt(j)) {
				flag=false;
				break;
			}else {
				flag=true;
			}
		}if(flag==true) { System.out.println(each);}
		
	}

}
}