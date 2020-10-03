public class queue
{
	int raer;
	int front;
	int arr[];
	int size;
	public queue(int x)
	{
		arr = new int[x];
		front = -1;
		raer = -1;
		size  = 0;
	}
	public boolean isEmpty()
	{
		if(size==0)
		{
			return true;
		}
		return false;
	}
	public int size()
	{
		return size;
	}
	public int first()
	{
		if(isEmpty())
		{
			return 0;
		}
		return arr[front];
	}
	public void enqueue(int x)
	{
		if(isEmpty())
		{
			arr[0]=x;
			front=0;
			raer=0;
		}
		else
		{
			raer +=1;
			arr[raer]=x;
		}
		size +=1;
	}
	public int dequeue()
	{
		if(isEmpty())
		{
			return 0;
		}
		else
		{
			front +=1; 
			size -=1;
		}
		
		return arr[front-1];
	}
}