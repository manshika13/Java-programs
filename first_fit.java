import java.util.*;
public class first_fit {
    public static void no_of_bins(int item[],int cap,int n){
        int res=0;
        int bin_rem[]=new int[n];
    }

    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no. of items u want to add in a bin");
        int n=sc.nextInt();
        System.out.println("Enter the bin capacity");
        int cap=sc.nextInt();
        int items[]=new int[n];
        System.out.println("Enter the items");
        for(int i=0;i<n;i++){
            items[i]=sc.nextInt();
        }
        no_of_bins(items,cap,n);
    }

}





