
public class FindMax {

	String str;

	public static void maxCharacter(String str){
		int n = str.length();  
		System.out.println("Length of the String : " + n);  

		char last = str.charAt(n - 1);  
		System.out.println("Last Character : " + last); 
		int firstInd=str.indexOf(last);
		System.out.println(firstInd);
		
	}

	public static void main(String[] args) 
	{
		maxCharacter("Barcelona");
		
	}
}
