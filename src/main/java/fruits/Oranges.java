package fruits;

public class Oranges extends Fruit implements FruitCharacteristics{
    @Override
    public boolean IsSeedless() {
        return false;
    }

    @Override
    public String Color() {
        return "Orange";
    }

    @Override
    public String Shape() {
        return "Circle";
    }
}
