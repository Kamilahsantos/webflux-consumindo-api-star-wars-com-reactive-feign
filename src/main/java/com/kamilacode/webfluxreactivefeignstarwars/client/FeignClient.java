package com.kamilacode.webfluxreactivefeignstarwars.client;


import com.kamilacode.webfluxreactivefeignstarwars.response.FilmsResponse;
import com.kamilacode.webfluxreactivefeignstarwars.response.PeopleResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import reactivefeign.spring.config.ReactiveFeignClient;
import reactor.core.publisher.Mono;

@ReactiveFeignClient(url = "https://swapi.dev/api/", name = "star-wars")
public interface FeignClient {

    @GetMapping("/people/{id}")
    Mono<PeopleResponse> getPeopleById(@RequestParam(value = "id") String id);

    @GetMapping("/films/{id}")
    Mono<FilmsResponse> getFilmById(@RequestParam(value = "id") String id);

}
