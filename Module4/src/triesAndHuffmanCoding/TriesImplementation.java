package triesAndHuffmanCoding;

/*
 * // alag se bhe bana sakta hai. wase alag se he banata to structrual way.

 class TrieNode{// tree = tree node / binary = binary node 
	 
	 char data;          //[A-Z]
	 boolean isTerminal;
	 int childCount;
	 
	  TrieNode children[];
	  public TrieNode(char data) {
		
		  this.data=data;
		  this.isTerminal=false; // by defaut boolean is always false nahi bhe karta chalta// use tell us 
	      this.children=new TrieNode[26];
	      this.childCount=0;
	      //  this keyword refer to reference of(main) class current  instance object, 
	      //  instane variable == create in class outside an methods
	  
	  }
	 
 }


 */




public class TriesImplementation {

	private TrieNode root;
	
	public TriesImplementation() {
		root = new TrieNode('\0'); // '\0'== null
	}
	
	
	public void remove(String word)
	{
		
		
		
	}
	// just terminal = false not remove anything ,
	// but vnot remove anything become our Tries DS bad in space complexity
	// so we create new func. for remove , after line 80
	 private void removeHelper1(TrieNode root , String word)
	 {
		 if(word.isEmpty()) {
			 
			 if(root.isTerminal) {
				 root.isTerminal=false;
					
				 return;
			
		 }
		 
		 // index
		 int childIndex = word.charAt(0) - 'A';
		 TrieNode child = root.children[childIndex];
		 
		 if(child == null) // he haven't that letter
		 {
			 return ;
		 }
					 
			 removeHelper1(child, word.substring(1));
			 
			 
		 }
	 }
	
	 
	public void Helper( String word)
	{
		removeHelper(this.root, word);
		removeHelper1(this.root, word);
	}
	
	// better remove
	private void removeHelper(TrieNode root , String word)
	 {
		 
		 if(word.isEmpty()) {
				// if(root.isTerminal) 
					 root.isTerminal=false;
						
				 return;
			 }
		 // index
		 int childIndex = word.charAt(0) - 'A';
		 TrieNode child = root.children[childIndex];
		 
		 if(child == null) // he haven't that letter
		 {
			 return ;
		 }
		
			 removeHelper(child, word.substring(1));
			 
			 // important
			 
			 if(!child.isTerminal && child.childCount ==0) {
				 
				 root.children[childIndex] = null;
				 root.childCount--;
				 
			 }
			 
			 
			 
			 
			 
			 
			 
			 
			 
//						int childcount1=0;
//					 for(TrieNode a:root.children) {
//						 if(a != null)
//							 childcount1++;
//						 
//					 }
					
		
	 }
	 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public boolean  search(String word) {
		
		return searchHelper(root,word); // this.root 
		
		
	}
	
	
	private boolean searchHelper(TrieNode root, String word) {
		
		if(word.isEmpty()) { // root = last character of word in String word
			return root.isTerminal;// check whether it is end(terminal) of word or not
		}
		
		// needed things
		// find character , index in array , throught ASCII
		int childIndex = word.charAt(0) - 'A'; // A-A=0  B-A = 1  index of array
		TrieNode child = root.children[childIndex];
		// i do part
		if(child == null)
			return false;
		
		// recusive part
		searchHelper(root.children[childIndex], word.substring(1));
		
		
		
		
		
		
		return false;
	}









	public void add(String word) {
		
		addHelper(root,word);
		
		
	}
	/*
	 * addHelper is used because 
	 * 1. we know tree are 85% recusive in nature , so we use recusive approach to insert,add.
	 * 2. we have to maintain current root(current root at that time) and its children linkage ,so there
	 *    would we possiblity that we have to link root to its children and this children to 
	 *    its children and this children to its child...
	 * 3. to create that linkage we have to traverse from our root  to its children ,so we need parameter in function as TrieNode root 
	 *    so we an  traverse from  root  to its children and an add new root and can link it  with current root at that time.
	 */
    
	// T(n) = O(length of word).  avg. L=4-5 character  ,  T(n) = O(5)= T(n) = O(1).
	private void addHelper(TrieNode root, String word) {
		
		if(word.isEmpty()) {  //  word.length() == 0;
			root.isTerminal = true;
			return;
		}
		
		// word character == index where children is
		int childIndex = word.charAt(0) - 'A';
		TrieNode child = root.children[childIndex] ;
		
		  if(child == null)//                               if(root.children[childIndex] == null)
		  {
			  //new node created, new object
			  child= new  TrieNode(word.charAt(0));
			  // link with current root
			  root.children[childIndex] = child;
			  
			  // childcount increase
			  root.childCount++;
			  
			  
		  }
		  // recusive part
		  addHelper(child, word.substring(1)); // child ==  root.children[childIndex]
		  // may possible  that child may have children.  isliya  addHelper(child,  );
		  // word.substring(1) == recusive part of String ,i do done by us that is word.charAt(0);
	}
}
















