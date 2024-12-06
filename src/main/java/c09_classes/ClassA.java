package c09_classes;
/*
    1. 클래스란?
        클래스는 객체를 생성하기 위한 설계도 = 틀 / 청사진이라고 볼 수 있음. 현실 세계의 개념을 프로그래밍으로 표현할 때,
        "특정 사물이나 개념의 특징(속성)"과 "행동(메서드)"로 정의함.
        예를 들어,
        '자동차'라는 클래스를 만든다면 자동차의 속성(색상, 속도)과, 행동(가속, 정지)을 코드로 표현할 수 있음.

    2. 객체(Object)란?
        클래스를 설계도로 봤을 때, 실제 사용할 수 있는 자동차(인스턴스)는 객체라고
        여기서 Object라는 표현과 Instance라는 표현은 한국에서는 거의 동일함.

            객체와 인스턴스의 관계
                객체는 포괄적인 개념으로 클래스에서 생성된 모든 것을 객체라고 함.
                인스턴스는 특정 객체가 어떤 클래스의 구현체인지를 강조하는 표현

            비유로 이해하기
                클래스 : 객체
                객체 : 설계도를 바탕으로 만들어진 모든 실물
                인스턴스 : 특정 설계도를 기반으로 만들어진 "해당 실물"

            예를 들어 :
                1. "사람"이라는 클래스를 고려했을 때,
                2. "홍길동", "김철수"는 이 '클래스'에서 생성된 객체임.
                3. "홍길동"은 "사람" 클래스의 인스턴스임
 */

public class ClassA {

    // 멤버 변수
    int num;
    String name;
    double score;

    void callName() {
        System.out.println(name + "을(를) 부릅니다.");
    }

}
