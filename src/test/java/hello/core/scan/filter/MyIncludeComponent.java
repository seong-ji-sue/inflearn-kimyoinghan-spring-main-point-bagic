package hello.core.scan.filter;

import java.lang.annotation.*;

/**
 * 추가를 위한 어노테이션
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface MyIncludeComponent {
}
