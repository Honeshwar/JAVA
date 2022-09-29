package applicationOf_triesAndHuffmanCoding;

import java.util.ArrayList;

import triesAndHuffmanCoding.TrieNode;

/*
 * we searh in google someting we type to fast and ski some word or write wrong spellin of words;
 */

public class PatternMatching_Using_SuffixTries {

	TrieNode root;
	

	public boolean patternMatching(ArrayList<String> vect, String pattern) {
         if(vect.isEmpty())
            return false;
        
         if(vect.isEmpty() && pattern=="")
            return true;
        
         boolean output=false;
        
        int size=vect.size();
        for(int i=0;i<size;i++){
            
           
            for(int j=vect.get(i).length()-1;j>=0;j--){
             String insertPart=vect.get(i).substring(j);
              insertNodeInTries(root , insertPart);
               
                 output =  searchPattern(root , pattern);
              

                    if(output)
                        return true;
        }
           
        }
       
          
            return output;
        
	}

    
    
    private boolean searchPattern(TrieNode root,String pattern){
        
         if(pattern.isEmpty())
            return true;
        
        int index = pattern.charAt(0) - 'a';
        
        TrieNode child = root.children[index];
        
        if(child == null){
            return false;
           
        }
        
            return searchPattern(child,pattern.substring(1));
        
        
    }
    
    
    
    private void insertNodeInTries(TrieNode root,String word){
        
        if(word.isEmpty())
            return;
        //childIndex
        int index = word.charAt(0) - 'a';
        
        TrieNode child = root.children[index];
        
        if(child == null){
            
            child = new TrieNode(word.charAt(0));
            root.children[index] = child;
        }
        
        insertNodeInTries(child, word.substring(1));
    }
    
	
	
}
