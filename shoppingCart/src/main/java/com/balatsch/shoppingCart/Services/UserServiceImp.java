package com.balatsch.shoppingCart.Services;

import com.balatsch.shoppingCart.entities.Users;
import com.balatsch.shoppingCart.repositories.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImp implements UserService {
    @Autowired
    UsersRepository usersRepository;

    @Override
    public List<Users> getUsers() {
        return usersRepository.findAll();
    }

    @Override
    public Users createUser(Users user) {
        return usersRepository.save(user);
    }

    @Override
    public void deleteUser(Users user) {
        usersRepository.delete(user);
    }


}
