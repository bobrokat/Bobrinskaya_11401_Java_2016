package Task015;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.portlet.ModelAndView;

/**
 * Created by Ekaterina on 18.03.2016.
 */

@Controller
@SessionAttributes("result")
@RequestMapping("/process")
public class ProcessController {

    @RequestMapping(method = RequestMethod.POST)
    public String postprpcess( @RequestParam String operation, @RequestParam String text){


        ModelAndView modelAndView = new ModelAndView();
        switch (operation){
            case "paragraph":
                String [] paragraphs = text.split("\n");
                modelAndView.addObject("result", paragraphs.length);
                break;

            case "words":
                String[] words = text.split(" ");
                modelAndView.addObject("result", words.length);
                break;

            case "character":
                modelAndView.addObject("result", text.length());
                break;

            case "sentences":
                String[] sentences = text.split(".");
                modelAndView.addObject("result", sentences.length);
        }

        return "redirect:/result";

    }

    @RequestMapping(method = RequestMethod.GET)
    public String getProcess(){
        return "process";
    }


}
