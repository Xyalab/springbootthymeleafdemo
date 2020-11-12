package pers.johnx.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ftc")
public class FirstThymeleafController {

    /**
     * 访问http://localhost:8080/first
     * 将数据message填充到templates/index.html
     * @param model
     * @return
     */
    @RequestMapping("/first")
    public String indexPage(Model model){

        String msg = "Hello, thymeleaf!";
        model.addAttribute("msg", msg);
        return "index1";
    }

}
