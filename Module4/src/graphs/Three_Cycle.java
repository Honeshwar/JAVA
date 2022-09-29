package graphs;

public class Three_Cycle {

	public static int solve(boolean[][] graph, int n) {
	
       
        
        
        // 3 cycle 3 for loop
      int count=0;
       for(int i=0; i<n ; i++) {
               
             for(int j=0; j<n ; j++) {
                 // if(graph[i][j] == true) {
                  
                 // it give 3rd edge of 3 cycle
             for(int k=0; k<n ; k++) {
                
                 // if(graph[j][k] == true)// an edge is there
                 // {
                 if(graph[i][j] == true && graph[j][k] == true && graph[i][k] == true) 
                     // 1 -- 2 -- 1 , 3rd edge find 1 -- 1 it always false
                     // same cell / place cannot link to itself
                     // e.g.. kullu -- kullu ,this route possible yes or no --> not possible.
                     count++;
                         }
                
                  //     }
                  // }
             } 
       }
//          int cycleCount = 0;

//         for (int i = 0; i < n - 2; ++i) {
//             for (int j = i + 1; j < n - 1; ++j) {
//                 for (int k = j + 1; k < n; ++k) {
//                     if (graph[i][j] && graph[j][k] && graph[k][i]) {
//                         ++cycleCount;
//                     }
//                 }
//             }
//         }
    
        return count/6;
	}
}
