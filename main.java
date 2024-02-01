// Sitt Lin Htet
// 1/29/2024
// Introductory lab-Java refresher with ArrayList - Lab 1
// creates a list of patrons for library in ArrayList datastructure
// use Random package to generate randomIndexes to add and remove patrons from patronList

import java.util.ArrayList;
import java.util.Random;

public class Main 
{
  public static void main(String[] args) {
    // setting patronList instance 
    ArrayList<Patron> patronList = new ArrayList<Patron>();

    // add 2 patrons to patronList
    patronList.add(new Patron("Ryle", "909180", "5 Mission St", "Millbrae", "Cal", "99839"));
    patronList.add(new Patron("Lilly", "902980", "25 Campana St", "Moonbay", "Cal", "99219"));

    // set random instance
    Random random = new Random();
    // index to add
    int randomIndexToAdd = random.nextInt(patronList.size());
    // index to remove
    int randomIndexToRemove = random.nextInt(patronList.size());

    // add two patrons in random index of the list
    patronList.add(randomIndexToAdd, new Patron("Joshua", "909290", "123 Belmond St", "South City", "Cal", "99999"));
    patronList.add(randomIndexToAdd, new Patron("Ashley", "909470", "23 Ocean Grove St", "Daly City", "Cal", "99999"));

    // remove one patron randomly from patronList
    patronList.remove(randomIndexToRemove);

    System.out.println("List of Patrons:");
    for (Patron patron : patronList) {
        System.out.println(patron); 
    }
}

