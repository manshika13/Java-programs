import java.util.*;
public class bitwise {
    public static int get(int num,int i){

        int bitmask=1<<i;
          if((num & bitmask)==0){
              return 0;
          }
          else
              return 1;

    }
    public static int set(int num,int i){
        int bitmask=1<<i;
       return num|bitmask;

    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int pos=sc.nextInt();
        int val=get(num,pos);
        System.out.println(val);
        int val2=set(num,pos);
        System.out.println(val2);

    }

}
