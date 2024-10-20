package task3;

public class RemoteControl {
    private Command[] commands;
    private Command undoCommand;

    public RemoteControl() {
        commands = new Command[5];
    }

    public void setCommand(int slot, Command command) {
        commands[slot] = command;
    }

    public void pressButton(int slot) {
        commands[slot].execute();
        undoCommand = commands[slot];
    }

    public void pressUndo() {
        undoCommand.undo();
    }
}

