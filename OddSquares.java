import java.util.*;
import java.io.File;

public class OddSquares
{

public static void main(String args[])
{
	ArrayList<Integer> l= new ArrayList<>();
		l.add(10);
		l.add(20);
		l.add(12);
		l.add(5);
		l.add(3);
		l.add(97);
		
	l.stream().filter(odd -> odd%2!=0).map(odd -> odd*odd).forEach(System.out :: println);
	System.out.println("Print to check in Jenkins Git Example Version 1.");
}
}
