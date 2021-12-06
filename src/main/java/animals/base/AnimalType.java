package animals.base;

public enum AnimalType {
    HERBIVOROUS("травоядное животное"),
    CARNIVOROUS("хищное животное"),
    OMNIVOROUS("всеядное животное");

    String strValue;

    AnimalType(String strValue) {
        this.strValue = strValue;
    }
}
