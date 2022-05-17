package Car.Components;

public class Engine {

    private String engineCode;
    private int bhp;

    public Engine(String engineCode, int bhp) {
        this.engineCode = engineCode;
        this.bhp = bhp;
    }

    public String getEngineCode() {
        return engineCode;
    }

    public int getBhp() {
        return bhp;
    }
}
