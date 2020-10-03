public class queueTest
{
	public static void main(String[] pro)
	{
		queue obj = new queue(6);

		obj.enqueue(7);
		obj.enqueue(9);
		obj.enqueue(2);
		obj.enqueue(8);

		assert(obj.size()==4);	
		assert(obj.dequeue()==7);
		assert(obj.isEmpty()== false);
		assert(obj.first()==9);

		System.out.println("You reach to pro level bro..");
		
	}
}