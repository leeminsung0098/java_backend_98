package Day3;

import java.io.IOException;

public class Input {
    public static void main(String[] args) {
        // 표준 입력.
        try {
            int num = System.in.read();

            System.out.println(num);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
