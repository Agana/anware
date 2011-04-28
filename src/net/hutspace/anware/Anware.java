package net.hutspace.anware;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

public class Anware extends Activity implements OnClickListener {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        findViewById(R.id.about_button).setOnClickListener(this);
    }

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.about_button:
			startActivity(new Intent(this, About.class));
			break;
		case R.id.exit_button:
			finish();
			break;
		case R.id.new_game_button:
			//TODO
		}
	}
}