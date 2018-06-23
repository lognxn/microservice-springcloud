package com.itmuch.cloud.movie.feign;

import com.itmuch.cloud.movie.entity.User;
import org.springframework.stereotype.Component;

@Component
class UserFeignClientFallback implements UserFeignClient {

    @Override
    public User findById(Long id) {
        User user = new User();
        user.setId(0L);
        return user;
    }

    @Override
    public User postUser(User user) {
        return null;
    }

    @Override
    public User getUser(User user) {
        return null;
    }
}