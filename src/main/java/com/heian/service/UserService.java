package com.heian.service;

import com.heian.po.User;

/**
 * Created by 北极熊
 */
public interface UserService {

    User checkUser(String username, String password);
}
