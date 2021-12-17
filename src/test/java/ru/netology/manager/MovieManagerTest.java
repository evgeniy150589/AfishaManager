package ru.netology.manager;

import org.junit.jupiter.api.Test;
import ru.netology.domain.Movie;

import static org.junit.jupiter.api.Assertions.*;

class MovieManagerTest {


    @Test
    public void shouldGet3Movies() {
        MovieManager manager = new MovieManager();
        Movie first = new Movie(1, "Bladshot", "action movies", "1");
        Movie second = new Movie(2, "Forward", "cartoon", "2");
        Movie third = new Movie(3, "Hotel Belgrad", "camedy", "3");

        manager.save(first);
        manager.save(second);
        manager.save(third);

        Movie[] actual = manager.getMovies();
        Movie[] expected = new Movie[]{third, second, first};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void ShouldFindLast10FilmsOutOf10() {
        MovieManager manager = new MovieManager();
        Movie first = new Movie(1, "Bladshot", "action movies", "1");
        Movie second = new Movie(2, "Forward", "cartoon", "2");
        Movie third = new Movie(3, "Hotel Belgrad", "camedy", "3");
        Movie fourth = new Movie(4, "Gentlemen", "action movies", "4");
        Movie fifth = new Movie(5, "The Invisible Man", "horrors", "5");
        Movie sixth = new Movie(6, "Trolls", "cartoon", "6");
        Movie seventh = new Movie(7, "Number one", "camedy", "7");
        Movie eighth = new Movie(8, "University", "camedy", "8");
        Movie ninth = new Movie(9, "Finch", "drama", "9");
        Movie tenth = new Movie(10, "Dune", "fantastic", "10");

        manager.save(first);
        manager.save(second);
        manager.save(third);
        manager.save(fourth);
        manager.save(fifth);
        manager.save(sixth);
        manager.save(seventh);
        manager.save(eighth);
        manager.save(ninth);
        manager.save(tenth);
        Movie[] actual = manager.getMovies();
        Movie[] expected = new Movie[]{tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second, first};

        assertArrayEquals(expected, actual);
    }


    @Test
    public void ShouldFindLast10FilmsOutOf11() {
        MovieManager manager = new MovieManager();
        Movie first = new Movie(1, "Bladshot", "action movies", "1");
        Movie second = new Movie(2, "Forward", "cartoon", "2");
        Movie third = new Movie(3, "Hotel Belgrad", "camedy", "3");
        Movie fourth = new Movie(4, "Gentlemen", "action movies", "4");
        Movie fifth = new Movie(5, "The Invisible Man", "horrors", "5");
        Movie sixth = new Movie(6, "Trolls", "cartoon", "6");
        Movie seventh = new Movie(7, "Number one", "camedy", "7");
        Movie eighth = new Movie(8, "University", "camedy", "8");
        Movie ninth = new Movie(9, "Finch", "drama", "9");
        Movie tenth = new Movie(10, "Dune", "fantastic", "10");
        Movie eleventh = new Movie(11, "Girl", "thriller", "11");

        manager.save(first);
        manager.save(second);
        manager.save(third);
        manager.save(fourth);
        manager.save(fifth);
        manager.save(sixth);
        manager.save(seventh);
        manager.save(eighth);
        manager.save(ninth);
        manager.save(tenth);
        manager.save(eleventh);
        Movie[] actual = manager.getMovies();
        Movie[] expected = new Movie[]{eleventh, tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second};

        assertArrayEquals(expected, actual);
    }


    @Test
    public void shouldSaveMovie() {
        MovieManager manager = new MovieManager();
        Movie first = new Movie(1, "Bladshot", "action movies", "1");

        manager.save(first);
        Movie[] actual = manager.getMovies();
        Movie[] expected = new Movie[]{first};

        assertArrayEquals(expected, actual);
    }


    @Test
    public void ShouldFindLast10FilmsIfThePosterIsEmpty() {
        MovieManager manager = new MovieManager();
        Movie[] actual = manager.getMovies();
        Movie[] expected = new Movie[0];

        assertArrayEquals(expected, actual);
    }

    @Test
    public void ShouldFindLast5FilmsIfThePosterIsEmpty() {
        MovieManager manager = new MovieManager(5);
        Movie[] actual = manager.getMovies();
        Movie[] expected = new Movie[0];

        assertArrayEquals(expected, actual);
    }

    @Test
    public void ShouldFindLast5FilmsOutOf11() {
        MovieManager manager = new MovieManager(5);
        Movie first = new Movie(1, "Bladshot", "action movies", "1");
        Movie second = new Movie(2, "Forward", "cartoon", "2");
        Movie third = new Movie(3, "Hotel Belgrad", "camedy", "3");
        Movie fourth = new Movie(4, "Gentlemen", "action movies", "4");
        Movie fifth = new Movie(5, "The Invisible Man", "horrors", "5");
        Movie sixth = new Movie(6, "Trolls", "cartoon", "6");
        Movie seventh = new Movie(7, "Number one", "camedy", "7");
        Movie eighth = new Movie(8, "University", "camedy", "8");
        Movie ninth = new Movie(9, "Finch", "drama", "9");
        Movie tenth = new Movie(10, "Dune", "fantastic", "10");
        Movie eleventh = new Movie(11, "Girl", "thriller", "11");

        manager.save(first);
        manager.save(second);
        manager.save(third);
        manager.save(fourth);
        manager.save(fifth);
        manager.save(sixth);
        manager.save(seventh);
        manager.save(eighth);
        manager.save(ninth);
        manager.save(tenth);
        manager.save(eleventh);
        Movie[] actual = manager.getMovies();
        Movie[] expected = new Movie[]{eleventh, tenth, ninth, eighth, seventh};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldGet3MoviesInsteadOf5() {
        MovieManager manager = new MovieManager(5);
        Movie first = new Movie(1, "Bladshot", "action movies", "1");
        Movie second = new Movie(2, "Forward", "cartoon", "2");
        Movie third = new Movie(3, "Hotel Belgrad", "camedy", "3");
        manager.save(first);
        manager.save(second);
        manager.save(third);

        Movie[] actual = manager.getMovies();
        Movie[] expected = new Movie[]{third, second, first};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void ShouldFindLast5FilmsOutOf5() {
        MovieManager manager = new MovieManager(5);
        Movie first = new Movie(1, "Bladshot", "action movies", "1");
        Movie second = new Movie(2, "Forward", "cartoon", "2");
        Movie third = new Movie(3, "Hotel Belgrad", "camedy", "3");
        Movie fourth = new Movie(4, "Gentlemen", "action movies", "4");
        Movie fifth = new Movie(5, "The Invisible Man", "horrors", "5");
        manager.save(first);
        manager.save(second);
        manager.save(third);
        manager.save(fourth);
        manager.save(fifth);

        Movie[] actual = manager.getMovies();
        Movie[] expected = new Movie[]{fifth, fourth, third, second, first};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void ShouldFindLast4FilmsOutOf5() {
        MovieManager manager = new MovieManager(5);
        Movie first = new Movie(1, "Bladshot", "action movies", "1");
        Movie second = new Movie(2, "Forward", "cartoon", "2");
        Movie third = new Movie(3, "Hotel Belgrad", "camedy", "3");
        Movie fourth = new Movie(4, "Gentlemen", "action movies", "4");

        manager.save(first);
        manager.save(second);
        manager.save(third);
        manager.save(fourth);


        Movie[] actual = manager.getMovies();
        Movie[] expected = new Movie[]{fourth, third, second, first};

        assertArrayEquals(expected, actual);
    }


}

