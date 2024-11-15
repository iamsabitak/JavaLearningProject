package Day32;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

public class ArrayLinkedlist {
    enum Level {
        LOW,
        MEDIUM,
        HIGH
    }

    public static void main(String[] args) {

        Level myVar = Level.MEDIUM;
        System.out.println(myVar);

        LocalDate myObj = LocalDate.now();
        System.out.println(myObj);

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        System.out.println("First element: " + numbers.get(0));
        numbers.remove(1);
        System.out.println("Final List: " + numbers);

        LinkedList<String> cars = new LinkedList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars);

        ArrayList<String> cities = new ArrayList<>();
        cities.add("Kathmandu");
        cities.add("Pokhara");
        cities.add("Bhaktapur");
        cities.add("Lalitpur");
        Collections.sort(cities);
        System.out.println("Sorted Cities: " + cities);

        HashMap<String, Integer> ages = new HashMap<>();
        ages.put("Alice", 25);
        ages.put("Bob", 30);
        System.out.println("Alice's age: " + ages.get("Alice"));
        System.out.println("HashMap: " + ages);

        HashSet<String> fruits = new HashSet<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Apple");
        System.out.println("Fruits: " + fruits);

        ArrayList<String> animals = new ArrayList<>();
        animals.add("Cat");
        animals.add("Dog");
        animals.add("Elephant");
        Iterator<String> iterator = animals.iterator();
        while (iterator.hasNext()) {
            String animal = iterator.next();
            System.out.println(animal);
        }

        int num = 10;
        Integer numObj = Integer.valueOf(num);
        System.out.println("Integer object: " + numObj);

        Integer anotherNumObj = 20;
        int primitiveNum = anotherNumObj.intValue();
        System.out.println("Primitive int: " + primitiveNum);

        Integer autoBoxed = num;
        int autoUnboxed = autoBoxed;
        System.out.println("Autoboxed Integer: " + autoBoxed);
        System.out.println("Auto-unboxed int: " + autoUnboxed);
    }
}
