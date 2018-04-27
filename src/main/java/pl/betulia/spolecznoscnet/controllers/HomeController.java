package pl.betulia.spolecznoscnet.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import pl.betulia.spolecznoscnet.mod.User;
import pl.betulia.spolecznoscnet.repositories.UserRepository;
import pl.betulia.spolecznoscnet.repositories.UserRoleRepository;

import java.security.Principal;

@Controller
public class HomeController {

    private UserRepository userRepository;
    private UserRoleRepository userRoleRepository;
    Main main = new Main(userRepository);

    public HomeController(UserRepository userRepository, UserRoleRepository userRoleRepository) {
        this.userRepository = userRepository;
        this.userRoleRepository = userRoleRepository;
    }

    @GetMapping("/")
    public String start(Principal principal, Model model, @RequestParam(value = "strona", defaultValue = "glowna") String strona) {

        if (principal!=null) {
            User user=main.getUser(model,principal);
            model.addAttribute("user", user);
        }
        if (strona.equals("rejestracja")) {
            model.addAttribute("user", new User());
        }

        model.addAttribute("str", strona);
        return "index";
    }



    @GetMapping("/index")
    public String main(Principal principal, Model model, @RequestParam(value = "strona", defaultValue = "glowna") String strona) {

        if (principal!=null) {
            User user= main.getUser(model,principal);
            model.addAttribute("user", user);
        }
        if (strona.equals("rejestracja")) {
            model.addAttribute("user", new User());
        }

        model.addAttribute("str", strona);
        return "index";
    }


    @PostMapping("/login")
    public String logowanie(Model model, Principal principal) {
        String login = principal.getName();
        User user = userRepository.findByUsername(login);
        if (user != null) {
            String strona="witaj";
            model.addAttribute("user", user);
            model.addAttribute("str", strona);
        } return "users/index";

    }

    @GetMapping("/logout")
    public String logoutme(Model model) {
        model.addAttribute("user", null);
        return "redirect:/";
    }


    @GetMapping("/szkielet")
    public String szkielet() {

        return "szkielet";
    }

}
