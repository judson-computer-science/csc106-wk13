import java.util.Formatter;
import java.io.PrintWriter;
import java.io.FileNotFoundException;

public class Output {

	public static void main(String[] args) {

		try {
			String name = "Mike";
			int age = 25;

			Formatter f = new Formatter("formatter.txt");
			f.format("My name is %s, I am %d years old\n", name, age);
			f.close();

		} catch(FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}
}

