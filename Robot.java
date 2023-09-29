public class Robot extends Mechanics {
    /**
     * В классе Robot ограничения на ввод значений на run (не более 25000 м)
     * и jump (не более 6 м)
     * @param name имя робота
     * @param run сколько робот может пробежать
     * @param jump сколько робот может перепрыгнуть
     */
    public Robot(String name, int run, int jump) {
        super(name, run, jump);

        if(run > 25000) {
            super.run = 25000;
        }
        if(jump > 6) {
            super.jump = 6;
        }
    }
    @Override
    void disqualified() {
        System.out.println(name + " не выполнил задание и решил поработить мир!");
    }
}
