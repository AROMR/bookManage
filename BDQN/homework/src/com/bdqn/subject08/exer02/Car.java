package com.bdqn.subject08.exer02;

public class Car extends Vehicle{
//    小车类Car是Vehicle的子类，其中包含的属性有载人数loader。
    int loader;

    public Car(){
    }

    public Car(int loader) {
        this.loader = loader;
    }

    public Car(int wheels, double weight, int loader) {
        super(wheels, weight);
        this.loader = loader;
    }

    public int getLoader() {
        return loader;
    }

    public void setLoader(int loader) {
        this.loader = loader;
    }
    public void carPrintInfo(){
        System.out.println("car车轮数为："+getWheels()+"，车重为："+getWeight()+"t，载人数为："+loader);
    }
}
