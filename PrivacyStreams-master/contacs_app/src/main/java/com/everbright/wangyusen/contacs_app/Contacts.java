package com.everbright.wangyusen.contacs_app;


import android.content.Context;

import com.github.privacystreams.core.Item;
import com.github.privacystreams.core.UQI;
import com.github.privacystreams.core.exceptions.PSException;
import com.github.privacystreams.core.purposes.Purpose;
import com.github.privacystreams.communication.Contact;



import java.util.List;

/**
 * Created by wangyusen on 6/17/17.
 */

public class Contacts {

    private String displayName;
    private String displayID;
    private String displayEmail;
    private String displayPhone;
    private String displayTime;

    private UQI uqi;
    private Purpose purpose;

    Contacts(Context context){
        this.purpose = Purpose.TEST("test");
        this.uqi = new UQI(context);
        displayName = "no contacts";
        displayID = "no contacts";
        displayEmail = "no contacts";
        displayPhone = "no contacts";
        displayTime = "no contacts";

    }
    public String getDisplay() {
        return displayName;
    }

    public String getDisplayEmail() {
        return displayEmail;
    }

    public String getDisplayID() {
        return displayID;
    }

    public String getDisplayName() {
        return displayName;
    }

    public String getDisplayPhone() {
        return displayPhone;
    }

    public String getDisplayTime() {
        return displayTime;
    }


    /*
        get all contacts name and store them in the displayName

     */
    public void getContacts_name(){
        try {
            //convert the raw data to List<Item>
            List<Item> temp = uqi.getData(Contact.getAll(), purpose).asList();
            if(!temp.isEmpty()){
                //check if the list is empty, if it is empty, the default value is "no contacts"
                displayName = "name: \n";
            }
            for(int i = 0; i < temp.size();i++) {
                //aquire each elment's value in the list
                displayName += temp.get(i).getValueByField("name") + "  \n";
            }
        } catch (PSException e) {
            e.printStackTrace();
        }
    }
    /*
       get all contacts time and store them in the displayTime

    */
    public void getContacts_time(){
        try {
            //convert the raw data to List<Item>
            List<Item> temp = uqi.getData(Contact.getAll(), purpose).asList();

            if(!temp.isEmpty()){
                //check if the list is empty, if it is empty, the default value is "no contacts"
                displayTime = "time_created:  \n";// this line is for the convenience of testing
            }

            for(int i = 0; i < temp.size();i++) {
                //aquire each elment's value in the list
                displayTime += temp.get(i).getValueByField("time_created") + "  \n";
            }

        } catch (PSException e) {
            e.printStackTrace();
                                }
    }

    /*
     get all contacts ID  and store them in the displayID

    */
    public void getContacts_id(){
        try {
            //convert the raw data to List<Item>
            List<Item> temp = uqi.getData(Contact.getAll(), purpose).asList();

            if(!temp.isEmpty()){
                //check if the list is empty, if it is empty, the default value is "no contacts"
                displayID = "id:  \n";// this line is for the convenience of testing
            }

            for(int i = 0; i < temp.size();i++) {
                //acquire each element's value in the list
                displayID += temp.get(i).getValueByField("id") + "  \n";
            }

        } catch (PSException e) {
            e.printStackTrace();
        }
    }

    /*
     get all contacts phones  and store them in the displayPhone
    */

    public void getContacts_phones(){
        try {
            //convert the raw data to List<Item>
            List<Item> temp = uqi.getData(Contact.getAll(), purpose).asList();

            if(!temp.isEmpty()){
                //check if the list is empty, if it is empty, the default value is "no contacts"
                displayID = "phones:  \n";// this line is for the convenience of testing
            }

            for(int i = 0; i < temp.size();i++) {
                //acquire each element's value in the list
                displayID += temp.get(i).getValueByField("phones") + "  \n";
            }

        } catch (PSException e) {
            e.printStackTrace();
        }
    }
    /*
        get all contacts emails and store them in the emails;
   */
    public void getContacts_emails(){
        try {
            //convert the raw data to List<Item>
            List<Item> temp = uqi.getData(Contact.getAll(), purpose).asList();

            if(!temp.isEmpty()){
                //check if the list is empty, if it is empty, the default value is "no contacts"
                displayEmail = "emails:  \n";// this line is for the convenience of testing
            }

            for(int i = 0; i < temp.size();i++) {
                //acquire each element's value in the list
                displayEmail += temp.get(i).getValueByField("emails") + "  \n";
            }

        } catch (PSException e) {
            e.printStackTrace();
        }
    }




}