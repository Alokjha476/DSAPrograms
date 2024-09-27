package Coding_Question.streamApi.comprators;
// Comprator
//The Comparator provides multiple sorting sequences. In other
// words, we can sort the collection on the basis of multiple elements such as id, name, and price etc.
//

import java.util.ArrayList;
import java.util.Comparator; // util package
import java.util.List;

class Movie {

    String name;
    Integer year;
    Integer rating;

    public Movie(String name, Integer year, Integer rating) {
        this.name = name;
        this.year = year;
        this.rating = rating;
    }

    public static Comparator<Movie> byName = new Comparator<Movie>() {
        @Override
        public int compare(Movie m1, Movie m2) {
            return m1.name.compareTo(m2.name);
        }
    };

    public static Comparator<Movie> byRating = new Comparator<Movie>() {
        @Override
        public int compare(Movie m1, Movie m2) {
            return m1.rating.compareTo(m2.rating);
        }
    };
    public static Comparator<Movie> byYear = new Comparator<Movie>() {
        @Override
        public int compare(Movie m1, Movie m2) {
            return m1.year.compareTo(m2.year);
        }
    };
    public void Display() {
        System.out.println("name" + " " + name + "year" + " " + year + "rating" + " " + rating);
    }
}
public class MoviesSort {
    public static void main(String[] args) {
        List<Movie> list1 = new ArrayList<>();
        list1.add(new Movie("Boom", 2015, 9));
        list1.add(new Movie("shaktiman", 2000, 5));
        list1.add(new Movie("Amar", 2001, 10));
        list1.add(new Movie("Radha", 2002, 8));

        System.out.println("Sort By Rating: ");
        list1.sort(Movie.byRating);
        for (Movie byRating : list1) {
            byRating.Display();

        }
        System.out.println("Sort by Name :");
        list1.sort(Movie.byName);
        for (Movie byName : list1) {
            byName.Display();
        }
        System.out.println("sort by Year: ");
        list1.sort(Movie.byYear);
        for (Movie byAge : list1) {
            byAge.Display();
        }

    }


}

