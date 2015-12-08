package nit.vikaapplication_v100.AboutActivity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import nit.vikaapplication_v100.R;
import nit.vikaapplication_v100.RecourseFile.RecourseString;

public class AboutActivity extends AppCompatActivity {

    private ListView lvAbout;
    private List<String> headerArray;
    private ArrayList<String> titleArray;
    private ArrayList<String> bodyArray;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);

        setSupportActionBar(toolbar);

        headerArray = new ArrayList<>();
        titleArray = new ArrayList<>();
        bodyArray = new ArrayList<>();

        String[] headerMass = getResources().getStringArray(R.array.AboutValue);
        String[] titleMass = getResources().getStringArray(R.array.TitleMass);
        String[] bodyMass = getResources().getStringArray(R.array.BodyMass);
/*Оптимизация нужна*/
        for (int i = 0; i < headerMass.length; i++) {

            headerArray.add(headerMass[i]);
            titleArray.add(titleMass[i]);
            bodyArray.add(bodyMass[i]);
        }
        lvAbout = (ListView) findViewById(R.id.lvAbout);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(AboutActivity.this, android.R.layout.simple_list_item_single_choice, headerArray);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        lvAbout.setDividerHeight(3);

        lvAbout.setAdapter(adapter);

        lvAbout.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
/*Выбор элемента листВию и передача данных во фрагмент через bundle*/
                CommonFragment fragment = new CommonFragment();
                Bundle bundle = new Bundle();
                bundle.putString(RecourseString.FragmentHeader, headerArray.get(position));
                bundle.putString(RecourseString.FragmentTitle, titleArray.get(position));
                bundle.putString(RecourseString.FragmentBody, bodyArray.get(position));
                fragment.setArguments(bundle);
                fragment.show(getFragmentManager(), "test");
            }
        });

    }


}
