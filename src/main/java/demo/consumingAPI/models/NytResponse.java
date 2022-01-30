package demo.consumingAPI.models;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class NytResponse {

    private String status;
    private String copyright;
    private Response response;
}
