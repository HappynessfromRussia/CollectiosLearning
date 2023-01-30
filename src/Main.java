import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args){

        //Arrays

        Cat[] cats = new Cat[4];
        cats[0] = new Cat("Tomas");
        cats[1] = new Cat("Begemot");
        cats[2] = new Cat("Filip Marcovich");
        cats[3] = new Cat("Kotarya");

        // cats[1] = null;

        System.out.println(Arrays.toString(cats));

        // ArrayList

        ArrayList<Cat> catsList = new ArrayList();
        for (Cat cat : cats){
            catsList.add(cat);
        }

        catsList.add( new Cat("Begemot2"));

        catsList.remove(1);

        Cat cat = catsList.get(0);
        System.out.println(cat);

        System.out.println(catsList.indexOf(cat));

        catsList.add(2, cat);
        catsList.set(2, new Cat("Menya syda vstavili"));

        catsList.removeAll(Arrays.asList(cat, catsList.get(3)));

        System.out.println(catsList.toString());

        System.out.println(catsList.size());

        //LinkedList
        String str1 = new String("Hello World");
        String str2 = new String("My name is Misha");
        String str3 = new String("I love Java");

        LinkedList<String> MishaBio = new LinkedList<>();
        MishaBio.add(str1);
        MishaBio.add(str2);
        MishaBio.add(str3);

        System.out.println(MishaBio);


        MishaBio.remove(1);
        System.out.println(MishaBio);

        //LinkedList on Practice

        LinkedList<Car> cars = new LinkedList<>();
        Car ferrari = new Car("Ferrari Enzo");
        Car bugatti = new Car("Veiron");
        Car mercedes = new Car("Benz");

        cars.addAll(Arrays.asList(ferrari, bugatti, mercedes ));

        System.out.println(cars);

        cars.addFirst(new Car("lada Granta"));
        cars.addLast(new Car("Fiat"));


        System.out.println(cars);

        System.out.println(cars.pollFirst());
        System.out.println(cars);

    }
}