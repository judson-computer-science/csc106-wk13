import java.io.*;

public class Person implements Serializable {

	private String name;
	private String title;

	public Person(String title, String name) { 
		this.name = name;
		this.title = title;
	}

	public String getName() { return name; }
	public String getTitle() { return title; }
}

