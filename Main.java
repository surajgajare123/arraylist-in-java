import java.util.ArrayList;
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		ArrayList<Integer> l1 = new ArrayList<>();
		ArrayList<Integer> l2 = new ArrayList<>();
		l2.add(61);
		l2.add(31);
		l2.add(21);
		l2.add(12);
		l2.add(83);
		l2.add(74);
		
		l1.add(6);
		l1.add(3);
		l1.add(2);
		l1.add(1);
		l1.add(8);
		l1.addAll(l2);
		
		for(int i = 0; i < l1.size(); i++){
		    System.out.println(l1.get(i));
		}
	}
}
