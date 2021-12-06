package animals.implementations;

import animals.base.AbstractAnimal;
import animals.base.AnimalType;
import animals.base.FoodType;
import animals.base.Habitat;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Carp extends AbstractAnimal {
    private static final Habitat LIVE_ENV = Habitat.WATER;
    private static final AnimalType ANIMAL_TYPE = AnimalType.OMNIVOROUS;
    public static final int MAX_LIVING_AREA = 200;
    public static final int MAX_WEIGHT = 4;
    public static final List<FoodType> eatingFoods = new ArrayList<>();
    static {
        eatingFoods.add(FoodType.ALGAE);
        eatingFoods.add(FoodType.INSECTS);
    }

    public Carp(Date birthDay, String name) {
        super(birthDay, name);
    }

    @Override
    public Habitat getLiveEnv() {
        return LIVE_ENV;
    }

    @Override
    public AnimalType getAnimalType() {
        return ANIMAL_TYPE;
    }

    @Override
    public String getAnimalClass() {
        return "Карп";
    }

    @Override
    public int getMaxArea() {
        return MAX_LIVING_AREA;
    }

    @Override
    public int getMaxWeight() {
        return MAX_WEIGHT;
    }

    @Override
    public String getEatingFoods() {
        return eatingFoods.toString();
    }
}
