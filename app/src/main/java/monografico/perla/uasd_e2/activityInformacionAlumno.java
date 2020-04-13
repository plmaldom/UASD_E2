package monografico.perla.uasd_e2;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class activityInformacionAlumno extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_informacion_alumno);

        View InfoConteiner = findViewById(R.id.LyInfoAlumno);
        InfoConteiner.setBackgroundColor(activityConfiguration.getmDefaultcolor());

        ImageView iv_alumno      = findViewById(R.id.iv_image_alumno);
        TextView tv_nombre       = findViewById(R.id.tv_nombre_alumno);
        TextView tv_ciudad       = findViewById(R.id.tv_direccion_alumno);
        TextView tv_matricula         = findViewById(R.id.tv_matricula_alumno);
        TextView tv_expresion = findViewById(R.id.tv_expresion_alumno);

        int AlumnoSelected = getIntent().getIntExtra("AlumnoSelected", 0);

        switch (AlumnoSelected) {
            case R.id.btn_Perla: {
                iv_alumno.setImageResource(R.drawable.img_perla);
                tv_nombre.setText      (R.string.name_perla);
                tv_matricula.setText        (R.string.id_perla);
                tv_ciudad.setText      (R.string.city_perla);
                tv_expresion.setText(R.string.expression_perla);
            } break;

            case R.id.btn_Gorky: {
                iv_alumno.setImageResource(R.drawable.img_gorky);
                tv_nombre.setText      (R.string.name_gorky);
                tv_matricula.setText        (R.string.id_gorky);
                tv_ciudad.setText      (R.string.city_gorky);
                tv_expresion.setText(R.string.expression_gorky);
            } break;

            case R.id.btn_Luis: {
                iv_alumno.setImageResource(R.drawable.img_luis);
                tv_nombre.setText      (R.string.name_luis);
                tv_matricula.setText        (R.string.id_luis);
                tv_ciudad.setText      (R.string.city_luis);
                tv_expresion.setText(R.string.expression_luis);
            } break;

            default:
                break;
        }
    }
}
