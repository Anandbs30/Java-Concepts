package V29_Exceptions.Exception_Handling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Try_with_resources {
	//Here we don't need to use the finally block directly inside try() define here then that will be closed automatically
	
	public static void main(String[] args) {
		//This try-with resources is introduced in java 7 and here automatically this object reader will be closed by JVM
		try(BufferedReader reader = new BufferedReader(new FileReader("a.txt"))){
			String line;
			while((line = reader.readLine()) != null) {
					System.out.println(line);
			}
		}catch(IOException e){
			System.out.println("IOException caught : "+e.getMessage());
		}
	}

}
