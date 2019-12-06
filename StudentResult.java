package pp1;

public class StudentResult {

	public static void main(String[] args) {
		
		
		int  sub1=100,sub2=70,sub3=100; 
		
		int sum=( sub1+sub2+sub3); 
		
		double avg = (double)(sum/3);
		
		 if ((avg>80)&&(avg<=100)) 

		        System.out.println("Distinction");
		 
		 
		 else if((avg>60)&&(avg<=80)) 

		        System.out.println("first division");
	            
		 else if ((avg>40)&&(avg<=60)) 

	        System.out.println("first division");
		
		
		
		 else 

	        System.out.println("failed");
		
		
	

	}

}
