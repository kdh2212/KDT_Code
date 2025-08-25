package sec02.ex;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteEx1 {
	public static void main(String[] args) throws IOException
	{
		OutputStream os = new FileOutputStream("C:/tmp/test1.db"); // 원래는 try 부분에다가 넣어야 한다.
		
		byte[] array = {40,50,60};
		os. write(array);
//		byte a =10;
//		byte b =20;
//		byte c =30;
//		
//		os.write(a);
//		os.write(b);
//		os.write(c);
		
		os.flush(); //출력버퍼를 비운다.
		os.close(); // 닫는다.
	}

}
