package ninja.watdahieuisa.ichallengeyou;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;

public class MainMenu extends AppCompatActivity {

    Button log;
    Button newAcc;
    EditText passwrd;
    EditText emailadd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        log = (Button)findViewById(R.id.loginBtn);
        newAcc = (Button)findViewById(R.id.newAccountBtn);
        passwrd = (EditText)findViewById(R.id.password);
        emailadd = (EditText)findViewById(R.id.emailAddress);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main_menu, menu);
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

    private void login()
    {

    }

    private void createNewAccount()
    {

    }

}
