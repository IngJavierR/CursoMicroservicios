package mx.com.example.web.rest;

import mx.com.example.commons.to.UserTO;
import mx.com.example.web.BaseTest;
import org.junit.Assert;
import org.junit.Test;
import java.util.List;

public class HelloControllerTest extends BaseTest {

    @Test
    public void exampleTest() {

        //this.entityManager.persist(new UserDO("Javier", "Rodriguez", 1));

        List<UserTO> users = this.cursoFacade.getAllUsers();

        Assert.assertEquals(1, users.size());
    }
}
