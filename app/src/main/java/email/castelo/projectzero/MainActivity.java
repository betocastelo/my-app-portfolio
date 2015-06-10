package email.castelo.projectzero;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;


public class MainActivity extends Activity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Set listeners for the app buttons in the main view.
        ArrayList<Button> listOfButtons = new ArrayList<Button>();
        listOfButtons.add((Button) findViewById(R.id.spotify_streamer_button));
        listOfButtons.add((Button) findViewById(R.id.scores_app_button));
        listOfButtons.add((Button) findViewById(R.id.library_app_button));
        listOfButtons.add((Button) findViewById(R.id.build_it_bigger_button));
        listOfButtons.add((Button) findViewById(R.id.xyz_reader_button));
        listOfButtons.add((Button) findViewById(R.id.capstone_button));

        for (Button button:listOfButtons) {
            button.setOnClickListener(this);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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

    @Override
    public void onClick(View view) {
        String message = getString(R.string.starting_app_message) + " ";
        switch (view.getId()) {
            case R.id.spotify_streamer_button:
                message += getString(R.string.spotify_streamer);
                break;

            case R.id.scores_app_button:
                message += getString(R.string.scores_app);
                break;

            case R.id.library_app_button:
                message += getString(R.string.library_app);
                break;

            case R.id.build_it_bigger_button:
                message += getString(R.string.build_it_bigger);
                break;

            case R.id.xyz_reader_button:
                message += getString(R.string.xyz_reader);
                break;

            case R.id.capstone_button:
                message += getString(R.string.capstone_project);
                break;
        }

        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
    }
}
