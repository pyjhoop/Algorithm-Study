package practice.sort;

import java.util.Arrays;

/*
 * [문제 1] 배열 오름차순 정렬
 *
 * 정수 배열이 주어진다. 이 배열을 오름차순(작은 값 -> 큰 값)으로 정렬하여 출력하시오.
 *
 * 입력:
 *   int[] nums = {5, 2, 8, 1, 9, 3, 7, 4, 6};
 *
 * 출력 예시:
 *   [1, 2, 3, 4, 5, 6, 7, 8, 9]
 *
 * 조건:
 *   - Arrays.sort() 를 사용한다.
 *   - 시간 복잡도는 O(N log N) 을 만족해야 한다.
 */
public class ArrayAscending {

    public static void main(String[] args) {
        int[] nums = {5, 2, 8, 1, 9, 3, 7, 4, 6};

        // TODO: 여기에 정렬 코드를 작성하세요.
        Arrays.sort(nums);

        System.out.println(Arrays.toString(nums));
    }
}
