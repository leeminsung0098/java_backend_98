package Day8;

public class Week2_test {
    public static void main(String[] args) {
// 문제 : 아래와 같이 출력되도록 해주세요. init() 메세드에 의해서 출력되어야 합니다.
// 조건 : 사람 클래스의 생성자는 사용할 수 없습니다, 동물 클래스를 수정하여 문제를 풀어주세요.
// 힌트 : 모든 생성자는 자신의 일을 하기 전에 super(); 부터 실행합니다.
// 힌트 : 모든 생성자는 자신의 일을 하기 전에 부모클래스의 생성자 부터 실행합니다.

        new 사람12();
        // 출력 : 사람이 초기화 됩니다.

    }
}


class 동물 {
    // 수정가능지역 시작
    동물(){
        init();
    }
    void init(){}
    // 수정가능지역 끝
}

class 사람12 extends 동물 {
    void init() {
        System.out.println("사람이 초기화 됩니다.");
    }
}