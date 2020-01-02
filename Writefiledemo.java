import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Writefiledemo {

	public static void main(String[] args) throws IOException {
		//FileWriter fw = new FileWriter("record.txt");
		File file = new File("record.text");	
		file.createNewFile();
		//fw.write("My name is Gayathri");
		//fw.close();
		//System.out.println("Done");
	}
}
