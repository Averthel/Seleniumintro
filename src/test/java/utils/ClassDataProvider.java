package utils;

import org.testng.annotations.DataProvider;

import static navigation.ApplicationURLs.*;

public class ClassDataProvider {

    @DataProvider(name="remoteDataProvider")
    public Object[][] navigationData(){
        Object[][] dataArray ={
                {APPLICATTION_URL, "JPetStore Demo"},
                {TOP_MENU_PAGE_URL, "JPetStore Demo"},
                {LOGIN_URL, "JPetStore Demo"},
                {LABRADOR_RETRIEVER_CATALOG, "JPetStore Demo"}
        };
        return  dataArray;
    }
}
