public class Lesson4 {
    public static void main(String[] args) {
        Person[] persArray = new Person[5];
        persArray[0] = new Person("Ivanov Ivan", "Engineer",
                 "ivivan@mailbox.com", "892312312", 30000, 30);
        persArray[1] = new Person("Tarasov Taras", "Devops",
                "tartar@mailbox.com", "890900999", 50000, 32);
        persArray[2] = new Person("Irinova Irina", "Analyst",
                "irira@mailbox.com", "890012345", 40000, 22);
        persArray[3] = new Person("Olegov Oleg", "QA",
                "Olleg@mailbox.com", "893340400", 55000, 40);
        persArray[4] = new Person("Davidov David", "Engineer",
                "davidov@mailbox.com", "890050005", 35000, 28);

        persArray[4].printInfo();
        System.out.println();

        Park attraction = new Park();
        Park.AttractionInfo carousel = attraction.new AttractionInfo("Карусель",
                "с 10-00 до 18-00", 500);
        Park.AttractionInfo ferrisWheel = attraction.new AttractionInfo("Колесо обозрения",
                "с 09-00 до 21-00", 200);
        Park.AttractionInfo trainRides = attraction.new AttractionInfo("Паровозик",
                "с 10-00 до 16-00", 350);

        carousel.attractionAbout();
    }
}
