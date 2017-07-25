package stream.learn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Demo4 {

	public static void main(String[] args) {
List<Person> list= populateList();
		
		System.out.println("-------- Use Collection.toList() in order to obtain the list of people from US -------------");
		List<Person> list1 = list.stream().filter(person -> person.getCountry().equals("US")).collect(Collectors.toList());
		System.out.println("Persons List : "+list1);
//		Can aslo be done as :
		Map<String,List<Person>> map = list.stream().collect(Collectors.groupingBy(person -> person.getCountry(),Collectors.toList()));
		System.out.println("Persons List : "+map.get("US"));
		
		System.out.println("-------- Use Collection.toSet() in order to obtain the set of people from US -------------");
		Set<Person> set = list.stream().filter(person -> person.getCountry().equals("US")).collect(Collectors.toSet());
		System.out.println("Persons Set : "+set);
//		Can aslo be done as :
		Map<String,Set<Person>> map1 = list.stream().collect(Collectors.groupingBy(person -> person.getCountry(),Collectors.toSet()));
		System.out.println("Persons Set : "+map1.get("US"));
		
		System.out.println("-------- Use Collection.toArrayList() in order to obtain the arryList of people from US -------------");
		List<Person> arrayList = list.stream().filter(person -> person.getCountry().equals("US")).collect(Collectors.toCollection(ArrayList::new));
//		or
//		List<Person> arrayList = list.stream().filter(person -> person.getCountry().equals("US")).collect(Collectors.toCollection(()->new ArrayList<>()));
		System.out.println("Persons List : "+arrayList);
//		Can aslo be done as :
		Map<String,List<Person>> maplist = list.stream().collect(Collectors.groupingBy(person -> person.getCountry(),Collectors.toCollection(ArrayList::new)));
		System.out.println("Persons List : "+maplist.get("US"));
		
		

	}
	
	private static List<Person> populateList(){
		List<Person> person = new ArrayList<>();
		person.addAll(Arrays.asList(new Person("person1","IND"),
									new Person("person2","US"),
									new Person("person3","US"),
									new Person("person4","PAK"),
									new Person("person5","IND"),
									new Person("person3","US"),
									new Person("person4","US"),
									new Person("person5","IND")));
		
		return person;
		
	}

}
