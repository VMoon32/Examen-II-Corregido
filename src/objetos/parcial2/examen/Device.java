package objetos.parcial2.examen;

public abstract class Device extends SmartHome{
    private String name;

    public Device(String name) {
        this.name = name;
    }

    public abstract void turnOn();

    public abstract void turnOff();

    public String getName() {
        return name;
    }
}
