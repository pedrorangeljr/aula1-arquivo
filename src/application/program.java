package application;

import java.io.File;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class program {

	public static void main(String[] args) {
		
		String[] lines = new String[] {"bom dia", "Boa tarde", "Boa Noite"};
		
		String path = "C:\\out.txt";
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
			
			for(String line : lines)
			{
				bw.write(line);
			    bw.newLine();
			}
		}
		catch(IOException e) {
			e.printStackTrace();
		}

	}

}
