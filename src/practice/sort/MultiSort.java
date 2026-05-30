package practice.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
 * [문제 5] 다중 정렬 (Multi-key Sort)
 *
 * 학생 정보(이름, 국어 점수, 수학 점수, 나이)가 주어진다.
 * 다음 조건을 모두 만족하도록 학생 리스트를 정렬하여 출력하시오.
 *
 *   1순위: 국어 점수 내림차순
 *   2순위: 국어 점수가 같다면 수학 점수 오름차순
 *   3순위: 수학 점수도 같다면 나이 오름차순
 *   4순위: 나이도 같다면 이름 사전순 (오름차순)
 *
 * 입력:
 *   ("Alice",   90, 80, 20)
 *   ("Bob",     85, 95, 22)
 *   ("Charlie", 90, 80, 19)
 *   ("David",   90, 75, 21)
 *   ("Eve",     85, 95, 22)
 *   ("Frank",   90, 80, 19)
 *
 * 출력 예시 (정렬 후):
 *   David   90 75 21
 *   Frank   90 80 19
 *   Charlie 90 80 19
 *   Alice   90 80 20
 *   Bob     85 95 22
 *   Eve     85 95 22
 *
 * 조건:
 *   - Comparator.comparing(...).thenComparing(...) 체이닝 방식을 사용한다.
 *   - 또는 람다식으로 직접 비교 로직을 작성한다.
 */
public class MultiSort {

    static class Student implements Comparable<Student>{
        String name;
        int korean;
        int math;
        int age;

        Student(String name, int korean, int math, int age) {
            this.name = name;
            this.korean = korean;
            this.math = math;
            this.age = age;
        }

        @Override
        public String toString() {
            return String.format("%-8s %d %d %d", name, korean, math, age);
        }

        @Override
        public int compareTo(Student o) {
            if(this.korean == o.korean) {
                if(this.math == o.math) {
                    if(this.age == o.age) {
                        return o.name.compareTo(this.name);
                    }
                    return this.age - o.age;
                }
                return this.math - o.math;
            }
            return o.korean - this.korean;
        }
    }

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>(Arrays.asList(
                new Student("Alice", 90, 80, 20),
                new Student("Bob", 85, 95, 22),
                new Student("Charlie", 90, 80, 19),
                new Student("David", 90, 75, 21),
                new Student("Eve", 85, 95, 22),
                new Student("Frank", 90, 80, 19)
        ));

        // TODO: 여기에 다중 정렬 코드를 작성하세요.
        Collections.sort(students);

        students.forEach(System.out::println);
    }
}
