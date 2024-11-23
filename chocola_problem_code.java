import java.util.*;
public class chocola_problem_code {

    public static void main(String[]args){
     int n=4,m=6;

     //-->here n define the number of rows
        //-->m define the number of columns of a chocolate
        Integer costVer[]={2,1,3,1,4};
        Integer costHor[]={4,1,2};
        //-->define the array of cuts
        //now we have to apply cut which have maximum cost so sort it in the
        //increasing order
        Arrays.sort(costVer,Collections.reverseOrder());
        Arrays.sort(costHor,Collections.reverseOrder());
       int h=0,v=0;//horizontal and vertical pointers that are pointing to array
       int hp=1,vp=1;//horizontal and vertical pieces
       int cost=0;
        while(h<costHor.length && v<costVer.length){
            if(costHor[h]<=costVer[v]){//vertical cut
                cost +=(costVer[v]*hp);
                vp++;
                v++;

            }
            else{
                cost +=(costHor[h]*vp);
                hp++;
                h++;
            }
        }
        while(h<costHor.length){
            cost+= (costHor[h])*vp;
            hp++;
            h++;
        }
      while(v<costVer.length){
          cost+= (costVer[v])*hp;
          vp++;
          v++;
      }
     System.out.println("min cost cuts="+cost);
    }

}
