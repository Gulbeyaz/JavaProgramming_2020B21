package Office_Hours.Practice_11_11_2020;

import java.util.Arrays;

public class SingleDimentionalArray {
    public static void main(String[] args) {

        int [] scores=new int[5];
        //                 length=1
        //              last index: 1-1=0

        scores[0]=10;
        scores[1]=20;
        scores[2]=50;
        scores[3]=30;
        scores[4]=40;
        System.out.println(Arrays.toString(scores));//[10,20,50,30,40]

for(int i=0; i<scores.length; i++){//0,1,2,3,4
    System.out.println(scores[i]);//

}


    }
}
