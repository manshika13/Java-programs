import java.util.*;
public class butterfly_pattern {
    public static void main(String[] args){
        int row;
       // int i;
        Scanner sc=new Scanner(System.in);
        row=sc.nextInt();
      for( int i=1;i<=row;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int j=1;j<=2*(row-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
      for(double i=row;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int j=1;j<=2*(row-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }


    }
}
