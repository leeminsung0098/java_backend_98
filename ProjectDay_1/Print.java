package ProjectDay_1;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Date;
import java.time.LocalDate;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Print {
    public static void  main(String[] args) {

        ArrayList<String> titles = new ArrayList<>();
        ArrayList<String> bodies = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String timecheck ="";
        String timecheck1 ="";
        String title = "";
        String data = "";
        String title1 = "";
        String data1 = "";
        ListNum A1 = new ListNum();
        ListNum A2 = new ListNum();
        Date currentDate = new Date();
        LocalDate currentDate1 = LocalDate.now();




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
                if(true)timecheck = String.valueOf(currentDate);
                System.out.println(currentDate);


                System.out.println("게시물 제목을 입력해주세요 :");
                title1 = scanner.nextLine();
                System.out.println("게시물 제목: " + title1);
                System.out.println("게시물 내용을 입력해주세요 :");
                data1 = scanner.nextLine();
                System.out.println("게시물 내용 :" + data1);
                if(true)timecheck1 = String.valueOf(currentDate);
                System.out.println(currentDate);


                System.out.println("게시물이 등록되었습니다.");




                in = "";
                continue;
            }

            else if (in.equals("list")) {
                A1.listNum1(title, data ,timecheck);
                A2.listNum1(title1, data1, timecheck1);
                Search1 s1 = new Search1();

                System.out.println("");
                s1.search1();
                s1.search2();
                s1.search3();

                in = "";
                System.out.println("명령어를 입력해주세요");

                in = scanner.nextLine();
                if(in.equals("search")){
                    System.out.println("검색 키워드를 입력해주세요");
                    in="";
                    in = scanner.nextLine();
                }



            }

            else if (in.equals("update")) {
                String a = "3";

                A1.listNum1(title, data ,timecheck);

                A2.listNum1(title1, data1, timecheck1);

                System.out.println("업데이트할 게시물 번호:");
                String updatein = scanner.nextLine();
                if (updatein.equals("3")) {
                    System.out.println("없는 게시물입니다. 처음으로 돌아갑니다.");
                }
               else if (updatein.equals("1")) {
                    System.out.println("새로운 제목을 입력해주세요");
                    title = scanner.nextLine();
                    System.out.println("새로운 제목:" + title);
                    System.out.println("새로운 내용을 입력해주세요 :");
                    data = scanner.nextLine();
                    System.out.println("새로운 내용:" + data);
                    System.out.println("1번 게시물이 수정되었습니다.");
                }
              else if (updatein.equals("2")) {
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

           else if (in.equals("delete")) {

                String ok = "1";
                String ok1 = "2";


                A1.listNum1(title, data , timecheck);
                A2.listNum1(title1, data1 , timecheck1);


                System.out.println("삭제할 게시물 번호:");
                String updatein = scanner.nextLine();


                if (ok != updatein) {
                    System.out.println("없는 게시물입니다.");
                    in = "";

                }
                if (updatein.equals("1")) {
                    System.out.println("삭제되었습니다.");
                    title = "";
                    data = "";
                    continue;
                }

                if (updatein.equals("2")) {
                    System.out.println("삭제되었습니다.");
                    title1 = "";
                    data1 = "";
                    continue;
                }
            }
            if (in.equals("detail")) {
                System.out.println("상세 보기할 게시물의 번호를 입력해주세요.");
                String detailnum = scanner.nextLine();
                if (detailnum.equals("1")) {

                    System.out.println(detailnum);
                    A1.listNum1(title, data ,timecheck);

                    continue;
                }
                if (detailnum.equals("2")) {

                    System.out.println(detailnum);
                    A2.listNum1(title1, data1, timecheck1);

                    continue;
                }
                if (detailnum.equals("3")) {
                    System.out.println("없는 게시물입니다.");

                }
                if (in.equals("exit")) {
                    System.out.println("프로그램을 종료합니다.");
                    break;
                }

            }
        }
    }
}



class ListNum{
    void listNum1(String title,String data,String timecheck){
        System.out.println("=========목록=========");
        System.out.println("제목1:" + title);
        System.out.println("내용1:" + data);
        System.out.println(timecheck);
        System.out.println("=====================");
    }
    void listNum2(String title1 , String data1 , String timecheck1){
        System.out.println("=========목록=========");
        System.out.println("제목1:" + title1);
        System.out.println("내용1:" + data1);
        System.out.println(timecheck1);
        System.out.println("=====================");
    }
}
class Search1{
    void search1(){
        System.out.println("==================");
        System.out.println("번호 : 1");
        System.out.println("제목 : 안녕하세요 반갑습니다. 자바 공부중이에요.");
        System.out.println("==================");
    }


    void search2(){
        System.out.println("==================");
        System.out.println("번호 : 2");
        System.out.println("제목 : 자바 질문좀 할게요~");
        System.out.println("==================");}

    void search3(){
        System.out.println("==================");
        System.out.println("번호 : 3");
        System.out.println("제목 : 정처기 따야되나요?");
        System.out.println("==================");}
}



//class SearchContent{
//    void search(){
//        String name = null;
//        while(true){
//            System.out.print("내용: ");
//            name = s.next();
//            if(name.equals("end"))   break;
//            for(Search1 st : Search1){
//                if(st.matches(name))
//                    st.print();
//            }
//        }
//    }
//}

//class Calendar{
//    SimpleDateFormat format = new SimpleDateFormat("yyyy - MM - dd HH:mm:ss");
//    SimpleDateFormat format1 = new SimpleDateFormat("yyyy년  MM월dd일 HH시mm분ss초");
//
//    Calendar time = Calendar.getInstance();
//
//    String format_time1 = format1.format(time.getTime());
//    String format_time2 = format1.format(time.getTime());
//
//}