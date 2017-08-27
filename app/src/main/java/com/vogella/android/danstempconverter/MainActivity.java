package com.vogella.android.danstempconverter;



import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;




public class MainActivity extends Activity {
    private EditText text;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text = (EditText) findViewById(R.id.inputValue);
    }

    public void onClick(View view) {
        switch (view.getId()){
            case R.id.button1:
            RadioButton celsiusButton =(RadioButton)
findViewById(R.id.radio0);
            RadioButton fahrenheitButton =(RadioButton)
findViewById(R.id.radio1);
            if (text.getText().length() == 0) {
                Toast.makeText(this, "Please enter a valid number",
                        Toast.LENGTH_LONG).show();
                return;
            }
            float inputValue = Float.parseFloat(text.getText().toString());
            if (celsiusButton.isChecked()) {
                text.setText(String
                        .valueOf(Utility.convertFahrenheitToCelsius(inputValue)));
                fahrenheitButton.setChecked(true);
                celsiusButton.setChecked(false);

            } else {
                text.setText(String
                        .valueOf(Utility.convertCelsiusToFahrenheit(inputValue)));
                fahrenheitButton.setChecked(false);
                celsiusButton.setChecked(true);

            }
            break;
        }

    }
}

