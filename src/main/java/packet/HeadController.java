package packet;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class HeadController {

    @RequestMapping("/")
    public String index(Model model) {
        FileReader fileReader = new FileReader();

        try {
            Saving i = fileReader.getSaving();
            model.addAttribute("strings", i);
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return "index";
    }

}
