public class PostStaticExample {

  public static String nameOfBlog = "Justin's Blog";

  public String title;
  public String content;
  public int numberOfPostViews;

  public String returnViewsMessage() {
    return String.format("%s has %d views.", title, numberOfPostViews);
  }

  public static String getLongerBlogTitle(PostStaticExample p1, PostStaticExample p2) {
    if (p1.title.length() >= p2.title.length()) {
      return p1.title;
    } else {
      return p2.title;
    }
  }
    public static void main(String[] args) {
        // create post 1
        PostStaticExample p1 = new PostStaticExample();
        p1.title = "A Day in the Life";
        p1.content = "Hello asd asdf asdf asdaf asdf.";
        p1.numberOfPostViews = 25;

        // create post 2
        PostStaticExample p2 = new PostStaticExample();
        p2.title = "My Dog, Snickers";
        p2.content = "Good doggy asfd asf asdf asdf asd fas asdf";
        p2.numberOfPostViews = 10;

        // using instance methods
        System.out.println(p1.returnViewsMessage());
        System.out.println(p2.returnViewsMessage());

        // using static method
        System.out.println(PostStaticExample.getLongerBlogTitle(p1, p2));

        // accessing static property
        System.out.println(PostStaticExample.nameOfBlog);
    }

}
