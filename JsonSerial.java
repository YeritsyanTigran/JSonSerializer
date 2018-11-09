import java.io.*;
import java.lang.reflect.*;
import java.util.*;

public class JsonSerial{


	public static String makeJson(Object obj) throws IOException,ClassNotFoundException,IllegalAccessException{

		Class c = Class.forName(obj.getClass().getSimpleName()); 

		Field fieldList[] = c.getDeclaredFields();

		String json = "{\n%s}";

		String namesAndValues = "";

		for(int i=0;i<fieldList.length;++i){

			fieldList[i].setAccessible(true);

			Object tempObj = fieldList[i].get(obj);
			String name = fieldList[i].getName();


			if(!fieldList[i].isAnnotationPresent(Transient.class))
			namesAndValues = namesAndValues.concat(String.format("'%s': '%s',\n",name,tempObj));

		}


		json = String.format(json,namesAndValues);

		System.out.println(String.format(json,namesAndValues));

		return json;



	}
}