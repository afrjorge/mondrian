package mondrian.rolap;

import java.util.ArrayList;
import java.util.List;

public class RolapWriteBackTable {
  private final String name;
  private final String schema;
  private List<RolapWriteBackColumn> columnList;

  public RolapWriteBackTable( String name, String schema, List<RolapWriteBackColumn> columnList) {
    this.name = name;
    this.schema = schema;
    this.columnList = columnList;
    if (this.columnList == null) {
      this.columnList = new ArrayList();
    }

  }

  public String getName() {
    return this.name;
  }

  public String getSchema() {
    return this.schema;
  }

  public List<RolapWriteBackColumn> getColumns() {
    return this.columnList;
  }
}
