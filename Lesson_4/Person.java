public class Person {
    String fullName;
    String position;
    String email;
    String phone;
    int salary;
    int age;

    public Person(String fullName, String position, String email, String phone, int salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public void printInfo() {
        System.out.println("Информация о сотруднике: " + "\n" + "Имя: " + fullName + "\n" +
                "Должность: " + position + "\n" + "Email: " + email + "\n" + "Телефон: " + phone + "\n" +
                "Зарплата: " + salary + "\n" + "Возраст: " + age);
    }
}
