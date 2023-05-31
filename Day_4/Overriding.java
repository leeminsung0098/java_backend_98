package Day_4;

public class Overriding {
    public static void main(String[] args) {

        MaxLimitCalculator cal = new MaxLimitCalculator();
        cal.add(50);  // 50 더하기
        cal.add(60);  // 60 더하기
        System.out.println(cal.getValue());  // 100 출력


    }
}
// 단 MaxLimitCalculator 클래스는 반드시 다음의 Calculator 클래스를 상속해서 만들어야 한다.


class MaxLimitCalculator extends Calculator{

int limit = 100;


    void add(int val) {
        if (this.value + val > limit) {
            this.value = limit;
        } else {
            super.add(val);
        }
    }

}


class Calculator {
    int value;

    Calculator() {
        this.value = 0;
    }

    void add(int val) {
        this.value += val;
    }

    int getValue() {
        return this.value;
    }
}



