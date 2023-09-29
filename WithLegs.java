public abstract class WithLegs {
    int run;
    int jump;
    String name;

    /**
     *
     * @param name название объекта с ногами
     * @param run сколько объект может пробежать в метрах
     * @param jump сколько объект может перепрыгнуть в метрах
     */
    public WithLegs( String name, int run, int jump) {
        this.run = run;
        this.jump = jump;
        this.name = name;
    }

    /**
     * running() - Функция проверяет, выполнил ли кандидат условия для преодоления дистанции, если ДА, то
     * выкидывает сообщение об успешно выполненном задании, а если НЕТ, то возвращает false
     * @param runDistance дистанция бега (если она меньше заданного run,
     * то бегун выполнил задание)
     */
    boolean running(int runDistance) {
        if (runDistance < run) {
            System.out.println(name + " пробежал " + runDistance + " м");
            return true;
        }
        return false;
    }

    /**
     * jumping() - Функция проверяет, выполнил ли кандидат условия для преодоления прыжка, если ДА, то
     * выкидывает сообщение об успешно выполненном задании, а если НЕТ, то возвращает false
     * @param jumpHeight высота стены (если она меньше заданного jump,
     * то прыгун выполнил задание)
     */
    boolean jumping(int jumpHeight) {
        if (jumpHeight < jump) {
            System.out.println(name + " преодолел стену в " + jumpHeight + " м");
            return true;
        }
        return false;
    }

    /**
     * disqualified() - Функция выкидывает сообщение, что кандидат не справился с заданием
     */
    void disqualified() {
        System.out.println(name + " не смог выполнить задание!" + ":(((");
    }
}