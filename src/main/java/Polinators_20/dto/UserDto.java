package Polinators_20.dto;

import Polinators_20.model.UserAddress;
import lombok.Data;

@Data
public class UserDto {

    private Integer id;

    private String firstName;

    private String name;

    private UserAddress userAddress;

    private String userName;

    private String emailAddress;
}
