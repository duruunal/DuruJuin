/*
* Author: duruunal
* Date: Jun. 17, 2021
* Description:
*/


package duru_juin;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExp1 {
	
	public static void main(String[] args) 
	{
		Scanner crayon = new Scanner (System.in);

		System.out.println("inscrire le texte pour la recherche");
		String input = crayon.nextLine();

		System.out.println("Inscrire le texte recherche");
		String regEx = crayon.nextLine();

		//Etape 1: Utiliser Pattern
		Pattern pattern = Pattern.compile(regEx,Pattern.CASE_INSENSITIVE);

		//Etape 2: Allouer un objet Matcher pour l'entere specifie
		Matcher matcher = pattern.matcher(input);

		//Etape 3: Verifier la concordance et afficher le resultat
		//Utiliser find

		/*
		 * while(matcher.find()) { System.out.println("Le(s) mot(s) \""+matcher.group()
		 * + "\" debute a l'indice " + matcher.start() + " et finit a l'indice " +
		 * matcher.end()); }
		 */

		 //Utiliser matches()

			/*
			 * if ( matcher.matches()) {
			 * System.out.println("Les deux tests sont les memes");
			 * 
			 * } else { System.out.println("les deux testes sont differents"); }
			 */

		//Utiliser lookingAt()

		if (matcher.lookingAt())
	{
		System.out.println("On a trouve \""+
				matcher.group()+ "\" commencant a l'indice " + matcher.start() +
				" et finit a l'indice " + matcher.end()); 
		}
		else
		{
			System.out.println("Le texte ne se trouve pas au debut");
		}
		crayon.close();
	}

	}


