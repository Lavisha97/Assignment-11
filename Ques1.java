import java.util.HashSet;
 
class HashRetain 
{
    public static void main(String args [])
	{
        HashSet<String> all = new HashSet<String>();
        all.add("ONE");
        all.add("TWO");
        all.add("THREE");
        all.add("FOUR");
        all.add("FIVE");
		all.add("SIX");
		System.out.println("Elements of all: ");
        System.out.println(all);
        HashSet<String> even = new HashSet<String>();
        even.add("TWO");
        even.add("FOUR");
        even.add("SIX");
		even.add("EIGHT");
		System.out.println("Elements of even: ");
        System.out.println(even);
        all.retainAll(even);
        System.out.println("Common elements of HASHSET all and even are:");
        System.out.println(all);
    }
}