public class Wall {
    private int height;

    public Wall(int height) {
        this.height = height;
    }

    public Wall() {
    }
    /**
     * getHeight() - Функция возвращает ранее заданное значение height (высоту стены)
     */
    public int getHeight() {
        return height;
    }
    /**
     * setHeight - Функция задает значение height (высоту стены)
     */
    public void setHeight(int height) {
        this.height = height;
    }

}