package Generics;

import java.util.ArrayList;
import java.util.HashMap;

public class Rectangle <T extends Number >{
    private final Pair<T,T> topLeft;
    private final Pair<T,T> bottomRight;

    public Rectangle(T top, T left, T bottom,T right){
        this.topLeft=new Pair<>(top,left);
        this.bottomRight=new Pair<>(bottom,right);
    }

    public static String getArray(ArrayList<String> strings){
        String res="";
        for(String s:strings){
            if(s.split(" ").length==1){
                res+=","+s;
            }
        }return res;
    }

    public static HashMap<Character, Integer> freqCount(String s){
        HashMap<Character, Integer> mapping = new HashMap<>();
        for (int i=0;i<s.length();i++){
            char c = s.charAt(i);
            mapping.putIfAbsent(c,0);
            mapping.put(c,mapping.get(c)+1);
        }
        return mapping;
    }

}
