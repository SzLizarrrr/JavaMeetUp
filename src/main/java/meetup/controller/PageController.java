package meetup.controller;

import meetup.repository.IssueCrudRepository;
import meetup.model.Issue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 * Created by szlizarrrr on 4/2/16.
 */

@Controller
public class PageController {

    @Autowired
    private IssueCrudRepository issueCrudRepository;

    @RequestMapping("/home")
    public String homePage(Model model) {
        Iterable<Issue> issues = issueCrudRepository.findAll();
        model.addAttribute("issues", issues);
        return "home";
    }

    @RequestMapping("/about")
    public String aboutPage() {
        return "about";
    }

    @RequestMapping("/issue")
    public String issuePage(@RequestParam(value = "id") long id, Model model) {
        model.addAttribute("issue", issueCrudRepository.findOne(id));
        return "issue";
    }
}
