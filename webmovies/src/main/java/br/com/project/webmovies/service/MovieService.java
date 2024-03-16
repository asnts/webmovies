package br.com.project.webmovies.service;

import br.com.project.webmovies.client.MovieClientOMDBFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class MovieService {

    @Value("${imdb.apiKey}")
    private String apiKey;

    @Autowired
    private MovieClientOMDBFeign movieClientOMDBFeign;

    public MovieService(MovieClientOMDBFeign movieClientOMDBFeign) {
        this.movieClientOMDBFeign = movieClientOMDBFeign;
    }

    public MovieClientOMDBFeign getMovie(String tema) {
        return (MovieClientOMDBFeign) movieClientOMDBFeign.getMovie(tema, apiKey);
    }
}
