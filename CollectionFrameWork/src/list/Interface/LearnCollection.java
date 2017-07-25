package list.Interface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class LearnCollection {

	public static void main(String[] args) {
//		List :
		List<String> list = new ArrayList<String>();
		list.addAll(Arrays.asList("Fpple","Banana","Gnaddnas","bat"));
//		Collections.sort(list);
//		list.sort((s1,s2) -> -s1.compareTo(s2));
		list.sort(new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				int l1 =o1.length();
				int l2 =o2.length();
				if(l1<l2) {
					return -1;
				}else if(l1>l2){
					return 1;
				}
				return 0;
			}
		});
		System.out.println("List : "+ list);
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		list.add("A");
		List list2 =new ArrayList<>(list);
		list2.add("list2");
		List list3 =new ArrayList<>(list);
		list3.add("list3");
		list.add("list1");
		List list4 =new ArrayList<>(list);
		list4.add("list4");
		
		System.out.println("List : "+ list2);
		
		Set<List<String>> set3 = new HashSet<List<String>>();
		List<List<String>> lst =new ArrayList<List<String>>();
		lst.add(list);
		lst.add(list2);
		lst.add(list3);
		set3.addAll(lst);
		System.out.println(set3);
		
		for(List<String> l : set3)
		System.out.println(l);
		
		
		
		Set<List<String>> set4 = new HashSet<List<String>>(set3);
		set4.add(list4);
		List<Set<List<String>>> impList = new ArrayList<>(); 
		impList.add(set3);
		impList.add(set4);
		System.out.println("impList : "+impList);
		
		for(Set<List<String>> im:impList)
		System.out.println(im);
		System.out.println();
		
//		Maps :
		System.out.println();
		Map<Integer,String> rollNumber =new HashMap<Integer, String>();
		rollNumber.put(1, "Aman");
		rollNumber.put(2, "Amanat");
		rollNumber.put(3, "Bha");
		rollNumber.put(4, "Heer");
		rollNumber.put(5, "Aman");
		rollNumber.put(2, "Amanad");
		System.out.println("Maps : "+ rollNumber);
		Map<Integer,String> map1 =new HashMap<Integer, String>(rollNumber);
		map1.put(7, "d");
		Map<Integer,String> map2 =new HashMap<Integer, String>(rollNumber);
		map2.put(7, "k");
		Map<Integer,String> map3 =new HashMap<Integer, String>(rollNumber);
		map3.put(7, "t");
		Map<Integer,String> map4 =new HashMap<Integer, String>(rollNumber);
		map4.put(7, "p");
		
		List<Map<Integer,String>> lt = new ArrayList<Map<Integer,String>>();
		lt.add(map1);
		lt.add(map2);
		lt.add(map3);
		Set<Map<Integer,String>> st = new HashSet<Map<Integer,String>>();
		st.addAll(lt);
		System.out.println("Check below: ");
		st.add(map4);
		System.out.println(st);
		System.out.println("Check below again: ");
		
		for(Map<Integer,String> m :st)
			System.out.println(m);
	
			
//		Sets :
		System.out.println();
		Set<String> set = new HashSet<String>();
		set.add("sat");
		set.add("cat");
		set.add("bat");
		set.add("cat");
		System.out.println("Set : "+ set);
		
//		Comparison :
		System.out.println();
		Set<String> check = new TreeSet<String>(set);
		check.retainAll(list);
		System.out.println(check);
		
	}

}
