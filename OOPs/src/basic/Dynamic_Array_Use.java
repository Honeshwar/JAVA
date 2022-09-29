package basic;

public class Dynamic_Array_Use {

	public static void main(String[] args) {
		Dynamic_Array d1=new Dynamic_Array();
//		System.out.println(d1.age);
//		Dynamic_Array.age=9;
//		d1.age=8;
		/*ADD
		 * 
		 * SET
		 * GET
		 * ISEMPTY
		 * PRINT
		 * SIZE
		 * REMOVE LAST
		 * REMOVE -- remove element and shift RHS element to LHS to that element index.
		 * ADD( , ); add element and shift RHS element to LHS to that element index.
		 * 
		 * 
		 */
		
		for(int i=0;i<100;i++) {
			d1.add(i);
		}
		d1.add(0);
		System.out.println(d1.removeLast());
		System.out.println(d1.get(3));
//		System.out.println(d1.isEmpty());
		System.out.println(d1.size());
//		d1.print();
		
		
		
		
		
	}

}
