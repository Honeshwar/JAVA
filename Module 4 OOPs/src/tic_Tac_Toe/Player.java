package tic_Tac_Toe;

import java.util.Scanner;

public class Player {

	private String name;
	private char symbol;
	
	public Player(String name, char symbol) {
		// not set directly name/symbool to an object becuse user can fill invalid name also
		// create getter setter ,sue for restriction.
		// direct set name , than that wlll fixed for all time,lifetime
		// flexibility ka liya we do this.
		setName(name);
		setSymbol(symbol);
		
	}
// if i don't use getter/setter ,than i will nerver will change player name.
	// so that func. is public user can  change name whenever he/she want to change.
    public void setName(String name)
	{
		if(!name.isEmpty())//name != "" , any consttrain for name
			this.name=name;
					
					
	}
	public void setSymbol(char symbol)// throws NotValidSymbol
	{
		if(symbol == 'X' || symbol == 'O' )
			this.symbol = symbol;
//		else {
//			//throw new NotValidSymbol();
//			System.out.println("Not Valid Symbol");
//		}
					
	}


	public String getName()
	{
		return this.name;
	}
	
	
	public char getSymbol()
	{
		return this.symbol;
	}


	
		














}
