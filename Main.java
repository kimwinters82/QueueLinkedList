import java.util.LinkedList;
import java.util.Queue;
import java.util.*;

class Main {
  public static void main(String[] args) {
    Queue <String> q = new LinkedList <String> ();//create queue object type linkedlist
    Scanner sc = new Scanner(System.in); // get user input 
    
    //while(sc.hasNextLine()){//continue taking in strings until none left
    for(int i =0; i<6; i++){
      String [] input = sc.nextLine().split(" "); //separate method call from string
      if (input[0].equalsIgnoreCase("insert")){ //if word equal insert
        q.add(input[1]); //insert string to back of queue
      }
      else { //if letters equal remove
        if (!q.isEmpty() && input[0].equalsIgnoreCase("remove")){
          //condition added to avoid error- removing from empty queue
          q.poll();//remove first element
        }
        }
        }
    sc.close();//close scanner
    
    System.out.println(q);
    if (q.isEmpty()){ //in case queue has no elements
      System.out.println("empty");
      }
    else if (q.size() % 2 == 0){ //even queue
      System.out.println(q.toArray()[(q.size()/2)-1]);//-1 for correct index
    }
    else if(q.size() % 2 != 0){//odd queue
      System.out.println(q.toArray()[q.size()/2]);//no plus 1 for correct index
    }
  }
}