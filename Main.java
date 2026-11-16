public class Main {
    public static void main(String[] args) {
        PanelControl panel = new PanelControl();
        SensorTemperatura temperatura = new SensorTemperatura(1, true, 8.5);
        SensorPresion presion = new SensorPresion(2, true, 6.2);
        SensorFlujo flujo = new SensorFlujo(3, false, 4.5);
        panel.agregarSensor(temperatura);
        panel.agregarSensor(presion);
        panel.agregarSensor(flujo);
        System.out.println("sistema de lectura de sensores");
        panel.realizarBarrido();
    }
}