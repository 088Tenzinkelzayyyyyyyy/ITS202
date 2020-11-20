public class SequentialSearchSTTest{
	public static void main(String[] args) {
		SequentialSearchST<String, Integer> obj = new SequentialSearchST<String, Integer>();

		obj.put("A",5);
		obj.put("B",7);
		obj.put("C",6);
		// System.out.println(obj.size());
		// System.out.println(obj.isEmpty());
		// System.out.println(obj.contains("A"));
		// System.out.println(obj.get("A"));
		obj.delete("B");
		// System.out.println(obj.get("B"));

		assert(obj.contains("Penjo")==true);
		assert(obj.contains("Wangdugey")==false);

		assert(obj.size()==5);
		assert(obj.get("Dawa")==4);
		assert(obj.get("Lham")==6);

		obj.delete("Joji");


		assert(obj.size()==4);


		System.out.println("all test case pass");
	}
}
