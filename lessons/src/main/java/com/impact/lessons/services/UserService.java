package com.impact.lessons.services;
import com.impact.lessons.models.User;
import com.impact.lessons.database.userStore;
import java.util.List;

public class UserService{
    private final userStore store = new userStore();
    public User CreateUser(User user){
        User newUser = new User(
                user.getUsername(),
                user.getEmail(),
                user.getPassword(),
                user.getRole()
        );
        return store.save(newUser);
    }
    public List<User> GetAllUsers(){
        return store.findAll();
    }
}