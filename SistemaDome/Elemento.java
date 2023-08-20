
public class Elemento
{
    private String titulo;
    private int duracion;
    private boolean loTengo;
    private String comentario;
    
    public Elemento(String elTitulo,int tiempo){
        titulo=elTitulo;
        duracion=tiempo;
        loTengo=false;
        comentario ="";
    }
    
    public void setComentario(String comentario){
        this.comentario=comentario;
    }
    public String getComentario(){
        return comentario;
    }
    
    public void setLoTengo(boolean tengo){
        loTengo=tengo;
    }

    public boolean getLTengo(){
        return loTengo;
    }
    
    public void print(){
        System.out.println("Elemento");
    }
    
    public String getTitulo(){
        return titulo;
    }
}