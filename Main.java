public class Main {
    public static void main(String[] args) {
      Review[] reviews = {
        new Review(4, "Good!"),
        new Review(3, "OK"),
        new Review(5, "Great!"),
        new Review(2, "Poor!"),
        new Review(3, "")
      };
  
      ReviewAnalysis r = new ReviewAnalysis(reviews);
      System.out.println(r.getAverageRating());
      System.out.println(r.collectComments());
    }
  }
  
    