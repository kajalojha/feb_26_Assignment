package feb_26_Question_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q1_Time_Series_Data
  {
      public static int[] calc_mov_avg(int size , int[] vect , int w_size)
      {
          List<Integer>result = new ArrayList<>();
          int w_sum =0;
          for(int i=0 ;i<w_size; i++) // for calcualte the sum of first window
          {
              w_sum+=vect[i];//6
          }
          result.add(w_sum/w_size);
          // calculate the sum of sub sequest windows
          for (int i=w_size;i<size;i++)
          {
              w_sum = w_sum - vect[i-w_size]+vect[i];//6-v[3-3]+v[3]=6-v[0]+4=6-1+4=5+4=9 = 9/3=3
              result.add(w_sum/w_size);
          }
//
          int[] resultarray = new int[result.size()];
          for(int i=0 ;i< result.size() ;i++)
          {
               resultarray[i] = result.get(i);
          }
          return resultarray;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int size = 4;
//        int [] vect = {1,2,3,4};
//        int w_size= 3 ;
        System.out.println(" enter the size of input vector ");
        int size = sc.nextInt();
        int[] vect = new int[size];
        System.out.println("enter the element in vector");
        for (int i = 0; i < size; i++) {
            vect[i] = sc.nextInt();
        }
        System.out.println("enter the window size ");
        int w_size = sc.nextInt();
        int[] result = calc_mov_avg(size, vect, w_size);
        //System.out.println("length" + result.length);


        for(int num : result)
        {
            System.out.println(num);
        }
        System.out.println("result " + result.length);

    }
}
