package Task015;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

/**
 * Created by Ekaterina on 18.03.2016.
 */
@Controller
@SessionAttributes("result")
@RequestMapping("/result")
public class ResultController {
    @RequestMapping(method = RequestMethod.GET)
    public String getResult(ModelMap modelMap, @ModelAttribute String result) {

        modelMap.put("result", result);
        return "result";

    }
}
