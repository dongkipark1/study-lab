package ex04;

/** 싱글톤 패턴
 * 목적: 문지기를 메모리에 하나만 올리고 싶다
 */

// 문지기
public class Doorman {

    public static Doorman instance = new Doorman(); // instance는 static에 new 이하는 heap에 저장

    private Doorman(){

    }

    public void 쫓아내(Animal a){
        System.out.println(a.getName()+ "(을)를 쫓아내");

    }
}
