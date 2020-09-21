package com.example.product;

public class Cake {
    private String cakeId;
    private String name;
    private String cakeDescription;
    private String cakeQuantity;
    private String cakePrice;
    private String imgUri;
    private String adminName;
    private String adminEmail;
    private String adminContactNo;

    public Cake() {}
    public Cake(String cakeId, String name, String cakeDescription, String cakeQuantity, String cakePrice, String url, String adminName, String adminEmail, String adminContactNo) {
        this.cakeId = cakeId;
        this.name = name;
        this.cakeDescription = cakeDescription;
        this.cakeQuantity = cakeQuantity;
        this.cakePrice = cakePrice;
        this.imgUri = url;
        this.adminName = adminName;
        this.adminEmail = adminEmail;
        this.adminContactNo = adminContactNo;
    }

    public String getCakeId() {
        return cakeId;
    }

    public String getName() {
        return name;
    }

    public String getCakeDescription() {
        return cakeDescription;
    }

    public String getCakeQuantity() {
        return cakeQuantity;
    }

    public String getCakePrice() {
        return cakePrice;
    }

    public String getImgUri() {
        return imgUri;
    }

    public String getAdminName() {
        return adminName;
    }

    public String getAdminEmail() {
        return adminEmail;
    }

    public String getAdminContactNo() {
        return adminContactNo;
    }
}
