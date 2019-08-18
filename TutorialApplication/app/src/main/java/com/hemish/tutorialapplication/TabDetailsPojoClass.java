package com.hemish.tutorialapplication;

/**
 * Created by dhame on 6/14/2019.
 */

public class TabDetailsPojoClass {
    private String tab_Description,tab_Code,tab_Output;

    public TabDetailsPojoClass() {
    }

    public TabDetailsPojoClass(String tab_Description, String tab_Code, String tab_Output) {
        this.tab_Description = tab_Description;
        this.tab_Code = tab_Code;
        this.tab_Output = tab_Output;
    }

    public String getTab_Description() {
        return tab_Description;
    }

    public void setTab_Description(String tab_Description) {
        this.tab_Description = tab_Description;
    }

    public String getTab_Code() {
        return tab_Code;
    }

    public void setTab_Code(String tab_Code) {
        this.tab_Code = tab_Code;
    }

    public String getTab_Output() {
        return tab_Output;
    }

    public void setTab_Output(String tab_Output) {
        this.tab_Output = tab_Output;
    }
}
