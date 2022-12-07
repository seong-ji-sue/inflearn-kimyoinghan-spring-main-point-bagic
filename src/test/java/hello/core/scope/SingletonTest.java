package hello.core.scope;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Scope;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class SingletonTest {
    @Test
    void singletonBeanFind() {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(SingleBean.class);
        SingleBean singleBean1 = ac.getBean(SingleBean.class);
        SingleBean singleBean2 = ac.getBean(SingleBean.class);

        System.out.println("singleBean1 = " +singleBean1);
        System.out.println("singleBean2 = " +singleBean2);
        Assertions.assertThat(singleBean1).isSameAs(singleBean2);

        ac.close();

    }

    @Scope("singleton")
    static class SingleBean {
        @PostConstruct
        public void init() {
            System.out.println("SingleBean.init");
        }

        @PreDestroy
        public void destroy() {
            System.out.println("SingleBean.destroy");
        }
    }
}
