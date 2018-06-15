package com.example.demogson;

class Data {
    String address;
    String phoneNumber;

    public Data(String address, String phoneNumber) {
        this.address= address;
        this.phoneNumber= phoneNumber;

    }
    public void setAddress(String address){
        this.address=address;
    }

    public String getAddress() {
        return address;
    }

    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber=phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}
