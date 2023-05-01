package hello.core.member;

public class Member {
	private long id;
	private String name;
	private Grade grade;

	public Member(final long id, final String name, final Grade grade) {
		this.id = id;
		this.name = name;
		this.grade = grade;
	}

	public long getId() {
		return id;
	}

	public void setId(final long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(final String name) {
		this.name = name;
	}

	public Grade getGrade() {
		return grade;
	}

	public void setGrade(final Grade grade) {
		this.grade = grade;
	}
}
