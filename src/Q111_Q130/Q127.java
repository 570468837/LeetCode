package Q111_Q130;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Q127 {
	public static void main(String[] args) {
		List<String> wordList = new ArrayList<String>();
		wordList.add("a");		wordList.add("b");		wordList.add("c");
		new Q127().ladderLength("a", "c", wordList);
		
	}
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Queue<String> queue = new LinkedList<>();
        queue.offer(beginWord);
        int level = 1;
        while(!queue.isEmpty()){
        	int levelNum = queue.size();
        	for(int i=0; i<levelNum; i++){
        		if(queue.peek().equals(endWord))
        			return level;
        		addToQueue(queue.peek(), wordList, queue);
        		queue.poll();
        	}
        	level++;
        }
    	return 0;
    }
    
    void addToQueue(String curWord, List<String> wordList, Queue<String> queue){
    	for(int i=0; i<wordList.size();i++){
    		if(ifNeighbor(curWord, wordList.get(i))){
    			queue.offer(wordList.get(i));
    			wordList.remove(i);
    			i--;
    		}
    	}
    }
    
    boolean ifNeighbor(String beginWord, String word){
    	int countDiff = 0;
    	for(int i=0; i<beginWord.length();i++){
    		if(beginWord.charAt(i) != word.charAt(i))
    			countDiff++;
    		if(countDiff > 1)
    			return false;
    	}
    	return countDiff==1? true: false;
    }
}
