import java.util.*;
public class first_fit1 {
    public static void no_of_bins(int item_weights[], int cap, int n) {
        int res = 0;
        int bin_rem[] = new int[n];
        for (int i = 0; i < n; i++) {
            int j;
            for (j = 0; j < res; j++) {
                if (bin_rem[j] >= item_weights[i]) {

                    bin_rem[j] = bin_rem[j] - item_weights[i];
                    break;

                }
            }
                if (j == res) {
                    bin_rem[res] = cap - item_weights[i];
                    res++;

                }


        }
        System.out.println("Number of bins required in First Fit " + res);
    }
        public static void main (String[]args){
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