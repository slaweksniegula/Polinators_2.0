package Polinators_20.service;

import Polinators_20.dto.CreateUserDto;
import Polinators_20.dto.EditPersonDto;
//import Polinators_20.model.BeeHives;
//import Polinators_20.model.Crops;
import Polinators_20.model.User;
import Polinators_20.repository.UserActionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserActionRepository repository;

    @Override
    public void saveUser(CreateUserDto createUserDto) {
        User user = User.builder()
                .firstName(createUserDto.getFirstName())
                .name(createUserDto.getName())
                .userName(createUserDto.getUserName())
                .emailAddress(createUserDto.getEmailAddress())
                .password(createUserDto.getPassword())
                .build();
        repository.save(user);
    }

    @Override
    public Optional<User> editUser(Integer id, EditPersonDto dto) {
        return Optional.empty();
    }

    @Override
    public void deleteUser(Integer id) {

    }

    @Override
    public Optional<User> findUserById(Integer id) {
        return Optional.empty();
    }

    @Override
    public List<User> findAll() {
        return repository.findAll();
    }

//    @Override
//    public Optional<User> findUserByCrops(Crops crops) {
//        return Optional.empty();
//    }
//
//    @Override
//    public Optional<User> findUserByBeeHives(BeeHives beeHives) {
//        return Optional.empty();
//    }
}
