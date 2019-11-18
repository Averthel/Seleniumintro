package navigation;

import configuration.AppProperties;

public class ApplicationURLs {

    public static final String APPLICATTION_URL = AppProperties.getAllUrl();
    public static final String TOP_MENU_PAGE_URL = APPLICATTION_URL + "actions/Catalog.action";
    public static final String LOGIN_URL = APPLICATTION_URL + "actions/Account.action?signonForm=";
    public static final String LABRADOR_RETRIEVER_CATALOG = APPLICATTION_URL + "actions/Catalog.action?viewProduct=&productId=K9-RT-02";

}
