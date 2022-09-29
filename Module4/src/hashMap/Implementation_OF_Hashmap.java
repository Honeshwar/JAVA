package hashMap;

import java.util.ArrayList;


public class Implementation_OF_Hashmap<K,V> {
  
	/*
	NodeInMap<K, V> arr[];
   
   public Implementation_OF_Hashmap() {
	   NodeInMap<Integer, String> arr[]=new  NodeInMap<Integer, String>[20];
	PrintSumToZero arry[]=new PrintSumToZero[9];
}
*/
	
	// bucket array
	
	ArrayList<NodeInMap<K,V>> bucket;
	int count ;
	int numBucket;//BucketSize
	
	public Implementation_OF_Hashmap() {
		bucket=new ArrayList<NodeInMap<K,V>>();
		numBucket=20;
		
		for(int i=0;i<20;i++) {
			bucket.add(null);
		}
		
	}

private  int getHashCode(K key) {
	// hash code generate
	
	//key always object ,like String ,Integer etc... inherite object super class sohashCode() func. can use by them.
	
	int hashCode=key.hashCode(); 
	int comprasion=hashCode % numBucket;
	
	return comprasion;
}


public void put(K key,V value) {
	// hash code generate  and comprasion karna hai, for that func create
	
	int bucketIndexforAddingNewNode=getHashCode(key);
	
	//  To iterate i need node ll head
	NodeInMap<K, V> head=bucket.get(bucketIndexforAddingNewNode);
	// find whether element is there? update value
	
	while(head!=null)
	{
		if(head.key.equals(key)) {// head.key==key only reference equal check
			
			head.value=value;
			return;
		}
		
		
		head=head.next;
	}
	
	//whether element is not there? create node
	
	//head current ll ka head karna padage because in loop woh null hogayaga.
	head=bucket.get(bucketIndexforAddingNewNode);
	NodeInMap<K, V> newHead=new NodeInMap<K, V>(key, value);
	newHead.next=head;
	bucket.set(bucketIndexforAddingNewNode, newHead);//replace
	count++;
	
	//bucket.add(newHead);  // not this because add start  0th index start but we wants  this index = bucketIndexforAddingNewNode for adding new node
	//bucket.add(bucketIndexforAddingNewNode, newHead);n// add and if that particular index have some node than this func. move (shift) to +1 index.
	
	
	//Important
	// REHASHING == firstly size double ,again hash code generate  and comprason h.c. and insert;
	// entries / bucket size should be < 0.75 , complexity to rehash O(1).
	double loadFactor= (double) count/numBucket;
	if(loadFactor>=0.75) {// > 0.75 also work
		rehash();// size double of bucket arrylist , so O(1) T.C maintain by not entirely add in same cell too much.
	}
}

private void rehash() {
	ArrayList<NodeInMap<K,V>> temp=bucket;
	
    bucket =new ArrayList<NodeInMap<K,V>>();//(numbucket*2)
    
    // detailing
    for(int i=0;i<2*numBucket;i++) {
    	bucket.add(null);
    }
    // temp insert ll to new arrayList
    count =0;
    numBucket=2*numBucket;
    int size =temp.size();
    for(int i=0;i<size;i++) {
    	
    	NodeInMap<K, V> head=temp.get(i);
    	// one cell have long chain of ll
    	
    	while(head!=null) {
    		K key=head.key;
    		V value=head.value;
    		
    		put(key,value);
    		count++;
    		
    		
    		head=head.next;
    	}
    	
    }
	
}

// O(1)
public int size() {
	return count;
}


public V search(K key) {
	// key  hash code generate 
	 int index=getHashCode(key);
	 
	 // i got index index to get value, arraylist tpe nodeInMap
	 NodeInMap<K, V> headLL=bucket.get(index);
	 
	 
	 // edege case head=null,
	 while(headLL!=null) {
		 if(headLL.key.equals(key)) {
			 return headLL.value;
		 }
		 
		 
		 
		 
		 headLL=headLL.next;
		 
	 }
	 return null;
	 
}

public K delete(K key) {
	// key  hash code generate 
	 int index=getHashCode(key);
	 
	 // i got index index to get value, arraylist tpe nodeInMap
	 NodeInMap<K, V> headLL=bucket.get(index);// get O(1) arays or arrayList
	 NodeInMap<K, V> prev=null;
	 
	 
	 while(headLL!=null) {
		 if(headLL.key.equals(key)) {
			 if(prev!=null) {
				 NodeInMap<K, V> temp=headLL;
				 // inbetween delete karna hai
				prev.next=headLL.next; // currentheadNode deleted
			   count--;
			   return temp.key;
			 
			 }else {
				 NodeInMap<K, V> temp=headLL;
			// edege case head=delete, value(head) store at arraylist get changes 
			 bucket.set(index, headLL.next);  // head delete and next become head
			 count--;
			 return temp.key;
			/* 
			 NodeInMap<K, V> temp=headLL.next;
			 headLL=null;
			 headLL=temp;
			 // abhi bhe in arraylist current head is delete head.,reference that not changes yet i just change ll not array stored value;
			 bucket.set(index, headLL);
			 
			 */
			 }
		 }
		 
		 
		 
		 prev=headLL;
		 headLL=headLL.next; // largest and secomd largest type thing/
		 
		 
	 }
	// edege case head=null,
	 return null;
	 
}






}
