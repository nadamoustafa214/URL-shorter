package module.controller;

import lombok.AllArgsConstructor;
import module.entity.Url;
import module.services.url;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.net.URI;

@RestController
@AllArgsConstructor
public class UrlController {
     private final url url;

     @PostMapping("/api/shorten")
public ResponseEntity<String> shortenUrl(@RequestBody Url urls){
         return ResponseEntity.ok(url.createNewUrl(urls));
}

@GetMapping("/{shortUrl}")
public ResponseEntity<Void> redirectUrl(@PathVariable String shortUrl){
  String orignalurl=       url.getOrignalUrl(shortUrl);
    HttpHeaders headers=new HttpHeaders();
    headers.setLocation(URI.create(orignalurl));
    return  new ResponseEntity<>(headers, HttpStatus.FOUND);

}

}
