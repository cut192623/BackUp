package spring.mvc.entity;

public class UserInfo {
    private String name;
    private String password;
    private String picture;



    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UserInfo() {
    }

    public UserInfo(String name, String password, String picture) {
        this.name = name;
        this.password = password;
        this.picture = picture;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", picture='" + picture + '\'' +
                '}';
    }

    public UserInfo(String name, String password) {
        this.name = name;
        this.password = password;
    }
}
