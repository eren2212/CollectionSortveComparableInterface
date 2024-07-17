
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;


class buyuktenKucugeString implements Comparator<String>{

    @Override
    public int compare(String o1, String o2) {
        return -o1.compareTo(o2);
    }
   
    
}

class kucuktenBuyugeidPlayer implements Comparator<Player>{

    @Override
    public int compare(Player p1, Player p2) {
        if(p1.id<p2.id){
            return -1;
        }
        else if(p1.id>p2.id){
            return 1;
        }
        else{
            return 0;
        }
    }
}

class kucuktenBuyugeStringPlayer implements Comparator<Player>{

    @Override
    public int compare(Player p1, Player p2) {
        return -p1.isim.compareTo(p2.isim);
    }
    
}

//burada Comparable bunu implement ettik ve ovveride ettik metodu.
/*Burada kendi objemizi sıralamak istiyorsak Comparable bunu implement etmek zorundayz */
class Player {
        public String isim;
        public int id;

        @Override
        public int hashCode() {
            int hash = 5;
            hash = 29 * hash + Objects.hashCode(this.isim);
            hash = 29 * hash + this.id;
            return hash;
        }

        @Override
        public String toString() {
            return   "  id = " + id +" isim = " + isim ;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null) {
                return false;
            }
            if (getClass() != obj.getClass()) {
                return false;
            }
            final Player other = (Player) obj;
            if (this.id != other.id) {
                return false;
            }
            if (!Objects.equals(this.isim, other.isim)) {
                return false;
            }
            return true;
        }

        public Player(String isim,int id) {
            this.isim = isim;
            this.id=id;
        }

   /* @Override
    //biz burada kendimiz id ye göre sıraladık
    public int compareTo(Player player) {
       if(this.id<player.id){
           return -1;
       }
       else if(this.id>player.id){
           return 1;
       }
       else{
           return 0;
       }
    }*/
       
        
}
public class Main {
    
    
    public static void main(String[] args) {
        
        /*
        List<String> liste = new ArrayList<String>();
        
        liste.add("PHP");
        liste.add("Pyhton");
        liste.add("javascript");
        liste.add("C++");
        liste.add("JAVA");
        
        Collections.sort(liste);
        
        for(String s:liste){
            System.out.println(s);
        }*/
        
        /*List<Player> liste = new ArrayList<Player>();
        
        liste.add(new Player("eren", 0));
        liste.add(new Player("melih", 10));
        liste.add(new Player("veli", 20));
        liste.add(new Player("ümit", 1));
        liste.add(new Player("Fahriye", 5));
        
        Player p1 = new Player("murat", 5);
        Player p2 = new Player("Messi", 4);
        
        //System.out.println(p2.compareTo(p1));
        Collections.sort(liste);
        
        for(Player p:liste){
            System.out.println(p);
        }
        
        */
        
        //tree set kendisi sıralıyor comparatore metoduna göre sıralıyor.
       /* Set<Player> treeSet = new TreeSet<Player>();
        
        treeSet.add(new Player("eren", 0));
        treeSet.add(new Player("melih", 10));
        treeSet.add(new Player("veli", 20));
        treeSet.add(new Player("ümit", 1));
        treeSet.add(new Player("Fahriye", 5));
        
        
        for(Player p:treeSet){
            System.out.println(p);
        }
        */
      
       
//burası direkt string
       /*List<String> liste = new ArrayList<String>();
       
        liste.add("PHP");
        liste.add("Pyhton");
        liste.add("javascript");
        liste.add("C++");
        liste.add("JAVA");
        
        Collections.sort(liste, new buyuktenKucugeString());
        
        
        for(String s:liste){
            System.out.println(s);
        }*/
       
        
        //burası Player objesini karşılaştırıyor .
        
       List<Player> liste = new ArrayList<Player>();
       
        liste.add(new Player("eren", 0));
        liste.add(new Player("melih", 10));
        liste.add(new Player("veli", 20));
        liste.add(new Player("ümit", 1));
        liste.add(new Player("fahriye", 5));
        
        Collections.sort(liste, new kucuktenBuyugeStringPlayer());
        
        
        for(Player p :liste){
            System.out.println(p);
        }
        
       

    }
}
