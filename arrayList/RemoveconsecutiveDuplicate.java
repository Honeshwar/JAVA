package arrayList;
import java.util.ArrayList;

public class RemoveconsecutiveDuplicate {
	
public static ArrayList<Integer> removeConsecutiveDuplicate(int a[]){
	ArrayList<Integer> l=new ArrayList<>();
	l.add(a[0]);// one toh hoga he hoga
	
	for(int i=1;i<a.length;i++) {
		if(a[i]!=a[i-1]) {
			//Integer a1=a[i];
			l.add(a[i]);
//			j++;i+=2;}
//		}else {
//			Integer a2=a[i];
//			l.add(a2);
//			i++;j++;
//		}
		
	}
	
}return l;}
	public static void main(String[] args) {
		int a[]= {10,10,23,34,23,10,33,32};
		ArrayList<Integer > a1=removeConsecutiveDuplicate(a);
		for(int i:a1){
			System.out.print(i+" ");
		}
for(int i=0;i<a1.size();i++) {
	System.out.println(a1.get(i));
}
	}
}