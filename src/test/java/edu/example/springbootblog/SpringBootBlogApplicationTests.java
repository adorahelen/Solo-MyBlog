package edu.example.springbootblog;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

@SpringBootTest
@TestPropertySource(locations = "classpath:/application.properties")
class SpringBootBlogApplicationTests {

    @Test
    void contextLoads() {
    }

}

