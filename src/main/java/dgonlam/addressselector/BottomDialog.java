package dgonlam.addressselector;

import android.app.Dialog;
import android.content.Context;
import android.view.Gravity;
import android.view.Window;
import android.view.WindowManager;

import chihane.jdaddressselector.R;
import mlxy.utils.Dev;

public class BottomDialog  {
    private static AddressSelector selector;
    private static Dialog dialog;

    public static Dialog init(Context context,OnAddressSelectedListener listener) {
        dialog = new Dialog(context, R.style.bottom_dialog);
        selector = new AddressSelector(context);
        dialog.setContentView(selector.getView());
        selector.setOnAddressSelectedListener(listener);
        Window window = dialog.getWindow();
        WindowManager.LayoutParams params = window.getAttributes();
        params.width = WindowManager.LayoutParams.MATCH_PARENT;
        params.height = Dev.dp2px(context, 256);
        window.setAttributes(params);
        window.setGravity(Gravity.BOTTOM);
        dialog.show();
        return dialog;
    }

    public static Dialog init(Context context,OnAddressSelectedListener listener,int colorId,int picId) {
        dialog = new Dialog(context,R.style.bottom_dialog);
        selector = new AddressSelector(context,colorId,picId);
        dialog.setContentView(selector.getView());
        selector.setOnAddressSelectedListener(listener);
        Window window = dialog.getWindow();
        WindowManager.LayoutParams params = window.getAttributes();
        params.width = WindowManager.LayoutParams.MATCH_PARENT;
        params.height = Dev.dp2px(context, 256);
        window.setAttributes(params);
        window.setGravity(Gravity.BOTTOM);
        dialog.show();
        return dialog;
    }

}
