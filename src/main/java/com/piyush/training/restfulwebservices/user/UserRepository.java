package com.piyush.training.restfulwebservices.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by piyush.panda on 28/11/2018.
 */
@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
}
