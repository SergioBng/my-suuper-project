package com.trutsyn.project.dao;

import com.trutsyn.project.models.User;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Sergey Trutsyn 08.08.2022
 */
@Component
public class UserDao {
    private static int USER_COUNT;
    private List<User> users;

    {
        users = new ArrayList<>();
        users.add(new User(1, "Tom", "Odel"));
        users.add(new User(2, "Sergey", "Trutsyn"));
        users.add(new User(3, "Vania", "Mitiay"));
    }

    public List<User> getUsers() {
        return users;
    }

    public User getUser(int id) {
        return users.stream().filter(user -> user.getId() == id).findAny().orElse(null);
    }

    public void save(User user) {
        user.setId(++USER_COUNT);
        users.add(user);
    }
}
