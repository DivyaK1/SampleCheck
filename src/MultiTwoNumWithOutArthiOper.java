import java.util.Scanner;

public class MultiTwoNumWithOutArthiOper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,result;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter numbers to multiply");
		i=sc.nextInt();
		j=sc.nextInt();
		result=multiTwoNumb(i,j);
		sc.close();
		System.out.println("Result : "+result);
	}

	private static int multiTwoNumb(int i, int j) 
	{
		int sum=0,temp,grt;
		if(i<j) {
			temp=i;
			grt=j;
		}
		else {
			temp=j;
			grt=i;
		}
		for(int k=1;k<=temp;k++) {
//			System.out.println("temp:"+temp);
			sum=sum+grt;
		}
		return sum;
	}
}
