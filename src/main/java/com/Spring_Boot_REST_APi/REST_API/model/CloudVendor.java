package com.Spring_Boot_REST_APi.REST_API.model;

import jakarta.persistence.*;

@Entity
@Table(
        name = "cloud_vendor_info"
)
public class CloudVendor {

    @Id
    @GeneratedValue(
            strategy = GenerationType.AUTO
    )
    public String vendorId;
    public String vendorName;
    public String VendorAddress;
    public String vendorPhoneNumber;


    /*Constructor*/
    public CloudVendor() {
    }

    public CloudVendor(String vendorId, String vendorName, String vendorAddress, String vendorPhoneNumber) {
        this.vendorId = vendorId;
        this.vendorName = vendorName;
        this.VendorAddress = vendorAddress;
        this.vendorPhoneNumber = vendorPhoneNumber;
    }


    /*Getter and setter Method*/
    public String getVendorId() {
        return vendorId;
    }

    public void setVendorId(String vendorId) {
        this.vendorId = vendorId;
    }

    public String getVendorName() {
        return vendorName;
    }

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

    public String getVendorAddress() {
        return VendorAddress;
    }

    public void setVendorAddress(String vendorAddress) {
        VendorAddress = vendorAddress;
    }

    public String getVendorPhoneNumber() {
        return vendorPhoneNumber;
    }

    public void setVendorPhoneNumber(String vendorPhoneNumber) {
        this.vendorPhoneNumber = vendorPhoneNumber;
    }
}
