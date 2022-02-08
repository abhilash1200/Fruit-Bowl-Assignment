package fruits;

public class Banana extends Fruit implements FruitCharacteristics{

    @Override
    public boolean IsSeedless() {
        return true;
    }

    @Override
    public String Color() {
        return "Yellow";
    }

    @Override
    public String Shape() {
        return "Banana";
    }
}
