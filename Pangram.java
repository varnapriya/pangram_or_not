import java.util.Scanner;

public class Pangram {

	public static void main(String[] args) {
		
       System.out.println("Enter the sentence:");
       Scanner scan=new Scanner(System.in);
       String sentence=scan.nextLine();
       containLetters(sentence);
	
	}
	
	public static void containLetters(String s)
	{
		s=s.toLowerCase();
		boolean lettersPresent=true;
		for(char c='a';c<='z';c++)
		{
			if(!s.contains(String.valueOf(c)))
			{
				lettersPresent=false;
				break;
			}	
			
		}
		if(lettersPresent==true)
		{
		System.out.println("It is a Pangram");	
		}
		else
		{
			System.out.println("It is not a Pangram");	
		}
	}

}
