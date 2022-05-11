package C9049_UNUSEDMIDSTREAM;

import javafx.scene.paint.Color;

import java.util.List;
import java.util.stream.IntStream;

import static javafx.scene.paint.Color.BLUE;
import static javafx.scene.paint.Color.RED;


public class UNUSEDMIDSTREAM_GOOD {

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

  public void foo(List<Widget> widgets) {
    int sum = widgets.stream()
                      .filter(w -> w.getColor() == BLUE)
                      .mapToInt(w -> w.getWeight())
                      .sum();
    IntStream pipeline = widgets.stream()
                                    .filter(w -> w.getColor() == RED)
                                    .mapToInt(w -> w.getWeight());
    sum = pipeline.sum();

    // do somthing....
  }

}