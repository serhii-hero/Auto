package com.it.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MyTest  extends BaseTest{

    @Test
    public void test1()  {
        app.login.login(validUser);
        Assert.assertEquals(app.dashBoard.getLbUserEmail(),validUser.email);
    }
}
