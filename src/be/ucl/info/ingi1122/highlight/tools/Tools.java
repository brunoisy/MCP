public class Tools {

	public static Portion[] quoiSurligner(char[] texte, char[][] mots) {
		return new Portion[0];
	}
	
	public static boolean contains(char[] texte, char[] mots){
		
		for (int i = 0 ; i < texte.length; i++){
			if (texte[i] == mots[0] ){
				int count = 1;
				for (int j = 1; j< mots.length; j++){
					if(texte[i+j] == mots[j]){
						count++;
					}
				}
				if(count == mots.length){
					return true;
				}
			}
		}
		return false;	
	}
	public static boolean correspond(char[] texte, char[][] mots) {
		
		
			for (int i = 0; i < mots.length ; i++){
				if (! contains(texte, mots[i])){
					return false;
				}
			}
		return true;
	}
	
}
