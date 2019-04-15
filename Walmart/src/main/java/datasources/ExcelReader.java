package datasources;


import utility.DataReader;

import java.io.IOException;

public class ExcelReader {

    DataReader dr = new DataReader();

    public String[] getKeywordFromExcel () throws IOException {
        String path = System.getProperty("user.dir")+"/data/keyword.xls";;
        String[] data = dr.fileReader2(path, 0);
        return data;
    }

}
