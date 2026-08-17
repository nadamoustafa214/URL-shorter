package module.services;

import lombok.AllArgsConstructor;
import module.entity.Url;
import module.entity.UrlDto;
import module.repostaory.UrlRepo;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
@AllArgsConstructor
public class url {
    private String text="ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789abcdefghijklmnopqrstuvwxyz";
    private int length=15;
    private final  UrlRepo urlRepo;

private String  generateRandomCode(){
    Random random=new Random();
    StringBuilder sb= new StringBuilder(length);
    for(int i=0;i<length;i++){
     int x=   random.nextInt(text.length());
     sb.append(text.charAt(x));
    }
return sb.toString();
}

public String createNewUrl(Url url){
    url.setURLShort(generateRandomCode());
    urlRepo.save(url);
    return url.getURLShort();
}

public String getOrignalUrl(String urlShort){
    Url url = urlRepo.findByURLShort(urlShort).orElseThrow();
    url.setCountClick(url.getCountClick()+1);
    urlRepo.save(url);
    return url.getOrignalURL();
}



}

// function create new url
// need to spcefic lentgh ==>15
























