package org.codelearn.twitter;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;


import org.codelearn.twitter.R;

import android.widget.Button;

public class MainActivity extends Activity {
	Button _loginBtn;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		_loginBtn = ( Button ) findViewById(R.id.btn_login);
		 
		_loginBtn.setOnClickListener(new View.OnClickListener() {
		      @Override
		      public void onClick(View v) {
		        //This is a comment which does no good to your code. Feel free to remove it after you copy pasted this snippet.
		        //Assignment - write logic to update the 'Login' text inside the button to 'Clicked'
		    	  _loginBtn.setText("Clicked");
		      }
		  });
		
		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
