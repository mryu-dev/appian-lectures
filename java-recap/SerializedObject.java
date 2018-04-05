import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import oracle.sql.BLOB;


public class SerializedObject {
	public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
		
		Class.forName("oracle.jdbc.driver.OracleDriver");   ///ojdbc14.jar
		Connection client1 = DriverManager.getConnection("jdbc:oracle:thin:@AG-023.MZOS.COM:1521:xe","system","mzos");
		client1.setAutoCommit(false);
			   String writeSQL = "begin insert into serial(id,obj) "+
			             " values (?,empty_blob()) " +
			             " return obj into ?; end;";

		System.out.println("Enter the Employee detials");
		Employee e = Employee.getData();
	    CallableStatement stmt = client1.prepareCall(writeSQL);
	    stmt.setInt(1, 1);
		stmt.registerOutParameter(2, java.sql.Types.BLOB);
	      stmt.executeUpdate();
	      BLOB blob = (BLOB) stmt.getBlob(2);
	      OutputStream os = blob.getBinaryOutputStream();
	      ObjectOutputStream oop = new ObjectOutputStream(os);
	      oop.writeObject(e);
	      oop.flush();
	      oop.close();
	      os.close();
	      stmt.close();
	      System.out.println("Done serializing ");
	      client1.commit();
	     /*
		 String readSQL = "select obj from serial where id = ?";

		PreparedStatement stmt1 = client1.prepareStatement(readSQL);
		stmt1.setInt(1, 1);
		 ResultSet rs = stmt1.executeQuery();
	      rs.next();
	      InputStream is = rs.getBlob(1).getBinaryStream();
	      ObjectInputStream oip = new ObjectInputStream(is);
	      Object o = oip.readObject();
	      System.out.println(o);
	      oip.close();
	      is.close();
	      stmt1.close();
	      */
	    client1.close();
	}
}
