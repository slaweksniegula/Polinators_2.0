package Polinators_20.controller;

import Polinators_20.dto.CreateUserDto;
import Polinators_20.model.User;
import Polinators_20.repository.UserActionRepository;
import Polinators_20.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Validator;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class RegistrationController {

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    UserActionRepository userActionRepository;

    @Autowired
    UserServiceImpl userService;

    @Autowired
    @Qualifier("userPasswordValidator")
    private Validator validator;

    @InitBinder
    private void InitBinder(WebDataBinder binder){
        binder.setValidator(validator);
    }

    @RequestMapping("/register")
    public String register(Model model){
        model.addAttribute("user", new CreateUserDto());
        return "register";
    }


    @GetMapping("/register")
    public String register(@ModelAttribute("user") @Validated CreateUserDto createUserDto, BindingResult bindingResult, Model model){

        if (bindingResult.hasErrors()){
            return "register";
        }

        userService.saveUser(createUserDto);

        return "redirect:/login";
    }
}
