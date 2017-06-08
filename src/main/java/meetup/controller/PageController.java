package meetup.controller;

import meetup.domain.Issue;
import meetup.service.IssueService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * Created by szlizarrrr on 4/2/16.
 */

@Controller
public class PageController {

    private static Logger log = LoggerFactory.getLogger(PageController.class);

    @Resource
    private IssueService issueService;

    @RequestMapping("/home")
    public String homePage(Model model) {
        log.debug("读取首页");
        Iterable<Issue> issues = issueService.findAll();
        model.addAttribute("issues", issues);
        return "home";
    }

    @RequestMapping("/about")
    public String aboutPage() {
        return "about";
    }

    @RequestMapping("/issue")
    public String issuePage(@RequestParam(value = "id") long id, Model model) {
        model.addAttribute("issue", issueService.findOne(id));
        return "issue";
    }
}
