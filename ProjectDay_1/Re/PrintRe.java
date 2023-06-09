package ProjectDay_1.Re;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class PrintRe {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        ArrayList<String> titles = new ArrayList<>();
        ArrayList<String> contents = new ArrayList<>();
        ArrayList<String> viewComments = new ArrayList<>();
        ArrayList<Integer> views = new ArrayList<>();
        LocalDate currentDate = LocalDate.now();
        timeout timedate = new timeout();
        String settime = "";


        while (true) {
            System.out.printf("명령어 : ");
            String cmd = scan.nextLine();

            if (cmd.equals("exit")) {

                System.out.println("프로그램을 종료합니다.");
                break;

            } else if (cmd.equals("add")) {

                System.out.printf("게시물 제목을 입력해주세요 : ");
                String title = scan.nextLine();
                System.out.printf("게시물 내용을 입력해주세요 : ");
                String content = scan.nextLine();
                settime = String.valueOf(currentDate);


                titles.add(title);
                contents.add(content);
                views.add(0);

                System.out.println("게시물이 등록되었습니다.");
                timeout.timecheck(settime);

            } else if (cmd.equals("list")) {
                if (titles.size() == 0) {
                    System.out.println("등록된 게시물이 없습니다.");
                    continue;
                }
                System.out.println("====================");
                for (int i = 0; i < titles.size(); i++) {
                    System.out.printf("번호 : %d\n", i + 1);
                    System.out.printf("제목 : %s\n", titles.get(i));
                    timeout.timecheck(settime);
                    System.out.println("====================");

                }
            } else if (cmd.equals("update")) {
                System.out.printf("수정할 게시물 번호 : ");
                int target = scan.nextInt();
                int targetIdx = target - 1;
                scan.nextLine();

                if (targetIdx < 0 || target > titles.size()) {
                    System.out.println("없는 게시물 번호입니다.");
                    continue;
                }

                System.out.printf("제목 : ");
                String title = scan.nextLine();
                System.out.printf("내용 : ");
                String body = scan.nextLine();

                titles.set(targetIdx, title);
                contents.set(targetIdx, body);

            } else if (cmd.equals("delete")) {
                System.out.printf("삭제할 게시물 번호 : ");
                int target = scan.nextInt();
                int targetIdx = target - 1;
                scan.nextLine();


                views.remove(targetIdx);


                if (targetIdx < 0 || target > titles.size()) {
                    System.out.println("없는 게시물 번호입니다.");
                    continue;
                }

                titles.remove(targetIdx);
                contents.remove(targetIdx);

                System.out.printf("%d번 게시물이 삭제되었습니다.\n", target);
            } else if (cmd.equals("detail")) {
                System.out.println("상세보기 할 게시물 번호를 입력해주세요.");
                int target = scan.nextInt();
                int targetIdx = target - 1;


                System.out.println("====================");
                for (int i = 0; i < titles.size(); i++) {
                    System.out.printf("번호 : %d\n", i + 1);
                    System.out.printf("제목 : %s\n", titles.get(i));
                    System.out.printf("내용 : %s\n", contents.get(i));
                    System.out.printf("조회수 : %d \n", views.get(i));
                    System.out.println("====================");
                    System.out.println("=======댓글=======");
                    for (String comment : viewComments) {
                        System.out.println(comment);}


                    if (i == targetIdx) {
                        views.set(i, views.get(i) + 1);
                    }
                    System.out.println("");
                    System.out.println("================");
                }
                System.out.println("상세보기 기능을 선택해주세요.");
                System.out.println("1.댓글 등록 , 2. 추천, 3. 수정, 4. 삭제, 5. 목록으로");
                int review = scan.nextInt();
                if (review == 1) {
                    while (true) {
                        System.out.println("댓글 기능");
                        System.out.println("댓글을 입력하세요(0을 누르면 댓글 종료)");
                        String comment = scan.nextLine();
                        if (comment.equals("0")) {
                            break;
                        }
                        viewComments.add(comment);
                    }
                    if (review == 2) {
                        System.out.println("추천 기능");
                    }
                    if (review == 3) {
                        System.out.println("추천");
                    }
                    if (review == 4) {
                        System.out.println("댓글 삭제");
                    }
                    if (review == 5) {
                        System.out.println("목록으로");
                    }
                } else if (cmd.equals("search")) {
                    System.out.println("찾을 단어를 입력하세요.");
                    String searchTarget = scan.nextLine();
                    boolean found = false;

                    for (int i = 0; i < titles.size(); i++) {
                        String title = titles.get(i);
                        String content = contents.get(i);
                        if (title.contains(searchTarget)) {
                            System.out.println("====================");
                            System.out.printf("번호: %d\n", i + 1);
                            System.out.printf("제목: %s\n", title);
                            System.out.printf("내용: %s\n", content);
                            timeout.timecheck(settime);
                            System.out.println("====================");

                            found = true;
                        }
                        if (content.contains(searchTarget)) {
                            System.out.println("====================");
                            System.out.printf("번호: %d\n", i + 1);
                            System.out.printf("제목: %s\n", title);
                            System.out.printf("내용: %s\n", content);
                            timeout.timecheck(settime);
                            System.out.println("====================");

                            found = true;
                        }
                    }
                    if (!found) {
                        System.out.println(" 찾을 수 없습니다.");
                    }

                }


            }
        }


    }
}
class timeout{
    String settime;
   public static void timecheck(String settime){
        System.out.println(settime);
    }
}

//class ListData{
//
//    void ListData(){
//        System.out.println("==================");
//        System.out.println("번호 : 1");
//        System.out.println("제목 : 안녕하세요 반갑습니다. 자바 공부중이에요");
//        System.out.println("==================");
//    }
//
//}