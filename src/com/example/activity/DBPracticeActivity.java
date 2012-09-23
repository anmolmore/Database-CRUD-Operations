package com.example.activity;

import com.example.db.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class DBPracticeActivity extends Activity implements OnClickListener {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        Button regButton = (Button)findViewById(R.id.buttonMainRegister);
        Button listButton = (Button)findViewById(R.id.ButtonMainList);
        regButton.setOnClickListener(this);
        listButton.setOnClickListener(this);
    }

	@Override
	public void onClick(View v) {
		Intent intent;
		switch(v.getId()) {
		case R.id.buttonMainRegister :
			intent = new Intent();
			intent.setClass(getApplicationContext(), Registration.class);
			startActivity(intent);
			break;
		case R.id.ButtonMainList :
			intent = new Intent();
			intent.setClass(getApplicationContext(), ListUsers.class);
			startActivity(intent);
			break;
		}
	}
}