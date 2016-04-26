public class Tools {


	public static Portion[] quoiSurligner(char[] texte, char[][] mots) {
		PortionSet portions = new PortionSet();

		for (int i = 0; i < mots.length; i++) { //pour chaque mot clé
			for (int j = 0; j < texte.length; j++) { // pour chaque lettre du texte
				int count;
				for (count = 0; count < mots[i].length; count++) {
					if (texte[j + count] != mots[i][count]) {
						break;
					}
				}
				if (count == mots[i].length) {
					portions.addPortion(new MyPortion(j, (j + mots[i].length - 1)));
				}
			}
		}
		return portions.getPortions();
	}

	/*
		public static Portion[] quoiSurligner(char[] texte, char[][] mots) {
			Portion[] portions = new Portion[mots.length];
			for (int i = 0; i < mots.length; i++) {
				for (int j = 0; j < texte.length; j++) {
					if (texte[j] == mots[i][0]) {
						int count = 1;
						for (int k = 1; k < mots.length; k++) {
							if (texte[j + k] == mots[i][k]) {
								count++;
							}
						}
						if (count == mots[i].length) {
							Portion p = new Portion {
								j, (j + mots[i].length - 1)
							} ;
						}
					}
				}
				portions[i] = p;
			}

			return portions;
		}
		*/

	public static boolean contains(char[] texte, char[] mots) {

		for (int i = 0; i < texte.length; i++) {
			if (texte[i] == mots[0]) {
				int count = 1;
				for (int j = 1; j < mots.length; j++) {
					if (texte[i + j] == mots[j]) {
						count++;
					}
				}
				if (count == mots.length) {
					return true;
				}
			}
		}
		return false;
	}

	/*
	public static boolean correspond(char[] texte, char[][] mots) {


		for (int i = 0; i < mots.length; i++) {
			if (! contains(texte, mots[i])) {
				return false;
			}
		}
		return true;
	}
	*/

	public static boolean correspond(char[] texte, char[][] mots) {

		for (int i = 0; i < mots.length; i++) { //pour chaque mot clé
			boolean containsWord = false;
			for (int j = 0; j < texte.length; j++) { // pour chaque lettre du texte
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
