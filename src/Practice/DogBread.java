package Practice;

public class DogBread {
  /*  In this class, you should specify the following attributes: breed, name, color,
  and following behaviors: bark(), run(), play().

    Create 3 different objects of it: Husky, Bulldog, Labrador with specific attributes and behaviors.
    */

    String name;
    String bread;
    String color;

    public static void main(String[] args) {

        DogBread dog1 = new DogBread();
        DogBread dog2 = new DogBread();
        DogBread dog3 = new DogBread();
        dog1.bread = "Huskey";
        dog2.bread = "Bulldog";
        dog3.bread = "Labrador";

        dog1.bark();
        dog1.run();
        dog1.play();
        dog2.bark();
        dog2.run();
        dog2.play();
        dog3.bark();
        dog3.run();
        dog3.play();
    }

    void bark() {
        System.out.println(bread + "is barking");
    }
    void run() {
            System.out.println(bread + "is running");
        }
    void play(){
        System.out.println(bread+"is playing");


}
}
