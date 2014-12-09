package com.qmcx.emasystem;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends Activity {

	private EditText edt_name;
	private EditText edt_password;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		init();
	}

	private void init() {
		edt_name = (EditText) findViewById(R.id.edt_name);
		edt_password = (EditText) findViewById(R.id.edt_password);

	}

	public void loginHandle(View source) {

		System.out.println("loginHandle: " + edt_name.getText());
		System.out.println("loginHandle: " + edt_name.getText());
		
		if (edt_name.getText().toString().equals("admin")
				&& edt_password.getText().toString().equals("12345678")) {

			startActivity(new Intent(MainActivity.this, SubMenuActivity.class));
			finish();
		} else {

			AlertDialog.Builder builder = new AlertDialog.Builder(this)
					.setTitle("提示").setMessage("用户名或者密码错误")
					.setNegativeButton("取消", new OnClickListener() {

						@Override
						public void onClick(DialogInterface dialog, int which) {
							// TODO Auto-generated method stub
						}
					});
			builder.create().show();

		}

	}

}
