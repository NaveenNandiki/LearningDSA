package com;

public class linearSearch  {
    public static void main(String[] args){
        int[] nums ={9,6,3,4,7,2,89,43,23,45};
        int ans = lSearch(nums, 89);
        System.out.println("Element Found at "+ ans+" index");
    }
    static int lSearch(int[] arr, int target){
        if(arr.length==0){
            return -1;
        }
         for(int index=0;index<arr.length;index++){
             if(arr[index]==target){
                 return index;
             }
         }
        return -1;
    }
}
