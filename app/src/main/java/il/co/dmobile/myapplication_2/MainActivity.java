package il.co.dmobile.myapplication_2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.LayoutInflater;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<User> users = new ArrayList<>();
        users.add(new User(R.drawable.avatar1,"Contact 1","contact1@post.runi.ac.il"));
        users.add(new User(R.drawable.avatar2,"Contact 2","contact2@post.runi.ac.il"));
        users.add(new User(R.drawable.avatar3,"Contact 3","contact3@post.runi.ac.il"));
        users.add(new User(R.drawable.avatar4,"Contact 4","contact4@post.runi.ac.il"));
        users.add(new User(R.drawable.avatar5,"Contact 5","contact5@post.runi.ac.il"));
        users.add(new User(R.drawable.avatar6,"Contact 6","contact6@post.runi.ac.il"));
        users.add(new User(R.drawable.avatar7,"Contact 7","contact7@post.runi.ac.il"));
        users.add(new User(R.drawable.avatar8,"Contact 8","contact8@post.runi.ac.il"));

        RecyclerView recyclerView = findViewById(R.id.rv);
        recyclerView.setHasFixedSize(false);

        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(this,1);
        recyclerView.setLayoutManager(layoutManager);

        UserAdapter adapter = new UserAdapter(users);
        recyclerView.setAdapter(adapter);


    }
}