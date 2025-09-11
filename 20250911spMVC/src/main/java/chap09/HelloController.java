package chap09;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import spring.Member;
import spring.MemberDao;

@Controller
public class HelloController {
	
	@Autowired
	private MemberDao memberDao;
	
	
	@GetMapping("/")
	public String main(Model model) {
		
		model.addAttribute("list",memberDao.selectAll());
		return "main";
	}
	
	
	
	@GetMapping("/search")
	public String search(String email,Model model) {
		model.addAttribute("mem",memberDao.selectByEmail(email));
//		Member member = memberDao.selectByEmail(email); 
//		System.out.println(member);
		return "result";
	}
}
