package com.company;

public class giftApp {
    private String giftname;
    private String gender;
    private String price;

    public giftApp(String giftname, String gender, String price) {
        this.giftname = giftname;
        this.gender = gender;
        this.price = price;
    }

    public giftApp() {

    }

    public String getGiftname() {
        return giftname;
    }

    public void setGiftname(String giftname) {
        this.giftname = giftname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
