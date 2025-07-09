class Movie {
    String title, director;
    int year;
    double rating;
    Movie next, prev;

    Movie(String title, String director, int year, double rating) {
        this.title = title;
        this.director = director;
        this.year = year;
        this.rating = rating;
    }
}

public class MovieManagementSystem {
    Movie head = null, tail = null;

    void addAtBeginning(String title, String director, int year, double rating) {
        Movie m = new Movie(title, director, year, rating);
        if (head == null) head = tail = m;
        else {
            m.next = head;
            head.prev = m;
            head = m;
        }
    }

    void addAtEnd(String title, String director, int year, double rating) {
        Movie m = new Movie(title, director, year, rating);
        if (tail == null) head = tail = m;
        else {
            tail.next = m;
            m.prev = tail;
            tail = m;
        }
    }

    void addAtPosition(int pos, String title, String director, int year, double rating) {
        if (pos <= 1 || head == null) {
            addAtBeginning(title, director, year, rating);
            return;
        }
        Movie temp = head;
        for (int i = 1; i < pos - 1 && temp.next != null; i++) temp = temp.next;
        if (temp == tail) addAtEnd(title, director, year, rating);
        else {
            Movie m = new Movie(title, director, year, rating);
            m.next = temp.next;
            m.prev = temp;
            temp.next.prev = m;
            temp.next = m;
        }
    }

    void removeByTitle(String title) {
        Movie temp = head;
        while (temp != null) {
            if (temp.title.equalsIgnoreCase(title)) {
                if (temp == head && temp == tail) head = tail = null;
                else if (temp == head) {
                    head = head.next;
                    head.prev = null;
                } else if (temp == tail) {
                    tail = tail.prev;
                    tail.next = null;
                } else {
                    temp.prev.next = temp.next;
                    temp.next.prev = temp.prev;
                }
                return;
            }
            temp = temp.next;
        }
    }

    void searchByDirector(String director) {
        Movie temp = head;
        while (temp != null) {
            if (temp.director.equalsIgnoreCase(director)) print(temp);
            temp = temp.next;
        }
    }

    void searchByRating(double rating) {
        Movie temp = head;
        while (temp != null) {
            if (temp.rating == rating) print(temp);
            temp = temp.next;
        }
    }

    void updateRating(String title, double rating) {
        Movie temp = head;
        while (temp != null) {
            if (temp.title.equalsIgnoreCase(title)) {
                temp.rating = rating;
                return;
            }
            temp = temp.next;
        }
    }

    void displayForward() {
        Movie temp = head;
        while (temp != null) {
            print(temp);
            temp = temp.next;
        }
    }

    void displayReverse() {
        Movie temp = tail;
        while (temp != null) {
            print(temp);
            temp = temp.prev;
        }
    }

    void print(Movie m) {
        System.out.println(m.title + " | " + m.director + " | " + m.year + " | " + m.rating);
    }

    public static void main(String[] args) {
        MovieManagementSystem m = new MovieManagementSystem();

        m.addAtBeginning("Inception", "Nolan", 2010, 8.8);
        m.addAtEnd("Interstellar", "Nolan", 2014, 8.6);
        m.addAtPosition(2, "The Dark Knight", "Nolan", 2008, 9.0);
        m.addAtEnd("Dangal", "Nitesh", 2016, 8.4);

        System.out.println("All Movies (Forward):");
        m.displayForward();

        System.out.println("\nAll Movies (Reverse):");
        m.displayReverse();

        System.out.println("\nSearch by Director: Nolan");
        m.searchByDirector("Nolan");

        System.out.println("\nSearch by Rating: 8.4");
        m.searchByRating(8.4);

        System.out.println("\nUpdating rating for Interstellar to 9.2");
        m.updateRating("Interstellar", 9.2);
        m.displayForward();

        System.out.println("\nRemoving 'Dangal'");
        m.removeByTitle("Dangal");
        m.displayForward();
    }
}
