package monografico.perla.uasd_e2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

//import com.azeesoft.lib.colorpicker.ColorPickerDialog;

import yuku.ambilwarna.AmbilWarnaDialog;

public class activityConfiguration extends AppCompatActivity {

    LinearLayout = mLayout;
    int mDefaultcolor;
    Button btnColor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_configuration);

        mLayout = findViewById(R.id.LyMainInfo);
        mDefaultcolor = ContextCompat.getColor(activityConfiguration.this, R.color.colorPrimary);
        btnColor = findViewById(R.id.btn_Settings);
        btnColor.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openColorPicker();
            }
        });

}

    public void openColorPicker() {
        AmbilWarnaDialog colorpicker = new AmbilWarnaDialog(this, mDefaultcolor,
                new AmbilWarnaDialog.OnAmbilWarnaListener() {
            @Override
            public void onCancel(AmbilWarnaDialog dialog) {

            }

            @Override
            public void onOk(AmbilWarnaDialog dialog, int color) {
                mDefaultcolor = color;
                mLayout.setBackground(mDefaultcolor);

            }
        });
        colorpicker.show();
    }
}
