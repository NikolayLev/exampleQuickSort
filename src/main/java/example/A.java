package example;

public class A {

    private int firstInt;
    private int secondInt;

    @Override
    public String toString() {
        return "A{" +
                "firstInt=" + firstInt +
                ", secondInt=" + secondInt +
                '}';
    }

    public A(int firstInt, int secondInt) {
        this.firstInt = firstInt;
        this.secondInt = secondInt;
    }

    public int getFirstInt() {
        return firstInt;
    }

    public void setFirstInt(int firstInt) {
        this.firstInt = firstInt;
    }

    public int getSecondInt() {
        return secondInt;
    }

    public void setSecondInt(int secondInt) {
        this.secondInt = secondInt;
    }
}
