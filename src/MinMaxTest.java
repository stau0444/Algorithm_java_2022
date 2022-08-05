public class MinMaxTest {
    public static void main(String[] args) {
        int [] a = {10,55,23,2,79,101,16,82,30,45,1};
        int min = a[0];
        int max = a[0];
        int minPos = 0;
        int maxPos = 0;
        for (int i=1 ; i<a.length; i++){
            if (a[i]>max){
                max = a[i];
                maxPos= i+1;
            }
            if(a[i]<min){
                min = a[i];
                minPos=i+1;
            }
        }
        System.out.println("max = " + max +",position:" + maxPos);
        System.out.println("min = " + min +",position:" + minPos);
    }
}
