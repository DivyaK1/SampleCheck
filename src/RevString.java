import java.util.Scanner;

public class RevString {
	 public static void main (String[] args) {
	       
	        String initial, rev="";
	        Scanner in=new Scanner(System.in);
	        System.out.println("Enter the string to reverse");
	        initial=in.nextLine();
	        int length=initial.length();
	        for(int i=length-1;i>=0;i--)
	          rev=rev+initial.charAt(i);
	        System.out.println("Reversed string: "+rev);
	    }
}
/*public static void main(String[] args)
    {
        String input = "Geeks for Geeks";
 
        StringBuilder input1 = new StringBuilder();
 
        // append a string into StringBuilder input1
        input1.append(input);
 
        // reverse StringBuilder input1
        input1.reverse();
 
        // print reversed String
        System.out.println(input1);
    }*/