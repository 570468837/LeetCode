package Q001_Q010;

public class Q10 {
	
public static void main(String[] args) {
	Q10 q = new Q10();	
	String s = "abccaa";
	String p = "abc*aa";
	System.out.println(q.isMatch(s, p));
}

public boolean isMatch(String s, String p) {  
    return helper(s,p,0,0);  
}  
private boolean helper(String s, String p, int i, int j)  
{  
    if(j==p.length())  
        return i==s.length();  
      
    if(j==p.length()-1 || p.charAt(j+1)!='*')  
    {  
        if(i==s.length()|| s.charAt(i)!=p.charAt(j) && p.charAt(j)!='.')  
            return false;  
        else  
            return helper(s,p,i+1,j+1);  
    }  
    //p.charAt(j+1)=='*'  
    while(i<s.length() && (p.charAt(j)=='.' || s.charAt(i)==p.charAt(j)))  
    {  
        if(helper(s,p,i,j+2))  
            return true;  
        i++;  
    }  
    return helper(s,p,i,j+2);  
}  

}
