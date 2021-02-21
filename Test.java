import java.util.Arrays;
import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		
		MyIntArrayList a = new MyIntArrayList();
		
		a.add(3);
		a.add(2);
		a.add(4);
		a.add(10);
		a.add(25);
		a.set(2, 1000);
		
		for (int i = 0; i < a.size(); i++)
			System.out.print(a.get(i) + " ");
		
		System.out.println();
		
		System.out.println(a.contains(3));
		System.out.println(a.contains(43));
		System.out.println(a.indexOf(5));
		System.out.println(a.lastIndexOf(2));
		
		MyIntArrayList b = new MyIntArrayList(a);
		b.addAll(a);
		
		for (int i = 0; i < b.size(); i++)
			System.out.print(b.get(i) + " ");
		
		b.add(3);
		b.add(2);
		b.add(4);
		
		System.out.println();
		
		for (int i = 0; i < b.size(); i++)
			System.out.print(b.get(i) + " ");
		
		
		

	}

}
