package il.co.dmobile.myapplication_2;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.prefs.Preferences;

public class DataPersistencyHelper {

    public static Context context;

    public static void storeData(List<User> users) {
        SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(context);
        SharedPreferences.Editor etitor = sp.edit();
        String json = new Gson().toJson(users);
        etitor.putString("users",json);
        etitor.commit();
    }

    public static List<User> loadData() {
        SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(context);
        String json = sp.getString("users",null);
        if (json != null) {
            Type type = new TypeToken<List<User>>(){}.getType();
            return new Gson().fromJson(json,type);
        } else {
            List<User> users = new ArrayList<>();
            users.add(new User(R.drawable.avatar1,"Contact 1","contact1@post.runi.ac.il"));
            users.add(new User(R.drawable.avatar2,"Contact 2","contact2@post.runi.ac.il"));
            users.add(new User(R.drawable.avatar3,"Contact 3","contact3@post.runi.ac.il"));
            users.add(new User(R.drawable.avatar4,"Contact 4","contact4@post.runi.ac.il"));
            users.add(new User(R.drawable.avatar5,"Contact 5","contact5@post.runi.ac.il"));
            users.add(new User(R.drawable.avatar6,"Contact 6","contact6@post.runi.ac.il"));
            users.add(new User(R.drawable.avatar7,"Contact 7","contact7@post.runi.ac.il"));
            users.add(new User(R.drawable.avatar8,"Contact 8","contact8@post.runi.ac.il"));
            return users;
        }


    }

}
