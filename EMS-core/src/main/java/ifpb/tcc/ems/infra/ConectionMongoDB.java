/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifpb.tcc.ems.infra;

import com.mongodb.DB;
import com.mongodb.Mongo;
import com.mongodb.MongoClient;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.UnknownHostException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jose2
 */
public class ConectionMongoDB {
    
    String host;
    private String BD;
    private int port;
    private Mongo mongo;
    private static Properties prop = null;

    public ConectionMongoDB(String BD) throws IOException, URISyntaxException {
         prop = new Properties();
            prop.load(new FileInputStream(getClass()
                    .getResource("/bd/Connection.properties").toURI().getPath()));

        this.host = prop.getProperty("mongo-host");
        this.BD = prop.getProperty("mongo-banco");
        this.port =  Integer.parseInt(prop.getProperty("mongo-port"));
        
    }

    public DB getConnection() {

        mongo = new MongoClient();
        
        return mongo.getDB(BD);
    }
    public void close(){
       mongo.close();
    }
}
