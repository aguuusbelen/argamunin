package argamunin.com.backend;

import org.bson.Document;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.MongoException;
import com.mongodb.ServerApi;
import com.mongodb.ServerApiVersion;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;

@CrossOrigin(origins = "http://localhost:3000")
@EnableAutoConfiguration(exclude={MongoAutoConfiguration.class})
@SpringBootApplication
public class BackendApplication {
    
	public static void main(String[] args) {
		SpringApplication.run(BackendApplication.class, args);
		
		// MONGO DB CONEXION
		String connectionString = "mongodb+srv://argamunin:rCD573GNOysZxpEY@argamunin.eieratd.mongodb.net/?retryWrites=true&w=majority";
	    ServerApi serverApi = ServerApi.builder()
	            .version(ServerApiVersion.V1)
	            .build();
	    MongoClientSettings settings = MongoClientSettings.builder()
	            .applyConnectionString(new ConnectionString(connectionString))
	            .serverApi(serverApi)
	            .build();
	    // Create a new client and connect to the server
	    try (MongoClient mongoClient = MongoClients.create(settings)) {
	        try {
	            // Send a ping to confirm a successful connection
	            MongoDatabase database = mongoClient.getDatabase("admin");
	            database.runCommand(new Document("ping", 1));
	            System.out.println("Pinged your deployment. You successfully connected to MongoDB!");
	        } catch (MongoException e) {
	            e.printStackTrace();
	        }
	    }
	}
}
