package mondrian.rolap;

import mondrian.olap.OlapElement;

public abstract class RolapDrillThroughColumn {
  private final String name;

  protected RolapDrillThroughColumn(String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }

  public abstract OlapElement getOlapElement();
}
