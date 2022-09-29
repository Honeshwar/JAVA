package generices;

public class MultipleGeneric<I, S> {
	private I first;
	private S second;
	//private Object name;
	public MultipleGeneric() {
		
	}
	public MultipleGeneric(I first,S second) {
		this.second=second;
		this.first=first;
		
	}

void setFirst(I first) {
	 this.first=first;
}
void setSecond(S second) {
	 this.second=second;
}
I getFirst() {
	return this.first;
}
S getSecond() {
	return this.second;
}

void print() {
	System.out.println("first="+first+" Second="+second);
}
}
