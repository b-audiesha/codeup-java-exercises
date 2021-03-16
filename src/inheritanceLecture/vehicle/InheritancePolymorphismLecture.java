//package inheritanceLecture.vehicle;
//
//public class InheritancePolymorphismLecture {
//
//  public static void main(String[] args) {
//
//    // =================== polymorphism example 1 - using methods that return objects
////        Vehicle newVehicle = makeVehicle("vehicle", 80);
////        newVehicle.setNumberOfOccupants(2);
////        System.out.println(newVehicle.getNumberOfOccupants());
//
//
////        Bus bus = (Bus) makeVehicle("bus", 55);
////        Vehicle v = makeVehicle("bus", 55);
////        Bus b = (Bus) makeVehicle("bus", 55);
////        b.honkHorn();
////        v.turnOn();
////        v.honkHorn();
//
////        Vehicle v1 = makeVehicle("bus", 55);
////        Vehicle v2 = makeVehicle("yacht", 30);
////        Vehicle v3 = makeVehicle("jet", 300);
////        v1.turnOn();
////        v2.turnOn();
////        v3.turnOn();
//
//
////        bus.turnOn();
////        bus.honkHorn();
//
//
////        bus.setNumberOfOccupants(2);
////        System.out.println(bus.getNumberOfOccupants());
//////         must cast Vehicle to type Bus and make variable a Bus type
//////         otherwise, cannot access subclass specific properties
////        System.out.println(bus.headlightOn);
//
//
//
//
//    // =================== polymorphism example 2 - using methods that take in objects
////        Jet jetObject = new Jet(600);
////        addOccupant(jetObject);
////        numOfOccupantsMessage(jetObject);
////
////        Yacht yachtObject = new Yacht(20);
////        addOccupant(yachtObject);
////        numOfOccupantsMessage(yachtObject);
//
//
//
//
//  }
//
//  // method that returns any of the Vehicle subclass objects or the Vehicle class object
//  public static Vehicle makeVehicle(String type, int maxSpeed) {
//    Vehicle obj = null;
//    switch (type) {
//      case "vehicle":
//        obj = new Vehicle(maxSpeed);
//        break;
//      case "jet":
//        obj = new Jet(maxSpeed);
//        break;
//      case "yacht":
//        obj = new Yacht(maxSpeed);
//        break;
//      case "bus":
//        obj = new Bus(maxSpeed);
//        break;
//    }
//    return obj;
//  }
//
//  // methods which take in any of the vehicle subclasses
//  public static void numOfOccupantsMessage(Vehicle obj) {
//    System.out.println("This vehicle is holding " + obj.getNumberOfOccupants());
//  }
//
//  public static void addOccupant(Vehicle obj) {
//    obj.setNumberOfOccupants(obj.getNumberOfOccupants() + 1);
//  }
//
//}
