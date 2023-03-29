package principal;

import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.JOptionPane;

import logica.Canino;
import logica.Gato;
import logica.MejorAmigo;
import logica.Perro;
import logica.Raza;
import logica.Pulga;

public class App {
    public static void main(String[] args) throws Exception {
        Perro sasha = new Perro("Sasha",Raza.Pug,(byte)40, "pequeños","pacito",true);
        System.out.println(sasha.getNombre());
        
        sasha.insertarPulga(new Pulga("Grillo",5000));
        
        Pulga pulguita = new Pulga("Eva", 5000);
        sasha.insertarPulga(pulguita);
        sasha.imprimirPulgas();
        
        String nombres[] = {"Ana","Mateo","Maroa"};
        System.out.println(Arrays.toString(nombres));
        
        pulguita = null;
        System.gc();
        
        //Perro perrito = new Perro("X",Raza.Labrador,(byte)40,"grandotes", "durisimo",false);
        System.out.println(Perro.NUMERO_PERROS);
        JOptionPane.showMessageDialog(null, "hola", "titidsf", 0);
        Perro.ladran();
        //perrito = null;
        Gato gatico = new Gato();
        MejorAmigo amigo = new Gato();
        MejorAmigo amigo2 = new Perro("X",Raza.Labrador,(byte)40,"grandotes", "durisimo",false);
        Canino canino = new Perro("X",Raza.Labrador,(byte)40,"grandotes", "durisimo",false);
        
        System.gc(); // para la basura de memoria

        ArrayList<MejorAmigo> lista = new ArrayList<>();
        lista.add(gatico);
        lista.add(sasha);
        lista.add(amigo);

    }
}
