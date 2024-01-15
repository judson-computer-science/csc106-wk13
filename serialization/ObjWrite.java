import java.io.*;

public class ObjWrite {

	public static void main(String[] args) throws Exception {

		FileOutputStream fos = new FileOutputStream(new File("object.txt"));
		ObjectOutputStream oos = new ObjectOutputStream(fos);

		oos.writeObject(new Person("Dad", "Patrick"));

		oos.close();
		fos.close();
	}
}
