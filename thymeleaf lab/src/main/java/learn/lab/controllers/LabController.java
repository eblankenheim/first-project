package learn.lab.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;
import java.util.Random;

@Controller
public class LabController {

    private final Random random = new Random();
    private final List<String> encouragements = List.of(
            "You can do it!",
            "Keep at it!",
            "I believe in you!",
            "You're the best!",
            "You smell nice.",
            "Wow. Cute outfit.",
            "Don't stop now!",
            "You. Are. Enough.",
            "You've done so much work! Keep going.",
            "You're nice.",
            "You're fast.",
            "You're smart.",
            "You're kind.",
            "Thank you so much.",
            "You look like you've lost weight.",
            "Did you get your hair cut? Cute!",
            "Great job today!",
            "You're killing it over there.",
            "Wow, that's impressive.",
            "I really, really love your work."
    );

    @GetMapping("/")
    public String getHome() {
        return "index";
    }

    @GetMapping("/encouragement")
    public String getEncouragement(Model model) {

        String encouragement = getRandomEncouragement();

        model.addAttribute("encouragement", encouragement);
        return "encouragement";
    }

    private String getRandomEncouragement() {
        int index = random.nextInt(encouragements.size());
        String encouragement = encouragements.get(index);
        return encouragement;
    }

    @GetMapping("/personal/encouragement")
    public String getPersonalEncouragement() {

        return "personal-encouragement";
    }

    @PostMapping("/personal/encouragement")
    public String getPersonalEncouragement(String name, Model model) {
        String encouragement = getRandomEncouragement();
        model.addAttribute("encouragement", encouragement);
        model.addAttribute("name", name);
        return "personal-encouragement";
    }
    @GetMapping("/tip")
    public String getTip(Model model) {
        model.addAttribute("displayForm", true);
        return "tip";
    }
    @PostMapping("/tip")
    public String getTip(double total, int percent, Model model) {
        model.addAttribute("total", total);
        model.addAttribute("percent", percent);
        BigDecimal tipAmount = BigDecimal.ZERO;
        tipAmount = BigDecimal.valueOf(total * (percent * .01)).setScale(2,RoundingMode.HALF_UP);
        model.addAttribute("tipAmount", tipAmount);
        model.addAttribute("displayForm", false);
        return "tip";
    }
    @GetMapping("/color")
    public String getColor() {
        return "color";
    }
    @GetMapping("/math")
    public String getMath() {
        return "math";
    }
    @GetMapping("/hockey")
    public String getHockey() {
        return "hockey";
    }

}
