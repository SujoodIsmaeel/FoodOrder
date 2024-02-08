package Domain;

public class CafeteriesDomain {
    private String title;
    private String picture;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String pic) {
        this.picture = picture;
    }

    public CafeteriesDomain(String title ,String picture ) {
        this.title = title;
        this.picture= picture;
    }
}
