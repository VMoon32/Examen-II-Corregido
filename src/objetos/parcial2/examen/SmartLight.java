package objetos.parcial2.examen;

public class SmartLight extends Device{
    public SmartLight(String device) {
        super(device);
    }
    @Override
    public void turnOn() {
        System.out.println(getName() + ":" + "Encendido Foco");
    }
    @Override
    public void turnOff(){
        System.out.println(getName() + ":" + "Apagando Foco");
    }
}
