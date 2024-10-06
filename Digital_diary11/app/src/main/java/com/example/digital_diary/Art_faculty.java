package com.example.digital_diary;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class Art_faculty extends AppCompatActivity {
    DatabaseReference db1;
    ListView listView;
    ArrayAdapter<String> arrayAdapter1;
    ArrayList<String> list1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_art_faculty);
        db1 = FirebaseDatabase.getInstance().getReference("DeanOfArt");
        listView = findViewById(R.id.listViewart);
        list1 = new ArrayList<String>();  //empty list
        arrayAdapter1 = new ArrayAdapter<String>(getApplicationContext(),R.layout.text_color_layout,list1);
        listView.setAdapter(arrayAdapter1);

        db1.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                list1.clear();
                for (DataSnapshot data : snapshot.getChildren()) {
                    String key = data.getKey();
                    stu obj1 = data.getValue(stu.class);
                    String output ="\n\t\t\t" + obj1.getName() + "\n\t\t\t" + obj1.getPosition()+"\n\t\t\t"+obj1.getNumber()+"\n\t\t\t"+obj1.getMail()+"\n";
                    list1.add(output);
                }
                arrayAdapter1.notifyDataSetChanged();
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String selectedItemData = list1.get(position);
                Intent intent = new Intent(getApplicationContext(), list.class);
                intent.putExtra("selectedData", selectedItemData);
                startActivity(intent);
            }
        });
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_search, menu);
        MenuItem searchItem = menu.findItem(R.id.action_search);
        SearchView searchView = (SearchView) searchItem.getActionView();
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                searchDatabase(newText);
                return true;
            }
        });
        return true;
    }

    private void searchDatabase(String searchText) {
        Query searchQuery = db1.orderByChild("name");
        searchQuery.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                list1.clear();
                for (DataSnapshot data : snapshot.getChildren()) {
                    stu item = data.getValue(stu.class);
                    if (item != null && item.getName().toLowerCase().contains(searchText.toLowerCase())) {
                        String output = "\n\t\t\t" + item.getName() + "\n\t\t\t" + item.getPosition() + "\n\t\t\t" + item.getNumber() + "\n\t\t\t" + item.getMail() + "\n";
                        list1.add(output);
                    }
                }
                arrayAdapter1.notifyDataSetChanged();
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
            }
        });
    }
}