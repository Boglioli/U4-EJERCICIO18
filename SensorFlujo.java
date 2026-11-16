public class SensorFlujo extends SensorIndustrial{
    private double señal;
    public SensorFlujo(int idSensor, boolean estadoOperativo, double señal) {
        super(idSensor, estadoOperativo);
        this.señal = señal;
    }
    @Override
    public String leerMetrica() {
        double flujo = señal * 20;
        return "flujo: " + flujo + " minuto";
    }
}
