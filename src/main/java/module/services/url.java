package module.services;

import lombok.AllArgsConstructor;
import module.entity.Url;
import module.entity.UrlDto;
import module.repostaory.UrlRepo;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
@AllArgsConstructor
public class url {
    private String text="ABCDDEFGHIJKLMNOPQRSTUVWXYZ0123456789abcdefghijklmnopqrstuvwxyz";
    private int length=15;
    private final  UrlRepo urlRepo;

private StringBuilder  generateRandomCode(){
    Random random=new Random();
    StringBuilder sb= new StringBuilder(length);
    for(int i=0;i<length;i++){
     int x=   random.nextInt(text.length());
     sb.append(text.charAt(x));
    }
return sb;
}

private void createNewUrl(Url urlDto){
    urlRepo.save(urlDto);


}



}

// function create new url
// need to spcefic lentgh ==>15
























