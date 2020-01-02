
import java.io.File;
import java.io.IOException;


public class Filedemo {
public static void main(String[] args) throws IOException {
	
	
	File file = new File ("c:\\delloite\\Batch\\BatchMates.txt");
	File h = new File ("c:\\delloite\\Batch");
	
	if (file.exists()) {
		System.out.println("File exists!");
	}
	else {
		h.mkdirs();
		file.createNewFile();
		System.out.println("New File created");
		
	}
System.out.println("Done");
}

}