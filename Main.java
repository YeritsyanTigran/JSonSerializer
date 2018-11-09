import java.io.*;
import java.lang.reflect.*;

public class Main{

	public static void main(String[] ars){
		Student student = new Student("Michael","Jakson",35,"Avenue boulvar","192.0.0.3");

		try{
			JsonSerial.makeJson(student);
		}catch(IOException e){
			e.printStackTrace();
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}catch(IllegalAccessException e){
			e.printStackTrace();
		}
		
	}
}