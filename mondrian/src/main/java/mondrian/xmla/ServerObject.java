package mondrian.xmla;

public class ServerObject {
  private String databaseID;

  public ServerObject(String databaseID) {
    this.databaseID = databaseID;
  }

  public String getDatabaseID() {
    return this.databaseID;
  }
}
