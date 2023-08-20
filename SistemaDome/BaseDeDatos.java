import java.util.ArrayList;

public class BaseDeDatos
{
    private ArrayList<Elemento> items;

    public BaseDeDatos(){
        items = new ArrayList<Elemento>();
    }
    
    public void addElemento(Elemento elElemento){
        items.add(elElemento);
    }
    public void lits(){
        for(Elemento item : items){
            item.print();
            System.out.println();
        }
    }
    
}
