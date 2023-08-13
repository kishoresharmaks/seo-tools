import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GeneratorController {

    @PostMapping("/generate-meta-tags")
    public String generateMetaTags(@RequestBody MetaTagRequest request) {
        String metaTitle = request.getMetaTitle();
        String metaDescription = request.getMetaDescription();
        String metaKeywords = request.getMetaKeywords();

        String metaTags = String.format(
            "<meta name=\"title\" content=\"%s\">\n" +
            "<meta name=\"description\" content=\"%s\">\n" +
            "<meta name=\"keywords\" content=\"%s\">\n",
            metaTitle, metaDescription, metaKeywords
        );

        return metaTags;
    }
}

class MetaTagRequest {
    private String metaTitle;
    private String metaDescription;
    private String metaKeywords;

    // Getters and setters
}
