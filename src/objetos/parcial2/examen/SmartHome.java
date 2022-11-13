package objetos.parcial2.examen;

import java.util.LinkedList;
import java.util.List;

class DeviceWithCommand
{
    Device device;
    String voiceCommand;
    String standardCommand;

    public DeviceWithCommand(Device device, String voiceCommand, String standardCommand) {
        this.device = device;
        this.voiceCommand = voiceCommand;
        this.standardCommand = standardCommand;
    }
}

public class SmartHome
{
    private List<Device> devices;
    private List<DeviceWithCommand> deviceWithCommands;

    public SmartHome()
    {
        devices = new LinkedList<>();
        deviceWithCommands = new LinkedList<>();
    }
    public void configure(String deviceName, String voiceCommand, String standardCommand)
    {
        Device device = findDeviceByName(deviceName);

        if (device != null)
        {
            DeviceWithCommand deviceWithCommand = new DeviceWithCommand(device, voiceCommand, standardCommand);
            deviceWithCommands.add(deviceWithCommand);
        }

    }
    public void processCommand(String command)
    {
        DeviceWithCommand device = findDeviceByVoiceCommand(command);

        if (device == null)
        {
            System.out.println("Lo siento no reconozco el comando");
        }
        else
        {
            if (device.standardCommand.equals("turnOn"))
            {
                device.device.turnOn();
            } else
            {
                device.device.turnOff();
            }
        }
    }
    private DeviceWithCommand findDeviceByVoiceCommand(String VoiceCommand)
    {
        for (DeviceWithCommand deviceWithCommand : deviceWithCommands)
        {
            if (deviceWithCommand.voiceCommand.equals(VoiceCommand))
            {
                return deviceWithCommand;
            }
        }
        return null;
    }

    private Device findDeviceByName(String deviceName)
    {
        for (Device device : devices)
        {
            if (device.getName().equals(deviceName))
            {
                return device;
            }
        }
        return null;
    }
    public void addDevice(Device device)
    {
        devices.add(device);
    }
}