package Polinators_20.repository;

import Polinators_20.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDetailsRepository extends CrudRepository<User, Long> {

    User findByUserName(String username);
}
