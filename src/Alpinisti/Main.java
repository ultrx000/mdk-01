package Alpinisti;


public class Main {
    public static void main(String[] args) {
        Alpinist[] alpinists = new Alpinist[3];
        alpinists[0] = new Alpinist("Shashka", 12, "Kolpino");
        alpinists[1] = new Alpinist("Tony", 54, "Spb");
        alpinists[2] = new Alpinist("Dan", 19, "Moscow");
        Groups group = new Groups(true, new Alpinist[5], "Everest");

        group.addToGroup(alpinists[0]);
        group.addToGroup(alpinists[1]);
        group.addToGroup(alpinists[2]);
    }

}
