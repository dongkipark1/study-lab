package ex00;

/**
 * 목표 : 다형성, 동적바인딩
 * 1. 소나타(오브젝트 == 객체), 제네시스(오브젝트 == 객체) == 자동차(추상적) -> 메모리에 띄울 수가 없음 이 세상에 존재하지 않기 때문에
 * 상태는 행위를 통해서 변경이 되어야 한다
 * 상태만을 바꿔버리면 디버깅을 하기가 힘들다.
 */

abstract class Car { // new x
    abstract void run(); // 추상 메서드는 오류가 남 추상 메서드는 메모리에 띄울 수가 없기 때문에 오류가 난다 부모가 된 메서드를 재정의를 해야한다
}

class Sonata extends Car{
    @Override // 부모의 메서드를 재정의
    void run() {
        System.out.println("소나타 달린다");
    } // 상속은 추상화를 이용하기 위함 , sonata -> car

}

class Genesis extends Car{
    @Override
    void run() {
        System.out.println("제네시스 달린다");
    } // genesis -> car
}

public class Mem02 {
    public static void main(String[] args) {
        Car s = new Sonata(); // 자동차이자 소나타(run) (메모리에 떠 있기 때문에 Car, Sonata 둘다 가능)
        s.run();
        // car(부모)의 run을 호출하러 갔더니, sonata(자식)의 run을
        // 재정의해서 car의 run이 오버라이드 되고,
        // sonata의 run이 호출이 된다. ==>>> 동적 바인딩
        Car g = new Genesis(); // 메모리 genesis(run), car
        g.run();
    }
}
