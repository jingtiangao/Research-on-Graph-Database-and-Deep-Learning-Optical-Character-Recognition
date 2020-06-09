package arangodtest;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
 
import com.arangodb.ArangoCollection;
import com.arangodb.ArangoCursor;
import com.arangodb.ArangoDB;
import com.arangodb.ArangoDBException;
import com.arangodb.entity.BaseDocument;
import com.arangodb.entity.CollectionEntity;
import com.arangodb.model.AqlQueryOptions;
import com.arangodb.util.MapBuilder;
import com.arangodb.velocypack.VPackSlice;
import com.arangodb.velocypack.exception.VPackExceptio
public class ArangoDBTest {
	 //连接和mongo差不多，本地地址  
    static ArangoDB arangoDB = new ArangoDB.Builder().host("10.61.2.206", 8529).user("root").password("123456").build();  
    //数据库  http://marketplace.eclipse.org/marketplace-client-intro?mpc_install=1774116
    static ArangoDatabase db = arangoDB.db("_system");  
    //集合  
    static ArangoCollection coll =db.collection("test11");  
	public static void main(String[] args) {
		 BaseDocument document = new BaseDocument();  
	       document.addAttribute("id",01);  
	       document.addAttribute("name","Damo");  
	       document.addAttribute("tag","10");  
	       coll.insertDocument(document);  
		// TODO Auto-generated method stub

	}

}
