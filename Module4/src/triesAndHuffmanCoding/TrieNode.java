package triesAndHuffmanCoding;

 // alag se bhe bana sakta hai. wase alag se he banata to structrual way.

 public class TrieNode{// tree = tree node / binary = binary node 
	 
	 char data;          //[A-Z]
	 boolean isTerminal;
	 public int childCount;
	 
	  public TrieNode children[];
	public boolean isTerminating;
	  public TrieNode(char data) {
		
		  this.data=data;
		  this.isTerminal=false; // by defaut boolean is always false nahi bhe karta chalta// use tell us 
	      this.children=new TrieNode[26];
	      this.childCount=0;
	      //  this keyword refer to reference of(main) class current  instance object, 
	      //  instane variable == create in class outside an methods
	  
	  }
	 
}

