import java.util.ArrayList;
public class PanelControl {
    private ArrayList<SensorIndustrial> sensores;
    public PanelControl() {
        sensores = new ArrayList<>();
    }
    public void agregarSensor(SensorIndustrial sensor) {
        sensores.add(sensor);
    }
    public void realizarBarrido() {
        for (SensorIndustrial sensor : sensores) {
            System.out.println("------------------");
            System.out.println(sensor.leerMetrica());
            sensor.mostrarEstado();
        }
    }
}
