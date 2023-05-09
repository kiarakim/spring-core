package hello.core;

import hello.core.discount.FixDiscountPolicy;
import hello.core.member.MemberService;
import hello.core.member.MemberServiceImpl;
import hello.core.member.MemoryMemberRepository;
import hello.core.order.OrderService;
import hello.core.order.OrderServiceImpl;

//전체를 설정하고 구성
public class AppConfig {
	public MemberService memberService(){
		return new MemberServiceImpl(new MemoryMemberRepository());
	}

	public OrderService orderService(){
		return new OrderServiceImpl(new MemoryMemberRepository(), new FixDiscountPolicy());
	}
}
