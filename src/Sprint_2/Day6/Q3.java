package Sprint_2.Day6;



class Animal{
    public void makeNoise(){
        System.out.println("Animal making Noise");
    }
    public void eat(){
        System.out.println("Animal is eating");
    }
    public void walk(){
        System.out.println("Animal is walking");
    }
}
class Dog extends Animal{
    @Override
    public void makeNoise(){
        System.out.println("Barking...");
    }
}
class Cat extends Animal{
    @Override
    public void makeNoise(){
        System.out.println("Meow...");
    }
}
class Tiger extends Animal{
    @Override
    public void makeNoise(){
        System.out.println("Roaring...");
    }
}



public class Q3 {
    public static void main(String[] args) {
        String [] animals = {"Dog","Cat","Tiger"};
        for (String animal : animals) {
            switch (animal) {
                case "Dog" -> {
                    System.out.println("Dog Specification");
                    Animal dog = new Dog();
                    dog.makeNoise();
                    dog.eat();
                    dog.walk();
                }
                case "Cat" -> {
                    System.out.println("Cat Specification");
                    Animal cat = new Cat();
                    cat.makeNoise();
                    cat.eat();
                    cat.walk();
                }
                case "Tiger" -> {
                    System.out.println("Tiger Specification");
                    Animal tiger = new Tiger();
                    tiger.makeNoise();
                    tiger.eat();
                    tiger.walk();
                }
            }
            System.out.println(animal);
        }

    }
}
