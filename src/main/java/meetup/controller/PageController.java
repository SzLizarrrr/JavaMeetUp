package meetup.controller;

import meetup.dao.IssueDao;
import meetup.model.Issue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
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

    @Autowired
    private IssueDao issueDao;

    @RequestMapping("/home")
    public String home(Model model){
        List<Issue> issues = new ArrayList<Issue>();
        for(Issue issue : issueDao.findAll()){
            issues.add(issue);
        }
        model.addAttribute("issues", issues);
        return "home";
    }

    @RequestMapping("/about")
    public String about(){
        return "about";
    }
}