package fruits;

public class PineApple extends Fruit implements FruitCharacteristics{
    @Override
    public boolean IsSeedless() {
        return false;
    }

    @Override
    public String Color() {
        return "Yellow";
    }

    @Override
    public String Shape() {
        return "Oval";
    }
}
