package meetup.controller;

import meetup.dao.IssueDao;
import meetup.model.Issue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by szlizarrrr on 4/23/16.
 */

@Controller
public class IssueController {

    @Autowired
    private IssueDao issueDao;

    @RequestMapping("/destory")
    public String issueDestory(@RequestParam(value = "id") long id){
        issueDao.delete(id);
        return "redirect:/";
    }

    @RequestMapping("/newissue")
    public String issueNew(Model model){
        model.addAttribute("issue", new Issue());
        return "newissue";
    }

    @RequestMapping("/create")
    public String issueCreate(Issue issue){
        issueDao.save(issue);
        return "redirect:/";
    }
}
