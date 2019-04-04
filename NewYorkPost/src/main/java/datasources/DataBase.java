package datasources;

import database.ConnectToSqlDB;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DataBase {
    public static String filePath = "/Users/mirouflyer/Desktop/MobileAutomation/Team10MobileAutomation/NewYorkPost/src/test/resources/secret.properties";
    static ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
    public static void insertDataInDB(){
        List<String> list = getItemValue();
        connectToSqlDB.insertDataFromArrayListToSqlTable(list,"NewYorkPostSearch","items",filePath);
    }

    public static List<String> getItemValue(){
        List<String> itemList = new ArrayList<String>();
        itemList.add("Buisness");
        itemList.add(("Trump's Border crisis"));
        itemList.add(("Politics"));
        itemList.add("Sports");
        itemList.add("Beaking News");
        itemList.add("Culture");
        return itemList;
    }

    public List<String> getItemListFromDB() throws Exception, IOException, SQLException, ClassNotFoundException{
        List<String> list = new ArrayList<String>();
        list = connectToSqlDB.readDataBase("NewYorkPostSearch","items",filePath);
        return list ;
    }

    public static void main(String[] args) throws  Exception, IOException, SQLException, ClassNotFoundException {
       // insertDataInDB();
        ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
        List<String> list = connectToSqlDB.readDataBase("NewYorkPostSearch","items",filePath);
        for(String st:list){
            System.out.println(st);
        }
   }
}
