package Polinators_20.repository;


import Polinators_20.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserActionRepository extends JpaRepository<User, Integer> {

    Optional<User> findById(Integer id);

    void deleteById(Integer id);

}
