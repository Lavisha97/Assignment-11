import java.util.*;
class Hashmap 
{
	public static void main(String args[]) 
	{
		HashMap<Integer,String> hm= new HashMap<Integer,String>();
		hm.put(1, "ONE");
		hm.put(2, "TWO");
		hm.put(3, "THREE");
		hm.put(4, "FOUR");
		hm.put(5, "FIVE");
		for(Map.Entry a:hm.entrySet())
		{
			System.out.println(a.getKey()+" "+a.getValue());
		}
		// To check for a specify value which will be entered by the user.
		
		/* Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value whose corresponding you want: ");
		int a = sc.nextInt();
		if(a <= 5)
		{
			String val=(String)hm.get(a); 
			System.out.println("Value for " +a+" is: " + val);
		}
		else
			System.out.println("Invalid option"); */
	}
}