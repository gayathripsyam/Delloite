import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Readfiledemo {
	public static void main(String[] args) throws IOException {
		File file = new File("Mohan.text");
		FileReader reader = new FileReader(file);
		int i=0;
		while((i=reader.read()) != -1) {
		System.out.print((char)i);
		}
		reader.close();
	}

}
