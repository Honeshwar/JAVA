import java.util.ArrayList;

public class KillPeople {
public static void main(String[] args) {
	ArrayList<Integer> people=new ArrayList<>();
	for(int i=1;i<=100;i++) {
		people.add(i);
	}
	
people=	killAll(people);
int size=people.size();
for(int i=0;i<size;i++) {
	System.out.print(people.get(i)+" ");
}
}

private static ArrayList<Integer> killAll(ArrayList<Integer> people) {
//	ArrayList<Integer> peopleKilled =new ArrayList<Integer>();
	for(int i=1;i<people.size();i++) {
		if(people.get(i)%2==0) {
			people.remove(i);
		}
			
	}int size=people.size();
	for(int i=1;i<size;i++) {
		if(people.get(i)%2==1) {
			people.remove(i);
		}
			
	}
	return people;
}
}
