package demo.consumingAPI.models;

import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Response {

    private List<Article> docs;
    private Meta meta;
}
