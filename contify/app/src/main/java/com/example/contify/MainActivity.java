package com.example.contify;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        Elements Carbon = new Elements("Carbon",12.0107, R.drawable.carbon,"C",6,"carbon dioxide");
        Elements Oxygen = new Elements("Oxygen",15.999, R.drawable.oxygen,"O",8,"Water");
        Elements Hydrogen = new Elements("Hydrogen",11.007, R.drawable.hydrogen,"H",1,"Water");
        Elements Lithium= new Elements("Lithium",6.938, R.drawable.lithium,"Li",3,"rechargeable batteries");
        Elements Beryllium = new Elements("Beryllium",9.012, R.drawable.beryllium,"Be",4,"gears and cogs");
        Elements Helium = new Elements("Helium",4.002, R.drawable.helium,"He",2,"Earth's atmosphere");
        Elements Boron = new Elements("Boron",10.806, R.drawable.boron,"B",5,"supplements as medicine");
        Elements Nitrogen = new Elements("Nitrogen",14.006, R.drawable.nitrogen,"N",7,"Earth's atmosphere");
         Elements Fluorine = new Elements("Fluorine",18.998, R.drawable.flourine,"F",9,"Toothpaste");

        Elements Neon = new Elements("Neon",20.1797, R.drawable.neon,"Ne",10,"earth's crust ");
        Elements Sodium = new Elements("Sodium",22.989, R.drawable.sodium,"Na",11,"common salt");
//        Elements Magnesium = new Elements("Magnesium",24.304, R.drawable.magnesium,"Mg",12,"plant and animal foods");
//        Elements Aluminium = new Elements("Aluminium",26.981, R.drawable.aluminium,"Al",13);
//        Elements Silicon = new Elements("Silicon",28.084, R.drawable.silicon,"Si",14,"cosmic dusts");
//        Elements Phosphorus = new Elements("Phosphorus",12.0107, R.drawable.phosphorus,"P",15,"compounds in mineralsv");
//        Elements Sulfur = new Elements("Sulfur",32.059, R.drawable.sulfur,"S",16);
//        Elements Chlorine = new Elements("Chlorine",35.446, R.drawable.chlorine,"Cl",17);
//        Elements Argon = new Elements("Argon",39.792, R.drawable.argon,"Ar",18);
//        Elements Potassium = new Elements("Potassium",39.0983, R.drawable.potassium,"K",19);
//        Elements Calcium = new Elements("Calcium",40.078, R.drawable.calcium,"Ca",20);



        ArrayList elements = new ArrayList<Elements>();

        elements.add(Carbon);
        elements.add(Oxygen);
        elements.add(Hydrogen);
        elements.add(Lithium);
        elements.add(Beryllium);
        elements.add(Helium);
        elements.add(Boron);
        elements.add(Nitrogen);
       elements.add(Fluorine);
      elements.add(Neon);
        elements.add(Sodium);
//        elements.add(Magnesium);
//        elements.add(Aluminium);
//        elements.add(Silicon);
//        elements.add(Phosphorus);
//        elements.add(Sulfur);
//        elements.add(Chlorine);
//        elements.add(Argon);
//        elements.add(Potassium);
//        elements.add(Calcium);


        RecyclerView rv = findViewById(R.id.rec);
        rv.addItemDecoration(new DividerItemDecoration(this,DividerItemDecoration.VERTICAL));
        rv.setHasFixedSize(true);
        RecyclerView.LayoutManager lm = new LinearLayoutManager(this);
        rv.setLayoutManager(lm);

        Adap ad = new Adap(elements,this);
        rv.setAdapter(ad);
    }
}