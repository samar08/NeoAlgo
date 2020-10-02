import java.util.*;

public class ArmstrongNumber
{
    static int length_number(int num){
        return String.valueOf(num).length();
    }
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Enter a number : ");
	    int num = sc.nextInt();
	    int res = num;
	    int val=0;
	    int len = length_number(num);
	    while(res>0){
	        int temp = res%10;
	        val += Math.pow(temp, len);
	        res = res/10;
	    }
	    if(num == val) System.out.println(num+" is armstrong");
	    else System.out.println(num+" is not armstrong");
	}
}

/*
Sample input and output
Example 1:
Enter a number : 1002
Number is not armstrong

Example 2:
Enter a number : 153
Number is armstrong

Example 3:
Enter a number : 8208
8208 is armstrong

Complexities
time: O(log(n))
space: O(1)
*/