package cn.edu.jxufe.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

/**
 * T_Order
 * @author 
 */
public class TOrder implements Serializable {
    /**
     * 订单编号
     */
    private Long orderid;

    /**
     * 手机号（用户）
     */
    private String telphone;

    /**
     * 订单备注
     */
    private String orderremarks;

    /**
     * 创建日期
     */
    private Date createtime;

    /**
     * 订单状态
     */
    private String orderstate;

    /**
     * 订单总价格
     */
    private Double totalprice;

    /**
     * 用户地址（收货地址）
     */
    private String address;







    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    private static final long serialVersionUID = 1L;


    public Long getOrderid() {
        return orderid;
    }

    public void setOrderid(Long orderid) {
        this.orderid = orderid;
    }

    public String getTelphone() {
        return telphone;
    }

    public void setTelphone(String telphone) {
        this.telphone = telphone;
    }

    public String getOrderremarks() {
        return orderremarks;
    }

    public void setOrderremarks(String orderremarks) {
        this.orderremarks = orderremarks;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getOrderstate() {
        return orderstate;
    }

    public void setOrderstate(String orderstate) {
        this.orderstate = orderstate;
    }

    public Double getTotalprice() {
        return totalprice;
    }

    public void setTotalprice(Double totalprice) {
        this.totalprice = totalprice;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", orderid=").append(orderid);
        sb.append(", telphone=").append(telphone);
        sb.append(", orderremarks=").append(orderremarks);
        sb.append(", createtime=").append(createtime);
        sb.append(", orderstate=").append(orderstate);
        sb.append(", totalprice=").append(totalprice);
        sb.append(", address=").append(address);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}