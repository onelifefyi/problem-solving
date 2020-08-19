/* Problem:  An animal shelter, which holds only dogs and cats, operates on a strictly"first in, first
out" basis. People must adopt either the "oldest" (based on arrival time) of all animals at the shelter,
or they can select whether they would prefer a dog or a cat (and will receive the oldest animal of
that type). They cannot select which specific animal they would like. Create the data structures to
maintain this system and implement operations such as enqueue, dequeueAny, dequeueDog,
and dequeueCat. You may use the built-in Linked List data structure.  */

/* Approach: The simplest way would be to keep all the dogs and cats on a single linked list,
             This will take O(N) worst in case of looking for either dog or cat and O(1) for any. Hence O(N)

            + We can use two lists one for dog and one for cat, whenever a new dog/cat is added we assign a number to
              them, if a specific pet is dequed it is simply removed from it's list otherwise if any pet is dequed then,
              we first compare both dog and cat's list first element and deque the pet having smallest number. O(1)
*/

import java.util.LinkedList;
import java.util.Queue;

class Pet{
    static int totalPets=0;
    int number;
    String name;

    Pet(String name){
        totalPets++;
        this.name = name;
        number = totalPets;
    }
}

public class CatsNDogs{
    Queue<Pet> cat;
    Queue<Pet> dog;

    CatsNDogs(){
        dog = new LinkedList<Pet>();
        cat = new LinkedList<Pet>(); 
    }

    void addDog(String name){
        dog.add(new Pet(name));
    }

    void addCat(String name){
        cat.add(new Pet(name));
    }

    String getCat(){
        return cat.remove().name;
    }

    String getDog(){
        return dog.remove().name;
    }

    String getAny(){
        if(dog.peek().number < cat.peek().number) return dog.remove().name;
        else return cat.remove().name;
    }

    public static void main(String[] args){
        CatsNDogs shelter = new CatsNDogs();
        shelter.addDog("Shadow");
        shelter.addCat("SmellyCat");
        shelter.addCat("Scratch");
        shelter.addDog("Bolt");
        shelter.addDog("Jimmy");

        System.out.println(shelter.getCat());
        System.out.println(shelter.getAny());
        System.out.println(shelter.getDog());
        System.out.println(shelter.getAny());
        System.out.println(shelter.getDog());
    }
}
