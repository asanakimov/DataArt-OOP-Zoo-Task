package animals.base;

public enum FoodType {
    MEAT("мясо"),
    GRASS("траву"),
    PLANTS("растения"),
    ALGAE("водоросли"),
    INSECTS("насекомых"),
    SHELLFISH("моллюсков"),
    CRUSTACEANS("ракообразных");

    public final String strValue;

    FoodType(String strValue) {
        this.strValue = strValue;
    }

    @Override
    public String toString() {
        return strValue;
    }
}
