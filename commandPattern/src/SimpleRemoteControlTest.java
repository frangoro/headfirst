/**
 * This is the client
 */
public class SimpleRemoteControlTest {

    public static void main(String[] args) {
        // The invoker who order the request
        SimpleRemoteControl src = new SimpleRemoteControl();
        // The receiver of the request
        Light light = new Light();
        // The command requested in the request
        LightCommand lightCommand = new LightCommand(light);
        // Pass the command to the invoker
        src.setCommand(lightCommand);
        // Invoke the command
        src.buttonWasPressed();
    }
}
