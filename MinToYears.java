package MinutesConversion;

import java.util.Scanner;
public class MinToYears {
    
    public void convert(int m)
    {
    	int years= m/(365*24*60);
    	double rem=m%(365*24*60);
        int days= (int)rem/(24*60);
        System.out.println(m+" minutes is approximately "+years+" years and "+days+" days");
    }
    public static void main(String[] args) {
    	int min;
		MinToYears obj=new MinToYears();
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter no. of minutes");
	    min= sc.nextInt();
	    sc.close();
	    obj.convert(min);
	}
    
}
