package Practice;

public class Dog {

    String breed;
        String name;
        String color;

        public static void main(String[]args){
            Dog b = new Dog();
            b.breed = "Bulldog";
            Dog l = new Dog();
            l.breed = "Labrador";
            Dog h = new Dog();
            h.breed = "Husky";
            h.bark();
            h.run();
            h.play();
            b.bark();
            b.run();
            b.play();
            l.bark();
            l.run();
            l.play();
        }
    void bark() {
        System.out.println(breed + " can bark");
    }
    void run() {
        System.out.println(breed + " can run");
    }
    void play() {
        System.out.println(breed + " can play");
    }
}

