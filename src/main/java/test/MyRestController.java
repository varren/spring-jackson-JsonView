package test;

import com.fasterxml.jackson.annotation.JsonView;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController {

    @JsonView(EntityVisibility.Public.class)
    @RequestMapping(value="/test", method= RequestMethod.GET)
    public Response<TestObject> testMethos() {

        TestObject testObject = new TestObject();
        testObject.setTest1("test1");
        testObject.setTest2("test2");
        testObject.setTest3("test3");
        System.out.println("testObject" + testObject);
        //return testObject;
        return new Response<>(testObject);
    }
}