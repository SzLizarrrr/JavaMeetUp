package meetup.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by EggiFace on 7/6/2017.
 */

@Controller
public class LoginController {

    @RequestMapping("/login")
    public String login() {
        return "login";
    }
}
