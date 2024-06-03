package ex10;

import ex10.command.Command;

// 버튼만 보고 요청하면 된다.
public class Button {
    private Command command;

    public Button(Command command){
        this.command = command;
    }


    public void press(){
        command.execute();
    }

}