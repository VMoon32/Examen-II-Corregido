package objetos.parcial2.examen;

public class SmartPlug extends Device{
    public SmartPlug(String device) {
        super(device);
    }

    @Override
    public void turnOn(){
        System.out.println(getName() + ":" + "Energizado Contacto");
    }
    @Override
    public void turnOff(){
        System.out.println(getName() + ":" + "Apagado Contacto");
    }
}
