package test.entity;


import test.entity.Info;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;

public class OrderInfo  implements Serializable {

  private long orderId;
  private long orderBookId;
  private java.sql.Timestamp orderTime;
  private long orderNum;
  private String name;
  private List<Info> orderinfo;

  public OrderInfo() {
  }

  public OrderInfo(long orderId, long orderBookId, Timestamp orderTime, long orderNum, String name) {
    this.orderId = orderId;
    this.orderBookId = orderBookId;
    this.orderTime = orderTime;
    this.orderNum = orderNum;
    this.name = name;
  }

  public long getOrderId() {
    return orderId;
  }

  public void setOrderId(long orderId) {
    this.orderId = orderId;
  }

  public long getOrderBookId() {
    return orderBookId;
  }

  public void setOrderBookId(long orderBookId) {
    this.orderBookId = orderBookId;
  }

  public Timestamp getOrderTime() {
    return orderTime;
  }

  public void setOrderTime(Timestamp orderTime) {
    this.orderTime = orderTime;
  }

  public long getOrderNum() {
    return orderNum;
  }

  public void setOrderNum(long orderNum) {
    this.orderNum = orderNum;
  }

  public String getOrderCustomerName() {
    return name;
  }

  public void setOrderCustomerName(String orderCustomerName) {
    this.name = orderCustomerName;
  }

  public List<Info> getOrderinfo() {
    return orderinfo;
  }

  public void setOrderinfo(List<Info> orderinfo) {
    this.orderinfo = orderinfo;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
  @Override
  public String toString() {
    return "OrderInfo{" +
            "orderId=" + orderId +
            ", orderBookId=" + orderBookId +
            ", orderTime=" + orderTime +
            ", orderNum=" + orderNum +
            ", Name='" + name + '\'' +
            '}';
  }

  public OrderInfo(String name) {
    this.name = name;
  }
}
