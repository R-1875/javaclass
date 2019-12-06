package check;

public class CheckPrime {

	public static void main(String[] args) {
		
		{
			int num=-1;
			int ct=0;

		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				ct++;
			}
		}
		

		if(ct==2)
		{

		System.out.println(num + " is a prime number");
		}

		else
		{

			System.out.println(num + " is a composite number");

		}

	}

	}
}
