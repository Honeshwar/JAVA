package generices;



//class ArrayPrint<T>{
//	
//	public static <T>  void arrayPrint(T arr[]) {
//		for(int i=0;i<arr.length;i++) {
//			System.out.println(arr[i]+" ");
//		}
//	}
//}



public class Method_Generics {
	class Print{
		
		public static   void arrayPrint(Integer[] a) {
			for(int i=0;i<a.length;i++) {
				System.out.println(a[i]+" ");
			}
		}

		public static void arrayPrint(Person[] p) {
			// TODO Auto-generated method stub
			
		}

		public static void arrayPrint(String[] s) {
			// TODO Auto-generated method stub
			
		}
	}
	public static void main(String[] args) {
		//Print b=new Print();
		
//		int a[]= {2,3,4};
		//wrapper class must use.
		Integer a[]= {2,3,4};
		
		Print.arrayPrint(a);
		String []s= new String[5];
		for(int i=0;i<s.length;i++) {
			s[i]="swag sad www";
			System.out.println(s[i]);
		}
		Print.arrayPrint(s);
	
      Person []p=new Person[8];
      Print.arrayPrint(p);
      // below reference array value
//      for(int i=0;i<p.length;i++) {
//			p[i]=new Person();
//			p[i]=p[i].Set(i+"how");
//			
//			System.out.println(p[i]);}
//			Person p1=new Person();
//		for(int i=0;i<p.length;i++) {
//			p1.print(p[i]);
//		}
     //p.clone();
     // Print.arrayPrint(p);
}
	}
