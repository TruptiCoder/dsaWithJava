//THERE IS NO PRIVATE AND PROTECTED CLASS IN JAVA
public class OOPs {

  public static void main(String args[]) {
    // Pen p1 =  new Pen();  //created Pen object called p1
    // p1.setColor(" Blue ");
    // System.out.println(p1.getColor());
    // p1.setTip(5);
    // System.out.println(p1.getTip());
    // p1.setColor("Purple");
    // System.out.println(p1.getColor());

    // BankAccount myAcc = new BankAccount();
    // myAcc.username = "shwetadhote";
    // myAcc.password = " 2124 ";

    // Student s1 = new Student("Shweta");
    // Student s1 = new Student();
    // Student s2 = new Student("shweta");
    //  Student s3 = new Student(124);
    // Student s4 = new Student("shwet",123);//JAVA MAKES CONSTRUCTOR BY ITSELF IF WE DON'T MAKE ONE BUT IF WE HAVE MAKE AT LEAST ONE CONSTRUCTER THEN IT CAN'T MAKE CONSTRUCTOR BY ITS OWN IF IT IS NOT MADE BY YOU

    // // System.out.println(s1.name);
    // Student s1 = new Student();
    // s1.name = "shweta";
    // s1.roll = 21;
    // s1.password = "abc";
    // s1.marks[0] = 100;
    // s1.marks[1] = 90;
    // s1.marks[2] = 80;

    // Student s2 = new Student(s1);
    // s2.password = "xyz";
    // s1.marks[2] = 60;
    // for(int i=0;i<3;i++){
    //     System.out.println(s2.marks[i]);
    // }

    //    Fish Shark = new Fish();
    //    Shark.eat();

    //MULTILEVEL INHERITANCE
    // Dog dobby = new Dog();
    // dobby.eat();
    // dobby.legs = 4;
    // System.out.println(dobby.legs);
    // Birds sparrow = new Birds();
    // sparrow.fly();
    // sparrow.breathe();

    //HYBRID INHERITANCE
    //    Tuna tuna = new Tuna();
    //    tuna.color();
    //    tuna.swim();
    // // FUNCTION OVERLOADING
    // Calculator calc = new Calculator();
    // System.out.println(calc.sum(1,2));
    // System.out.println(calc.sum((float)2.3,(float)1.3));
    // System.out.println(calc.sum(2,3,4));

    // //METHOD OVERRIDING
    // Guitar g = new Guitar();
    // g.play();     //IF WE MAKE OBJECT OF CHILD CLASS THEN IT WILL TAKE FUNCTION FROM CHILD CLASS

    //  //ABSTRACT CLASSES
    //  HipHop h = new HipHop();
    //  h.Style();
    //  h.dance();
    //  System.out.println(h.beats);

    //INTERFACES
    //    Queen q = new Queen();
    //    q.moves();

    // //INTERFACES IN MULTIPLE INHERITANCE
    // Bear b = new Bear();
    // b.eat();
    // b.eats();

    // //STATIC KEYWORD     //STATIC VARIABLE CAN BE CALLED BY CLASS ALSO(CLASS.VARIABLE)
    // Stu s1 = new Stu();
    // s1.school = "WPS";

    // Stu s2 = new Stu();
    // System.out.println(s2.school);

    //SUPER KEYWORD
    Lowers l = new Lowers();
    System.out.println(l);
  }
}

class BankAccount {

  public String username;
  String password;

  public void setpassword(String pwd) {
    password = pwd;
  }
}

class Pen {

  private String color;
  private int tip; //this.tip shows that this tip is from class pen  this means current object

  String getColor() {
    return this.color;
  }

  int getTip() {
    return this.tip;
  }

  void setColor(String newColor) {
    this.color = newColor;
  }

  void setTip(int tip) {
    this.tip = tip; //and the tip is an external variable that we have given
  }
}

class Student {

  String name;
  int roll;
  String password;
  int marks[];

