package se.lexicon.model;

import java.time.LocalDateTime;

public class ShoppingCart {

   private int id;
   private LocalDateTime lastUpdate;
   private String orderStatus;
   private String deliveryAddress;
   private String customerReference;
   private Boolean paymentApproved;

    public ShoppingCart(int id, LocalDateTime lastUpdate, String orderStatus,
                        String deliveryAddress, String customerReference, Boolean paymentApproved) {
        this.id = id;
        this.lastUpdate = lastUpdate;
        this.orderStatus = orderStatus;
        this.deliveryAddress = deliveryAddress;
        this.customerReference = customerReference;
        this.paymentApproved = paymentApproved;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDateTime getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(LocalDateTime lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public String getCustomerReference() {
        return customerReference;
    }

    public void setCustomerReference(String customerReference) {
        this.customerReference = customerReference;
    }

    public Boolean getPaymentApproved() {
        return paymentApproved;
    }

    public void setPaymentApproved(Boolean paymentApproved) {
        this.paymentApproved = paymentApproved;
    }

    @Override
    public String toString() {
        return "ShoppingCart{" +
                "id=" + id +
                ", lastUpdate=" + lastUpdate +
                ", orderStatus='" + orderStatus + '\'' +
                ", deliveryAddress='" + deliveryAddress + '\'' +
                ", customerReference='" + customerReference + '\'' +
                ", paymentApproved=" + paymentApproved +
                '}';
    }
}
