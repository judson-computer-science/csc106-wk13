import java.util.*;

public class Family {

	public static void main(String[] args) {

		Map<String, Person> members = new HashMap<>();

		members.put("12345", new Person("Dad", "Patrick"));
		members.put("54321", new Person("Son", "John"));

		for(String key : members.keySet()) {
			Person p = members.get(key);
			System.out.println(p.getName() + " is the " + p.getTitle());
		}
	}
}

