package hashMap;

public class NodeInMap<K,V> {

	K key;
	V value;
	NodeInMap<K, V> next;
  public NodeInMap(K key,V value){
	  this.key=key;
	  this.value=value;
	  next=null;
  }
}