  // //DEEP COPY CONSTRUCTOR(S2 WON'T UPDATE AFTER COPYING)
  // Student (Student s1){
  //     marks = new int[3];
  //     this.name = s1.name;
  //     this.roll = s1.roll;
  //     for(int i=0;i<marks.length;i++){
  //         this.marks[i] = s1.marks[i];
  //     }
  // }
  // SHALLOW COPY CONSTRUCTOR(S2 WILL UPDATE AFTER COPYING ALSO)
  Student(Student s1) {
    marks = new int[3];
    this.name = s1.name;
    this.roll = s1.roll;
    this.marks = s1.marks;
  }

  // Student(String name){ //we have use the constructer here
  //     this.name = name;
  // }
  Student() { //NON PARAMETERISED CONSTRUCTER
    marks = new int[3];
    System.out.println("constructer is called....");
  }

  Student(String name) { //PARAMETERISED CONSTRUCTER
    marks = new int[3];
    this.name = name;
  }

  Student(int roll) { //PARAMETERISED CONSTRUCTER
    marks = new int[3];
    this.roll = roll;
  }
}

//BASE CLASS
class Animal {

  String color;

  void eat() {
    System.out.println("eats");
  }

  void breathe() {
    System.out.println("breathes");
  }
}

//DERIVED CLASS
class Fish extends Animal { //WE USE EXTENDS TO INHERIT ALL PROPERTIES OF CLASS ANIMAL

  int fins;

  void swim() {
    System.out.println("Swims in water");
  }
}

class Tuna extends Fish {

  void color() {
    System.out.println("Blue");
  }
}

class Mammals extends Animal {

  int legs;

  void walk() {
    System.out.println("walks");
  }
}

class Birds extends Animal {

  void fly() {
    System.out.println("fly");
  }
}

class Dog extends Mammals {

  String breed;
}

class Calculator {

  int sum(int a, int b) {
    return a + b;
  }

  float sum(float a, float b) {
    return a + b;
  }

  int sum(int a, int b, int c) {
    return a + b + c;
  }
}

class Music {

  void play() {
    System.out.println("plays any type of music");
  }
}

class Guitar extends Music {

  void play() {
    System.out.println("plays the strings");
  }
}

abstract class Dance {

  String beats;

  //CONSTRUCTOR
  Dance() {
    beats = "fast";
  }

  void Style() {
    System.out.println("there are many styles of dance");
  }

  abstract void dance(); //ABSTRACT METHODS ARE THOSE METHODS WHICH DON'T HAVE IMPLEMENTATION IT DEPENDS ON ITS CLASSS
  //ABSTRACT CLASSES ARE THOSE CLASSES IN WHICH WE CAN'T MAKE OBJECTS
}

class Classic extends Dance {

  void changeBeats() {
    beats = "slow";
  }

  void dance() {
    System.out.println("Classical dance ");
  }
}

class HipHop extends Dance {

  void dance() {
    System.out.println("Hip-hop dance");
  }
}

interface ChessPlayer {
  void moves(); //BY DEFAULT PUBLIC AND ABSTRACT
}

class Queen implements ChessPlayer { //IMPLEMENTS IS USE TO ACCESS INTERFACE

  public void moves() {
    System.out.println("up,down,left ,right ,diagonal");
  }
}

class Rook implements ChessPlayer {

  public void moves() {
    System.out.println("up,down,left ,right");
  }
}

class King implements ChessPlayer {

  public void moves() {
    System.out.println("up,down,left ,right ,diagonal(by one step)");
  }
}

interface herbivore {
  void eat();
}

interface carnivore {
  void eats();
}

class Bear implements herbivore, carnivore {

  public void eat() {
    System.out.println("eats plants");
  }

  public void eats() {
    System.out.println("eats meat");
  }
}

class Stu {

  String name;
  int roll;
  static String school;

  void setName(String name) {
    this.name = name;
  }

  String getName() {
    return this.name;
  }
}

class Clothes {

  Clothes() {
    System.out.println("Western Clothes");
  }
}

class Lowers extends Clothes {

  Lowers() {
    super(); //BY SUPER KEYWORD WE CAN CALL THE PARENT CLASS THAT IS CLOTHES IF WE DONT WRITE IT JAVA BY DEFAULT CALL SUPER KEYWORD
    System.out.println("jeans");
  }
}
