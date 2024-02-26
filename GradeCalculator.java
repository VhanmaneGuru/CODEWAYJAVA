import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);



        System.out.println("Enter your marks in subject 1:");
        int m1 = sc.nextInt();

        System.out.println("Enter your marks in subject 2:");
        int m2 = sc.nextInt();
		
		System.out.println("Enter your marks in subject 3:");
        int m3 = sc.nextInt();
		
		System.out.println("Enter your marks in subject 4:");
        int m4 = sc.nextInt();
		
		System.out.println("Enter your marks in subject 5:");
        int m5 = sc.nextInt();
		
		int total=m1+m2+m3+m4+m5;
		

        System.out.println("Total marks is="+total);
		double avg=total/5;
		System.out.println("average is=="+avg);
		if(avg>85 && avg<100)
		{
			 System.out.println(" Your Grade is O");
		
		}
		else if(avg>75 && avg<85)
		{ 
	        
				 System.out.println(" Your Grade is A+ ");

		}
		else if(avg>65 && avg<75)
		{ 
	        
				 System.out.println(" Your Grade is A ");

		}
	else if(avg>55 && avg<65)
		{ 
	        
				 System.out.println(" Your Grade is B ");

		}
	else if(avg>45 && avg<55)
		{ 
	        
				 System.out.println(" Your Grade is C ");

		}
		else if( avg<45)
		{ 
	        
				 System.out.println(" Your Grade is Fail ");

		}
	
	
		

        
    }
}