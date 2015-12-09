package nit.vikaapplication_v100.AboutActivity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ExpandableListView;
import android.widget.SimpleExpandableListAdapter;
import android.widget.TextView;

import nit.vikaapplication_v100.R;

/**
 * Created by David on 29.11.2015.
 */
public class AboutActivityLispVeiw extends AppCompatActivity {
    final String LOG_TAG = "myLogs";
    ExpandableListView elvMain;
    AdapterHelper ah;
    SimpleExpandableListAdapter adapter;
    TextView tvInfo;
//

    public void onCreate(Bundle savedInstance) {
        super.onCreate(savedInstance);
        setContentView(R.layout.activity_about_lisp);

        //буфер данных для AdapterHelper
        /*String[] data= getResources().getStringArray(R.array.about_app_arr);
        Intent setDataToAdapterHelper = new Intent(this, AdapterHelper.class);
        setDataToAdapterHelper.putExtra("StringArray",data);
        startActivity(setDataToAdapterHelper);*/

        //буфер дынных

        tvInfo = (TextView) findViewById(R.id.tvInfo);

        //создаем адаптер
        ah = new AdapterHelper(AboutActivityLispVeiw.this);
        adapter = ah.getAdapter();

        elvMain = (ExpandableListView)findViewById(R.id.expandableListView);
        elvMain.setAdapter(adapter);

        //нажатие на элемент
        elvMain.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {
            public boolean onChildClick(ExpandableListView parent, View v,
                                        int groupPosition, int childPosition, long id) {
                Log.d(LOG_TAG, "onChildClick groupPosition = " + groupPosition +
                        " childPosition = " + childPosition +
                        " id = " + id);
               // tvInfo.setText(ah.getGroupChildText(groupPosition, childPosition));
                return false;
            }


            //


        });
        // нажатие на группу
      elvMain.setOnGroupClickListener(new ExpandableListView.OnGroupClickListener() {
            public boolean onGroupClick(ExpandableListView parent, View v,
                                        int groupPosition, long id) {
                Log.d(LOG_TAG, "onGroupClick groupPosition = " + groupPosition +
                        " id = " + id);
                // блокируем дальнейшую обработку события для группы с позицией 1
               // if (groupPosition == 1) return true;

                return false;
            }
        });
        // сворачивание группы
        elvMain.setOnGroupCollapseListener(new ExpandableListView.OnGroupCollapseListener() {
            public void onGroupCollapse(int groupPosition) {
                Log.d(LOG_TAG, "onGroupCollapse groupPosition = " + groupPosition);
                //tvInfo.setText("Свернули " + ah.getGroupText(groupPosition));
            }
        });

        // разворачивание группы
        elvMain.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {
            public void onGroupExpand(int groupPosition) {
                Log.d(LOG_TAG, "onGroupExpand groupPosition = " + groupPosition);
                //tvInfo.setText("Равзвернули " + ah.getGroupText(groupPosition));
            }
        });
//jk
        // разворачиваем группу с позицией 2
        //elvMain.expandGroup(2);
    }

}




