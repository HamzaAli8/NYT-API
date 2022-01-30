package demo.consumingAPI.models;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Byline {

    String original;
    Person [] person;
    String organization;
}
