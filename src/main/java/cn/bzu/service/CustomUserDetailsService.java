package cn.bzu.service;

import cn.bzu.persistence.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    UserMapper userMapper;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {

        cn.bzu.domain.User user = userMapper.selectUserByCode(s);

        if (user != null) {
            UserDetails userDetails = User.builder()
                    .username(user.getUserName())
                    .password(new BCryptPasswordEncoder().encode(user.getUserPassword()))
                    .roles("admin")
                    .build();
            return userDetails;

        }
        return null;

    }

}
