package othello;

/* 
 * blueprint for many players, 
 *  copy for many palyers ,
 *  properties and functionality work on  sifferent individiual palyer 

 */

public class Player {
	
	private String name;// when name update i know getter setter
	 int disc;//public
	
	public static final int BLACK = 1; // colour ko represent by intege.
	public static final int WHITE = 2;
	public Player(String name , String colour) {
		setName(name);
		setColour(colour);
	}
	
	
	public void setName(String name)
	{
		if(name.length() == 0)
			System.out.println("Name cannot be EMPTY");// exception we can throws.
		else
			this.name = name;
	}

	
	public void setColour(String colour)
	{
		colour = colour.toLowerCase();
		if(colour.equals("black"))
			this.disc=BLACK;
		
		else if(colour.equals("white"))
			this.disc=WHITE;
		
		else
			System.out.println(" Enter valid colour "); // exception  can be throws
		
		
		
		
		
		
		
	}



		public String getName() {
		if(name.isEmpty())	
		return "String is empty";
  
		return this.name;


}

		public String getColour() {
			
			if (this.disc == BLACK)
				return "black";
			
			if (this.disc ==WHITE)
				return "white";
			
//			if(this.colour == 0)
				return "enter colur before getting";
		}
















}
