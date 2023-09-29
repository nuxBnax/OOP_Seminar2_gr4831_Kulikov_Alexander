public class Human extends HomoSapiens {
    /**
     * В классе Human ограничения на ввод значений на run (не более 10000)
     * и jump (не более 3)
     * @param name имя человека
     * @param run сколько человек может пробежать
     * @param jump сколько человек может перепрыгнуть
     */
    public Human(String name,int run, int jump) {
        super(name, run, jump);
        if(run > 10000) {
            super.run = 10000;
        }
        if(jump > 3) {
            super.jump = 3;
        }
    }

    @Override
    void disqualified() {
        System.out.println(name + " подвернул ногу!" + ":(((");
    }

}
