package objetos.parcial2.examen;

public class SmartMiniSplit extends Device{
    public SmartMiniSplit(String device) {
        super(device);
    }

    @Override
    public void turnOn() {
        System.out.println(getName() + ":" + "Encendido mini split");
    }
    @Override
    public void turnOff(){
        System.out.println(getName() + ":" + "Apagado mini split");
    }
}
