import java.net.SocketTimeoutException;
import java.security.spec.ECParameterSpec;
import java.text.Format;

public class Sorting {
    static class SelectionSort{
        public static void main(String[] args) {
            int [] a = {50,130,80,70,4,100,10,120,60,20,40,30,5};
            int min = a[0];
            int [] b = new int [a.length];
            int bCount = 0;
            int countedNum = 0;
            int j = 0;
            int max =0;
            while(j<a.length){
                for (int i=0; i<a.length; i++) {
                    if(max<a[i]){
                        max = a[i];
                    }
                    if(min > a[i] && a[i] > countedNum){
                        min = a[i];
                    }
                }
                b[bCount] = min;
                countedNum = min;
                bCount++;
                min = max;
                j++;
            }
            for (int i : b) {
                System.out.println("i = " + i);
            }
        }
    }
    static class BubbleSort{
        public static void main(String[] args) {
        //두개씩 비교하여 제일 큰 수를 뒤로 보낸다.
            int [] a = {50,130,80,70,4,100,300,10,120,60,20,40,30,5};
            int first = 0;
            int second = 0;
            int j = 0;
            while (j<a.length){
                for (int i = 0; i<a.length; i++){
                    if(i == a.length-1){
                        break;
                    }
                    if(a[i]<a[i+1]){
                        second = a[i];
                        first = a[i+1];
                    }else {
                        first = a[i];
                        second = a[i+1];
                    }
                    a[i+1]=second;
                    a[i]=first;
                }
                j++;
            }

            for (int i : a) {
                System.out.println("i = " + i);
            }
        }
    }
    static class InsertionSort{
        public static void main(String[] args) {
            //큰수를 뒤로 보내면서 작은 수부터 정렬한다.
            //temp 비교되는 수
            //j temp가 있어야할 자리
            //i 배열의 인덱스
            int [] a = {50,130,80,70,4,100,300,10,120,60,20,40,30,5};

            int k=0;
            int j=0;
            int i=0;
            int temp = a[i];
            for (i=1; i<a.length-1; i++){
                if(a[i]>a[i+1]){
                    temp = temp;
                    a[i] = a[i+1];
                    a[i+1] = temp;
                }
            }
            for (int t : a) {
                System.out.println("t = " + t);
            }
        }
    }
}

