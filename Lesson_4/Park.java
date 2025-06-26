public class Park {

    public class AttractionInfo {
        private String attractionType;
        private String attractionWorkTime;
        private int attractionCost;

        public AttractionInfo(String attractionType, String attractionWorkTime, int attractionCost){
            this.attractionType = attractionType;
            this.attractionWorkTime = attractionWorkTime;
            this.attractionCost = attractionCost;
        }

        public void attractionAbout() {
            System.out.println("! Информация об аттракционах !" + "\n" + "Вид аттракциона: " + attractionType + "\n" +
                    "Время работы аттракциона: " + attractionWorkTime + "\n" + "Стоимость (руб.): " + attractionCost);
        }
    }
}
