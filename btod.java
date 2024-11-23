import java.util.*;
public class btod{
    public static void convertor(int bnum){
        int dec=0;
        int pow=0;
        while(bnum>0){
            int l_digit = bnum%10;
            dec = dec+(l_digit*(int)Math.pow(2,pow));
            pow++;
            bnum =bnum/10;
        }
        System.out.println(dec);

    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int bnum=sc.nextInt();
        convertor(bnum);

    }

}
