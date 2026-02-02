package LinearSearch;

public class SearchInArrays {
    public static void main(String[] args){
        int[] arr ={3,5,2,7,6,1,9};
       int index=lSearch(arr,6);
       if(index!=-1){
           System.out.println("item found af index "+ index);
       }
       else {
           System.out.println("item not found");
       }
    }

    static int lSearch(int[] arr, int target){
        if(arr.length==0) return -1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
}
