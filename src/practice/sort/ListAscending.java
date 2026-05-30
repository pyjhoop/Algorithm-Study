package practice.sort;

import java.util.*;

/*
 * [문제 3] 리스트(List) 오름차순 정렬
 *
 * 문자열 리스트가 주어진다. 이 리스트를 사전 순서(오름차순)로 정렬하여 출력하시오.
 *
 * 입력:
 *   List<String> fruits = new ArrayList<>(Arrays.asList(
 *       "banana", "apple", "cherry", "date", "blueberry"
 *   ));
 *
 * 출력 예시:
 *   [apple, banana, blueberry, cherry, date]
 *
 * 조건:
 *   - Collections.sort() 또는 List.sort() 를 사용한다.
 *   - 두 가지 방법 모두 연습해본다.
 */
public class ListAscending {

    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>(Arrays.asList(
                "banana", "apple", "cherry", "date", "blueberry"
        ));

        // TODO: 여기에 오름차순 정렬 코드를 작성하세요.
        // list.sort();
        fruits.sort(Comparator.naturalOrder());
        //Collections.sort();
//        Collections.sort(fruits);

        System.out.println(fruits);
    }
}
