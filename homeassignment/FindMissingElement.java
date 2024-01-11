package week1.homeassignment;

import java.util.Arrays;

public class FindMissingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int a[] ={1,4,3,2,8, 6, 7};
    Arrays.sort(a);
   //1234678
    for (int i = 0; i < a.length; i++) {
    	
    	int b=i+1;
    	if(a[i]!=b)
    	{
    		System.out.println("missing number is :" +b);
    		break;
    		
   }
    	}
    

}
}
