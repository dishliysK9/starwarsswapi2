package dev.dishoo.starwarsswapi.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.dishoo.starwarsswapi.service.FilmsService;
import dev.dishoo.starwarsswapi.validation.ObjectValidator;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/films")
@AllArgsConstructor
public class FilmsController {
    
    private ObjectValidator validator;



    private FilmsService filmsService;


}
