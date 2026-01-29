package com;

public class SearchInStrings {
    public static void main(String[] args){
        String name = "naveen nandiki";
        boolean ans= StrSearch(name, 'i');
        System.out.println(ans);
    }
    static boolean StrSearch(String Str,char target){
        if(Str.length()==0){
            return false;
        }
        for(char ch : Str.toCharArray()){
            if(ch == target){
                return true;
            }
        }
        return false;
    }


}
