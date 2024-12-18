package c19_generic.wildcards.wildcard_practice;

import lombok.ToString;

@ToString
public class Tiger extends Animal{

    // 상속 받은 메서드
    @Override
    public void move() {
        System.out.println("호랑이가 네 발로 뜁니다.");
    }

    // 호랑이 고유 메서드
    public void hunt(){
        System.out.println("호랑이가 사냥을 합니다.");
    }
    // 다 하셨으면 Human.java에 들어가서 toString 에너테이션을 쓰시고, 오버라이드 해서
    // 사람이 두 발로 뜁니다. 하세요.

}
