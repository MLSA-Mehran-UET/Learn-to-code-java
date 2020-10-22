
public class palindrome 
{
	public static void main(String args[])
	{
		int rem,temp=0;
		int sum=0;
		int i =131;
		
		
			temp=i;
			
			while(i>0)
			{
				rem=i%10;
				
				sum=(sum*10)+rem;
			}
		    if(temp==sum)
		    {
			System.out.println("The Number "+sum+" is Palindrome!");
            }
		    else
		    {
			System.out.println("The Number "+sum+" is Palindrome!");
            }
		
	}

}
