public class Tools {

	public static Portion[] quoiSurligner(char[] texte, char[][] mots) {
		Portion[] portions = new Portion[mots.length];
		for (int i = 0; i < mots.length; i++){
			for (int j = 0; j < texte.length; j++){
				if(texte[j] == mots[i][0]){
					int count =1;
					for(int k = 1; k < mots.length ;k++ ){
						if(texte[j+k] == mots[i][k]){
							count ++;
						}
					}
					if(count == mots[i].length){
						Portion p = new Portion{j,(j+mots[i].length -1)};
					}
				}
			}
			portions[i] = p;
		}
		
		return portions;
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
