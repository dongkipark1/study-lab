package ex08.polling;

/**
 *  1. 주기적으로 잘 물어보고
 *  2. 실시간으로 반응하려고!!
 *  3. 주기를 잘 정해야함.
 */

public class App {
    public static void main(String[] args) {
        LotteMart lotteMart = new LotteMart();
        Customer1 cus1 = new Customer1();

        // 1. 마트 입고 준비
        new Thread(() -> {
            lotteMart.received();
        }).start();

        // 2. 손님 thread = main thread
        // 5초가 지나야지 반응함 스레드 시간이 걸려있음
        // 무한으로 while을 돌려서 데이터가 찰 때까지 기다린다.
        while(true){
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e){
                throw new RuntimeException(e);
            }
            if (lotteMart.getValue() != null){
                cus1.update(lotteMart.getValue() + "가 들어왔습니다");
            }else {
                System.out.println("아직 안들어옴");
            }
        }

        // 현재는 첫 스레드와 메인 스레드 2개의 멀티 스레드가 돌고있다.
        // 한 번 요청하면 끝나는게 아니라 계속 들어온다
    }
}
