import java.util.HashMap;

public class LongestStringWithoutRepeatingCharacters {
    public static int optimal(String s){
        HashMap<Character,Integer> map=new HashMap<>();
        int l=0;
        int maxlen=0;
        for(int r=0;r<s.length();r++){
            char c=s.charAt(r);
            if(map.containsKey(c)){
                if(map.get(c)>=l) l=map.get(c)+1;
            }else{
                map.put(c,r);
                maxlen=Math.max(maxlen,r-l+1);
            }
        }
        return maxlen;
    }
    public static void main(String[] args) {
        String s="cadbzabcd";
        System.out.println(optimal(s));
    }
}
