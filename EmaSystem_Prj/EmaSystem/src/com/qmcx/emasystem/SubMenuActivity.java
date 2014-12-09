package com.qmcx.emasystem;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SubMenuActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.sub_menu);
	}

	public void assetsHandle(View source) {
		startActivity(new Intent(SubMenuActivity.this, AssetsActivity.class));
	}

	public void apparatusHandle(View source) {
		startActivity(new Intent(SubMenuActivity.this, ApparatusActivity.class));
	}
}
