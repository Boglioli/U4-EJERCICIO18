public class SensorPresion extends SensorIndustrial {
    private double señal;
    public SensorPresion(int idSensor, boolean estadoOperativo, double señal) {
        super(idSensor, estadoOperativo);
        this.señal = señal;
    }
    @Override
    public String leerMetrica() {
        double presion = señal * 5;
        return "presion: " + presion + " bar";
    }
}
