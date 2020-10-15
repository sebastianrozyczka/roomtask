public class Room {
    private double size;
    private double temperature;
    private boolean isAirConditioner;
    private static final double MINIMUM_TEMPERATURE = 17;
    private static final double BIGGEST_SIZE_FOR_STRONG_COOLING = 20;

    public Room(double size, double temperature, boolean isAirConditioner) {
        this.size = size;
        this.temperature = temperature;
        this.isAirConditioner = isAirConditioner;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public boolean isAirConditioner() {
        return isAirConditioner;
    }

    public void setAirConditioner(boolean airConditioner) {
        isAirConditioner = airConditioner;
    }

    public boolean reduceTemperature() {
        if(temperature > MINIMUM_TEMPERATURE && isAirConditioner) {
            temperature = temperature - coolingForce();
            return true;
        } else
            return false;
    }

    private double coolingForce() {
        if(size > BIGGEST_SIZE_FOR_STRONG_COOLING)
            return 0.5;
         else
             return 1.5;
    }

    public String showInfoAboutRoom() {
        return "Pokój o wielkości " + size + " metrów kwadratowych oraz temperaturze powietrza: "
                + temperature + " stopni celsjusza. Czy zamontowany klimatyzator? " + isAirConditioner;
    }

    public String tryToReduceTemperatureAndReturnStatus() {
        return "Próba obniżenia temperatury powietrza. Czy udana? " + reduceTemperature();
    }
}
