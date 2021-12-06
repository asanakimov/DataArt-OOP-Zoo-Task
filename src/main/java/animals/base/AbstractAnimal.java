package animals.base;

import java.util.Date;

public abstract class AbstractAnimal implements Animal {
    private final Date birthDay;
    private final String name;


    public AbstractAnimal(Date birthDay, String name) {
        this.birthDay = birthDay;
        this.name = name;
    }

    @Override
    public Date getBirthDay() {
        return birthDay;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void eat(FoodType food) {
        boolean canEat = false;

        AnimalType animalType = getAnimalType();
        if (food == FoodType.GRASS) {
            canEat = (animalType == AnimalType.HERBIVOROUS || animalType == AnimalType.OMNIVOROUS);
        } else if (food == FoodType.MEAT) {
            canEat = (animalType == AnimalType.CARNIVOROUS || animalType == AnimalType.OMNIVOROUS);
        }
        StringBuilder msg = new StringBuilder();

        msg.append("Я ")
//                .append(getAnimalClass())
//                .append(" ")
                .append(getName())
                .append(" ")
                .append(canEat ? "буду кушать" : "не буду кушать")
                .append(" ")
                .append(food.strValue);
        System.out.println(msg);
    }

    @Override
    public void printInfo() {

        StringBuilder msg = new StringBuilder();

        msg.append("[ ")
                .append(getAnimalClass())
                .append(" ]\n")
                .append("среда обитания: ")
                .append(getLiveEnv().strValue)
                .append(",\n")
                .append(getAnimalType().strValue)
                .append(", ест: ")
                .append(getEatingFoods())
                .append(",\n")
                .append("вес до ")
                .append(getMaxWeight())
                .append(" кг,\n")
                .append("нужно ")
                .append(getMaxArea())
                .append(" кв.м. для обитания.\n");

        System.out.println(msg);
    }


}
