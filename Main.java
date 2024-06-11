import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) {
    System.out.println("SAT DATA!!!!");

    // create data structure to store all total scores
    ArrayList<Integer> totalScore = new ArrayList<Integer>();
    
    try{
      Scanner s = new Scanner(new File("total.txt"));

      while(s.hasNext()){
        int score = Integer.parseInt(s.nextLine());
        totalScore.add(score);
      }
      s.close();
    }

    catch(Exception e){
      System.out.println("file not found");
    }

    // make sure all data entered the ArrayList
  //  System.out.println(totalScore);
    System.out.println(totalScore.size() + " students took the test"); 

    System.out.println("Average: " + getAvg(totalScore));

    System.out.println("Minimum: " + getMin(totalScore));
    System.out.println("Maximum: " + getMax(totalScore));
  }

  public static double getAvg(ArrayList<Integer> List) {
        int total = 0;

        for (int score: List) {
          total += score;
        }

        double average = (double)total/List.size();
    return average;
  }

  public static int getMin(ArrayList<Integer> List) {
    int min = Integer.MAX_VALUE;

    for (int score: List) {
      if (score < min) {
        min  = score;
      }
    }

    return min;
  }

  public static int getMax(ArrayList<Integer> List) {
    int Max = Integer.MIN_VALUE;

    for (int score: List) {
      if (score > Max) {
        Max  = score;
      }
    }

    return Max;
  }
  
}
