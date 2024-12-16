package c18_static.singleton;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Factory {
    // 필드 선언

    private String factoryName;

    // 생성자 저의 부분 필요 없음 -> 애너테이션 때문에

    // 매서드 정의 -> 이제 중요한 점은 return 타입이 String, int 이런게 아니라
    // 저의하 수업 중에 정의한 클래스라는 점입니다. -> 싱글톤에서도 했습니다. Samsung.java 확인
    public SmartPhone produceSmartPhone() {
        System.out.println(factoryName + "에서 스마트폰을 생성합니다.");

        String model = "갤럭시S";
        String serial = null;

        //싱글톤 패턴이 적용된 Samsung 인스턴스를 가지고오기
        Samsung samsung = Samsung.getInstance();    // produceSmartphone()을 처음 실행할 때서야
                                                    // 처음 Samsung 클래스의 인스턴스가 하나 만들어짐
                                                    // 이 후 두번째 produceSmartphone()을 실행할 때는
                                                    // 이미 만들어진 instance가 반환됨.
        serial = samsung.createSeralNumber(model);

        SmartPhone smartPhone = new SmartPhone(samsung.getCompany(), model, serial);
        // samsung.을 치게 될 경우 자동완성으로 getCompany()가 있습니다.
        // 그 이유는 Samsung.java를 확인했을 때 company 필드에만 @Getter가 적용되어있고
        // serialNumber에는 @Getter가 없었기 때문입니다. 즉, 매번 클래스 단위에 일단 @Data 애너테이션을
        // 적용하는 방식은 비효율적이고 코드 가독성을 떨어트릴 수 있어 명확한 설계 하에 코딩을 할 필요가 있습니다.
        return smartPhone;

    }








}
