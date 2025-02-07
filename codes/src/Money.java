package src;

abstract public class Money {
    protected int amount;

    static public Dollar dollar(int amount) {
        return new Dollar(amount);
    }

    static public Money franc(int amount) {
        return new Franc(amount);
    }

    public boolean equals(Object object) {
        Money money = (Money) object;
        return amount == money.amount && getClass().equals(money.getClass());
    }

    abstract public Money times(int multiplier);

}
