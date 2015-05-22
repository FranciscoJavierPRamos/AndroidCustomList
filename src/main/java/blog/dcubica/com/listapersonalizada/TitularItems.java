package blog.dcubica.com.listapersonalizada;

/**
 * Created by Estacion1 on 11/02/2015.
 */
public class TitularItems {
    String title; // Título del item
    String description; // Descripción del item
    int img; // Imagen del item

    // Constructor por defecto de la clase
    public TitularItems(){}

    // Constructor con parámetros para inicializar el item
    public TitularItems(String _title, String _description, int _img){
        this.title = _title;
        this.description = _description;
        this.img = _img;
    }

    // Aqui inicia el GET y el SET para cada propiedad de la clase
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }
}
