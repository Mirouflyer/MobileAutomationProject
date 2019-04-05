package datasources;

import database.ConnectToSqlDB;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DataBase {
    public static String filePath = "/Users/mirouflyer/Desktop/MobileAutomation/Team10MobileAutomation/Walmart/src/test/resources/secret.properties";
    static ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
    public static void insertDataInDB(){
        List<String> list = getItemValue();
        connectToSqlDB.insertDataFromArrayListToSqlTable(list,"WalmartMobileSearch","items",filePath);
    }

    public static List<String> getItemValue(){
        List<String> itemList = new ArrayList<String>();
        itemList.add("iPhone X");
        itemList.add(("Smart Tv"));
        itemList.add(("Water"));
        itemList.add("Honey");
        itemList.add("Table");
        itemList.add("Oil car");
        return itemList;
    }

    public List<String> getItemListFromDB() throws Exception, IOException, SQLException, ClassNotFoundException{
        List<String> list = new ArrayList<String>();
        list = connectToSqlDB.readDataBase("WalmartMobileSearch","items",filePath);
        return list ;
    }

    public static void main(String[] args) throws  Exception, IOException, SQLException, ClassNotFoundException {
       //insertDataInDB();
        ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
        List<String> list = connectToSqlDB.readDataBase("WalmartMobileSearch","items",filePath);
        for(String st:list){
            System.out.println(st);
        }
   }
}
