package zzy;

import android.content.Context;
import android.util.Log;

import com.zzy.engine.app.sdk.ZManager;

import org.zywx.wbpalmstar.engine.DataHelper;
import org.zywx.wbpalmstar.engine.EBrowserView;
import org.zywx.wbpalmstar.engine.universalex.EUExBase;

/**
 * Created by Lenovo on 2018/12/22.
 */

public class EUExFingerpalm extends EUExBase {
    private static final String TAG = "uexFingerpalm";

    public EUExFingerpalm(Context context, EBrowserView eBrowserView) {
        super(context, eBrowserView);
    }

    /**
     * 获取策略
     * @param params
     */
  public void  fingerpalm(String [] params){
      if (params.length < 0) {
          return;
      }
      Datavoice datavoice = DataHelper.gson.fromJson(params[0], Datavoice.class);
      String userName = datavoice.getUserName();
      String serverUrl = datavoice.getServerUrl();
      Log.e("userName",userName);
      Log.e("serverUrl",serverUrl);
      ZManager.getPermmission(userName,serverUrl);
      Log.e(TAG,"获取权限");
  }

    @Override
    protected boolean clean() {
        return true;
    }
}
