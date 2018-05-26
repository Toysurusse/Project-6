package resources;

import com.opensymphony.xwork2.ActionSupport;

public class UserAction {

    //DI via Spring
    UserBo userBo;

    public UserBo getUserBo() {
        return userBo;
    }

    public void setUserBo(UserBo userBo) {
        this.userBo = userBo;
    }

    public String execute() throws Exception {

        userBo.printUser();
        return "success";

    }
}