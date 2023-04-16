
//Java coed for the implementation of eucler's totient function
import java.util.Scanner;
public class EuclersToitent {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = input.nextInt();
        int result = n;
        //For loop that runs from 2 to the square root of the number
        for (int i = 2; i * i <= n; i++) {
            //If the number is divisible by i
            if (n % i == 0) {
                //Then we need to remove all the multiples of i
                while (n % i == 0) {
                    n /= i;
                }
                //Then we need to subtract the value of i from the result
                result -= result / i;
            }
        }
        if (n > 1) {
            result -= result / n;
        }
        System.out.println("The value of eucler's totient function is " + result);
        input.close();
    }
}

/*
Algorithm:
First we need to import the Scanner class from the java.util package
Then we need to create a Scanner object
Then we need to ask the user to enter the number
Then we need to store the number in a variable
Then we need to calculate the value of euler's totient function
Then we need to print the value of euler's totient function
Then we need to close the Scanner object
 */

 /*
  * What is Eucler's totient function?
    The Euler's totient function is a function that is used to calculate the number of 
    positive integers less than or equal to n that are relatively prime to n.
    The value of the Euler's totient function is denoted by phi(n).
  */