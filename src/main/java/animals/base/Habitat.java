package animals.base;

public enum Habitat {
    EARTH("земля"),
    WATER("вода"),
    AIR("воздух");

    String strValue;

    Habitat(String strValue) {
        this.strValue = strValue;
    }
}
