public class Dog extends Animal {
    private static int countDog;

    public void addDog() {
        countDog++;
    }

    public static int getCountAnimal() {
        return countDog;
    }

    public Dog(String name) {
        this.name = name;
        addDog();
    }

    public void run(int distance) {
        if (distance < 0) {
            System.out.println("Dog " + name + " stay stand.");
        } else if (distance > 500) {
            System.out.println("Dog " + name + " not finished.");
        } else {
            System.out.println("Dog " + name + " ran " + distance + " meters.");
        }
    }

    public void swim(int distance) {
        if (distance < 0) {
            System.out.println("Dog " + name + " stay alive.");
        } else if (distance > 10) {
            System.out.println("Dog " + name + " not finished.");
        } else {
            System.out.println("Dog " + name + " swam " + distance + " meters.");
        }
    }
}
