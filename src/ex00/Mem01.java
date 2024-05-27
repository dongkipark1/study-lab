package ex00;

/**
 * 목표: heap, stack, static 구분하기
 * https://www.youtube.com/watch?v=QRj0WR5Uh2M&t=1273s
 *
 * 1. JVM는 static 키워드가 붙은 친구들을 static 메모리에 로드한다.
 * 2. JVM은 static 메모리에 main 메서드를 찾아서 실행한다.
 * 3. JVM의 생명주기는 main 메서드의 코드 줄 (Queue에 담겨져 있다가 실행 first in first out).
 * 4. heap 동적 메모리 할당
 * - static은 하나만 띄우고(정적 메모리) heap은 여러개 띄울 수 있다(동적 메모리)
 * 5. 메서드 실행 시에 stack(단기 기억)이 열린다.
 */

class Animal {
    String name = "강아지"; // static 부터 걸러내서 메인 실행하기 전에 메모리가 떠있고,

    void speak(){ // speak 메서드 스택 생성 (로컬 변수) - 잠깐만 떠있는 친구
        String sound = "멍멍";
        System.out.println(sound);
    } // speak 메서드 스택 소멸
}

public class Mem01 {

    public static void main(String[] args) {
        Animal a = new Animal();
        a.speak();
        System.out.println(a.name);
    }
}
