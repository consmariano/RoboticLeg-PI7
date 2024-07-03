import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class TestGCode {
    public static void main(String[] args) throws Exception {
        GCodeLexer lexer = new GCodeLexer(CharStreams.fromFileName("../../GCode-example"));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        GCodeParser parser = new GCodeParser(tokens);
        ParseTree tree = parser.gcode();
        System.out.println(tree.toStringTree(parser));
    }
}
