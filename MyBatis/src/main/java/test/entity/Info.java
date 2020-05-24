package test.entity;
import test.entity.OrderInfo;


import java.io.Serializable;
import java.util.List;

public class Info implements Serializable {

  private String name;
  private long age;
  private  String sex;
  private List<OrderInfo> orders;
  public Info() {

  }

  public Info(String name, long age, String sex) {
    this.name = name;
    this.age = age;
    this.sex = sex;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public long getAge() {
    return age;
  }

  public void setAge(long age) {
    this.age = age;
  }

  public String getSex() {
    return sex;
  }

  public void setSex(String sex) {
    this.sex = sex;
  }

  public List<OrderInfo> getOrders() {
    return orders;
  }

  public void setOrders(List<OrderInfo> orders) {
    this.orders = orders;
  }

  @Override
  public String toString() {
    return "Info{" +
            "name='" + name + '\'' +
            ", age=" + age +
            ", sex='" + sex + '\'' +
            '}';
  }
}
