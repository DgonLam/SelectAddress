package dgonlam.addressselector;

import android.app.Dialog;
import android.content.Context;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import chihane.jdaddressselector.R;

public class BottomDialog  {
    private static AddressSelector selector;
    private static Dialog dialog;

    public static Dialog init(Context context,OnAddressSelectedListener listener,int height) {
        dialog = new Dialog(context, R.style.bottom_dialog);
        selector = new AddressSelector(context);
        dialog.setContentView(selector.getView());
        selector.setOnAddressSelectedListener(listener);
        selector.setOnCloseClickListener(new OnCloseClickListener() {
            @Override
            public void onClick(View view) {
                dialog.dismiss();
            }
        });
        Window window = dialog.getWindow();
        WindowManager.LayoutParams params = window.getAttributes();
        params.width = WindowManager.LayoutParams.MATCH_PARENT;
        params.height =height;
        window.setAttributes(params);
        window.setGravity(Gravity.BOTTOM);
        dialog.show();
        return dialog;
    }

    public static Dialog init(Context context,OnAddressSelectedListener listener,int colorId,int picId,int height) {
        dialog = new Dialog(context,R.style.bottom_dialog);
        selector = new AddressSelector(context,colorId,picId);
        dialog.setContentView(selector.getView());
        selector.setOnAddressSelectedListener(listener);
        selector.setOnCloseClickListener(new OnCloseClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("long","click");
                dialog.dismiss();
            }
        });
        Window window = dialog.getWindow();
        WindowManager.LayoutParams params = window.getAttributes();
        params.width = WindowManager.LayoutParams.MATCH_PARENT;
        params.height = height;
        window.setAttributes(params);
        window.setGravity(Gravity.BOTTOM);
        dialog.show();
        return dialog;
    }

}
