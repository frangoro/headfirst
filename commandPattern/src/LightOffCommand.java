/**
 * This is the command
 */
public class LightOffCommand implements Command {

    // Who
    Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    // How
    @Override
    public void execute() {
        light.off();
    }
}
