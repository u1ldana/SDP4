package task3;

public class Main {
    public static void main(String[] args) {
        RemoteControl remote = new RemoteControl();
        TV tv = new TV();

        Command tvOn = new TurnTVOn(tv);

        remote.setCommand(0, tvOn);
        remote.pressButton(0);
        remote.pressUndo();
    }
}
