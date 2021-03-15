package OOPLecture;
import java.util.Scanner;
//
//public class OopLecture {
//
//  public static void main(String[] args) {

    // ======================== slide 3 (classes and objects)
//
//            Person p1 = new Person();
//            p1.firstName = "Justin";
//            p1.lastName = "Reich";
//            System.out.println(p1.sayHello());
//            p1.age = 30;
//            Person otherP1Name = p1;
//            System.out.println(p1);
//            System.out.println(p1);
//            System.out.println(otherP1Name);
//            p1.firstName = "Bob";
//            System.out.println(otherP1Name.firstName);

//        System.out.println(p1.age);
//            System.out.printf("%s %s %d", p1.firstName, p1.lastName, p1.age);

//            System.out.println(p1.firstName);

//            Person p2 = new Person();
//            p2.firstName = "Casey";
//            p2.lastName = "Edwards";
//            System.out.println(p2.sayHello());

//            Person p3 = new Person();
//            System.out.println(p3.sayHello());
//            p3.firstName = "Ryan";
//            System.out.println(p3.firstName);

//            Person p4 = new Person();
//            p4.firstName = "Ryan";
//            p4.firstName = "Douglas";

//            System.out.println(p3.firstName + " " + p4.firstName);

//            System.out.println(p1);
//            System.out.println(p2);
//            System.out.println(p3);
//            System.out.println(p4);
//            System.out.println(p4.firstName);
//            System.out.println(p3.firstName.equals(p4.firstName));

//            System.out.println("Hello "
//                    + p1.firstName
//                    + ", "
//                    + p2.firstName
//                    + ", "
//                    + p3.firstName);

//            p1.lastName = "Reich";
//            System.out.println(p1.lastName);

//            Person p2 = new Person();
//            p2.firstName = "Justin";
//            p2.lastName = "Reich";

//            System.out.println(p1);
//            System.out.println(p2);

//            Person justinImposter = p2;
//
//            System.out.println(justinImposter);
//            System.out.println(p2);

//            System.out.println(p1 == p2);

//            p1.firstName = "Rick";
//            p1.lastName = "Sanchez";
//            System.out.println(p1.firstName);
//            System.out.println(p1.lastName);


//            System.out.println(p1.firstName);
//            System.out.println(p1.lastName);

//
//            Person fred = new Person();
//            fred.firstName = "Fred";
//            fred.lastName = "Smith";
//            System.out.println(fred.firstName);
//            System.out.println(fred.lastName);



    // -- Dog Example --


//            Dog d1 = new Dog();
//
//            d1.age = 3;
//            d1.breed = "corgi";
//            d1.canBreed = false;
//            d1.name = "Tater";



    // ======================== slide 4 (object fields)

//            Person rick = new Person();
//            rick.firstName = "Rick";
//            rick.lastName = "Sanchez";
//            System.out.println(rick.sayHello());

    // -- Dog Method Example --

//            Dog d1 = new Dog();
//            d1.age = 3;
//            d1.breed = "corgi";
//            d1.canBreed = false;
//            d1.name = "Tater";
//
//            d1.callForDog("Tater");


    // ======================== slide 5 (class fields)



//            System.out.println(Arithmetic.PI);
//            System.out.println(Arithmetic.add(5, 5));
//            System.out.println(Arithmetic.multiply(5, 5));

    // -- DogHelper Example --

    // log out NUMBER_OF_DOG_BREEDS?????

//        System.out.println(DogHelper.NUMBER_OF_DOG_BREEDS);
//
//        int sparkyAgeInHumanYears = 10;
//        int sparkyAgeInDogYears = (int) DogHelper.humanToDogYears(sparkyAgeInHumanYears);
//        System.out.println(sparkyAgeInDogYears);

//        Double


    // ======================== slide 7 (class vs. object fields)

//            Person theBestDrummerAlive = new Person();
//            theBestDrummerAlive.name = "Neil Peart";

//            Person theBestSinger = new Person();
//            System.out.println(theBestSinger.name);
//            theBestSinger.name = "Weird Al";

//            Person.worldPopulation += 1; // accessing a static property

//            theBestDrummerAlive.worldPopulation = 5;
//            System.out.println(theBestSinger.worldPopulation);
//            System.out.println(theBestDrummerAlive.worldPopulation);
//
//        System.out.println(Person.species);

//            System.out.println(Person.worldPopulation);

//            System.out.println(Person.name);
//
//            // this also works, but is usually not a good idea
//            System.out.println(theBestDrummerAlive.worldPopulation); // 7500000001
//            System.out.println(theBestDrummerAlive.name);



    // ======================== slide 8 (constructors)

//            Student jane = new Student("Jane Doe", "Zion");
//            System.out.print(jane.name + " - ");
//            System.out.println(jane.cohort); // prints "Jane Doe - Zion"
//            Student john = new Student("John Doe");
//            System.out.println(john.name + " - ");
//            System.out.println(john.cohort); // prints "John Doe - Unassigned"


    // ======================== slide 9 (this keyword)

//            Student jane = new Student("Jane Doe", "Zion");
//            System.out.print(jane.name + " - ");
//            System.out.println(jane.cohort); // prints "Jane Doe - Zion"
//            Student john = new Student("John Doe");
//            System.out.print(john.name + " - ");
//            System.out.println(john.cohort); // prints "John Doe - Unassigned"


    // ======================== slide 10 (visibility)

  //  Student student = new Student("John Doe", 82.4);

    //System.out.println(student.name); // "John Doe"

//            // DON'T DO THIS - can't access private properties outside the class
//            System.out.println(student.grade);



//            System.out.println(student.shareGrade()); // Do this instead

    //System.out.println(student.shareGrade());

    //student.changeGrade(100);

    //System.out.println(student.shareGrade());


  //}

//}
