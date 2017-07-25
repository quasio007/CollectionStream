package list.Interface;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class SetsDemo {

	public static void main(String[] args) {
		Set<String> set = new LinkedHashSet<String>();
		set.add("cat");
		set.add("bat");
		set.add("sat");
		set.add("cat");
		System.out.println("LinkedHashSet : " + set);
		// for(String s :set)
		// System.out.println(s);
		System.out.println();

		SortedSet<String> set1 = new TreeSet<String>();
		set1.add("pat");
		set1.add("rat");
		set1.add("dat");
		set1.add("mat");
		System.out.println("TreeSet : " + set1);

		Set<String> set2 = new HashSet<String>(set);
		System.out.println("LinkedHashSet : " + set2);
		
//		Set<> s = new HashSet<>();
	}

}
