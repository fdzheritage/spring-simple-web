package springsimpleweb;

import javax.persistence.Table;
import javax.persistence.Entity;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Table(name="page")
public class Page {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="pageId")
    private Integer id;

    @Column(name="pageKey", unique=true)
    private String pageKey; // default: page_key

    @Column(name="title")
    private String title;

    @Column(name="content")
    private String content;

    // Constructor
    public Page(String pageKey, String title, String content) {
        this.pageKey = pageKey;
        this.title = title;
        this.content = content;
    }

    public String getPageKey() {
        return this.pageKey;
    }

    public void setPageKey(String pageKey) {
        this.pageKey = pageKey;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public String getContent() {
        return this.content;
    }

    public void setContent(String content) {
        this.content = content;
    }

}