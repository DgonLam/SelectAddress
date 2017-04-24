package com.ums.osigntest;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import dgonlam.addressselector.BottomDialog;
import dgonlam.addressselector.OnAddressSelectedListener;
import dgonlam.addressselector.model.City;
import dgonlam.addressselector.model.County;
import dgonlam.addressselector.model.Province;
import dgonlam.addressselector.model.Street;

public class MainActivity extends AppCompatActivity {

//    private Dialog selectAddress;
//    private AddressSelector addressSelector;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        Intent intent = new Intent(MainActivity.this, OSignActivateActivity.class);
//        startActivity(intent);

    }

    public void onClick(View v){
        Dialog dialog = BottomDialog.init(MainActivity.this, new OnAddressSelectedListener() {
            @Override
            public void onAddressSelected(Province province, City city, County county, Street street) {
                //
                Log.d("long","province:"+province+" city:"+city);
            }
        },R.color.skyblue,R.mipmap.ic_tick_skyblue);
//        Intent intent = new Intent(MainActivity.this, IOUAppVerifyActivity.class);
//        intent.putExtra("appUserId","17750621005");
//        intent.putExtra("token","a");
//        intent.putExtra("platCode","2000");
//        startActivityForResult(intent, 1);
//        initDialog();
    }

    @Override
    protected void onActivityResult(int reqCode,int resultCode,Intent data){
        if (resultCode == RESULT_OK){
            Log.d("long","code:"+data.getExtras().getString("errCode")+" info:"+data.getExtras().getString("errInfo"));
        }else if (resultCode == RESULT_CANCELED){
            Log.d("long","cancled");
        }
    }

//    private void initDialog(){
//        selectAddress = new Dialog(this, R.style.bottom_dialog);
//        addressSelector = new AddressSelector(this);
////            addressSelector.getView().findViewById(R.id.indicator).setBackgroundColor(getResources().getColor(R.color.skyblue));
//        addressSelector.setOnAddressSelectedListener(new OnAddressSelectedListener() {
//            @Override
//            public void onAddressSelected(Province province, City city, County county, Street street) {
//
//            }
//        });
//        selectAddress.setContentView(addressSelector.getView());
//        Window window = selectAddress.getWindow();
//        WindowManager.LayoutParams layoutParams = window.getAttributes();
//        layoutParams.x = 0;
//        layoutParams.y = getWindowManager().getDefaultDisplay().getHeight();
//        layoutParams.width = getWindowManager().getDefaultDisplay().getWidth();
//        layoutParams.height = getWindowManager().getDefaultDisplay().getHeight() / 2;
//        selectAddress.onWindowAttributesChanged(layoutParams);
//        selectAddress.show();
//
//    }
}
