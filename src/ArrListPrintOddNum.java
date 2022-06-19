import java.util.ArrayList;
import java.util.Arrays;

public class ArrListPrintOddNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <Integer>numbers = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9));
		numbers.removeIf(num -> num%2 == 0);
		System.out.println(numbers);
		/*numbers.add(2, 7);
		System.out.println(numbers);
		numbers.clear();
		System.out.println(numbers);*/
	}

}
