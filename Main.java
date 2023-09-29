public class Main {

    public static void main(String[] args) {
        WithLegs[] withLegsList = {
                new Human("Валера", 7000, 3),
                new Cat("Пушистик", 500, 2),
                new Robot("Мегатрон", 3000, 15),
                new HomoSapiens("Какой-то мужик", 2100, 2),
                new Animals("Ксеноморф", 3000, 2),
                new Mechanics("Кресло", 0, 0),
                new Human("Генадий", 1500, 10),
                new Cat("Хвостик", 3000, 2),
                new Robot("СтарСкрим", 2500, 2),
        };
        Track track = new Track();
        track.setDistance(2000);

        Wall wall = new Wall();
        wall.setHeight(3);

        Object[] tasks = {track, wall};

        for (WithLegs legs : withLegsList) {
            boolean execute = true;
            int i = 0;
            while (execute && i < tasks.length) {
                if (tasks[i] instanceof Track) {
                    execute = legs.running(((Track) tasks[i]).getDistance());
                }
                else if (tasks[i] instanceof Wall) {
                    execute = legs.jumping(((Wall) tasks[i]).getHeight());
                }
                i++;
            }
            if (!execute) legs.disqualified();
        }
    }
}