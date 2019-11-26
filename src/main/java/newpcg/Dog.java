package newpcg;

public class Dog {

    public int weight; // вес собаки
    public int height; // рост собаки
    public String type; // тип животного
    public String color; //окрас собаки

    //собака ест
    public void eat(){
        System.out.print("Kus'...\n");
    }

    //собака спит
    public void sleep(){
        System.out.print("Sleeping hr-r-r-r...\n");
    }

    //собака говорит
    public String speak(String words){
        String phrase = words + "...gavgav...\n";
        return phrase;
    }

    //тип животного
    public String typeAnimal(String words1) {
        String phrase1 = words1 + "...test...\n";
        return phrase1;
    }

}
