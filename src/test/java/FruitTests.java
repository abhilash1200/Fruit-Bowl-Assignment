import bowl.fruitBowl;
import data.DataLoader;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FruitTests {
    fruitBowl mixedFruitBowl;
    @Test
    public void shouldSegregateFruits(){

        //Arrange
        mixedFruitBowl = new DataLoader().loadData();

        //Act
        fruitBowl bowlWithApple=mixedFruitBowl.getAllApplesBowl();
        fruitBowl bowlWithOrange=mixedFruitBowl.getAllOrangesBowl();
        fruitBowl bowlWithBanana=mixedFruitBowl.getAllBananaBowl();
        fruitBowl bowlWithPineApple=mixedFruitBowl.getAllPineAppleBowl();

        //Assert
        Assert.assertEquals(bowlWithApple.getCount(),2);
        Assert.assertEquals(bowlWithOrange.getCount(),2);
        Assert.assertEquals(bowlWithBanana.getCount(),1);
        Assert.assertEquals(bowlWithPineApple.getCount(),1);

    }
}
