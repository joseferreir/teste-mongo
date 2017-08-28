/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifpb.dac.stateless.ten;

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
         
        this.host = "localhost";
        this.BD =  "aula";
        this.port = 27017;
        
    }

    public DB getConnection() {

        mongo = new MongoClient();
        
        return mongo.getDB(BD);
    }
    public void close(){
     //   mongo.close();
    }
}
