package demo.consumingAPI.models;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Keyword {

    private String name;
    private String value;
    private Integer rank;
    private String major;


}
