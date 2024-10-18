import modelEntities.department;
import modelEntities.seller;

import java.util.Date;

public class program {
    public static void main(String[] args){
        department obj = new department(1, "Books");
        System.out.println(obj);
        seller seller = new seller(21, "Bob", "bob@gmail.com", new Date(), 3000.0,obj);

        System.out.println(seller);
    }
}
