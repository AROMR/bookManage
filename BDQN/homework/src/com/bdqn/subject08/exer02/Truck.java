package com.bdqn.subject08.exer02;

public class Truck extends Vehicle{

//    卡车类Truck是Car类的子类，其中包含的属性有载重量payload。

    double payload;

    public Truck() {

    }

    public Truck(double payload) {
        this.payload = payload;
    }

    public Truck(int wheels, double weight, double payload) {
        super(wheels, weight);
        this.payload = payload;
    }

    public double getPayload() {
        return payload;
    }

    public void setPayload(double payload) {
        this.payload = payload;
    }

    public void truckPrintInfo(){
        System.out.println("Truck车轮数为："+getWheels()+"，车重为："+getWeight()+"t，载重量为："+payload+"t");
    }

}
