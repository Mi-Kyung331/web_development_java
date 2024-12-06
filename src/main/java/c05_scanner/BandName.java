package c05_scanner;

import java.util.Scanner;

public class BandName {
    public static void main(String[] args) {

        // Scanner class를 import > 콘솔창에 입력을 하기 위해
        Scanner scanner = new Scanner(System.in);

        // 변수 선언 > 초기화하지 않음
//        String name;
//        String age;
//        String school;
//        String mbti;
//
//        System.out.print("이름이 무엇입니까? >>> ");
//        name = scanner.nextLine();
//        System.out.print("몇 살입니까? >>> ");
//        age = scanner.nextLine();
//        System.out.print("학교가 어디입니까? >>> ");
//        school = scanner.nextLine();
//        System.out.print("MBTI는 어떻게 됩니까? >>> ");
//        mbti = scanner.nextLine();
//
//
//        System.out.print("제 이름은 " + name + "이고, ");
//        System.out.print("나이는" + age + "살입니다.\n");
//        System.out.print(school + "했으며, ");
//        System.out.print("MBTI는 " + mbti + "입니다.");

        // pantsColor, lastFood 변수를 선언 > String

        // 입력 받기 위한 안내문을 작성하고, 변수에 데이터를 대입하세요.
        // 지금 입은 하의 색깔이 무엇인가요?
        // 마지막으로 먹은 음식이 무엇인가요?

        // pantsColor와 lastFood를 이용하여 밴드 네임을 출력하세요
        // 당신의 밴드 이름은 그레이 시리얼입니다.

        // 1. 변수 선언 따로 초기화 따로
        String pantsColor;
        String lastFood;
        String logo = """
                  _______                       _______                      __   __    __               \s
                 |       .--.--.-----.-----.   |   _   .-----.--------.-----|  |_|  |--|__.-----.-----.  \s
                 |.|   | |  |  |  _  |  -__|   |   1___|  _  |        |  -__|   _|     |  |     |  _  |  \s
                 `-|.  |-|___  |   __|_____|   |____   |_____|__|__|__|_____|____|__|__|__|__|__|___  |  \s
                   |:  | |_____|__|            |:  1   |                                        |_____|  \s
                   |::.|                       |::.. . |                                                 \s
                   `---'                       `-------'                                                 \s
                                                                                                         \s
                """;

        System.out.println(logo);
        System.out.print("지금 입은 하의 색깔이 무엇인가요? ");
        pantsColor = scanner.nextLine();
        System.out.print("마지막으로 먹은 음식이 무엇인가요? ");
        lastFood = scanner.nextLine();
        System.out.print("당신의 밴드 이름은 " + pantsColor + " " + lastFood + "입니다.");

        // 2. 변수 선언 및 초기화 함께
//        System.out.print("지금 입은 하의 색깔이 무엇인가요? ");
//        String pantsColor = scanner.nextLine();
//        System.out.print("마지막으로 먹은 음식이 무엇인가요? ");
//        String lastFood = scanner.nextLine();
//        System.out.print("당신의 밴드 이름은 " + pantsColor + " " + lastFood + "입니다.");
    }
}
