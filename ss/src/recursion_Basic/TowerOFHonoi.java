package recursion_Basic;

import java.util.Scanner;

public class TowerOFHonoi {
	public static void towerOfHanoi(int disks, char source, char auxiliary, char destination) {
		if(disks==0){// for zero disks
            return;
        }
		if(disks==1) {
		System.out.println(source+" "+destination);	// first disk move
		return;
		}//return; compile execute this line,than compiler get exit from function.
	
		towerOfHanoi(disks-1, source, destination,auxiliary);// second disk move
		System.out.println(source+" "+destination);
		towerOfHanoi(disks-1,  auxiliary,source, destination);// first disk move above second disk
	}
	
	public static void towerHanoi(int n,char s,char h,char d){
        if(n==1){
            System.out.println(" 1st disk from "+s+" to "+d);
            return;
        }
        towerHanoi(n-1,s,d,h);
        System.out.println("move"+n+" th disk from "+s+" to "+d);
        towerHanoi(n-1,h,s,d);
    }

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		towerOfHanoi(n, 'a', 'b', 'c');
		towerHanoi(n, 's', 'h', 'd');
		towerHanoi1(n,"source", "helper","destination");
	}

	private static void towerHanoi1(int n, String string, String string2, String string3) {
		
		if(n==1){
            System.out.println("move 1st disk from "+string+" to "+string3);
            return;
        }
        towerHanoi1(n-1,string,string3,string2);
        System.out.println("move"+n+" th disk from "+string+" to "+string3);
        towerHanoi1(n-1,string2,string,string3);
	}
}


