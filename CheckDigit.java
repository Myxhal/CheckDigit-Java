/*************************************************************************
 *  Compilation:  javac CheckDigit.java
 *  Execution:    java CheckDigit 020131452
 *
 *  @author:
 * Mychal Ortega
 * mlo77@scarletmail.rutgers.edu
 * mlo77
 *
 *  Takes a 12 or 13 digit integer as a command line argument, then computes
 *  and displays the check digit
 *
 *  java CheckDigit 048231312622
 *  0
 *
 *  java CheckDigit 9780470458310
 *  0
 * 
 *  java CheckDigit 9780470454310
 *  8
 * 
 *  Print only the check digit character, nothing else.
 *Check digit  (30 points). Write a program CheckDigit.java that takes a 12 or 13-digit long as a command-line argument and displays the digit computed as follows:
Take for an example the number 048231312622
Sum every other digit of the code, starting from the right.  In the example, that is 2 + 6 + 1 + 1 + 2 + 4 = 16.  Discard the tens digit and keep the ones digit, 6. 
Start with the second to last digit and do the same thing.  Sum the digits, discard the tens digit and keep the ones digit.  In this example this is 2 + 2 + 3 + 3 + 8 + 0=18.  Discarding the 10 leaves 8.  Multiply this number by 3 and again discard the tens digit.  8×3 = 24, leaving 4.
Add the numbers from steps 1 and 2.  Again drop the tens digit.  6 + 4 = 10, leaving the digit 0 (zero).
Hint 1: the maximum value that can be stored in an integer variable is 2147483647 which is only 10 digits long. To read a 12 or 13-digit integer from command line argument you will need to store it in a long variable. Use: long number = Long.parseLong(args[0]); to read a long from the command line.
Hint 2: to extract the rightmost digit of a number use the modulus operator.
Hint 3: to remove the rightmost digit of a number use the integer division by 10
Hint 4: for full credit use a loop to compute the sums
Assume the input value used to test your program is a 12 or 13-digit positive integer. 
 *************************************************************************/

public class CheckDigit {

    public static void main (String[] args) {
        long x = Long.parseLong(args[0]);
        long w = Long.parseLong(args[0]);
        long count = 0;
        while(x > 0){
            long y = x % 10;
            x = x/ 100;
            count+= y;
        }
        //System.out.println(count+ "count");
        

        long counts = 0;
        while(w > 0){
              w = w / 10;
            long y = w % 10;
            w = w/10;
            counts += y;
        }
        //System.out.println(counts + "counts");
        long a = (((counts %10)*3)%10) + (count % 10);
        long b = a % 10;
        System.out.println(b);
        // WRITE YOUR CODE HERE
    }
}
