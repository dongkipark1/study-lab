package ex06.notification;

public class SmsNotifier implements Notifier{

    private Notifier notifier;

    public SmsNotifier(Notifier notifier) {
        this.notifier = notifier;
    }

    public SmsNotifier() {

    }

    // 재정의 됨
    public void send(){
        if (notifier != null) notifier.send();
        System.out.println("SMS 알림");
    }
}

// 값이 있는 생성자를 때리면 기능을 하고 값이 없는 생성자를 때리면 기능을 하지 못한다.