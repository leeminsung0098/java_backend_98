import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {

        System.out.println("중복있는 로또");
        for(int i = 1; i < 6 ; i++){
            ArrayList<Integer> lotto =new ArrayList<>();
            System.out.printf("%d 회 [",i);
            for(int j = 0 ; j < 6; j++){
                lotto.add((int)(Math.random()*44));
                // math.random 은 0부터 1미만의 숫자를 생성한다 괄호를 안쓰고 연산하면 0 x 10 을 계속 연산하므로 0만 나온다. 그래서 10을 먼저 곱해준다.
            }
            System.out.println(lotto.toString());
        }




        System.out.println("중복없는 로또");
        int idx_num = 0;
        int lotto_num[] = new int[6];

        String result_text = "";

        for(int i = 1 ; i <= 30; i++){
            result_text = "";
            result_text += idx_num + 1 + "회 : [";  // result_txt = 1씩증가하는 숫자 + 회 : [

            for(int j = 0; j <= 5; j++){
                int num_temp = (int)(Math.random()*44+1); //Math.random()은 0부터 1미만 생성. > *44 > 0~44츨력 > +1(45까지를 출력하기 위함.) > 소수점 제거.
                lotto_num[j] = num_temp;  // 6번 작동  lotto_num 안에 6개의 숫자가 들어간다.
            }
            Arrays.sort(lotto_num); // 유니코드순으로 정렬해준다. << 변수등을 유니코드 반환 << 정렬해준다 , 문자나 숫자만 넣을수있다
            boolean duple = false;  // 중복 숫자 지우는 코드;
            for(int k = 0; k < lotto_num.length ; k++){ // 0 1 2 3 4 5 , 6은 실행 x
                if(k == lotto_num.length - 1){ // 0번 부터 출력하므로 -1해준다  0 1 2 3 4 5 lotto_num은 6자리 배열이므로.
                    result_text += lotto_num[k] +"]";
                } else if (lotto_num[k]!= lotto_num[k+1]) {  //<< 유니코드로 정렬되어있으니 중복 숫자가 겹칠경우 나란히 배열됨 ex) [1,1,2,2,3,3] 그러므로 lotto_num[k+1]을 쓴다.
                    result_text += lotto_num[k] + ".\t"; // 공백수 맞추기 {탭}
                }else{
                    duple = true;
                }
            }
            if(idx_num==5)break;
            if(duple == false){
                idx_num++;
                System.out.println(result_text);
            }
        }







    }
}