import static java.lang.System.*;

public class BubbleSort {
    public static void main(String[] args) {
        int[] intArr = new int[10];

        for (int i = 0; i < intArr.length; i++) {
            out.print(intArr[i] = (int) (Math.random() * 10));
        }
        out.println();

        for (int i = 0; i < intArr.length; i++) {
            boolean changed = false; // 자리바꿈이 발생했는지를 체크
            // 버블 정렬은 가장 큰 값이 배열 맨 뒤로 옮겨가고 정리가 끝나기 때문에 정리가 끝난 i 만큼 swap(교환)하지 않아도 된다.
            for (int j = 0; j < intArr.length - 1 - i; j++) {
                if (intArr[j] > intArr[j + 1]) {
                    int tmp = intArr[j];
                    intArr[j] = intArr[j + 1];
                    intArr[j + 1] = tmp;
                    changed = true;
                } // end if
            } // end for j
            for (int k = 0; k < intArr.length; k++)
                out.print(intArr[k]);
            out.println();
            if (!changed)
                break;
        } // end for i
    }
}
