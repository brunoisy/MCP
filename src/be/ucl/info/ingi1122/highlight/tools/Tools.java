package be.ucl.info.ingi1122.highlight.tools;

import be.ucl.info.ingi1122.highlight.tools.Portion;
import be.ucl.info.ingi1122.highlight.tools.MyPortion;
import be.ucl.info.ingi1122.highlight.tools.PortionSet;

public class Tools {


	public static Portion[] quoiSurligner(char[] texte, char[][] mots) {
		PortionSet portions = new PortionSet();

		for (int i = 0; i < mots.length; i++) { //pour chaque mot clé
			for (int j = 0; j < texte.length - mots[i].length + 1; j++) { // pour chaque lettre du texte	
				if (match(texte, mots[i], j)) {
					portions.addPortion(new MyPortion(j, j + mots[i].length));
				}
			}
		}
		return portions.getPortions();
	}

	public static boolean match(char[] texte, char[] mot, int j){
		for (int count = 0; count < mot.length; count++) {
			if (texte[j + count] != mot[count]) {
				return false;
			}
		}
		return true;
	}


	public static boolean correspond(char[] texte, char[][] mots) {

		for (int i = 0; i < mots.length; i++) { //pour chaque mot clé
			boolean containsWord = false;
			for (int j = 0; j < texte.length - mots[i].length + 1; j++) { // pour chaque lettre du texte
				int count;
				for (count = 0; count < mots[i].length; count++) {
					if (texte[j + count] != mots[i][count]) {
						break;
					}
				}
				if (count == mots[i].length) {
					containsWord = true;
					break;
				}
			}
			if (! containsWord)
				return false;
		}
		return true;
	}
}
