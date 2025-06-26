abstract class Animal {
    private static int countAnimal;
    public String name;
    public int distance;

    public Animal() {
        countAnimal++;
    }

    public static int getCountAnimal() {
        return countAnimal;
    }

    public void run(int distance) {
        System.out.println("Animal ran " + distance + "meters.");
    }

    public void swim(int distance) {
        System.out.println("Animal swam " + distance + "meters.");
    }
}
