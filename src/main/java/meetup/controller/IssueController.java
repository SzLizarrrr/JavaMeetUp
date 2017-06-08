package meetup.controller;

import meetup.repository.IssueCrudRepository;
import meetup.model.Issue;
import meetup.service.IssueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;

/**
 * Created by szlizarrrr on 4/23/16.
 */

@Controller
public class IssueController {

    @Resource
    private IssueService issueService;

    @RequestMapping("/destory")
    public String issueDestory(@RequestParam(value = "id") long id){
        issueService.delete(id);
        return "redirect:/";
    }

    @RequestMapping("/newissue")
    public String issueNew(Model model){
        model.addAttribute("issue", new Issue());
        return "newissue";
    }

    @RequestMapping("/create")
    public String issueCreate(Issue issue){
        issueService.save(issue);
        return "redirect:/";
    }
}
