//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package mondrian.olap;

import java.io.PrintWriter;

public class TransactionCommand extends QueryPart {
  private final Command command;

  TransactionCommand(Command command) {
    this.command = command;
  }

  public void unparse(PrintWriter pw) {
    pw.print(this.command.name() + "TRANSACTION");
  }

  public Object[] getChildren() {
    return new Object[]{this.command};
  }

  public Command getCommand() {
    return this.command;
  }

  public static enum Command {
    BEGIN,
    COMMIT,
    ROLLBACK;

    private Command() {
    }
  }
}
