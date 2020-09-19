package Polinators_20.service;

import Polinators_20.dto.CreateUserDto;
import Polinators_20.dto.EditPersonDto;
//import Polinators_20.model.BeeHives;
//import Polinators_20.model.Crops;
import Polinators_20.model.User;

import java.util.List;
import java.util.Optional;

public interface UserService {

    void saveUser(CreateUserDto createUserDto);

    Optional<User> editUser(Integer id, EditPersonDto dto);

    void deleteUser (Integer id);

    Optional<User> findUserById(Integer id);

    List<User> findAll();

//    Optional<User> findUserByCrops(Crops crops);
//
//    Optional<User> findUserByBeeHives(BeeHives beeHives);




}
