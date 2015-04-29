package concesionario;

import java.util.ArrayList;

public class Principal {
	public static void main(String[]args){
	ArrayList<Object>lista=new ArrayList<Object>();
	Cliente c1=new Cliente("Juan",26,"Segovia",680232609);
	Cliente c2=new Cliente("Sara",29,"Ávila",680232817);
	Cliente c3=new Cliente("Pepe",30,"Salamanca",680232908);
	Cliente c4=new Cliente("Laura",20,"Segovia",680232605);
	Vendedor v1=new Vendedor("Eduardo",01,680232601);
	Vendedor v2=new Vendedor("Amanda",02,680232602);
	Vendedor v3=new Vendedor("Luis",03,680232603);
	Vendedor v4=new Vendedor("Elena",04,680232604);
    Coche coche1=new Coche(1111,"Alfa Romeo","4C",2011);
    Coche coche2=new Coche(1112,"Audi","A5",2010);
    Coche coche3=new Coche(1113,"BMW","Serie 3",2012);
    Coche coche4=new Coche(1114,"Dacia","Sandero",2013);
    
    lista.add(0,c1);
    lista.add(1, c2);
    lista.add(2, c3);
    lista.add(3, c4);
    lista.add(4, coche1);
    lista.add(5, coche2);
    lista.add(6, coche3);
    lista.add(7, coche4);
    lista.add(8, v1);
    lista.add(9, v2);
    lista.add(10, v3);
    lista.add(11, v4);
    
    for(int i=0; i<lista.size(); i++){
    	System.out.println(lista.get(i));
    }

}
}
