package packet;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

@Controller
public class eneController {

    @RequestMapping(value = "/ene/", method = RequestMethod.GET)
    public String addContactGet(final Model model, Saving fileReader1) {
        return "ene";
    }

    @RequestMapping(value = "/ene/", method = RequestMethod.POST)
    public String addContactPost(final Model model, @Valid Saving fileReader1) {

        FileReader fileReader = new FileReader();

        try {
            fileReader.saveSaving(fileReader1);
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return "redirect:/";
    }

}
