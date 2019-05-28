/*
The client
 */
public class RemoteLoader {

    public static void main (String args []) {
        // the invoker
        RemoteControl remoteControl = new RemoteControl();
        System.out.println(remoteControl);

        // the receiver
        Light light = new Light();

        // the commands
        LightCommand onLightCommand = new LightCommand(light);
        LightOffCommand offLightCommand = new LightOffCommand(light);

        remoteControl.setCommand(0,onLightCommand, offLightCommand);
        remoteControl.onButtonWasPressed(0);
        remoteControl.offButtonWasPressed(0);

    }
}
