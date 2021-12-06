package task;

import animals.base.Animal;
import animals.base.FoodType;
import animals.base.Habitat;
import animals.implementations.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Task {
    public static void main(String[] args) {
        /* Task 1. Create animals list
           and try to feed them by grass and meat.
        */
        System.out.println("[Задание 1]");
        List<Animal> animals = createAnimalsList();

        animals.forEach(Animal::printInfo);
        // по-хорошему, printInfo можно вынести в отдельный класс утилит

        for (Animal animal : animals) {
            animal.eat(FoodType.GRASS);
            animal.eat(FoodType.MEAT);
            System.out.println("");
        }

        /* 2. Рассчитать минимальное необходимое место (кв.м.) нужное в зоопарке,
           если в нем живут:
              - 5 рысей,
              - 4 енота,
              - 2 кенгуру,
              - 7 орлов,
              - 3 страуса,
              - 15 карпов и
              - 7 тараней.
             Результат вывести на консоль
          */
        System.out.println("[Задание 2]");

        int livingAreaForZoo = 5 * Lynx.MAX_LIVING_AREA
                + 4 * Raccoon.MAX_LIVING_AREA
                + 2 * Kangaroo.MAX_LIVING_AREA
                + 7 * Eagle.MAX_LIVING_AREA
                + 3 * Ostrich.MAX_LIVING_AREA
                + 15 * Carp.MAX_LIVING_AREA
                + 7 * Roach.MAX_LIVING_AREA;

        System.out.println("минимальное необходимое место (кв.м.) нужное в зоопарке для\n"
                .concat(" -  5 рысей, \n")
                .concat(" -  4 енотов, \n")
                .concat(" -  2 кенгуру,\n")
                .concat(" -  7 орлов,\n")
                .concat(" -  3 страуса,\n")
                .concat(" - 15 карпов и\n")
                .concat(" -  7 тараней.\n")
                .concat("равно = ")
                .concat(String.valueOf(livingAreaForZoo))
                .concat(" кв.м.\n"));


        /* Рассчитать грузоподъемность автомобиля, который должен будет перевозить всех
           сухопутных животных. То же самое для летающих животных. То же самое для плавающих
           животных. Результаты вывести на консоль
         */
        System.out.println("[Задание 3]");
        int weightOfEarthAnimals = getWeightByHabitat(animals, Habitat.EARTH);
        System.out.println("Weight of animals living on Earth = " + weightOfEarthAnimals + " kgs" +
                "\n");

        int weightOfWaterAnimals = getWeightByHabitat(animals, Habitat.WATER);
        System.out.println("Weight of animals living in Water = " + weightOfWaterAnimals + " kgs" +
                "\n");

        int weightOfAirAnimals = getWeightByHabitat(animals, Habitat.AIR);
        System.out.println("Weight of animals living in Air = " + weightOfAirAnimals + " kgs\n");

    }

    private static int getWeightByHabitat(List<Animal> animals, Habitat habitat) {
        return animals.stream().
                filter(animal -> (animal.getLiveEnv() == habitat))
                .mapToInt(Animal::getMaxWeight).sum();
    }

    private static List<Animal> createAnimalsList() {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Lynx(new Date(), "Обыкновенная рысь"));
        animals.add(new Raccoon(new Date(), "Енот полоскун"));
        animals.add(new Kangaroo(new Date(), "Восточный кенгуру"));
        animals.add(new Eagle(new Date(), "Степной орел"));
        animals.add(new Ostrich(new Date(), "Африканский страус"));
        animals.add(new Carp(new Date(), "Зеркальный карп"));
        animals.add(new Roach(new Date(), "Черноморская тарань"));
        return animals;
    }
}
