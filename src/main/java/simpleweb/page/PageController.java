package simpleweb.page;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.ui.Model;

import simpleweb.page.Page;
import simpleweb.page.PageRepository;

@Controller    
public class PageController {
	@Autowired 
	private PageRepository pageRepository;

    @GetMapping(path="/") 
    public String showHome(Model model) {
        return showPage("home", model);
    }

	@GetMapping(path="/{pageKey}") 
	public String showPage ( @PathVariable("pageKey") String pageKey, Model model) {
        Page page = pageRepository.findByPageKey(pageKey);
        if ( page == null) {
            page = new Page("Not Found", "Page not found");
        }
		return addToModel(model, page);
	}
    
    private String addToModel(Model model, Page page ) {
        model.addAttribute("title", page.getTitle());
        model.addAttribute("content", page.getContent());
        return "default";
    }
}