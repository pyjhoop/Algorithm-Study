package practice.sort;

import java.util.*;

/*
 * [문제 4] 리스트(List) 내림차순 정렬
 *
 * 정수 리스트가 주어진다. 이 리스트를 내림차순(큰 값 -> 작은 값)으로 정렬하여 출력하시오.
 *
 * 입력:
 *   List<Integer> numbers = new ArrayList<>(Arrays.asList(
 *       30, 10, 50, 20, 40, 60, 5
 *   ));
 *
 * 출력 예시:
 *   [60, 50, 40, 30, 20, 10, 5]
 *
 * 조건:
 *   - Collections.reverseOrder() 사용하는 방법
 *   - 람다식 (a, b) -> b - a 사용하는 방법
 *   - Comparator.reverseOrder() 사용하는 방법
 *   세 가지를 모두 시도해본다.
 */
public class ListDescending {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(
                30, 10, 50, 20, 40, 60, 5
        ));

        // TODO: 여기에 내림차순 정렬 코드를 작성하세요.
//        numbers.sort(Comparator.reverseOrder());
//        Collections.sort(numbers, Collections.reverseOrder());
        numbers = numbers.stream().sorted().toList();

        System.out.println(numbers);
    }
}
