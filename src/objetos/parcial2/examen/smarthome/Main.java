package objetos.parcial2.examen.smarthome;

import objetos.parcial2.examen.SmartHome;
import objetos.parcial2.examen.SmartSwitch;
import objetos.parcial2.examen.*;

public class Main {

    public static void main(String[] args) {
        SmartHome smartHome = new SmartHome();

        // Add devices to smart home
        smartHome.addDevice(new SmartSwitch("Focos Navidad"));
        smartHome.addDevice(new SmartPlug("Arbol Navidad"));
        smartHome.addDevice(new SmartLight("Foco Entrada principal"));
        smartHome.addDevice(new SmartLight("Foco Cochera"));
        smartHome.addDevice(new SmartLight("Foco Cocina"));
        smartHome.addDevice(new SmartMiniSplit("Clima Estudio"));

        // Configure commands
        smartHome.configure("Focos Navidad", "Enciende focos navidad", "turnOn");
        smartHome.configure("Focos Navidad", "Apaga focos navidad", "turnOff");
        smartHome.configure("Arbol Navidad", "Enciende arbolito", "turnOn");
        smartHome.configure("Arbol Navidad", "Apaga arbolito", "turnOff");
        smartHome.configure("Foco Entrada principal", "Enciende entrada principal", "turnOn");
        smartHome.configure("Foco Entrada principal", "Apaga entrada principal", "turnOff");
        smartHome.configure("Clima Estudio", "Enciende clima", "turnOn");
        smartHome.configure("Clima Estudio", "Apaga clima", "turnOff");

        // Testing commands
        smartHome.processCommand("Enciende focos navidad"); // imprimir: 'Focos Navidad: Encendiendo switch'
        smartHome.processCommand("Enciende Cochera"); // imprimir: 'Lo siento, no reconozco el comando'
        smartHome.processCommand("Apaga focos navidad"); // imprimir: 'Focos Navidad: Apagando switch'
        smartHome.processCommand("Enciende arbolito"); // imprimir: 'Arbol Navidad: Energizando contacto'
        smartHome.processCommand("Apaga arbolito"); // imprimir: 'Arbol Navidad: Apagando contacto'
        smartHome.processCommand("Enciende entrada principal"); // imprimir: 'Foco Entrada principal: Encendiendo foco'
        smartHome.processCommand("Apaga entrada principal"); // imprimir: 'Foco Entrada principal: Apagando foco'
        smartHome.processCommand("Enciende focos navidad"); // imprimir: 'Focos Navidad: Encendiendo switch'
        smartHome.processCommand("Enciende clima"); // imprimir: 'Clima Estudio: Encendiendo mini split'
        smartHome.processCommand("Apaga clima"); // imprimir: 'Clima Estudio: Apagando mini split'


    }
}