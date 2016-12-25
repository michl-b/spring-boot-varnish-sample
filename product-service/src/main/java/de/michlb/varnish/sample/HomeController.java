package de.michlb.varnish.sample;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by mbart on 23.12.2016.
 */
@Controller
public class HomeController {

    @RequestMapping("/")
    public String onShow() {
        return "index";
    }
}
