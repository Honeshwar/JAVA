package basic;

public class Dynamic_Array {
	static int age=0;
private int data[];
private int index;//for index count
public Dynamic_Array() {
	this.data=new int[6];
	index=0;
}

boolean isEmpty() {
//	if(this.data.length==0) {
//		return true;
//	}
//	return false;
	return this.data.length==0;
}
	
	void set(int index,int value) {
		if(index==data.length) {
		//	throw error
			return ;
		}
		this.data[index]=value;
		index=index+1;
		
	}
	private void increaseLength() {
		
		/*before increase capacity of array 
		i want to store reference(value) of old array 
		 if i don't do it than old array element vanished.*/
		int temp[]=data;
		
			data=new int[2*temp.length];//
			for(int i=0;i<temp.length;i++) {
				this.data[i]=temp[i];
			}
		}
		
	

public	int get(int i) {
		if(i>=this.data.length) {
			//throw error
			return-1;
		}int temp=this.data[i];
		return temp;
	}

	int size() {
		
	return 	this.data.length;
	}
//void print() {
//	for(int i=0;i<data.length;i++) {
//	System.out.println(	data[i]);
//	}
//}
void add(int value) {
	if(index==data.length) {//initial=0
		increaseLength();
	}
	data[index]=value;
	index=index+1;// after giving value move to next index
}
public int removeLast() {
	if(index==0) {
		return -1;
	}
	int temp=data[index-1];
	data[index-1]=0;//skip also
	index--;
	return temp;
}

}

