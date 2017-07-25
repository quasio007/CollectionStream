package list.Interface;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class AddingOwnObject {

	public static void main(String[] args) {
		Person p1 =new Person(1,"Aman");
		Person p2 =new Person(2,"Baby");
		Person p3 =new Person(3,"Crazy");
		Person p4 =new Person(4,"Dazy");
		Person p5 =new Person(1,"Aman");
		
		
		
		Map<Person,String> map =new HashMap<Person, String>();
		map.put(p1, "Aman");
		map.put(p2, "Amanat");
		map.put(p3, "Bha");
		map.put(p4, "Heer");
		map.put(p5, "Aman");
		map.put(p4, "Ranjeet");
		System.out.println("Maps : "+ map);
		for(Person p : map.keySet()) {
			System.out.println(p + " : "+p.hashCode());
		}
	
			
//		Sets :
		System.out.println();
		Set<String> set = new HashSet<String>();
		set.add("sat");
		set.add("cat");
		set.add("bat");
		set.add("cat");
		System.out.println("Set : "+ set);

	}
	



}


 class Person{
	private int id ;
	private String name;

	
	 Person(int id,String name) {
		this.id=id;
		this.name =name;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Person Id is : '"+id+"' and name is : '"+name +"'";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	

	
}