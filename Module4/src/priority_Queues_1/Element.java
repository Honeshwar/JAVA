package priority_Queues_1;


/*
 * template / node create karaga that store value and priority at same time.
 * 
 */

public class Element<V> {
	 V value;
	 int priority;
  
	 public Element(V value,int priority) {
	 this.priority=priority;
	 this.value=value;
	}
 
}
