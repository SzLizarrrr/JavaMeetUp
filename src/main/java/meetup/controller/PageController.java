package meetup.controller;

import meetup.dao.IssueDao;
import meetup.model.Issue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
    public String homePage(Model model){
        Iterable<Issue> issues = issueDao.findAll();
        model.addAttribute("issues", issues);
        return "home";
    }

    @RequestMapping("/about")
    public String aboutPage(){
        return "about";
    }

    @RequestMapping("/issue")
    public String issuePage(@RequestParam(value = "id") long id, Model model){
        model.addAttribute("issue", issueDao.findOne(id));
        return "issue";
    }

    @RequestMapping("/destory")
    public String issueDestory(@RequestParam(value = "id") long id){
        issueDao.delete(id);
        return "redirect:/";
    }
}
