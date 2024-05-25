public class Main {

    public static void main(String[] args) {
        Market market = new Market();
        Human human1 = new Human("Denis");
        Human human2 = new Human("Eva");
        market.acceptToMarket(human1);
        market.acceptToMarket(human2);
        market.update();
    }
}
