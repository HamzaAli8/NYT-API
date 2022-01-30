package demo.consumingAPI.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Multimedia {

    private String subtype;
    private String caption;
    private String credit;
    private String type;
    private String url;
    private Integer height;
    private Integer width;

    @JsonProperty("subtype")
    private String subType;

    @JsonProperty("crop_name")
    private String cropName;



}
