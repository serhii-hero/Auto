package com.it;

import com.it.helpers.CommonHelper;
import com.it.helpers.DashBoardHelper;
import com.it.helpers.LoginHelper;

public class App {
    public CommonHelper common;
    public DashBoardHelper dashBoard;
    public LoginHelper login;

    public App() {
        common= new CommonHelper();
        dashBoard = new DashBoardHelper();
        login= new LoginHelper();

    }
}
