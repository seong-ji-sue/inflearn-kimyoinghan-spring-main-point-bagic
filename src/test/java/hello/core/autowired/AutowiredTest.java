package hello.core.autowired;

import hello.core.member.Member;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.lang.Nullable;

import java.util.Optional;

/**
 * 옵션 처리에 대한 테스트 코드입니다.
 */
public class AutowiredTest {

    @Test
    void AutowiredOption() {
        ApplicationContext ac = new AnnotationConfigApplicationContext(TestBean.class);
    }

    static class TestBean{

        //호출이 않됨
        @Autowired(required = false)
        public void setNoBean1(Member noBean1) {
            System.out.println("noBean1"+ noBean1);
        }

        //호출은 되고 싶은데 null
        @Autowired
        public void setNoBean2(@Nullable Member noBean2) {
            System.out.println("noBean2"+ noBean2);
        }

        //없으면 empty
        @Autowired
        public void setNoBean3(Optional<Member> noBean3) {
            System.out.println("noBean3"+ noBean3);
        }
    }
}
