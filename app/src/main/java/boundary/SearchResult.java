package boundary;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import com.example.android.cz2006androidproject.R;

import java.util.List;

import entity.Place;
import entity.PopularPlace;
import entity.SQLiteHelper;

/**
 * This class is used to show the search result of an query. User will be able to select places
 * from here.
 */
public class SearchResult extends ActionBarActivity {
    Place[] result = new Place[10];
    String searchEntry = new String();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_result);
        SQLiteHelper db = new SQLiteHelper(this);
        db.getReadableDatabase();
        List<PopularPlace> list = db.getPopularPlaces();
        TextView tester=(TextView)findViewById(R.id.testerTextView);
        tester.setText(String.valueOf(list.size()));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_search_result, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
    public String getUserInput() {
        return null;
    }
    public void searchEntry(String entry) {

    }
}
