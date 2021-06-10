/*
* Author: duruunal
* Date: Jun. 10, 2021
* Description:
*/


package duru_juin;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Exemple5 {
	
	public static void main(String[] args) throws IOException,FileNotFoundException
	{
		BufferedReader entree;
		String ligne;
			entree = new BufferedReader(new FileReader("monfichier.txt"));
		
			while(entree.ready())
			{
			ligne=entree.readLine();
			System.out.print(ligne);
			}
		
		
		entree.close();
		
	}

}
