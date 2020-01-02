import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class IOExercise {
	
public static void main(String[] args) throws IOException {
	
	
	FileReader fr = new FileReader("Mohan.text");
	FileWriter fw = new FileWriter("record.text");
	
	int i;
	while((i=fr.read()) != -1) {
		fw.write(i);
		System.out.print((char)i);
	}
fr.close();
fw.close();

}
}
