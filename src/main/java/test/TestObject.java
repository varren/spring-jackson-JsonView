package test;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonView;

public class TestObject {

    @JsonView(EntityVisibility.Public.class)
    private String test1;

    @JsonView(EntityVisibility.Detailed.class)
    private String test2;

    @JsonView(EntityVisibility.Internal.class)
    private String test3;

    @JsonIgnore
    private String test4;


    public String getTest1() {
        return test1;
    }

    public void setTest1(String test1) {
        this.test1 = test1;
    }

    public String getTest2() {
        return test2;
    }

    public void setTest2(String test2) {
        this.test2 = test2;
    }

    public String getTest3() {
        return test3;
    }

    public void setTest3(String test3) {
        this.test3 = test3;
    }

    public String getTest4() {
        return test4;
    }

    public void setTest4(String test4) {
        this.test4 = test4;
    }
}
