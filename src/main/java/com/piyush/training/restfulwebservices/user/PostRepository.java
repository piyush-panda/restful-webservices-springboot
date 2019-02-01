package com.piyush.training.restfulwebservices.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by piyush.panda on 02/12/2018.
 */
@Repository
public interface PostRepository extends JpaRepository<Post, Integer> {
}
