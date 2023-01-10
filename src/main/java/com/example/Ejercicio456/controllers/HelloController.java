package com.example.Ejercicio456.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/saludo")
    public String holaMundo(){

        return """
                <!doctype html>
                                <html lang="en">
                                  <head>
                                    <!-- Required meta tags -->
                                    <meta charset="utf-8">
                                    <meta name="viewport" content="width=device-width, initial-scale=1">
                                               \s
                                    <!-- Bootstrap CSS -->
                                    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
                                               \s
                                    <title>Hello, world!</title>
                                  </head>
                                  <body>
                                    <h1>¡Hola mundo!</h1>
                                    <h2>ʕ◉ᴥ◉ʔ</h2>
                                  </body>
                                </html>
                
                """;

    }
}
