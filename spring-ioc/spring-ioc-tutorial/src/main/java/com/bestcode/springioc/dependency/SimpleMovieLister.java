package com.bestcode.springioc.dependency;

/**
 * pojo class
 *
 * @author <a href="mailto:1205241831@qq.com">Xch</a>
 * @version 1.00
 * @see
 * @since 2018.09.02
 */
public class SimpleMovieLister {

    /**
     * the SimpleMovieLister has a dependency on a MovieFinder
     */
    private MovieFinder movieFinder;

    /**
     * a constructor so that the Spring container can inject a MovieFinder
     * @param movieFinder
     */
    public SimpleMovieLister(MovieFinder movieFinder) {
        this.movieFinder = movieFinder;
    }

    public MovieFinder getMovieFinder() {
        return movieFinder;
    }

    // business logic that actually uses the injected MovieFinder is omitted...
}
