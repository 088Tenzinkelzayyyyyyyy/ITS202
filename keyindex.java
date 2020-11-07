public class keyindex{
	
	public static void indexing(int arra[]){
		
		int R = 256;
		int N = arra.length;
		int aux[] = new int[N];
		int count [] = new int[R+1];


		for (int i = 0;i < N ; i++) {
			count[arra[i]+1]++;	
		}

		for (int r = 0; r < R; r++ ) {
			count[r+1] += count [r];
		}

		for (int i = 0; i < N; i++) {
			aux[count[arra[i]]++] = arra[i];
		}

		for (int i = 0; i < N; i++ ) {
			arra[i] = aux[i];
		}

		for (int i: arra) {
			System.out.print(i+" ");
		}

	} 

	public static void main(String[] args) {
		int arra[] = { 5, 1, 2, 6, 3, 3, 4, 5};
		keyindex ob = new keyindex();
		ob.indexing(arra);
		//indexing(arra);

	}
}