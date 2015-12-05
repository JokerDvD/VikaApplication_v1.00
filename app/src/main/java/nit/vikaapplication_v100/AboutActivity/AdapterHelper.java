package nit.vikaapplication_v100.AboutActivity;

import android.content.Context;
import android.widget.SimpleExpandableListAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.ResourceBundle;

/**
 * Created by David on 30.11.2015.
 *//*public class AdapterHelper {

    final String ATTR_GROUP_NAME= "groupName";
    final String ATTR_PHONE_NAME= "phoneName";


    // названия компаний (групп)
    String[] groups = new String[] {"HTC", "Samsung", "LG"};

    // названия телефонов (элементов)
    String[] phonesHTC = new String[] {"Sensation", "Desire", "Wildfire", "Hero"};
    String[] phonesSams = new String[] {"Galaxy S II", "Galaxy Nexus", "Wave"};
    String[] phonesLG = new String[] {"Optimus", "Optimus Link", "Optimus Black", "Optimus One"};

    // коллекция для групп
    ArrayList<Map<String, String>> groupData;

    // коллекция для элементов одной группы
    ArrayList<Map<String, String>> childDataItem;

    // общая коллекция для коллекций элементов
    ArrayList<ArrayList<Map<String, String>>> childData;
    // в итоге получится childData = ArrayList<childDataItem>

    // список аттрибутов группы или элемента
    Map<String, String> m;

    Context ctx;

    AdapterHelper(Context _ctx) {
        ctx = _ctx;
    }

    SimpleExpandableListAdapter adapter;


    SimpleExpandableListAdapter getAdapter() {

        // заполняем коллекцию групп из массива с названиями групп
        groupData = new ArrayList<Map<String, String>>();
        for (String group : groups) {
            // заполняем список аттрибутов для каждой группы
            m = new HashMap<String, String>();
            m.put(ATTR_GROUP_NAME, group); // имя компании
            groupData.add(m);
        }

        // список аттрибутов групп для чтения
        String groupFrom[] = new String[] {ATTR_GROUP_NAME};
        // список ID view-элементов, в которые будет помещены аттрибуты групп
        int groupTo[] = new int[] {android.R.id.text1};


        // создаем коллекцию для коллекций элементов
        childData = new ArrayList<ArrayList<Map<String, String>>>();

        // создаем коллекцию элементов для первой группы
        childDataItem = new ArrayList<Map<String, String>>();
        // заполняем список аттрибутов для каждого элемента
        for (String phone : phonesHTC) {
            m = new HashMap<String, String>();
            m.put(ATTR_PHONE_NAME, phone); // название телефона
            childDataItem.add(m);
        }
        // добавляем в коллекцию коллекций
        childData.add(childDataItem);

        // создаем коллекцию элементов для второй группы
        childDataItem = new ArrayList<Map<String, String>>();
        for (String phone : phonesSams) {
            m = new HashMap<String, String>();
            m.put(ATTR_PHONE_NAME, phone);
            childDataItem.add(m);
        }
        childData.add(childDataItem);

        // создаем коллекцию элементов для третьей группы
        childDataItem = new ArrayList<Map<String, String>>();
        for (String phone : phonesLG) {
            m = new HashMap<String, String>();
            m.put(ATTR_PHONE_NAME, phone);
            childDataItem.add(m);
        }
        childData.add(childDataItem);

        // список аттрибутов элементов для чтения
        String childFrom[] = new String[] {ATTR_PHONE_NAME};
        // список ID view-элементов, в которые будет помещены аттрибуты элементов
        int childTo[] = new int[] {android.R.id.text1};

        adapter = new SimpleExpandableListAdapter(
                ctx,
                groupData,
                android.R.layout.simple_expandable_list_item_1,
                groupFrom,
                groupTo,
                childData,
                android.R.layout.simple_list_item_1,
                childFrom,
                childTo);

        return adapter;
    }

    String getGroupText(int groupPos) {
        return ((Map<String,String>)(adapter.getGroup(groupPos))).get(ATTR_GROUP_NAME);
    }

    String getChildText(int groupPos, int childPos) {
        return ((Map<String,String>)(adapter.getChild(groupPos, childPos))).get(ATTR_PHONE_NAME);
    }

    String getGroupChildText(int groupPos, int childPos) {
        return getGroupText(groupPos) + " " +  getChildText(groupPos, childPos);
    }
}*/
    public class AdapterHelper
{




        final String ATTR_GROUP_NAME = "groupName";
        final String ATTR_ABOUT_NAME = "aboutName";

