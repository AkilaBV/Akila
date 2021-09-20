import java.util.Arrays;

public class RemoveDuplicateNumberFromAnArray {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6,1,4};
		
		
		System.out.println("************initial array*********");
		for(int n: a) {
			System.out.println(n);
		}
		
		
		
		int count=1;
		Arrays.sort(a);
		//to get the number of unique elemnets
		for(int i=0;i<a.length-1;i=i+1) {
			if(a[i]!=a[i+1]) {
				count=count+1;
			}
			
		}
		System.out.println("count : " +count);
		//create a temp array with size unique eleemnts
		int b[]=new int[count];
		int j=0;
		for(int i=0;i<a.length-1;i++) {
			if(a[i]!=a[i+1]) {
				b[j]=a[i];
				j++;
			}
			
		}
		//System.out.println(a[a.length-1]);
		b[j++]=a[a.length-1];
		System.out.println("transfering to original array");
		for(int i=0;i<j;i++) {
			System.out.println(b[i]);
			a[i]=b[i];
		}
		
		
		

	}

}
