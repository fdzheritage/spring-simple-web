package hello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
// import org.springframework.web.bind.annotation.RestController;
// import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {

    @GetMapping("/home")
    public String home(Model model) {
        return index(model);
    }

    @GetMapping("/")
    public String index(Model model) {
        Page page = new Page("Home", "Greetings from Spring Boot!");
        return addToModel(model, page);
    }

    @GetMapping("/about")
    public String about(Model model) {
        Page page = new Page("About Us", "We are the best of the best");
        return addToModel(model, page);
    }

    @GetMapping("/contact")
    public String contact(Model model) {
        Page page = new Page("Contact Us", "Don't contact us with stupid questions");
        return addToModel(model, page);
    }
    
    @GetMapping("/gallery")
    public String gallery(Model model) {
        Page page = new Page("Gallery", "Your pictures go here");
        return addToModel(model, page);
    }
    
    @GetMapping("/greeting")
    public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        return "greeting";
    }

    private String addToModel(Model model, Page page ) {
        model.addAttribute("title", page.getTitle());
        model.addAttribute("content", page.getContent());
        return "default";
    }

}