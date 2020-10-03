public class stack
{
	int n;
	int t;
	int arr[];
	int size;
	public stack()
	{
		n = 6;
		t = -1 ;
		arr = new int[n];
		size = 0;
	}
	public boolean isEmpty()
	{
		if(size == 0){
			return true;
		}
		return false;
	}
	public int size()
	{
		return size;
	}
	public int top()
	{
		if(isEmpty())
		{
			return 0;
		}
		return arr[t];
	}
	public void push(int x)
	{
		if(size == 0){
	        arr[0]=x;
	        t=0;
	    }
	    else{
	        t= t + 1;
	        arr[t]=x;
	    }
	    size+=1;
	}
	public int pop()
	{
		if(isEmpty()){
      		System.out.print("stack underflow");
    	}
    	else{
      		t-=1;
    	}
    	size-=1;
    	return arr[t+1];
	}
}