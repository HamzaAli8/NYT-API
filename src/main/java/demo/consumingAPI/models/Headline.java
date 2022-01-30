package demo.consumingAPI.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Headline {

    private String main;
    @JsonProperty("print_headline")
    private String printHeadline;


}
