package org.Aamir.telusko.SB.ProjWeb1.TeluskoWebMVCSBTutorial;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomepageController {
    @RequestMapping("/h1")
    public String showHomepage(){
        return "index.jsp";
    }
}
