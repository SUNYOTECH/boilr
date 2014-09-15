package com.github.andrefbsantos.boilr.activities;

import com.github.andrefbsantos.boilr.R;
import com.github.andrefbsantos.boilr.domain.AlarmWrapper;
import com.github.andrefbsantos.boilr.fragments.GenericAlarmSettingsFragment;
import com.github.andrefbsantos.boilr.fragments.PriceHitAlarmSettingsFragment;
import com.github.andrefbsantos.boilr.fragments.PriceVarAlarmSettingsFragment;
import com.github.andrefbsantos.libpricealarm.PriceHitAlarm;
import com.github.andrefbsantos.libpricealarm.PriceVarAlarm;

import android.app.Activity;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.preference.PreferenceActivity;

public class AlarmSettingsActivity extends PreferenceActivity {

	private AlarmWrapper wrapper;


	@Override
	protected void onCreate(Bundle bundle) {
		super.onCreate(bundle);
		int id = (Integer) bundle.get("id");
//		setContentView(R.layout.alarm_settings);
//		FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
//		if(wrapper.getAlarm() instanceof PriceHitAlarm ){
//			fragmentTransaction.add(R.id.settings_list, new PriceHitAlarmSettingsFragment());
//		}else if(wrapper.getAlarm() instanceof PriceVarAlarm){
//			fragmentTransaction.add(R.id.settings_list, new PriceVarAlarmSettingsFragment());
//		}
//		fragmentTransaction.add(R.id.settings_list, new GenericAlarmSettingsFragment());
//		fragmentTransaction.add(R.id.settings_list, new AlarmAlertSettingsFragment());
//		fragmentTransaction.commit();
	}


	public AlarmWrapper getAlarmWrapper() {
		return wrapper;
	}

	// TODO Create Listener to handle changes on view.
}
