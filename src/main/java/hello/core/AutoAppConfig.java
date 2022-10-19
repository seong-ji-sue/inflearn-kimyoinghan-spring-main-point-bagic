package hello.core;

import hello.core.member.MemberRepository;
import hello.core.member.MemoryMemberRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

/**
 * 컴포넌트 스캔을 위한 AppConfig입니다.
 * @ComponentScan 자동으로 빈을 등록해줌, excludeFilters 뺄꺼 지정 : 어노테이션이 Configuration 붙은거
 * Bean으로 등록 안해도 된다.
 * basePackages 시작 패키지 지정 가능
 * default는 @ComponentScan이 붙은 패키지 기준으로 함
 * 그래서 프로젝트 루트에다가 ComponentScan을 붙여야함(SpringbootApplication도 동일
 */
@Configuration
@ComponentScan(
        basePackages = "hello.core",
        excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Configuration.class)
)
public class AutoAppConfig {

//    // 수동 빈등록과 자동 빈 등록 충돌할 때 예시 상황을 하기 위한 코드입니다.
//    // 수동 빈이 우선권을 갖습니다.
//    @Bean(name="memoryMemberRepository")
//    MemberRepository memberRepository() {
//        return new MemoryMemberRepository();
//    }
}
