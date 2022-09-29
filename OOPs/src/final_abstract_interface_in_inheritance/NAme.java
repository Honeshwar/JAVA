package final_abstract_interface_in_inheritance;

public class NAme extends Student implements Interface,INter {
	//multiple interface at same time.

	@Override
	public int weight() {
		// TODO Auto-generated method stub
		return 70;
	}

	@Override
	public String name() {
		// TODO Auto-generated method stub
		return "how";
	}

	@Override
 public	int age() {
		// by default --> public abstract method
		// remove public throw an error/.
		return 10;
	}

	@Override
	public int num() {
		// TODO Auto-generated method stub
		return 0;
	}

	
}
