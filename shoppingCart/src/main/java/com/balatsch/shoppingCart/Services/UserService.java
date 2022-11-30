package com.balatsch.shoppingCart.Services;

import com.balatsch.shoppingCart.entities.Users;

import java.util.List;

public interface UserService {
    public List<Users> getUsers();
    public Users createUser(Users user);
    public void deleteUser(Users user);

}
