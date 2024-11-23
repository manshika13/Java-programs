import java.util.*;
public class floyd_traingle {
    public static void main(String[] args){
        int row;
        int k=1;
        Scanner sc=new Scanner(System.in);
        row=sc.nextInt();
        for(int i=0;i<row;i++){
            for(int j=0;j<=i;j++){
                System.out.print(k);
                k++;
            }
            System.out.print("\n");
        }
    }
}
