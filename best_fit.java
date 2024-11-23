import java.util.Scanner;

public class best_fit {
    public static void no_of_bins(int items_weight[],int cap,int n){
        int result=0;
        int bin_rem[]=new int[n];
        for(int i=0;i<n;i++){
            int j;
            int min=cap+1;
            int bin=0;
            for(j=0;j<result;j++){
                if(bin_rem[j] >= items_weight[i] && bin_rem[j]-items_weight[i]<min){
                    bin=j;
                    min=bin_rem[j]-items_weight[i];
                }
            }
            if(min==cap+1){
                bin_rem[result]=cap-items_weight[i];
                result++;
            }
            else
                bin_rem[bin]=bin_rem[bin]-items_weight[i];


        }

        System.out.println("number of bins required "+result);

    }



    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of items u want to add in a bin");
        int n = sc.nextInt();
        System.out.println("Enter the bin capacity");
        int cap = sc.nextInt();
        int items_weight[] = new int[n];
        System.out.println("Enter the items");
        for (int i = 0; i < n; i++) {
            items_weight[i] = sc.nextInt();
        }
        no_of_bins(items_weight, cap, n);
    }
}
