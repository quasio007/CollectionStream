package list.Interface;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapDemo {

	public static void main(String[] args) {
	Map<Integer,String> rollNumber =new HashMap<Integer, String>();
rollNumber.put(1, "Aman");
rollNumber.put(2, "Amanat");
rollNumber.put(3, "Bha");
rollNumber.put(4, "Heer");
rollNumber.put(5, "Aman");
rollNumber.put(2, "Amanad");

Collection<String> list =rollNumber.values();
for(String s :list)
	System.out.println(s);

for(HashMap.Entry<Integer, String> entry : rollNumber.entrySet()) {
	if(entry.getKey() == 3) {
		entry.setValue("Check");
	}
	System.out.println(entry.getKey()+" : "+entry.getValue());
}
	
	}

}
