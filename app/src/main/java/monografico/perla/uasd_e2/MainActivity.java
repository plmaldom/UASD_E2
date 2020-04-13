package monografico.perla.uasd_e2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /*
    ImageButton btn_perla       = (ImageButton) findViewById(R.id.btn_Perla);
    ImageButton btn_gorky       = (ImageButton) findViewById(R.id.btn_Gorky);
    ImageButton btn_luis        = (ImageButton) findViewById(R.id.btn_Luis);
    ImageButton btn_settings    = (ImageButton) findViewById(R.id.btn_Settings);
*/

    public void onClickToViewAlumnInfo(View v){

        Intent myIntent = new Intent(this, activityInformacionAlumno.class);
        
        switch (v.getId()){
            
            case R.id.btn_Perla:
                myIntent.putExtra("AlumnoSelected", R.id.btn_Perla);
                startActivity(myIntent);
                break;

            case R.id.btn_Gorky:
                myIntent.putExtra("AlumnoSelected", R.id.btn_Gorky);
                startActivity(myIntent);
                break;

            case R.id.btn_Luis:
                myIntent.putExtra("AlumnoSelected", R.id.btn_Luis);
                startActivity(myIntent);
                break;

            default:
                break;
        }
    }

    public void onClickConfigurationButton(View v) {
        startActivity(new Intent(this, activityConfiguration.class));
    }
}

