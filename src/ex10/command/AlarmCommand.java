package ex10.command;

import ex10.alarm.Alarm;

public class AlarmCommand implements Command{

    private Alarm alram;

    public AlarmCommand(Alarm alram) {
        this.alram = alram;
    }

    @Override
    public void execute() {
        alram.alramOn();
    }
}