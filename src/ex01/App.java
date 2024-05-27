package ex01;

import ex02.Animal;
import ex02.Doorman;
import ex02.Mouse;
import ex02.Tiger;

public class App {
    public static void main(String[] args) {
        ex02.Animal mouse = new Mouse();
        Animal tiger = new Tiger();
        ex02.Doorman doorman = new Doorman();
        doorman.쫓아내(tiger);
    }
}
