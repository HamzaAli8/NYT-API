package demo.consumingAPI.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Article {


    @JsonProperty("web_url")
    private String webUrl;
    private String snippet;

    @JsonProperty("lead_paragraph")
    private String leadParagraph;

    @JsonProperty("print_section")
    private String printSection;

    @JsonProperty("print_page")
    private String printPage;

    private String source;
    private List<Multimedia> multimedia;
    private Headline headline;
    private List<Keyword> keywords;

    @JsonProperty("pub_date")
    private String pubDate;

    @JsonProperty("document_type")
    private String documentType;

    @JsonProperty("news_desk")
    private String newsDesk;
    private String section_name;
    private Byline byline;

    @JsonProperty("type_of_material")
    private String typeOfMaterial;

    @JsonProperty("_id")
    private String id;

    @JsonProperty("word_count")
    private int wordCount;
    private String uri;



}
