package ramsandroidproject.com.ramapps2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class enudemo extends AppCompatActivity {
    ListView lv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enudemo);
        lv1 = (ListView)findViewById(R.id.lv1);
        String items [] = {"Soma","Pavan","Mahesh","Avinash","Rajesh","Srinivas","Ram","Rakesh"};
        ArrayAdapter aa = new ArrayAdapter(this,android.R.layout.simple_dropdown_item_1line,items);
        lv1.setAdapter(aa);
    }
}
