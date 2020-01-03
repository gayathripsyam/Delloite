import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Randomdemo {

	public static void main(String[] args) throws IOException {
		
		RandomAccessFile file = new RandomAccessFile("fridat.txt", "rw");
		file.writeUTF("Today is friday");
		System.out.println(file.getFilePointer());
		file.seek(0);
		System.out.println(file.getFilePointer());
		String str = file.readUTF();
		System.out.println("File content is:");
		System.out.println(str);
		
		file.seek(file.length());
		file.writeUTF("Gayathri");
		file.seek(file.length()-8);
		String hm = file.readLine();
		file.close();
		System.out.println(hm);
	}
}
