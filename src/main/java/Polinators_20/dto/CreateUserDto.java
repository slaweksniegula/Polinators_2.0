package Polinators_20.dto;

import Polinators_20.model.BeeHives;
import Polinators_20.model.UserAddress;
import lombok.Data;

import java.util.List;

@Data
public class CreateUserDto {

    private String firstName;

    private String name;

    private UserAddress userAddress;

    private String userName;

    private String emailAddress;

    private String password;

    private String passwordConfirmation;

    private List<BeeHives> beeHives;


}
