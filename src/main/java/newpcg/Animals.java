package newpcg;


public class Animals {

    public static void main(String[] args) {

        Cat ourcat = new Cat();
        ourcat.eat();
        ourcat.sleep();
        String say = ourcat.speak("Play with me");
        String type = ourcat.typeAnimal("1");
        System.out.println(say);
        System.out.println(type);

        Dog ourdog = new Dog();
        ourdog.eat();
        ourdog.sleep();
        String say1 = ourdog.speak("No");
        String type1 = ourdog.typeAnimal("2");
        System.out.println(say1);
        System.out.println(type1);

        Bird ourbird = new Bird();
        ourbird.eat();
        ourbird.sleep();
        String say2 = ourbird.speak("Yes");
        String type2 = ourbird.typeAnimal("3");
        System.out.println(say2);
        System.out.println(type2);


    }

}
