import javax.lang.model.SourceVersion;

public class FindNumBinary {
    public static void main(String[] args) {
        /*
             풀이
            * 가운데 처음 끝을 변수로 두고 찾는 수가 가운데에서 크거나 작을경우를 비교하여
            * 가운데 처음 끝을 조정해주며 찾는다
            * 이진탐색이 활용되며 O(logN)만큼의 수행시간이 걸린다.
         */
        // 정렬된 아래의 배열에서 원하는  숫자를 이진트리방식을 사용해 찾아라.
        int [] numbers = {12,25,31,48,54,66,70,83,95,108,120};

        int left = 0;
        int right = numbers.length-1;
        int mid = (right-left)/2;
        System.out.println("mid = " + mid);
        System.out.println("right = " + right);
        System.out.println("left = " + left);
        int target = 48;
        int temp = numbers[mid];
        boolean find = false;
        while (left<=right){
            if(target == temp){
                find = true;
                break;
            }
            if(target < temp){
                right = mid-1;
            }else if(target>temp){
                left = mid+1;
            }

            mid = (right+left)/2;
            temp = numbers[mid];
        }
        if(find){
            System.out.println(target + "은 배열의 " + mid+ "번째 인덱스에 있습니다.");
        }else{
            System.out.println(target+"이 배열에 존재하지 않습니다");
        }


    }
}
