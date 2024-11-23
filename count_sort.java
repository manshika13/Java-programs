public class count_sort{
    public static void count_sort(int[] arr){
        int largest_arr=Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
             largest_arr=Math.max(largest_arr,arr[i]);
        }
        //store zero in every element of the count array
        int arr2[]=new int[largest_arr+1] ;
        for(int i=0;i<arr2.length;i++){
              arr2[i]=0;
        }
        //store frequency of the number in count array
        for(int i=0;i<arr.length;i++){
            int j=arr[i];
            arr2[j]=arr2[j]+1;
        }
       /* for(int i=0;i<arr2.length;i++)
        System.out.println(arr2[i]);*/
        for(int i=0;i<arr2.length;i++){
            while(arr2[i]>0){
                System.out.println(i);
                arr2[i]--;
            }
        }
    }
    public static void main(String[] args){
    int arr[]={1,2,4,3,1,0,6,3,2};
    count_sort(arr);

    }
}
