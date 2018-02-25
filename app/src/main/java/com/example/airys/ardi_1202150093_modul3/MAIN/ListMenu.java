package com.example.airys.ardi_1202150093_modul3.MAIN;

import java.util.ArrayList;
import com.example.airys.ardi_1202150093_modul3.R;

/**
 * Created by airys on 24/02/18.
 */

public class ListMenu {

    public static ArrayList<Menu> getMenu(){
        ArrayList<Menu>menu= new ArrayList<>();

        Menu makanan1 = null;

        makanan1 = new Menu();
        makanan1.setName("Aqua");
        makanan1.setHarga("ini adalah air mineral merek Aqua");
        makanan1.setImage(R.drawable.aqua);
        menu.add(makanan1);

        makanan1 = new Menu();
        makanan1.setName("Pristine");
        makanan1.setHarga("ini adalah air mineral merek Pristine");
        makanan1.setImage(R.drawable.pristine);
        menu.add(makanan1);

        makanan1 = new Menu();
        makanan1.setName("LeMinerale");
        makanan1.setHarga("ini adalah air mineral merek LeMinerale");
        makanan1.setImage(R.drawable.leminerale);
        menu.add(makanan1);

        makanan1 = new Menu();
        makanan1.setName("Cleo");
        makanan1.setHarga("ini adalah air mineral merek  Cleo");
        makanan1.setImage(R.drawable.cleo);
        menu.add(makanan1);

        makanan1 = new Menu();
        makanan1.setName("Club");
        makanan1.setHarga("ini adalah air mineral merek Club");
        makanan1.setImage(R.drawable.club);
        menu.add(makanan1);

        makanan1 = new Menu();
        makanan1.setName("Equil");
        makanan1.setHarga("ini adalah air mineral merek Equil");
        makanan1.setImage(R.drawable.equil);
        menu.add(makanan1);

        makanan1 = new Menu();
        makanan1.setName("Amidis");
        makanan1.setHarga("ini adalah air mineral merek Amidis");
        makanan1.setImage(R.drawable.amidis);
        menu.add(makanan1);

        makanan1 = new Menu();
        makanan1.setName("Evian");
        makanan1.setHarga("ini adalah air mineral merek Evian");
        makanan1.setImage(R.drawable.evian);
        menu.add(makanan1);

        makanan1 = new Menu();
        makanan1.setName("Ades");
        makanan1.setHarga("ini adalah air mineral merek Ades");
        makanan1.setImage(R.drawable.ades);
        menu.add(makanan1);




        return menu;
    }

}
