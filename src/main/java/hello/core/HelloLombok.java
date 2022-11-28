package hello.core;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * 롬북 테스트 코드
 */
@Getter
@Setter
@ToString
public class HelloLombok {
    private String name;
    private int age;

    public static void main(String[] args) {
        HelloLombok helloLombok = new HelloLombok();
        helloLombok.setAge(20);

        System.out.println("helloLombok = " + helloLombok);

    }
}
