class mergesort{
	int[] ar;
	int[] temp_Array;
	int length;

	public static void main(String args[])
	{
		int[] arrayToSort = {8,1,4,0,2,5,7,3};

		mergesort a = new mergesort();
		a.sort(arrayToSort);
		System.out.print(" Sorted array = ");
		for(int n:arrayToSort){
			System.out.print(n);
			System.out.print(" ");
		}
		System.out.print("\n Length of array = " + arrayToSort.length);
		System.out.print("\n");
	}

	public void sort(int[] arrayToSort)
	{
		this.ar = arrayToSort;
		this.length = arrayToSort.length;
		this.temp_Array = new int [length];
		merge_sort(0, length-1);
		
	}

	public void merge_sort(int low, int high)
	{
		if(low<high)
		{
			int mid = low + (high-low)/2;
			merge_sort(low, mid);
			merge_sort(mid+1, high);
			merge(low, mid, high);
		}
	}
	public void merge(int low, int mid, int high)
	{
		for(int n=low; n<=high; n++){
			temp_Array[n] = ar[n];
		}
		int n = low;
		int o = mid + 1;
		int p= low;
		while(n<= mid && o<=high)
		{
			if(temp_Array[n] <= temp_Array[o])
			{
				ar[p] = temp_Array[n];
				n++;
			}
			else
			{
				ar[p] = temp_Array[o];
				o++;
			}
			p++;
		}
		while(n<=mid)
		{
			ar[p] = temp_Array[n];
			n++;
			p++;
		}
	}
}

   