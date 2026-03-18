//Example 1: Get the middle element of LinkedList using the LinkedList class
import java.util.LinkedList;

class MiddleElementInList{
  public static void main(String[] args){

    LinkedList<String> animals = new LinkedList<>();

    animals.add("Dog");
    animals.addFirst("Cat");
    animals.addLast("Horse");
    System.out.println("LinkedList: " + animals);

    String middle = animals.get(animals.size()/2);
    System.out.println("Middle Element: " + middle);
    }
}