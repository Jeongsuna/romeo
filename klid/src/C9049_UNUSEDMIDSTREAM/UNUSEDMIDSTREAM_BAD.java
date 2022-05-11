package C9049_UNUSEDMIDSTREAM;

import javafx.scene.paint.Color;

import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static javafx.scene.paint.Color.BLUE;
import static javafx.scene.paint.Color.RED;

public class UNUSEDMIDSTREAM_BAD {

  public class Widget {
    private Color color;

    private int weight;

    public Color getColor() {
      return color;
    }

    public int getWeight() {
      return weight;
    }
  }

  public void foo(List<UNUSEDMIDSTREAM_BAD.Widget> widgets) {

    Stream<Widget> pipeline = widgets.stream().filter(b -> b.getColor() == RED); // Noncompliant

    // do somthing....
  }

}