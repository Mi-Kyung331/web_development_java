package c09_classes;
/*
    생성자 getter setter toString equals() hash()을 자동생성하는 방법

    메뉴바 클릭 - code - generate로 들어가서 해당 메뉴를 클릭하시면 됩니다.
    단축키 - alt + insert

    1. alt + insert
    2. Constructor 클릭
    3. 어떤 필드를 기준으로 생성자를 만들지 체크 (복수 선택 가능)
 */


public class Student02 {
    int num;
    String name;
    Double score;

    public Student02(int num) {
        this.num = num;
    }

    public Student02(String name) {
        this.name = name;
    }

    public Student02(Double score) {
        this.score = score;
    }

    public Student02(int num, String name) {
        this.num = num;
        this.name = name;
    }

    public Student02(int num, String name, Double score) {
        this.num = num;
        this.name = name;
        this.score = score;
    }


}
