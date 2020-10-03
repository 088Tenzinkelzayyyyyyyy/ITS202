public class queuelinklistTest
{
	public static void main(String[] pro)
	{
		queuelinklist obj = new queuelinklist();

		obj.enqueue(5);
		obj.enqueue(6);
		obj.enqueue(7);
		obj.enqueue(4);

		assert(obj.size()==4);
		assert(obj.isEmpty()==false);
		assert(obj.first()==5);
		assert(obj.dequeue()==5);
		assert(obj.size()==3);

		System.out.println("Bro you reach to pro level..");
	}
}