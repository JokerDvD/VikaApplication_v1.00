package nit.vikaapplication_v100.ResultActivity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import nit.vikaapplication_v100.R;
import nit.vikaapplication_v100.RecourseFile.RecourseString;

public class ResultActivity extends AppCompatActivity {
    String ScannedCode;
    TextView ScannedText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        ScannedCode=new Intent().getStringExtra(RecourseString.ScannedCode);
        ScannedText=(TextView)findViewById(R.id.ScannedText);
        ScannedText.setText(ScannedCode);
    }
}
