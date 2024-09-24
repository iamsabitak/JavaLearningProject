public class Day15 {
  public static void main(String[] args) {
    Dogs myDog = new Dogs();

    myDog.makeSound();

    myDog.bark();

    Cars myCar = new Cars();

    myCar.start();
    myCar.stop();
    myCar.honk();

    Base base = new Base();
    base.setX(3);
    System.out.println(base.getX());

    Derived derived = new Derived();
    derived.setY(32);
    System.out.println(derived.getY());

    // ParentClass parent = new ParentClass(1);

    // IntermediateClass intermediate = new IntermediateClass(2, 3);

    // ChildDerived child = new ChildDerived(4, 5, 6);

    Persons person = new Persons();
    person.sum();
    Teacher teacher = new Teacher();
    teacher.sing();
  }
}

class Animals {

  public void makeSound() {
    System.out.println("Animal makes a sound");
  }
}

class Dogs extends Animals {
  public void bark() {
    System.out.println("Dog barks");
  }
}

class Vehicle {

  public void start() {
    System.out.println("Vehicle is starting");
  }

  public void stop() {
    System.out.println("Vehicle is stopping");
  }
}

class Cars extends Vehicle {

  public void honk() {
    System.out.println("Car is honking");
  }
}

class Base {
  public int x;

  public int getX() {
    return x;
  }

  public void setX(int x) {
    System.out.println("It is base class");
    this.x = x;
  }
}

class Derived extends Base {
  public int y;

  public int getY() {
    return y;
  }

  public void setY(int y) {
    System.out.println("derived a new class from base class");
    this.y = y;
  }
}

class ParentClass {
  public int x;

  ParentClass() {
    System.out.println("I am a parent class constructor");
  }

  ParentClass(int x) {
    System.out.println("I am a parent class constructor carrying the value of x: " + x);
  }
}

class IntermediateClass extends ParentClass {
  public int y;

  IntermediateClass() {
    System.out.println("I am an intermediate class constructor");
  }

  IntermediateClass(int x, int y) {
    super(x);
    System.out.println("I am an overloaded intermediate class constructor carrying the value of y: " + y);
  }
}

class ChildDerived extends IntermediateClass {
  ChildDerived() {
    System.out.println("I am a ChildDerived class constructor");
  }

  ChildDerived(int x, int y, int z) {
    super(x, y);
    System.out.println("I am an overloaded ChildDerived class constructor carrying the value of z: " + z);
  }
}

class Persons {

  void sum() {
    System.out.println(5 + 7);

  }
}

class Teacher extends Persons {
  void sing() {
    System.out.println("She is Singing");
  }
}