public class Cat extends Animal {
    private static int countCat;
    public boolean hunger;
    public int catPortion;

    public void addCat() {
        countCat++;
    }

    public static int getCountAnimal() {
        return countCat;
    }

    public Cat(String name, boolean hunger, int catPortion) {
        this.name = name;
        this.hunger = hunger;
        this.catPortion = catPortion;
        addCat();
    }

    public void run(int distance) {
        if (distance < 0) {
            System.out.println("Cat " + name + " stay stand.");
        } else if (distance > 200) {
            System.out.println("Cat " + name + " not finished.");
        } else {
            System.out.println("Cat " + name + " ran " + distance + " meters.");
        }
    }

    public void swim(int distance) {
        if (distance < 0) {
            System.out.println("Cat " + name + " stay alive.");
        } else {
            System.out.println("Cat " + name + " can't swim.");
        }
    }
}
