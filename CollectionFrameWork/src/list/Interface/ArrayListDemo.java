package list.Interface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;
import java.util.function.UnaryOperator;

public class ArrayListDemo {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();

		String str1 = "Hello";
		list.add(str1);
		list.addAll(Arrays.asList("aCh", " ", "How ", "was ", "your ", " ", "day!!!"));
		System.out.println("Before :");
		for (String str : list)
			System.out.println(str);

		
		list.replaceAll(i->i+1);
		// list.removeIf(s -> s.contains("a"));
		System.out.println();
		System.out.println();
		System.out.println("After :");
		for (String str : list)
			System.out.println(str);

		// System.out.println("Vector :");
		//
		// Vector<Integer> v = new Vector<Integer>();
		// v.addAll(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9));
		//
		// for (int i : v)
		// System.out.println(i);
		//
		// System.out.println("Replacing all values in vector :");
		//
		//
		//
		// for (int i : v)
		// System.out.println(i);
		//
		List<Integer> list1 = new ArrayList<>();
		list1.addAll(Arrays.asList(1,2,3,4,5,6));
		list1.replaceAll(i->i+1);
		for (int str : list1)
			System.out.println(str);
		
		Integer[] arr =list1.toArray(new Integer[list1.size()]);
		System.out.println(arr[4]);
		
	}

}

interface Preset {
	String meth();
}
