public class LSD{
	
	public static void sort(){
		//Sort x[] on leading T characters.
		String x[] = { "Dorji","Penjo","Namja","Oojay","Tseri" };
		int T = x[0].length();
 		int N = x.length;
 		int R = 256;
 		String[] aux = new String[N];

 		for (int i = 0; i < N ; i++) {
 			System.out.print(x[i]+" ");
 		}
 		
 		for (int k = T-1; k >= 0; k--){
			// Sort by key-indexed counting on kth char.
			int[] count = new int[R+1];
		
			// Compute frequency counts.
			for (int i = 0; i < N; i++){
 				count[x[i].charAt(k) + 1]++;

			}
		
			for (int r = 0; r < R; r++){
			// Transform counts to indices.
				count[r+1] += count[r];
			}
			for (int i = 0; i < N; i++){
 			// Distribute.
				aux[count[x[i].charAt(k)]++] = x[i];
 			}
 			for (int i = 0; i < N; i++){
 			// Copy back.
				x[i] = aux[i];
 			}
 		}
 		System.out.println(" ");
 		System.out.println(" ");

 		for (int i = 0; i < N ; i++) {
 			System.out.println(x[i]+" ");
 		}	
 	}

 	public static void main(String[] args) {
		sort();
 	}
}