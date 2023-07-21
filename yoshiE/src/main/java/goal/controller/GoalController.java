package goal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class GoalController {
	
	@RequestMapping(value="/goalSheet", method=RequestMethod.GET)
	public String goalStartShow(Model model) {
		
		
		return "html/goal/goal";
		
	}
	
	//テストSQL
	@RequestMapping(value="/goalSheet/test", method=RequestMethod.GET)
	public String goalTEST(Model model) {
		
		
		return "html/goal/goal";
		
	}

}
