public class Track{
    private int distance;

    public Track(int distance) {
        this.distance = distance;
    }
    public Track() {
    }

    /**
     * getDistance() - Функция возвращает ранее заданное значение distance (дистанция на беговой дорожке)
     */
    public int getDistance() {
        return distance;
    }
    /**
     * setDistance - Функция задает значение distance (дистанция на беговой дорожке)
     */
    public void setDistance(int distance) {
        this.distance = distance;
    }

}