public class RemoteControl {

    Command[] onCommands;
    Command[] offCommands;

    public RemoteControl () {
        onCommands = new Command[7];
        offCommands = new Command[7];

        NoCommand noCommand = new NoCommand();
        for (int i = 0; i < onCommands.length; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPressed(int slot) {
        onCommands[slot].execute();
    }

    public void offButtonWasPressed(int slot) {
        offCommands[slot].execute();
    }

    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("\n--- Remote Control ---\n");
        for (int i = 0; i < onCommands.length; i++) {
            sb.append("[Slot " + i + "] " + onCommands[i].getClass().getName() + " - " + offCommands[i].getClass().getName() + "\n");
        }
        return sb.toString();
    }
}
