import java.util.Scanner;
public class insertionsort{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int length = sc.nextInt();
		int a[] = new int[length];
			for(int i = 0; i < length; i++) {
				System.out.print("Enter elements of array : ");
				int e = sc.nextInt();
				a[i] = e;
			}
			System.out.println("Before sorting: ");
			for (int j=0;j<a.length;j++) {
				System.out.print(" "+a[j]);
			}

		insertionsort o = new insertionsort();
		o.sort(a);
		System.out.println();
		o.printa(a);
	}
	void sort(int a[]){

		int n = a.length;
		for (int i=1; i<n ;i++) {
			int k = a[i];
			int j = i - 1;

			while (j >= 0 && a[j] > k){
				a[j + 1] = a[j]; 
                j = j - 1; 
			}
			a[j+1] = k;
		}
	}

	void printa(int a[]){
		System.out.println("After sorting: ");
		int n = a.length;
		for (int i=0;i<n ;i++ ) {
			System.out.print(" "+a[i]);
			
		}
	}


}