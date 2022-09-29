package twoDArray;

public class Spiral {
	
		
	public static void spiralPrint(int matrix[][]){
        if(matrix.length==0){
    System.out.println();
return;
}

        
		int rS=0,rE=matrix.length-1;
		int cS=0,cE=matrix[0].length-1;
		while(rS<=rE) {
            int cols=cS;
			for ( ;cols<=cE && rS<=rE;cols++) { // rS<=rE for loop run only  when this condition full fill 
				System.out.print(matrix[rS][cols]+" ");// if we don't use it ,then all loop run that we don't need
			}											// our loop run only for rS<=rE
			
			rS++;
			
				int j=cE;
					
					for(int i=rS;i<=rE && rS<=rE ;i++) {
						System.out.print(matrix[i][j]+" ");
			}cE--;
			int end=rE;
			
			for (int k =cE;k>=cS && rS<=rE;k--){//cols
				System.out.print(matrix[end][k]+" ");
			}
			rE--;
			int up=cS;
		
			for(int y=rE;y>=rS && rS<=rE;y--) {
				System.out.print(matrix[y][up]+" ");
}cS++;
	}

}

		
	public static void main(String[] args) {
		int a[][]= {{1 ,2, 3}, 
				{4 ,5, 6 },
				{7 ,8, 9 },
				{10, 11, 12 }};
		int b[][]= {{1, 2 ,3, 4, 5} ,
				{6 ,7, 8, 9, 10 },
				{11 ,12, 13, 14 ,15 },
				{16 ,17 ,18 ,19, 20 },
				{21, 22, 23 ,24 ,25 }
};
		spiralPrint(a);
		System.out.println();
		
		spiralPrint(b);
		//spiralPrint(null);
	}

}
