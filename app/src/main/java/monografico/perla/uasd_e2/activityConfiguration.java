package monografico.perla.uasd_e2;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import yuku.ambilwarna.AmbilWarnaDialog;

public class activityConfiguration extends AppCompatActivity {

    private static int mDefaultcolor;
    LinearLayout mLayout;
    ImageButton btnColor;

    public static int getmDefaultcolor() {
        return mDefaultcolor;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_configuration);

        mLayout = findViewById(R.id.LyInfoAlumno);
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
                mLayout.setBackgroundColor(mDefaultcolor);
            }
        });

        colorpicker.show();
    }
}
