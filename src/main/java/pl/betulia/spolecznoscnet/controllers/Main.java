package pl.betulia.spolecznoscnet.controllers;

import org.springframework.ui.Model;
import pl.betulia.spolecznoscnet.mod.User;
import pl.betulia.spolecznoscnet.repositories.UserRepository;

import java.security.Principal;

public class Main {

    private UserRepository userRepository;

    public Main(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    public User getUser(Model model, Principal principal) {

        if(principal!=null)
        {
            String login = principal.getName();
            User user = userRepository.findByUsername(login);
            if (user != null) {
                model.addAttribute("user", user);
            }
            return user;
        }
        return null;
    }

}
