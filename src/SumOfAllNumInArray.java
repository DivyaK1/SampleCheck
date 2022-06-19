import java.util.Scanner;

public class SumOfAllNumInArray {
	static int asize;
	static int total=0;		
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter size of array"+asize);
		asize = sc.nextInt();
		int total = sumOfArr(asize);
		System.out.println("Sum of numbers in array : "+total);
	}

	private static int sumOfArr(int asize) {		
		int arr[] = new int[asize];		
		System.out.println("Enter elements into array");
		for(int i=0;i<asize;i++) {
			arr[i]=sc.nextInt();
			total=total+arr[i];
		}
		sc.close();
		return total;
	}

	
}
