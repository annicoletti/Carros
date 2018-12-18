package carros;

import sorter.Sorteable;
import sorter.SortedList;

/**
 *
 * @author NICOLETTI A.
 */
        
public class Automoveis implements Sorteable {
    
    private String modelo;
    private int ano;
    
    public Automoveis(){
        this.modelo = "";
        this.ano = 0;
    }
    
    public Automoveis(String modelo, int ano){
        this.modelo = modelo;
        this.ano = ano;
    }
    
    public void setNome(String modelo){
        this.modelo = modelo;
    }
    
    public void setano(int ano){
        this.ano = ano;
    }
    
    public String getModelo(){
        return modelo;
    }
    
    public int getAno(){
        return ano;
    }
    
    @Override
    public void print(){
        System.out.println(modelo + " - " + ano);
    }
    
    
    @Override
    public int compare (Sorteable item){
        if(!(item instanceof Automoveis)){
            return 0;
        }
        else{
            Automoveis al = (Automoveis)item;
            
            if (al.ano < ano){
                return -1;
            }
            else if(al.ano > ano){
                return 1;
            }
            return 0;
        }
    }
    
    public static void main(String[] args) {
        SortedList sl;
        sl = new SortedList(10);
        sl.add(new Automoveis("Palio",5));
        sl.add(new Automoveis("Gol",9));
        sl.add(new Automoveis("Focus",3));
        sl.add(new Automoveis("Xana",2));
        sl.add(new Automoveis("Uno",0));
        sl.add(new Automoveis("Kwid",8));
        sl.add(new Automoveis("Logan",10));
        sl.add(new Automoveis("Onix",12));
        sl.add(new Automoveis("Spin",1));
        sl.add(new Automoveis("Capitva",15));
        
        sl.sort();
        sl.printAll();
    }
}