        //name of about's (group)


        //Bundle extras = intent.getExtras();
        // String[] groups = ctx.getResources().getStringArray(R.array.about_app_arr); //new String[]{"О приложении", "Что такое KIZ?", "Как проверить товар?"};
        String[] groups = new String[]{"О приложении", "Что такое KIZ?", "Как проверить товар?"};
       // String[] groups = getResources().getStringArray(R.array.about_app_arr);//new String[]{"О приложении", "Что такое KIZ?", "Как проверить товар?"};


        //name of about's (elements)
       String[] aboutApp = new String[]{"Информация предоставлена международной\n" +
                "ассоциацией цифрового кодирования GS1…\t" +
                "Приложение разработано АО\t" +
                "«Национальные информационные\n" +
                "технологии» в рамках исполнения\n" +
                " соглашения…\n" +

                "\nИнформация предоставлена международной\n" +
                "ассоциацией цифрового кодирования GS1…\n" +
                "Приложение разработано АО\n" +
                "«Национальные информационные\n" +
                "технологии» в рамках исполнения\n" +

                "соглашения…\n" +

                "\nИнформация предоставлена международной\n" +
                "ассоциацией цифрового кодирования GS1…\n" +
                "Приложение разработано АО\n" +
                "«Национальные информационные\n" +
                "технологии» в рамках исполнения\n" +
                "соглашения…"};

   /* Context context =
    String[] aboutApp = ;*/
        String[] aboutKIZ = new String[]{"Galaxy S II", "Galaxy Nexus", "Wave"};
        String[] aboutAppT = new String[]{"Optimus", "Optimus Link", "Optimus Black", "Optimus One"};

        //
        ArrayList<Map<String, String>> groupData;
        //
        ArrayList<Map<String, String>> childDataItem;
        //
        ArrayList<ArrayList<Map<String, String>>> childData;

        Map<String, String> m;

        Context ctx1;
    private ResourceBundle resources;

    AdapterHelper(Context _ctx) {
            ctx1 = _ctx;
        }

        SimpleExpandableListAdapter adapter;

        SimpleExpandableListAdapter getAdapter ()
        {
            groupData = new ArrayList<Map<String, String>>();
            for (String group : groups) {
                m = new HashMap<String, String>();
                m.put(ATTR_GROUP_NAME, group);
                groupData.add(m);
            }
            String groupFrom[] = new String[]{ATTR_GROUP_NAME};

            int groupTo[] = new int[]{android.R.id.text1};

            childData = new ArrayList<ArrayList<Map<String, String>>>();
            childDataItem = new ArrayList<Map<String, String>>();

            for (String aboutElement : aboutApp) {
                m = new HashMap<String, String>();
                m.put(ATTR_ABOUT_NAME, aboutElement); // название телефона
                childDataItem.add(m);
            }
            childData.add(childDataItem);

            //second Item

            childDataItem = new ArrayList<Map<String, String>>();

            for (String aboutElement : aboutKIZ) {
                m = new HashMap<String, String>();
                m.put(ATTR_ABOUT_NAME, aboutElement);
                childDataItem.add(m);
            }

            childData.add(childDataItem);

            // создаем коллекцию элементов для третьей группы
            childDataItem = new ArrayList<Map<String, String>>();

            for (String aboutElements : aboutAppT) {
                m = new HashMap<String, String>();
                m.put(ATTR_ABOUT_NAME, aboutElements);
                childDataItem.add(m);
            }
            childData.add(childDataItem);

            //lisp for read
            String childFrom[] = new String[]{ATTR_ABOUT_NAME};
            //lisp ID
            int childTo[] = new int[]{android.R.id.text1};

            adapter = new SimpleExpandableListAdapter(
                    ctx1,
                    groupData,
                    android.R.layout.simple_expandable_list_item_1,
                    groupFrom,
                    groupTo,
                    childData,
                    android.R.layout.simple_list_item_1,
                    childFrom,
                    childTo
            );
            return adapter;

        }
        String getGroupText ( int groupPos){
            return ((Map<String, String>) (adapter.getGroup(groupPos))).get(ATTR_GROUP_NAME);
        }

        String getChildText ( int groupPos, int childPos){
            return ((Map<String, String>) (adapter.getChild(groupPos, childPos))).get(ATTR_ABOUT_NAME);
        }

        String getGroupChildText ( int groupPos, int childPos){
            return getGroupText(groupPos) + " " + getChildText(groupPos, childPos);


        }




}
