//package OOPLecture;
//
//public class Student {
//}
//import java.util.Date;
//
//public class Post {
//
//  // static variables
//  public static String nameOfBlog = "Justin's Blog";
//  public static Date whenBlogWentLive = new Date();
//  public static int maxPostContentLength = 2000;
//
//
//  // instance variables
//  public String title;
//  public String content;
//  public int numberOfPostViews;
//  public String genre;
//  public Date createdAt;
//  public Date updatedAt;
//  public String author;
////    public Comment[] comments;
//
//  // instance methods
//  public String returnViewsMessage() {
//    return String.format("%s has %d views.", title, numberOfPostViews);
//  }
//
//  public void clearOutContent() {
//    content = "This user no longer has an active account.";
//  }
//
//  public String returnAuthorDateMessage() {
//   // return String.format("This post was created by %s on %s", author, createdAt);
//  }
//
////    public void addComment(Comment comment) {
////
////    }
//
//
//
//
//  // static methods
//  public static String getLongerBlogTitle(Post p1, Post p2) {
//    if (p1.title.length() >= p2.title.length()) {
//      return p1.title;
//    } else {
//      return p2.title;
//    }
//  }
//
////    public static Post[] getPostsByGenre(Posts[] allPosts, String genre) {
//  // filter out posts that don't match the genre
//  // return posts in genre
////    }
//
//  public static void main(String[] args) {
//    // create post 1
//    Post p1 = new Post();
//    p1.title = "A Day in the Life";
//    p1.content = "Hello asd asdf asdf asdaf asdf.";
//    p1.numberOfPostViews = 25;
//    p1.clearOutContent();
//
//
//    // create post 2
//    Post p2 = new Post();
//    p2.title = "My Dog, Snickers";
//    p2.content = "Good doggy asfd asf asdf asdf asd fas asdf";
//    p2.numberOfPostViews = 10;
//
//    // using instance methods
//    System.out.println(p1.returnViewsMessage());
//    System.out.println(p2.returnViewsMessage());
//
////        Post.returnViewsMessage();
//
//    // using static method
//    System.out.println(Post.getLongerBlogTitle(p1, p2));
////
//    // accessing static property
//    System.out.println(Post.nameOfBlog);
//  }
//
//}
