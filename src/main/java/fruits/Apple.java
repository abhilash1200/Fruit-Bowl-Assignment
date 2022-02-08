package fruits;

public class Apple extends Fruit implements FruitCharacteristics{

    @Override
    public boolean IsSeedless() {
        return false;
    }

    @Override
    public String Color() {
        return "Green";
    }

    @Override
    public String Shape() {
        return "Circle";
    }
}
