package com.piyush.training.restfulwebservices.user;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/**
 * Created by piyush.panda on 14/10/2018.
 */
@Component
public class UseDaoService {

    private static List<User> users = new ArrayList<>();
    private static int usersCount = 3;

    static{

        users.add(new User(1, "Adam", new Date()));
        users.add(new User(2, "Eve", new Date()));
        users.add(new User(3, "Jack", new Date()));
    }

    public List<User> findAll() {
        return  users;
    }

    public User findUser(int id) {
        return  users.stream().filter((user) -> user.getId().equals(id)).findAny().orElse(null);
    }


    public boolean deleteUser(int id) {
        return users.removeIf(user -> user.getId().equals(id));
    }

    public User save(User user) {
        if(user.getId() == null){
            user.setId(++usersCount);
        }
        users.add(user);
        return user;
    }
}
