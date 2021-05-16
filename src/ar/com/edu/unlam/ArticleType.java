package ar.com.edu.unlam;

public enum ArticleType {

    ARTICULO_BEBIDA("articulo_bebida"),
    ARTICULO_PERFUME("articulo_perfume");

    private final String name;

    ArticleType(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }


}
