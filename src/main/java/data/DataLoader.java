package data;

import bowl.fruitBowl;
import fruits.Apple;
import fruits.Banana;
import fruits.Oranges;
import fruits.PineApple;

public class DataLoader {

    public fruitBowl loadData(){

        fruitBowl mixedFruitBowl = new fruitBowl();
        mixedFruitBowl.addFruitsToBowl(new Apple());
        mixedFruitBowl.addFruitsToBowl(new Oranges());
        mixedFruitBowl.addFruitsToBowl(new Banana());
        mixedFruitBowl.addFruitsToBowl(new Apple());
        mixedFruitBowl.addFruitsToBowl(new PineApple());
        mixedFruitBowl.addFruitsToBowl(new Oranges());
        return mixedFruitBowl;
    }
}
