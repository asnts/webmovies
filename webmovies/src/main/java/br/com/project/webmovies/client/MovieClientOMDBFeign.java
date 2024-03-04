package br.com.project.webmovies.client;

 import br.com.project.webmovies.routes.MovieOmdb;
 import org.springframework.cloud.openfeign.FeignClient;
 import org.springframework.web.bind.annotation.RequestMapping;
 import org.springframework.web.bind.annotation.RequestMethod;
 import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value="omdbFilmes", url="https:/www.omdbapi.com/")
public interface MovieClientOMDBFeign {


 @RequestMapping(method = RequestMethod.GET)
 MovieOmdb getMovie(@RequestParam("t") String tema, @RequestParam("apiKey") String key);

}
