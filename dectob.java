//decimal to binary number
import java.util.*;
public class dectob {
    public static void convertor(int dnum){
        int bno=0;
        int pow=0;
        while(dnum>0){
            int r=dnum%2;
            bno = bno +(r*(int)Math.pow(10,pow));
            pow++;
            dnum=dnum/2;
        }
        System.out.println(bno);

    }


    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        int dec=sc.nextInt();
        convertor(dec);


    }
}
