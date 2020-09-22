package Polinators_20.controller;

import Polinators_20.dto.CreateUserDto;
import Polinators_20.dto.UserDto;
import Polinators_20.mapper.UserMapper;
import Polinators_20.model.User;
import Polinators_20.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller

@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired

    public UserController(UserService useruserService) {
        this.userService = useruserService;
    }


    @GetMapping(value = "/all")
    public String allUsers(Model model) {

        List<User> allUsers = userService.findAll();

        List<UserDto> allUsersDto = UserMapper.mapEntityToDto(allUsers);

        model.addAttribute("all", allUsersDto);

        return "all";

    }

    @GetMapping
    public ResponseEntity<User> findById(@RequestParam Integer id) {
        return ResponseEntity.ok(userService.findUserById(id)
                .orElse(null));
    }
}
