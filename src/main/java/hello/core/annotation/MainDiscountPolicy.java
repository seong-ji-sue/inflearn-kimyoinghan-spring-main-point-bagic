package hello.core.annotation;

import org.springframework.beans.factory.annotation.Qualifier;

import java.lang.annotation.*;

/**
 * 애노테이션 직접 만들기 강의에서 추가한 애노테이션 입니다
 * @Qualifier 애노테이션 작성시 문자열로 지정하면 안되기 때문에
 * 애노테이션을 만들어서 사용합니다.
 */
@Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.TYPE, ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Documented
@Qualifier("mainDiscountPolicy")
public @interface MainDiscountPolicy {

}
