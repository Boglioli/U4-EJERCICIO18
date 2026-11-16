public class SensorTemperatura extends SensorIndustrial {
    private double señal;
    public SensorTemperatura(int idSensor, boolean estadoOperativo, double señal) {
        super(idSensor, estadoOperativo);
        this.señal = señal;
    }
    @Override
    public String leerMetrica() {
        double temperatura = señal * 10;
        return "temperatura: " + temperatura + " C°";
    }
}
