package hello.core;

import hello.core.member.Gradle;
import hello.core.member.Member;
import hello.core.member.MemberService;
import hello.core.member.MemberServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 회원 테스트
 */
public class MemberApp {

    public static void main(String[] args) {

//        AppConfig appConfig = new AppConfig();
//        MemberService memberService = appConfig.memberService();

        //ApplicationContext 가 스프링 컨테이너, @Bean을 전부 관리해줌
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

        //빈으로 등록되있는거를 꺼내옴, 첫번째 메서드 이름,
        MemberService memberService = applicationContext.getBean("memberService", MemberService.class);

        Member member = new Member(1L, "memberA", Gradle.VIP);
        memberService.join(member);

        Member findMember = memberService.findMember(1L);

        System.out.println("new member = " + member.getName());
        System.out.println("find member = " + findMember.getName());
    }
}
