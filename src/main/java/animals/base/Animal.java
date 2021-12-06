package animals.base;

import java.util.Date;

public interface Animal {
    Date getBirthDay();

    String getName();

    Habitat getLiveEnv();

    AnimalType getAnimalType();

    void eat(FoodType food);

    String getAnimalClass();

    int getMaxArea();

    int getMaxWeight();

    void printInfo();

    String getEatingFoods();
}
