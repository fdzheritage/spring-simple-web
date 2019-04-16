package simpleweb.menu;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.Table;
import javax.persistence.OneToOne;
import javax.persistence.JoinColumn;
import javax.persistence.CascadeType;
import simpleweb.page.Page;

@Entity 
@Table (name="menu")
public class MenuItem {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;

    @Column(name = "label")
    private String label;

    @Column( name = "order")
    private Integer order;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(unique = true)
    private Page page;

    public MenuItem() {

    }

    public Integer getId(){
        return this.id;
    }    

    public String getLabel() {
        return this.label;
    }

    public void setLabel(String label){
        this.label = label;
    }

    public Integer getOrder() {
        return this.order;
    }

    public void setOrder( Integer order){
        this.order = order;
    }

    public void setPage(Page page) {
        this.page = page;
    }

    public Page getPage() {
        return this.page;
    }

    
}