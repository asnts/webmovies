package br.com.project.webmovies.controller;

import br.com.project.webmovies.routes.MovieOmdb;
import br.com.project.webmovies.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/filme")
public class MovieController {

    @Autowired
    private MovieService movieService;

    @GetMapping("/omdb/{tema}")
    public ResponseEntity<MovieOmdb> getMovie(@PathVariable String tema){
        try {
            MovieOmdb movieOmdb = (MovieOmdb) movieService.getMovie(tema);
            return ResponseEntity.status(HttpStatus.OK).body(movieOmdb);
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }

    }
}
