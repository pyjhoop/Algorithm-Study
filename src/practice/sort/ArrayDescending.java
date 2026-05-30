package practice.sort;

import java.util.Arrays;
import java.util.Collections;

/*
 * [문제 2] 배열 내림차순 정렬
 *
 * 정수 배열이 주어진다. 이 배열을 내림차순(큰 값 -> 작은 값)으로 정렬하여 출력하시오.
 *
 * 입력:
 *   Integer[] nums = {5, 2, 8, 1, 9, 3, 7, 4, 6};
 *
 * 출력 예시:
 *   [9, 8, 7, 6, 5, 4, 3, 2, 1]
 *
 * 조건:
 *   - 원시 타입 int[] 가 아닌 Integer[] 를 사용하여 Comparator 를 적용해본다.
 *   - Collections.reverseOrder() 또는 람다식을 사용하여 정렬한다.
 *   - 힌트: Arrays.sort(arr, Comparator);
 */
public class ArrayDescending {

    public static void main(String[] args) {
        Integer[] nums = {5, 2, 8, 1, 9, 3, 7, 4, 6};

        // TODO: 여기에 내림차순 정렬 코드를 작성하세요.
//        Arrays.sort(nums, Collections.reverseOrder());
        negate(nums);
        Arrays.sort(nums);
        negate(nums);

        System.out.println(Arrays.toString(nums));
    }

    static void negate(Integer[] nums) {
        for(int i = 0; i< nums.length; i++) {
            nums[i] = -nums[i];
        }
    }
}
