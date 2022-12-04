package hello.core.scope;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Scope;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class PrototypeTest {
    @Test
    void protoTypeBeanFind() {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(PrototypeBean.class);
        System.out.println("find protoTypeBean1");
        PrototypeBean prototypeBean1 = ac.getBean(PrototypeBean.class);
        System.out.println("find protoTypeBean2");
        PrototypeBean prototypeBean2 = ac.getBean(PrototypeBean.class);
        System.out.println("prototypeBean1 = " +prototypeBean1);
        System.out.println("prototypeBean2 = " +prototypeBean2);
        Assertions.assertThat(prototypeBean1).isNotSameAs(prototypeBean2);

        //직접 호출해줘야 함
        prototypeBean1.destroy();
        prototypeBean2.destroy();
        ac.close();//호출 안됨
    }

    @Scope("singleton")
    static class PrototypeBean {
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
