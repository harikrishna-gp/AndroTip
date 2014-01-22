package com.example.tiptop;
import android.view.View;
import android.widget.Toast;
import android.widget.EditText;
import java.lang.Integer;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	public void onPercentClick(View view) {
		float percent=0;
		String toastTxt;
		int    totalAmt=0;
		float  tipAmt = 0;
		EditText tipText =  (EditText)findViewById(R.id.tipDisplayTxt);
		EditText amtText =  (EditText)findViewById(R.id.totalAmt);
		totalAmt = Integer.parseInt(amtText.getText().toString());
		
		switch (view.getId()) {
			case R.id.pc10Btn:
				percent =10;
				break;
			case R.id.pc15Btn:
				percent =15;
				break;
			case R.id.pc20Btn:
				percent =20;
				break;
		}
		if (totalAmt <=0) {
			toastTxt = "Please enter a valid amount";
			Toast.makeText(this, toastTxt, Toast.LENGTH_LONG).show();
		}
		else {
			tipAmt = totalAmt * (percent/100);
			tipText.setText(String.valueOf(tipAmt));
		}
	}
}
