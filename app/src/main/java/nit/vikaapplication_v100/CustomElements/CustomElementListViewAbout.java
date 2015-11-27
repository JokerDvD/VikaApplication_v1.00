package nit.vikaapplication_v100.CustomElements;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import nit.vikaapplication_v100.Model.AboutInfo;
import nit.vikaapplication_v100.R;

/**
 * Created by Admin on 27.11.2015.
 */
public class CustomElementListViewAbout extends BaseAdapter {

    Context ctx;
    LayoutInflater lInflater;
    ArrayList<AboutInfo> objects;

    CustomElementListViewAbout(Context context, ArrayList<AboutInfo> aboutInfos) {
        this.ctx = context;
        this.objects = aboutInfos;
        lInflater = (LayoutInflater) ctx
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }


    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View view = convertView;

        if (view == null) {
            view = lInflater.inflate(R.layout.custom_list_view_about, parent, false);
        }
        AboutInfo aboutInfo=getAboutInfo(position);
        TextView description=(TextView)view.findViewById(R.id.aboutDescription);
        description.setText(aboutInfo.getAboutInfo());
        TextView tel=(TextView)view.findViewById(R.id.aboutTel);
        tel.setText(aboutInfo.getAboutInfoTelefone());

        ImageView aboutImage=(ImageView)view.findViewById(R.id.aboutImageView);
        aboutImage.setImageResource(aboutInfo.getAboutIcon());

        CheckBox checkBox
                =(CheckBox) view.findViewById(R.id.cbBox);
        ;
        return view;
    }

    private AboutInfo getAboutInfo(int position) {
        return objects.get(position);
    }
}
