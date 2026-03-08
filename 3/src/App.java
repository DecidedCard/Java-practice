import java.util.Scanner;

import ConstructorTest.Circle;

public class App {
    public static void main(String[] args) throws Exception {
        int[] a = { 1, 2, 3, 4, 5 }; // 배열의 초기화

        int[] b;
        b = new int[10]; // 배열의 생성, new 연산자 사용

        // lengthTest();
        // stringTest();
        scannerTest();
    }

    public static void lengthTest() {
        int twoArray[][] = { { 1, 2, 3 }, { 4, 5, 6 } };

        for (int i = 0; i < twoArray.length; i++) { // length를 활용하여 반복문 작성
            for (int j = 0; j < twoArray[i].length; j++) {
                System.out.print(twoArray[i][j]);
                System.out.println();
            }
            System.out.println();
        }
    }

    public static void stringTest() { // 문자열의 +연산자
        String a = "result";

        System.out.println(a + 123);
        System.out.println('A' + 0);
        System.out.println("A" + 1);
    }

    public static void scannerTest() { // 스캐너 테스트
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) { // 다음 int가 있으면 반복
            System.out.println(sc.nextInt());
        }
        sc.close();
    }

    public static void ConstructorTest(String args[]) {
        Circle c = new Circle(5.0);
        // System.out.println(c.r); // 컴파일 오류 메소드 없는 변수기 때문에 다른 패키지에서 사용할 수 없음
        System.out.println(c.getArea());
    }
}
