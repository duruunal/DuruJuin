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

public class Exemple3 {
	
	public static void main(String[] args) throws IOException,FileNotFoundException
	{
		FileReader ficALire;
		BufferedReader entree;
		int c;
		
		ficALire=new FileReader("monfichier.txt");
		entree = new BufferedReader(ficALire);
		c=entree.read(); // Lecture du premier caractere
		
		while(c != -1 && c != '\n')
		{
			System.out.print((char)c);
			c=entree.read();
		}
		
		
		entree.close();
		ficALire.close();
		
	}

}
