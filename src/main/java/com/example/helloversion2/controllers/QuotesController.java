package com.example.helloversion2.controllers;

import com.example.helloversion2.models.Quote;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Controller
@RequestMapping("/quotes")
public class QuotesController {

    /*private List<String> quotes =
            new ArrayList<>(List.of("citat1", "citat2", "citat3"));
*/
    @GetMapping("/random")
    public ResponseEntity<String> getRandomQuote() {
        List<String> quotes = generateList();
        Random random = new Random();
        int tilfældigtTal = random.nextInt(quotes.size()); //tal ml 0-2
        // ArrayList indeholder 3 citater
        // Udvælg tilfældigt citat fra listen
        return new ResponseEntity<>(quotes.get(tilfældigtTal),HttpStatus.OK); //tilfældigt citat
    }

    @GetMapping("/random2")
    public ResponseEntity<Quote> getRandomQuote2() {
        List<Quote> quotes = generateListOfQuoteObjects();
        Random random = new Random();
        int randomIndex = random.nextInt(quotes.size()); //tal ml 0-list size-1
        return new ResponseEntity<>(quotes.get(randomIndex),HttpStatus.OK);
    }

    private List<String> generateList() {
        ArrayList<String> quotes = new ArrayList<>();
        quotes.add("citat 1");
        quotes.add("citat 2");
        quotes.add("citat 3");
        return quotes;
    }

    private List<Quote> generateListOfQuoteObjects() {
        ArrayList<Quote> quotes = new ArrayList<>();
        quotes.add(new Quote("Bedre sent end aldrig", "Ukendt", "Almen"));
        quotes.add(new Quote("Ude godt, hjemme bedst", "Ukendt", "Almen"));
        quotes.add(new Quote("Den der ler sidst ler bedst", "Ukendt", "Almen"));
        quotes.add(new Quote("Bedre lille og vågen end stor og doven",  "Ukendt", "Almen"));
        quotes.add(new Quote("Det har jeg aldrig gjort før, så det klarer jeg helt sikkert", "Pippi", "Underholdning"));
        quotes.add(new Quote("Du misser 100 procent af de skud, du ikke tager", "Wayne Gretzky", "Sport"));

        return quotes;
    }
}
