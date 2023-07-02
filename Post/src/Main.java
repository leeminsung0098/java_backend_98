import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Board board = new Board();
        Scanner scanner = new Scanner(System.in);
        Date time = new Date();

        while (true) {
            System.out.println("원하는 작업을 선택하세요.");
            System.out.println("1. 게시물 추가");
            System.out.println("2. 게시물 조회");
            System.out.println("3. 댓글 추가");
            System.out.println("4. 게시물 업데이트");
            System.out.println("0. 종료");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("제목을 입력하세요: ");
                    String title = scanner.nextLine();
                    System.out.println("내용을 입력하세요: ");
                    String content = scanner.nextLine();
                    board.createPost(title, content , time);
                    break;
                case 2:
                    System.out.println("조회할 게시물번호를 입력하세요: ");
                    int postId = scanner.nextInt();
                    scanner.nextLine();
                    board.viewPost(postId);
                    break;
                case 3:
                    System.out.println("댓글을 추가할 게시물번호를 입력하세요: ");
                    int targetPostId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("댓글 내용을 입력하세요: ");
                    String comment = scanner.nextLine();
                    board.addCommentToPost(targetPostId, comment);
                    break;
                case 4:
                    System.out.println("수정할 게시물번호를 입력하세요");
                    int targetPostId2 = scanner.nextInt();
                    scanner.nextLine();
                    board.viewPost(targetPostId2);
                    System.out.println("수정할 게시물 제목 ");
                    String update_title = scanner.nextLine();
                    scanner.nextLine();
                    System.out.println("수정할 게시물 내용");
                    String update_content = scanner.nextLine();
                    board.updatePost(targetPostId2 , update_title ,update_content);



                    break;
                case 0:
                    System.out.println("프로그램을 종료");
                    System.exit(0);
                    break;
                default:
                    System.out.println("잘못된 선택");
                    break;


            }
        }
    }
}