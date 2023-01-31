import java.util.*;

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

        catsList.add( new Cat("Begemot"));

       // catsList.remove(1);

        Cat cat = catsList.get(0);
        System.out.println(cat);

        System.out.println(catsList.indexOf(cat));

        catsList.add(2, cat);
        catsList.set(2, new Cat("Menya syda vstavili"));

       // catsList.removeAll(Arrays.asList(cat, catsList.get(3)));

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

        /*// Array List Vs Linked List

        List<Integer> list = new LinkedList<>();

        for (int i = 0; i< 5000000; i++) {
            list.add(new Integer(i));
        }
        long start = System.currentTimeMillis();

        for (int i = 0; i<100; i++){
            list.add(2000000, Integer.MAX_VALUE);
        }

        System.out.println("Time of working for linked list  in millisecond:"+
                (System.currentTimeMillis()-start));


        list = new ArrayList<>();
        for (int i = 0; i< 5000000; i++) {
            list.add(new Integer(i));
        }
        start = System.currentTimeMillis();

        for (int i = 0; i<100; i++){
            list.add(2000000, Integer.MAX_VALUE);
        }

        System.out.println("Time of working for Array list  in millisecond:"+
                (System.currentTimeMillis()-start));

*/

        // Set

        Set<String> states = new HashSet<>();
        states.add("Germany");
        states.add("France");
        states.add("Russia");

        boolean isAdded = states.add("Russia");

        System.out.println("Russia is added:" + isAdded);
        System.out.println("Set contains: " + states.size());

        System.out.println(states);

        states.remove("Germany");

        System.out.println(states);

        HashSet<Cat> catsHashSet = new HashSet(catsList);

        System.out.println(catsHashSet);

        TreeSet<Cat> catTreeSet = new TreeSet(catsList);

        System.out.println(catTreeSet);

        // Map


    }
}