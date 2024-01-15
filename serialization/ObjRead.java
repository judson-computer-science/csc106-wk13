import java.io.*;

public class ObjRead {

	public static void main(String[] args) throws Exception {

		FileInputStream fos = new FileInputStream(new File("object.txt"));
		ObjectInputStream oos = new ObjectInputStream(fos);

		Person p = (Person) oos.readObject();

		oos.close();
		fos.close();

		System.out.println(p.getName() + " is the " + p.getTitle());
	}
}

