package Polinators_20.mapper;


import Polinators_20.dto.UserDto;
import Polinators_20.model.User;
import Polinators_20.model.UserAddress;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class UserMapper {

    public static UserDto mapEntityToDto(User userEntity) {

        UserDto dto = new UserDto();
        dto.setId(userEntity.getId());
        dto.setFirstName(userEntity.getFirstName());
        dto.setName(userEntity.getName());
        dto.setEmailAddress(userEntity.getEmailAddress());
        dto.setUserName(userEntity.getUserName());
        dto.setUserAddress(userEntity.getUserAddress());

        return dto;
    }

    public static List<UserDto> mapEntityToDto(List<User> entities) {

        List<UserDto> dtos = new ArrayList<>();

        for (User user : entities) {
            dtos.add(mapEntityToDto(user));
        }

        return dtos;
    }

    public static void mapToEntity(Integer Id, String firstName, String name, String emailAddress, String userName, UserAddress userAddress) {

        User user = new User();
        user.setId(Id);
        user.setFirstName(firstName);
        user.setName(name);
        user.setEmailAddress(emailAddress);
        user.setUserName(userName);
        user.setUserAddress(userAddress);
    }
}
