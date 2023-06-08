package Day9;


import java.lang.reflect.Array;
import java.security.spec.RSAOtherPrimeInfo;
import java.util.ArrayList;

public class Colletion {
    public static void main(String[] args) {

        // 배열 사용 > 길이 제한. 길이가 넘으면 예외가 발생. 길이가 더 필요해서 100으로 잡으면 메모리가 낭비.
        //             배열은 삭제 , 추가 개념이 없다 .. 구현은 가능하지만 비효율.
        // 해결방법 ,,,> ArrayList, HashMap
        //추가 수정 삭제 조회 사이즈
        int[] arr = new int[100];

        arr[0]= 100;

        ArrayList<Integer> list = new ArrayList<>();
        //추가 = add  , add한번에 값 하나만 들어감
        list.add(10);
        list.add(12);

        //조회 = get , 인덱싱
        System.out.println(arr[0]);
        System.out.println(list.get(0));

        //수정 = set,    > set(위치,값)
        arr[0] = 200;
        list.set(0,200);

        //삭제 - remove(위치)
        list.remove(0);
        // 하나 삭제하면 뒤에있는 값이 앞으로 당겨짐.
        list.remove(Integer.valueOf(20)); // 값으로 삭제

        // 사이즈
        System.out.println(arr.length);

        System.out.println(list.size());

        list.add(4);
        list.add(12);

        System.out.println(list.size());
        //순회
        for(int i = 0; i < list.size(); i++){
            System.out.println(list);
        }
        System.out.println("*******************************");



// {5,4,3,2,1,0}을 ArrayList에 추가 해주세요.
// ArrayList의 사이즈를 출력해주세요.
// ArrayList의 3,4번째 값을 읽어서 출력해주세요.
// 1,2번째 값을 지운 뒤, 다시 3,4번째 값을 출력해주세요
// List의 모든 값을 출력해주세요.


        // 정수를 저장할 수 있는 ArrayList를 선언하고 만들어주세요.
        // 리스트에 값을 추가해주세요.
        ArrayList<Integer> arrayList = new ArrayList<>();

        arrayList.add(5);
        arrayList.add(4);
        arrayList.add(3);
        arrayList.add(2);
        arrayList.add(1);
        arrayList.add(0);

        // size()
        // 리스트의 사이즈를 출력해주시고, 값이 6이 맞다면 계속 진행해주세요.
        // 출력결과 : 6
        System.out.println(arrayList.size());

        // get()
        // 리스트의 3,4번째 값을 출력해주세요.
        // 출력결과 : 3, 2

        System.out.println(arrayList.get(3));
        System.out.println(arrayList.get(4));



        // remove()
        // 리스트의 1,2번째 값을 지운 뒤, 다시 3,4번째 값을 출력해주시고 어떤 변화가 있는지 체크해주세요.
        // 출력 결과 : 1, 0

        arrayList.remove(1);
        arrayList.remove(2);

        System.out.println(arrayList.get(3));
//        System.out.println(arrayList.get(4));
        // 반복문으로 출력.

            for (int i = 0; i < arrayList.size(); i++){
                System.out.println(arrayList.get(i));
            }

        // 리스트의 모든 값을 출력해주세요.
        // 출력 결과 : 3, 2, 1, 0



        사람 사람1 = new 사람(20 , "길동");
        사람 사람2 = new 사람(25 , "길순");
        사람 사람3 = new 사람(12 , "길홍");
        사람 사람4 = new 사람(84 , "길빵");
        사람 사람5 = new 사람(65 , "길풍");

        //네 사름을 ArrayList에 저장
        //사람을 자기소계 시키기
        //20 대인 사람 자기소개시키기
        ArrayList<사람> 사람들 = new ArrayList<>();

        사람들.add(사람1);
        사람들.add(사람2);
        사람들.add(사람3);
        사람들.add(사람4);
        사람들.add(사람5);

        for (int i = 0 ; i< 사람들.size(); i++){
            사람들.get(i).introduce();
        }
         for (int i = 0 ; i< 사람들.size(); i++){
             if (사람들.get(i).getAge() >= 20 && 사람들.get(i).getAge() < 30) {
                 사람들.get(i).introduce();
            }
        }


    }
}


class 사람 {


    private int age;
    private String name;

    사람(int age , String name) {
        this.age = age;
        this.name = name;
    }

     void introduce(){
        System.out.printf("안녕하세요 %d 살 %s 입니다.\n",age,name);
    }
    int getAge(){
        return this.age;
    }

    String getName(){
        return this.name;
    }
}