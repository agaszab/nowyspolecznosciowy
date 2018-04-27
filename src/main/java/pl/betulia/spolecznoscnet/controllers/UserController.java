package pl.betulia.spolecznoscnet.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import pl.betulia.spolecznoscnet.mod.User;
import pl.betulia.spolecznoscnet.repositories.UserRepository;
import pl.betulia.spolecznoscnet.repositories.UserRoleRepository;

import java.security.Principal;

@Controller
public class UserController {


    private UserRepository userRepository;
    private UserRoleRepository userRoleRepository;
    Main main = new Main(userRepository);

    public UserController(UserRepository userRepository, UserRoleRepository userRoleRepository) {
        this.userRepository = userRepository;
        this.userRoleRepository = userRoleRepository;
    }




    @GetMapping("/profil")
    public String profil (Model model, Principal principal, @RequestParam int doProfilu){
        User user=main.getUser(model, principal);
        if(user!=null) {
            model.addAttribute("doProfilu", doProfilu);
            model.addAttribute("user", user);
            return "redirect:/index?strona=profil";
        } else return "/login";

    }


}
