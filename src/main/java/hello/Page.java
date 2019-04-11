package hello;

public class Page {
    private String title;
    private String content;

    // This is the constructor
    public Page(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public String getTitle() {
        return this.title;
    }

    public String getContent() {
        return this.content;
    }

    public String getHtml() {
        String html = "";
        html += "<h1>" + this.title + "</h1>";
        html += "<p>" + this.content + "</p>";
        return html; 
    }


}