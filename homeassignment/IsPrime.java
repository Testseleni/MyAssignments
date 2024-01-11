package week1.homeassignment;


public class IsPrime {
	public static void main(String[] args) {

		 int num = 91;
		    boolean prime = false;
		    for (int i = 2; i <= num / 2; ++i) {
		     
		      if (num % i == 0) {
		        prime = true;
		        break;
		      }
		    }

		    if (!prime)
		      System.out.println(num + " is a prime number.");
		    else
		      System.out.println(num + " is not a prime number.");
		  }
		}
