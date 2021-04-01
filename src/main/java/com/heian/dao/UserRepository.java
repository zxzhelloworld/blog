package com.heian.dao;

import com.heian.po.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by 北极熊
 */
public interface UserRepository extends JpaRepository<User,Long> {

    User findByUsernameAndPassword(String username, String password);
}
