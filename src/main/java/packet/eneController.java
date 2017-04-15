package packet;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

@Controller
public class eneController {

    @RequestMapping("/ene/")
    public String index(Model model) {
        FileReader fileReader = new FileReader();

        try {
            Saving i = fileReader.getSaving();
            model.addAttribute("strings", i);
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return "ene";
    }

    @RequestMapping(value = "/2/", method = RequestMethod.POST)
    public String addContactPost(final Model model, @Valid Saving fileReader1) {

        FileReader fileReader = new FileReader();

        try {
            Saving i = fileReader.getSaving();

            Saving saving = FileReader.getSaving();
            saving.setDen(saving.getDen() - 50);
            saving.setEne(saving.getEne() + 20);
            saving.setHap(saving.getHap() + 3);
            saving.setPr(saving.getPr() + 20);
            saving.setPr2(saving.getPr2() + 400);
            saving.setPr3(saving.getPr3() + 700);
            saving.setPr4(saving.getPr4() + 900);
            FileReader.saveSaving(saving);

            model.addAttribute("strings", i);
        } catch (Exception ex) {
            ex.printStackTrace();
        }



        return "redirect:/";
    }

}
