package com.shashank.ewallet.user.service;


import com.shashank.ewallet.user.domain.User;
import com.shashank.ewallet.user.service.resource.TransactionRequest;
import com.shashank.ewallet.user.service.resource.UserRequest;
import com.shashank.ewallet.user.service.resource.UserResponse;

public interface UserService {

    public void createUser(User user) ;
    public UserResponse getUser(String id);

    public User deleteUser(String id);

    public User updateUser(UserRequest userRequest, String id);

    public boolean transfer(Long userId, TransactionRequest request);
}

