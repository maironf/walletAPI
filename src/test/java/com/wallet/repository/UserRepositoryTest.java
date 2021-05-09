package com.wallet.repository;

import com.wallet.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertNotNull;

@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles("test")
public class UserRepositoryTest {

    @Autowired
    UserRepository repository;

    @Test
    public void testSave(){
        User u = new User("12345","neymessi","neymessinaldo10@hotmail.com");
        User response = repository.save(u);
        assertNotNull(response);
    }
}
