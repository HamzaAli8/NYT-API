package demo.consumingAPI.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Person {

    @JsonProperty("firstname")
    private String firstName;

    @JsonProperty("middlename")
    private String middleName;

    @JsonProperty("lastname")
    private String lastName;


    private String qualifier;
    private String title;
    private String role;
    private String organization;
    private Integer rank;


}
