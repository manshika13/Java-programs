import java.util.*;
public class array_sorted_or_not {
    public static boolean sorted(int arr[],int i){
        if(i==0) {
            return true;
        }
       if(arr[i]<arr[i-1]){
           return false;
        }
        return sorted(arr,i-1);
    }

    public static void main(String[] args){
        int arr[]={4,3,2,5};
        boolean b=sorted(arr,arr.length-1);
        System.out.println(b);
    }
}
