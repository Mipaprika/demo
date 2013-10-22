package com.demo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: jj
 * Date: 13-10-22
 * Time: 上午11:56
 * To change this template use File | Settings | File Templates.
 */
@Controller
public class HomeController {
    @RequestMapping({"/","home"})
    public String showHomePage(Map<String, Object> model){
        model.put("spittles", 1);
        return "home";
    }
}
