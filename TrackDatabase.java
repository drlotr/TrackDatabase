import java.util.*;
public class TrackDatabase {
	static Map<String, String> TrackDatabase = new HashMap<String, String>();
	public static void search(String key) {
		if(TrackDatabase.containsKey(key)) {
			System.out.println(key + "'s events include " + TrackDatabase.get(key));
		} else {
			System.out.println("Invalid Name.");
		}
	}
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		System.out.print("Number of entries: ");
		int entries = scnr.nextInt();
		for(int i = 0; i < entries; i++) {
			System.out.print("Name: ");
			String n = scnr.next();
			System.out.print("Events: ");
			String e = scnr.next();
			TrackDatabase.put(n, e);
		}
		System.out.print("Search for person: ");
		String searchFor = scnr.next();
		search(searchFor);
		System.out.println("=========================");
		TrackDatabase.forEach( (name, event) -> System.out.println(name + "'s events include " + event));
		
	}

}
