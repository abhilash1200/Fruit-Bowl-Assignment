package bowl;

import fruits.*;
import java.util.ArrayList;
import java.util.List;

public class fruitBowl {
    public List<Fruit> fruits;

    public  fruitBowl(){
        fruits=new ArrayList<>();
    }

    public void addFruitsToBowl(Fruit fruitType) {
        fruits.add(fruitType);

    }

    public fruitBowl getAllPineAppleBowl() {
        fruitBowl bowlOfPineApple=new fruitBowl();
        fruits.stream().forEach(f->{
            if(f instanceof PineApple)
                bowlOfPineApple.addFruitsToBowl(f);
        });
        return bowlOfPineApple;
    }

    public fruitBowl getAllApplesBowl() {

        fruitBowl bowlOfApple=new fruitBowl();

        fruits.stream().forEach(f->{
            if(f instanceof Apple)
                bowlOfApple.addFruitsToBowl(f);
        });
        return bowlOfApple;
    }

    public fruitBowl getAllOrangesBowl() {
        fruitBowl bowlOfOrange=new fruitBowl();
        fruits.stream().forEach(f->{
            if(f instanceof Oranges)
                bowlOfOrange.addFruitsToBowl(f);
        });
        return bowlOfOrange;

    }

    public fruitBowl getAllBananaBowl() {
        fruitBowl bowlOfBanana=new fruitBowl();
        fruits.stream().forEach(f->{
            if(f instanceof Banana)
                bowlOfBanana.addFruitsToBowl(f);
        });
        return bowlOfBanana;
    }
    public int getCount() {
        return fruits.size();
    }
}


