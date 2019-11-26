package newpcg;

public class Bird {

    public int weight; // вес птицы
    public int height; // рост птицы
    public String type; // тип животного
    public String color; //окрас птицы

    //птица ест
    public void eat(){
        System.out.print("Kluv'...\n");
    }

    //птица спит
    public void sleep(){
        System.out.print("Sleeping mm-m-m-m...\n");
    }

    //птица говорит
    public String speak(String words){
        String phrase = words + "...ChikChirik...\n";
        return phrase;
    }

    //тип животного
    public String typeAnimal(String words1) {
        String phrase1 = words1 + "...test1...\n";
        return phrase1;
    }

}
