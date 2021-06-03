package sg.edu.rp.c346.id20008189.demosimplelistviewexamtips;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.lang.reflect.Array;

public class MainActivity extends AppCompatActivity {
    ListView lvExamTips;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvExamTips=findViewById(R.id.lvExamTips);

        String [] a = new String[4];
        a[0]="Don't just read the code, code it as much as possible during each practical session";
        a[1]="Seek help from the lecturer ASAP, don't wait till you lost in the jungle";
        a[2]="Prepare your template source code for each topic";
        a[3]="Create a few empty Android projects to speed up your coding during the exam";
        a[4]="Ensure that your Android Studio is up and running before the exam";
    }
}