public class inheritance{
    public static void main(String args[]){
        // Fish shark = new Fish();
        // shark.eat();

        Dog dobby = new Dog();
        dobby.eat();
        dobby.legs = 4;
        System.out.println(dobby.legs);
    }
}

class Animal{
    String color;

    void eat(){
        System.out.println("eats");
    }

    void breath() {
        System.out.println("breaths");
    }
}

class Mammals extends Animal{
    // int legs;

    void walk(){
        System.out.println("walks");
    }
}

class Fish extends Animal{
    void swim(){
        System.out.println("swims");
    }
}

class Bird extends Animal{
    void fly(){
        System.out.println("flys");
    }
}

class Dog extends Mammals{
    String bread;
}

//derived class
// class Fish extends Animal{
//     int fins;

//     void swim(){
//         System.out.println("Swims in water");
//     }
// }