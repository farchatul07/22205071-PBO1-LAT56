/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg22205071_pbo_lat57;

/**
 *
 * @author user
 Nama              : Farchatul Hudayah
 Nim               : 22205071
 Prodi             : Teknik Informatika
 Kelas             : PBO1
 Deskripsi Program : untuk menampilkan hasil VEHICLE
 */
public class Vehicle {
      private String myBrand;
    private String myModel;

    public Vehicle() {
       // Constructor
    }

    public String getBrand() {
        return myBrand;
    }

    public void setBrand(String brand) {
        myBrand = brand;
    }

    public String getModel() {
        return myModel;
    }

    public void setModel(String model) {
        myModel = model;
    }
}

// Bicycle class
class Bicycle extends Vehicle {
    private int myGearCount;

    public Bicycle() {
        // Constructor
    }

    public int getGearCount() {
        return myGearCount;
    }

    public void setGearCount(int gearCount) {
        myGearCount = gearCount;
    }
}

// Skateboard class
class Skateboard extends Vehicle {
    private double myBoardLength;

    public Skateboard() {
        // Constructor
    }

    public double getBoardLength() {
        return myBoardLength;
    }

    public void setBoardLength(double boardLength) {
        myBoardLength = boardLength;
    }
}

// Main class for testing
class VehicleTest {
    public static void main(String[] args) {
        Bicycle myBike = new Bicycle();
        myBike.setBrand("Trek Bike");
        myBike.setModel("7.4FX");
        myBike.setGearCount(23);

        Skateboard myBoard = new Skateboard();
        myBoard.setBrand("Ally Skate");
        myBoard.setModel("Rocket");
        myBoard.setBoardLength(54.5);

        // Display vehicle information
        System.out.println("Bicycle Brand: " + myBike.getBrand());
        System.out.println("Bicycle Model: " + myBike.getModel());
        System.out.println("Bicycle Gear Count: " + myBike.getGearCount());
        System.out.println();

        System.out.println("Skateboard Brand: " + myBoard.getBrand());
        System.out.println("Skateboard Model: " + myBoard.getModel());
        System.out.println("Skateboard Board Length: " + myBoard.getBoardLength() + " inches");
    }
}
