package me.creatorguy.androidlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    private static ListView lvMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvMain = findViewById(R.id.lvMain);

        String[] restaurants = { "Chipotle", "Burger King", "Pizza Hut", "Cheese Cake Factory", "Benihana", "Hu Hot", "Andalous", "Zoes", "In & Out Burger", "LA Burger", "Riverside Thai", "Sushi Place", "Fast N Furious" };
        ListAdapter listAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, restaurants);
        lvMain.setAdapter(listAdapter);
        lvMain.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        String clickedRestaurant = adapterView.getItemAtPosition(i).toString();
        Toast.makeText(this, clickedRestaurant, Toast.LENGTH_SHORT).show();
    }
}