package feb_26_Question_3;

import java.util.Scanner;

public class Q2_Gas_Station
{
    public int iscompleted(int[] gas, int[] cost)
    {
        int totalgas =0; // for total gas
        int totalcost =0 ;// for total cost
        int currentgas = 0;//for current gas ammount
        int startStation=0;// for start station
     for(int i=0 ;i<gas.length ;i++)
     {
         totalgas += gas[i]; // add valuee of gas in total gas
         totalcost +=cost[i]; // add cost in total cost
         currentgas += gas[i]-cost[i]; // current gas by subtracting gas-cost
         if(currentgas < 0)
         {
             startStation = i+1;// current gas is less than 0 then start from i+1;
             currentgas =0;
         }
     }
     if(totalgas < totalcost) // total gas is smaller than total cost
     {
         return -1; //return -1
     }
     else
     {
         return startStation; // return start station
     }
    }
    public static void main(String[] args)
    {
        System.out.println("enter the size");
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
      int[] gas =new int[n];
        System.out.println("enter the amount of gas");
      for(int i=0 ;i<gas.length ;i++)
      {
          gas[i] = sc.nextInt();
      }
      int[] cost = new int[n];
        System.out.println("enter the cost");
        for(int i=0 ;i<cost.length ;i++)
        {
            cost[i] = sc.nextInt();
        }
        Q2_Gas_Station gasStation = new Q2_Gas_Station(); // create object of class
      int result =  gasStation.iscompleted(gas,cost); // call the function by object
        System.out.println(result);

    }

}
