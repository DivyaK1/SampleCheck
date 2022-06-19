
public class PrimeBtw2Numb {
	 public static void main(String[] args) {

	        int low = 61, high = 70;

	        while (low < high) {
	            boolean flag = false;

	            for(int i = 2; i <= low/2; ++i) {
	                // condition for nonprime number
	                if(low % i == 0) {
	                    flag = true;
	                    break;
	                }
	            }

	            if (!flag && low != 0 && low != 1)
	                System.out.print(low + " ");

	            ++low;
	        }
}
}
