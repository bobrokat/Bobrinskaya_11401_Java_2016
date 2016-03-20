package Task014;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by Ekaterina on 09.03.2016.
 */
@Controller
@RequestMapping("/calc")
public class CalcController {
    @RequestMapping(method = RequestMethod.GET)
    public String hiPage(ModelMap model, @RequestParam double first, @RequestParam String operation, @RequestParam double second) {
        model.put("first", first);
        model.put("second", second);
        double result;
        switch (operation) {
            case "-":
                result = first - second;
                model.put("result", result);
                model.put("operation", operation);
                break;
            case "add":
                result = first + second;
                operation = "+";
                model.put("operation", operation);
                model.put("result", result);
                break;
            case "*":
                result = first * second;
                model.put("operation", operation);
                model.put("result", result);
                break;
            case "/":
                result = first / second;
                model.put("operation", operation);
                model.put("result", result);
                break;

        }

        return "calc";
    }


}
