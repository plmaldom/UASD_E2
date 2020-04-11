package monografico.perla.uasd_e2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        ImageButton btn_perla = (ImageButton) findViewById(R.id.btn_Perla);
        ImageButton btn_gorky = (ImageButton) findViewById(R.id.btn_Gorky);
        ImageButton btn_luis = (ImageButton) findViewById(R.id.btn_Luis);
        ImageButton btn_settings = (ImageButton) findViewById(R.id.btn_Settings);
    }
        
    public void onClick(View v){
        Intent myIntent = null;
        
        switch (v.getId()){
            
            case R.id.btn_Perla:
                myIntent = new Intent(MainActivity.this, InformacionAlumno.class);
                        break;

            case R.id.btn_Gorky:
              //  myIntent = new Intent(MainActivity.this, InformacionAlumno.class);
                break;

            case R.id.btn_Luis:
               // myIntent = new Intent(MainActivity.this, InformacionAlumno.class);
                break;

            case R.id.btn_Settings:
                myIntent = new Intent(MainActivity.this, activityConfiguration.class);
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + v.getId());
        }
        
        startActivity(myIntent);
    }

}
