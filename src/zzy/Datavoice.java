package zzy;

import java.io.Serializable;

/**
 * Created by ylt on 16/7/28.
 */

public class Datavoice implements Serializable {
private String userName;
private String serverUrl;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getServerUrl() {
        return serverUrl;
    }

    public void setServerUrl(String serverUrl) {
        this.serverUrl = serverUrl;
    }

    @Override
    public String toString() {
        return "Datavoice{" +
                "userName='" + userName + '\'' +
                ", serverUrl='" + serverUrl + '\'' +
                '}';
    }
}
