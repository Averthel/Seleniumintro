package navigation;

import configuration.AppProperties;

public class ApplicationURLs {

    public static final String APPLICATTION_URL = AppProperties.getAllUrl();
    public static final String LOGIN_URL = APPLICATTION_URL + "actions/Account.action?signonForm=";

}
