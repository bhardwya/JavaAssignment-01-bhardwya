package com.assignment1.bhardwya.bhardwyaassignment01;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GameController {
    private Game game;

    public GameController() {
        game = new Game();
    }

    @GetMapping("/")
    public String play(Model model) {
        model.addAttribute("boxes", game.getBoxes());
        return "play";
    }

    @PostMapping("/result")
    public String result(@RequestParam("box") int boxIndex, Model model) {
        game.selectBox(boxIndex);
        model.addAttribute("selectedBox", game.getSelectedBox());
        model.addAttribute("boxes", game.getBoxes());
        return "result";
    }
}
