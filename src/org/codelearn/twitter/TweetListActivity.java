package org.codelearn.twitter;

import android.os.Bundle;
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class TweetListActivity extends Activity {

	private ListView tweetListView;

    private ArrayAdapter tweetItemArrayAdapter;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_tweet_list);
		
		tweetItemArrayAdapter = new TweetAdapter(this, new String[10]);
		
		
		
		tweetListView = (ListView) findViewById(R.id.tweetList);
      tweetListView.setAdapter(tweetItemArrayAdapter);
	}
	
	
	private class TweetAdapter extends ArrayAdapter{
	       private LayoutInflater inflater;
	                
	        public TweetAdapter(Activity activity, String[] items){
	            super(activity, R.layout.row_tweet, items);
	            inflater = activity.getWindow().getLayoutInflater();
	        }
	        
	        @Override
	        public View getView(int position, View convertView, ViewGroup parent){
	            return inflater.inflate(R.layout.row_tweet, parent, false);
	        }

	   }

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.tweet_list, menu);
		return true;
	}

}
