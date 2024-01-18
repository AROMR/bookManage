package com.bdqn.subject08.exer02;

public class Test {
    public static void main(String[] args) {
        Car car1 = new Car(4,2,5);
        car1.printInfo();
        car1.carPrintInfo();
        Car car2 = new Car();
        car2.setWheels(4);
        car2.setWeight(3);
        car2.setLoader(7);
        System.out.println("car2车轮数："+car2.getWheels()+"，车重："+ car2.getWeight()+"t，载人数："+car2.getLoader());

        Truck truck1 = new Truck(8,6,30);
        truck1.printInfo();
        truck1.truckPrintInfo();
        Truck truck2 = new Truck();
        truck2.setWheels(6);
        truck2.setWeight(5);
        truck2.setPayload(20);
        System.out.println("truck2车轮数："+truck2.getWheels()+"，车重："+ truck2.getWeight()+"t，载重量："+truck2.payload+"t");
    }
}
