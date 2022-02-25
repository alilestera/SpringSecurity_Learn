package com.alilestera;

import com.alilestera.domain.User;
import com.alilestera.mapper.MenuMapper;
import com.alilestera.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.List;

/**
 * @author Alilestera
 * @date 2/21/2022
 */
@SpringBootTest
public class MapperTest {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private MenuMapper menuMapper;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Test
    public void testSelectPermsByUserId() {
        List<String> permissionKeyList = menuMapper.selectPermsByUserId(2L);
        System.out.println(permissionKeyList);
    }

    @Test
    public void testPasswordEncoder() {
        String encode = passwordEncoder.encode("18");
        System.out.println("encode = " + encode);
    }

    @Test
    public void testUserMapper() {
        List<User> users = userMapper.selectList(null);
        for (User user : users) {
            System.out.println(user);
        }
    }
}
