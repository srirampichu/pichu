package createfolder;

import java.io.File;
import java.io.IOException;

public class One {
public static void main(String[] args) throws IOException {
	File f = new File("E:\\name11\\hai\\");
	boolean r = f.mkdir();
	System.out.println(r);
////	boolean a = f.createNewFile();
////	System.out.println(a);
//	boolean b = f.canWrite();
//	System.out.println(b);
//	boolean c = f.canRead();
//	System.out.println(c);
//	boolean d = f.canExecute();
	
}	

}
