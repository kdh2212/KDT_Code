package chap05_2;

/*
 * DTO는 Bean으로 등록할 필요가 없다.  
 * 이 Member 클래스는 Bean 여기서는 Component를 할 필요가 없다.
 */
import java.time.LocalDateTime;

import org.springframework.stereotype.Component;


public class Member {

	private Long id;
	private String email;
	private String password;
	private String name;
	private LocalDateTime registerDateTime;

	public Member(String email, String password, 
			String name, LocalDateTime regDateTime) {
		this.email = email;
		this.password = password;
		this.name = name;
		this.registerDateTime = regDateTime;
	}

	void setId(Long id) {
		this.id = id;
	}

	public Long getId() {
		return id;
	}

	public String getEmail() {
		return email;
	}

	public String getPassword() {
		return password;
	}

	public String getName() {
		return name;
	}

	public LocalDateTime getRegisterDateTime() {
		return registerDateTime;
	}

}
