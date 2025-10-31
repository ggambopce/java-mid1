package exception.ex1;

import java.util.Scanner;

public class MainV1 {

    /**
     * 서버에 data전송 프로그램
     * 서버 연결, 데이터 전송, 연결 해제
     */
    public static void main(String[] args) {
        //NetworkServiceV1 networkService = new NetworkServiceV1();
        NetworkServiceV1_3 networkService = new NetworkServiceV1_3();

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("전송할 문자: ");
            String input = sc.nextLine();
            if (input.equals("exit")) {
                break;
            }
            networkService.sendMessage(input);
            System.out.println();
        }
        System.out.println("프로그램을 정상 종료합니다.");
    }
}
