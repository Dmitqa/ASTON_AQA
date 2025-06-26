public class Bowl {
    public static int foodBowl;

    public Bowl(int foodBowl) {
        Bowl.foodBowl = foodBowl;
    }

    public int infoBowl() {
        return foodBowl;
    }

    public void replenishBowl(int newFood) {
        foodBowl += newFood;
    }

}
