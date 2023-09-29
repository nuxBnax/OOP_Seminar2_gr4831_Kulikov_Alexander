public class Cat extends Animals{
    /**
     * В классе Cat ограничения на ввод значений на run (не более 1000 м)
     * и jump (не более 3 м)
     * @param name имя кота/кошки
     * @param run сколько кот/кошка может пробежать
     * @param jump сколько кот/кошка может перепрыгнуть
     */
    public Cat(String name,int run, int jump) {
        super(name, run, jump);
        if(run > 1000) {
            super.run = 1000;
        }
        if(jump > 3) {
            super.jump = 3;
        }
    }

    @Override
    void disqualified() {
        System.out.println(name + " увидел миску с едой и не смог выполнить задание!");
    }

}