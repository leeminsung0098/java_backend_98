package ProjectDay_1;

import java.util.Scanner;

public class Print {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        String title = "";
        String data = "";
        String title1 = "";
        String data1 = "";


        while (true) {
            System.out.println("명령어를 입력해주세요:");
            String in = scanner.nextLine();

            if (in.equals("add")) {
                System.out.println("게시물 제목을 입력해주세요 :");
                title = scanner.nextLine();
                System.out.println("게시물 제목:" + title);
                System.out.println("게시물 내용을 입력해주세요 :");
                data = scanner.nextLine();
                System.out.println("게시물 내용:" + data);
                System.out.println("게시물 제목을 입력해주세요 :");
                title1 = scanner.nextLine();
                System.out.println("게시물 제목: " + title1);
                System.out.println("게시물 내용을 입력해주세요 :");
                data1 = scanner.nextLine();
                System.out.println("게시물 내용 :" + data1);

                System.out.println("게시물이 등록되었습니다.");
                in = "";
                continue;
            }

            if (in.equals("list")) {
                System.out.println("==========");
                System.out.println("제목1:" + title);
                System.out.println("내용1:" + data);
                System.out.println("제목2:" + title1);
                System.out.println("내용2:" + data1);

                in = "";
                continue;
            }

            if (in.equals("update")) {
                String a = "3";
                System.out.println("=========목록=========");
                System.out.println("제목1:" + title);
                System.out.println("내용1:" + data);
                System.out.println("=====================");
                System.out.println("제목2:" + title1);
                System.out.println("내용2:" + data1);
                System.out.println("=====================");
                System.out.println("업데이트할 게시물 번호:");
                String updatein = scanner.nextLine();
                if (updatein.equals("3")) {
                    System.out.println("없는 게시물입니다. 처음으로 돌아갑니다.");
                }
                if (updatein.equals("1")) {
                    System.out.println("새로운 제목을 입력해주세요");
                    title = scanner.nextLine();
                    System.out.println("새로운 제목:" + title);
                    System.out.println("새로운 내용을 입력해주세요 :");
                    data = scanner.nextLine();
                    System.out.println("새로운 내용:" + data);
                    System.out.println("1번 게시물이 수정되었습니다.");
                }
                if (updatein.equals("2")) {
                    System.out.println("새로운 제목을 입력해주세요");
                    title1 = scanner.nextLine();
                    System.out.println("새로운 제목:" + title1);
                    System.out.println("새로운 내용을 입력해주세요 :");
                    data1 = scanner.nextLine();
                    System.out.println("새로운 내용:" + data1);
                    System.out.println("1번 게시물이 수정되었습니다.");
                    in = "";
                    continue;
                }
            }

            if (in.equals("delete")) {
                String ok = "1";
                String ok1 = "2";
                System.out.println("=========목록=========");
                System.out.println("제목1:" + title);
                System.out.println("내용1:" + data);
                System.out.println("=====================");
                System.out.println("제목2:" + title1);
                System.out.println("내용2:" + data1);
                System.out.println("=====================");
                System.out.println("삭제할 게시물 번호:");
                String updatein = scanner.nextLine();
                if (ok != updatein) {
                    System.out.println("없는 게시물입니다. 처음으로 돌아갑니다.");
                    in = "";
                }
                if (updatein.equals("1")) {
                    System.out.println("삭제되었습니다.");
                    title = "";
                    data = "";
                }

                if (updatein.equals("2")) {
                    System.out.println("삭제되었습니다.");
                    title1 = "";
                    data1 = "";
                }
            }
            if (in.equals("exit")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

        }
    }
}
