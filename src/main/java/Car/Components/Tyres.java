package Car.Components;

public class Tyres {

    private int width;
    private TyreSeason tyreSeason;

    public Tyres(int width, TyreSeason tyreSeason) {
        this.width = width;
        this.tyreSeason = tyreSeason;
    }

    public int getWidth() {
        return width;
    }

    public TyreSeason getTyreSeason() {
        return tyreSeason;
    }
}
