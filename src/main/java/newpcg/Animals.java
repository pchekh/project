package newpcg;


public class Animals {

    public static void main(String[] args) {

        Cat cat1 = new Cat("Vasily", 12, 12, "Cat", "black");
        Cat cat2 = new Cat("Boris", 16, 16, "Cat", "white");


        String move1 = cat1.move("Move");
        String move2 = cat2.move("Move");
        System.out.println(move1 + "cat1");
        System.out.println(move2+ "cat1");

        boolean x;
        x = cat1.equals(cat2);
        System.out.println(x);

        System.out.println(cat1.toString());
        System.out.println(cat2.toString());


        Dog dog1 = new Dog("Bobik", 12, 12, "Dog", "black");
        Dog dog2 = new Dog("Tuzik", 16, 16, "Dog", "white");


        String move3 = dog1.move("Move");
        String move4 = dog2.move("Move");
        System.out.println(move3+ "dog1");
        System.out.println(move4+ "dog2");

        x = dog1.equals(dog2);
        System.out.println(x);

        System.out.println(dog1.toString());
        System.out.println(dog2.toString());

        Bird bird1 = new Bird("Bobik", 12, 12, "Bird", "black");
        Bird bird2 = new Bird("Tuzik", 16, 16, "Bird", "white");

        String move5 = bird1.move("Move");
        String move6 = bird2.move("Move");
        System.out.println(move5+ "bird1");
        System.out.println(move6+ "bird2");


        x = bird1.equals(bird2);
        System.out.println(x);

        System.out.println(bird1.toString());
        System.out.println(bird2.toString());


    }

}
