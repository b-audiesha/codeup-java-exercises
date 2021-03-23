//package collectionsLecture;
//
//import java.util.*;
//
//public class CollectionsLecture {
//
//  public static void printEachElement(List<String> strings) {
//    for (String str : strings) {
//      System.out.println(str);
//    }
//  }
//
//  public static void main(String[] args) {
//
//    // ----------------------------- Array Lists
//
//    // creating Array Lists
//
//    List<Integer> numbers = new ArrayList<>();
//    numbers.add(1);
//    numbers.add(2);
//    numbers.add(3);
//
////        System.out.println(numbers);
//
////        System.out.println(numbers.remove(1));
//
////        System.out.println(numbers.get(0));
//
//
////        List<String> strings = new ArrayList<>();
////        strings.add("bob");
////        strings.add("hello");
////        strings.add("etc");
//
////        System.out.println(numbers);
////        System.out.println(strings);
//
////        printEachElement(strings);
//
//
////        List<String> names = new ArrayList<>(Arrays.asList(
////                "Fred",
////                "Sally",
////                "Cindy"
////        ));
////
////        System.out.println(names);
////        names.add("Justin");
////        System.out.println(names);
//
//    // peeking into list
//
////        System.out.println(numbers);
////        System.out.println(names);
//
//
//    // get elements
//
////        System.out.println(numbers.get(2));
////        System.out.println(numbers.get(5));
//
//
//    // adding & editing elements
//
////        numbers.add(20);
////        System.out.println(numbers);
////        numbers.add(0, 21);
////        numbers.set(0, 7);
////        System.out.println(numbers);
////        System.out.println(numbers);
////        numbers.add(10, 22);
////        System.out.println(numbers);
//
////        System.out.println(numbers.size());
//
//
//
//
//    // removing elements
//
////        System.out.println(names);
////        names.remove(0);
////        System.out.println(names);
//
////        names.remove("Cindy");
////        System.out.println(names);
//
//
////        numbers.remove(2);
////        numbers.remove(1); // 1, 3
////        System.out.println(numbers);
////        numbers.remove(Integer.valueOf(3)); // remove by value of the number
////        System.out.println(numbers);
////        System.out.println(numbers.indexOf(1));
////
//
//    // reordering list
//
////        Collections.sort(numbers);
////        Collections.reverse(numbers);
////        System.out.println(numbers);
//
//
//    // info about list and getting elements
//
////        System.out.println(numbers.size());
////        System.out.println(numbers);
////        System.out.println(numbers.indexOf(3));
////        System.out.println(numbers.indexOf(105));
////
//    ArrayList<String> roasts = new ArrayList<>();
//    roasts.add("medium");
//    roasts.add("light");
//    roasts.add("medium");
//    roasts.add("dark");
////        System.out.println(roasts);
////        System.out.println(roasts.contains("dark"));
////        System.out.println(roasts.contains("espresso"));
////        System.out.println(roasts.lastIndexOf("medium"));
////        System.out.println(roasts.isEmpty());
////
////        ArrayList<String> roast = roasts;
////        System.out.println(roast == roasts);
//
//
//    // ----------------------------- Hash Maps
//
//    // creating hash maps
////        Map<String, String> usernames = new HashMap<>();
////        usernames.put("Ryan", "ryanorsinger");
////        usernames.put("Luis", "MontealegreLuis");
////        usernames.put("Zach", "zgulde");
////        usernames.put("Fernando", "fmendozaro");
////        usernames.put("Justin", "jreich5");
////        System.out.println(usernames);
//
//    // getting values from and info about hash map
////        System.out.println(usernames);
////        System.out.println(usernames.get("Justin"));
////        System.out.println(usernames.get("Phillip"));
////        System.out.println(usernames.get("Justin"));
////        System.out.println(usernames.getOrDefault("Fred", "gocodeup"));
////        System.out.println(usernames.containsKey("Luis"));
//
//    // updating hash maps
//
////        usernames.put("Ryan", "rorsinger");
////        System.out.println(usernames);
////        System.out.println(usernames);
////        usernames.put("Ryan", "Test");
////
////        usernames.putIfAbsent("Zach", "coderdude24");
////        System.out.println(usernames);
////        usernames.replace("Ryan", "torvalds"); // same as put
////        System.out.println(usernames);
//
//    // removing pairs from hash map
//
////        System.out.println(usernames.remove("Zach"));
////        System.out.println(usernames);
////        System.out.println(usernames.remove("Zach"));
////        System.out.println(usernames);
////        System.out.println(usernames);
////        usernames.clear();
////        System.out.println(usernames);
////        System.out.println(usernames.isEmpty());
//
//
//  }
//
//}
