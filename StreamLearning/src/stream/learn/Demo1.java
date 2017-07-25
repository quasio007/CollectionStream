package stream.learn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class Demo1 {

	public static void main(String[] args) {
		List<Person> list= populateList();
		Map<Integer,String> map =populateMap();
		
System.out.println("------------------------- Obtain Stream from List-----------------------------");
list.stream().forEach(person -> System.out.println(person));

System.out.println("------------------------- Obtain Stream from Map using entrySet() -----------------------------");
map.entrySet().stream().forEach(System.out::println);
// Can also use : map.entrySet().stream().forEach(entry -> System.out.println(entry));

System.out.println("------------------------- Obtain Stream from Map using keySet() -----------------------------");
map.keySet().stream().forEach(value -> System.out.println(value+" : "+map.get(value)));

System.out.println("------------------------- Obtain Stream from Map using values() -----------------------------");
map.values().stream().forEach(System.out::println);

System.out.println("------------------------- Obtain Stream from String  using chars() -----------------------------");
"12345..9 abcdef..z".chars().forEach(x -> System.out.println(Character.toChars(x)));

System.out.println("------------------------- Obtain Stream from String  using split() -----------------------------");
Arrays.asList("A,B,C,D,1,2,3".split(",")).stream().forEach(System.out::println);
// Can also use : Stream.of("A,B,C,D,1,2,3".split(",")).forEach(System.out::println);

System.out.println("------------------------- Obtain Stream from Arrays  -----------------------------");
String[] strArray = {"Hi","Hello","ByeBye"};
Stream.of(strArray).forEach(System.out::println);
//Can also use : Arrays.asList(strArray).stream().forEach(System.out::println);

System.out.println("------------------------- Obtain Stream of Values  -----------------------------");
Stream.of("One","Two",3,'3',"Three").forEach(System.out::println);

System.out.println("------------------------- Obtain Stream from function generate  -----------------------------");
Stream.generate(Math::random).limit(10).forEach(System.out::println);

System.out.println("------------------------- Obtain Stream from function iterate  -----------------------------");
Stream.iterate(5, i->i+1).limit(10).forEach(System.out::println);

System.out.println("------------------------- Obtain Stream from function builder  -----------------------------");
Stream.builder().add("One").add("Two").add("Three").build().forEach(System.out::println);

System.out.println("------------------------- Obtain Stream from another Stream  -----------------------------");
list.stream().distinct().sorted().limit(3).forEach(System.out::println);
	}
	
	private static Map<Integer,String> populateMap(){
		Map<Integer,String> map =new HashMap<>();
		map.put(1,"Aman");
		map.put(2,"Baby");
		map.put(3,"Chia");
		map.put(4,"David");
		map.put(5,"Eleza");
		return map;
	}
	
	private static List<Person> populateList(){
		List<Person> person = new ArrayList<>();
		person.addAll(Arrays.asList(new Person("person4","PAK"),
									new Person("person1","IND"),
									new Person("person2","US"),
									new Person("person3","US"),
									new Person("person5","IND"),
									new Person("person4","US")));
		return person;
		
	}

}
