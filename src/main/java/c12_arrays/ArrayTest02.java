package c12_arrays;
/*
    String[] names 배열을 선언하고
    출석부의 이름을 입력하도록 하여, name 배열에 집어넣는 프로그램을 작성합니다.

    실행 예
    몇 명의 학생을 등록하겠습니까? >>> 12
    1번 학생 이름 : 강미경
    2번 학생 이름 : 권성재
    3번 학생 이름 : 김용환
    4번 학생 이름 : 김은수
    5번 학생 이름 : 박경호
    6번 학생 이름 : 박수빈
    7번 학생 이름 : 엄진우
    8번 학생 이름 : 이시후
    9번 학생 이름 : 이하온
    10번 학생 이름 : 장시원
    11번 학생 이름 : 황지선
    12번 학생 이름 : 안근수

    [출력 결과]
    1. 강미경
    2. 권성재
    3. 김용환
    4. 김은수
    5. 박경호
    6. 박수빈
    7. 엄진우
    8. 이시후
    9. 이하온
    10. 장시원
    11. 황지선
    12. 안근수

        -> count에 선언 된 수 만큼 학생 이름을 입력할 수 있도록 반복문을 작성해야 함.
 */

import java.util.Scanner;

public class ArrayTest02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // 몇 개 짜리 방의 배열을 만들 것인가를 count 변수에 초기화
        int count = 0;

        // 배열의 크기를 결정 짓기 위해서
        System.out.print("몇 명의 학생을 등록하겠습니까? >>> ");
        count = scanner.nextInt();
        // 위에서 .nextInt()를 사용했고, 밑에 학생 이름을 입력 받을 예정이기 때문에
        scanner.nextLine(); // 배리어 미리 작성

        // String 배열 선언 및 초기화
        String[] names = new String[count];

        // 학생의 이름을 count 횟수만 큼 입력 받기 위한 반복문 작성
        for (int i = 0; i < count; i++) {
            System.out.print((i+1) + "번 학생 이름 : ");
            names[i] = scanner.nextLine();
        }

        // 학생의 이름을 출력하기 위한 반복문 작성
        System.out.println("[ 출력 결과 ]");

        // count만큼 입력 받았기 때문에 count = names.length
//        for (int i = 0; i < count; i++) {
//            System.out.print((i+1) +". " + names[i]);
//        }

        for (int i = 0; i < names.length; i++) {
            System.out.println((i+1) +". " + names[i]);
        }


//        int[] arr = new String[12];
//        arr[0] = "강미경";
//        arr[1] = "권성재";
//        arr[2] = "김용환";
//        arr[3] = "김은수";
//        arr[4] = "박경호";
//        arr[5] = "박수빈";
//        arr[6] = "엄진우";
//        arr[7] = "이시후";
//        arr[8] = "이하온";
//        arr[9] = "장시원";
//        arr[10] = "황지선";
//        arr[11] = "옥진서";
//
//
//        String[] arr2 = {1,2,3,4,5,6,7,8,9,10,11,12};








    }
}
