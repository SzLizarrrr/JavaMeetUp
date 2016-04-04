package meetup.controller;

import meetup.model.Issue;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by szlizarrrr on 4/2/16.
 */

@Controller
public class PageController {

    @RequestMapping("/home")
    public String home(Model model){
        List<Issue> issues = new ArrayList<Issue>();
        issues.add(new Issue("Java 热爱者", 5));
        issues.add(new Issue("崇拜者", 7));
        model.addAttribute("issues", issues);
        return "home";
    }

    @RequestMapping("/about")
    public String about(){
        return "about";
    }
}
