
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class IOExercisenew {
	
public static void main(String[] args) throws IOException {
	
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the name of the file: ");
	String userFile = sc.nextLine();
	File file = new File(userFile);
	
	if (file.exists()) {
		System.out.println("File exists!");
		
		System.out.println("Enter the name of the file to paste: ");
		String userinput = sc.nextLine();
		File writeinput = new File(userinput);
	
		FileReader fr = new FileReader(file);
		FileWriter fw = new FileWriter(writeinput);
		
		int i;
		while((i=fr.read()) != -1) {
			fw.write(i);
			System.out.print((char)i);
			System.out.print("Success");
		}
	fr.close();
	fw.close();

	}
	else {
		System.out.print("File does not exist");	
	}

}
}

