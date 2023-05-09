package hello.core.member;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MemberServiceTest {

	MemberService memberService = new MemberServiceImpl(new MemoryMemberRepository());

	@Test
	void join() {
		// given
		Member member = new Member(1L, "memberA", Grade.VIP);

		// when
		memberService.join(member);
		final Member findMember = memberService.findMember(1L);

		// then
		assertThat(member).isEqualTo(findMember);
	}

	@Test
	void findMember() {
		// given
		final long id = 1L;
		final String name = "memberA";
		Member member = new Member(id, name, Grade.VIP);
		memberService.join(member);

		// when
		final Member findMember = memberService.findMember(id);

		// then
		assertThat(name).isEqualTo(findMember.getName());
	}
}
