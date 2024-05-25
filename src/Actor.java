public abstract class Actor {

    protected String name;
    protected boolean isMakeOrder;
    protected boolean isTakeOrder;

    public abstract void setMakeOrder(boolean makeOrder);

    public abstract void setTakeOrder(boolean takeOrder);

    public abstract boolean isMakeOrder();

    public abstract boolean isTakeOrder();

    abstract String getName();

    public Actor(String name) {
        this.name = name;
    }
}
