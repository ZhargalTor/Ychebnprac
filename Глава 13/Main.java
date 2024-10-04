Глава 13 Вариант A задание 2
Выполнил: Торяшиев Жаргал

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class Main {

    public static void main(String[] args) throws SQLException {
        Connection connection = DatabaseConnection.getConnection();

        // Find all films released in current and last year
        List<Film> films = Query.findFilmsReleasedInCurrentAndLastYear(connection);
        System.out.println("Films released in current and last year:");
        for (Film film : films) {
            System.out.println(film);
        }

        // Find all actors in a given film
        int filmId = 1;
        List<Actor> actors = Query.findActorsInFilm(connection, filmId);
        System.out.println("Actors in film with ID " + filmId + ":");
        for (Actor actor : actors) {
            System.out.println(actor);
        }

        // Find all actors who have been in at least N films
        int n = 2;
        List<Actor> actorsInAtLeastNFilms = Query.findActorsInAtLeastNFilms(connection, n);
        System.out.println("Actors who have been in at least " + n + " films:");
        for (Actor actor : actorsInAtLeastNFilms) {
            System.out.println(actor);
        }

        // Find all actors who are also directors
        List<Actor> actorsWhoAreAlsoDirectors = Query.findActorsWhoAreAlsoDirectors(connection);
        System.out.println("Actors who are also directors:");
        for (Actor actor : actorsWhoAreAlsoDirectors) {
            System.out.println(actor);
        }

        // Delete all films released more than a certain number of years ago
        int yearsAgo = 5;
        Modification.deleteFilmsReleasedBeforeDate(connection, yearsAgo);
        System.out.println("Deleted all films released more than " + yearsAgo + " years ago");

        connection.close();
    }
}
