package newpcg;

public class Cat {

    public int weight; // вес кота
    public int height; // рост кота
    //public String type; // тип животного
    public String color; //окрас кота

    //кот ест
    public void eat(){
        System.out.print("Eating...\n");
    }

    //кот спит
    public void sleep(){
        System.out.print("Sleeping zz-z-z-z...\n");
    }

    //кот говорит
    public String speak(String words){
        String phrase = words + "...mauu...\n";
        return phrase;
    }

    //тип животного
    public String typeAnimal(String words){
        String phrase = words + "...mammal...\n";
        return phrase;
    }

    }
