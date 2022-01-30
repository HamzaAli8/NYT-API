package demo.consumingAPI.service;

import demo.consumingAPI.models.Article;
import demo.consumingAPI.models.NytResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
public class NytService {

    @Value("${api_key}")
    private String apikey;

    @Value("${base_url}")
    private String BaseUrl;

    @Autowired
    RestTemplate restTemplate;

    public List<Article> getArticles(String query){

        NytResponse response = restTemplate.getForObject(BaseUrl + query + "&api-key="+ apikey, NytResponse.class);
        List<Article> results = new ArrayList<>();

                if(response != null && response.getStatus().equals("OK")){

                    return response.getResponse().getDocs();
                } else {

                    return results;
                }
    }
}
