package szx.car_shop.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;



public class User {

    private Integer userId;


    private String userName;


     private String userPassword;


    private String userRealname;


    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserRealname() {
        return userRealname;
    }

    public void setUserRealname(String userRealname) {
        this.userRealname = userRealname;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", userPassword='" + userPassword + '\'' +
                ", userRealname='" + userRealname + '\'' +
                '}';
    }

    public User() {
    }

    public User(Integer userId, String userName, String userPassword, String userRealname) {
        this.userId = userId;
        this.userName = userName;
        this.userPassword = userPassword;
        this.userRealname = userRealname;
    }
}