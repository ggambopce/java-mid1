package exception.ex4;

import exception.ex3.NetworkServiceV3_1;

import java.util.Scanner;

public class MainV4 {
    public static void main(String[] args) {
        NetworkServiceV4 networkService = new NetworkServiceV4();

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("전송할 문자: ");
            String input = scanner.nextLine();
            if (input.equals("exit")) {
                break;
            }
            try {
                networkService.sendMessage(input);
            } catch (Exception e) { // 모든 예외를 잡아서 처리
                exceptionHandler(e);
            }
            System.out.println();
        }
        System.out.println("프로그램을 정상 종료합니다.");
    }

    // 공통 예외 처리
    private static void exceptionHandler(Exception e) {
        System.out.println("서버문제입니다.");
        e.printStackTrace(System.out);
    }
}
