package com.arm.malideveloper.openglessdk.simpletriangle;

import android.os.Bundle;
import android.util.Log;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private static final String LOGTAG = "MainActivity";

    protected TutorialView graphicsView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
//        setContentView(R.layout.activity_main);
        Log.i(LOGTAG, "Creating New Tutorial View");
        graphicsView = new TutorialView(getApplication());
        setContentView(graphicsView);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
		
    }
	
	    @Override protected void onPause()
    {
        super.onPause();
        graphicsView.onPause();
    }
    @Override protected void onResume()
    {
        super.onResume();
        graphicsView.onResume();
    }
}