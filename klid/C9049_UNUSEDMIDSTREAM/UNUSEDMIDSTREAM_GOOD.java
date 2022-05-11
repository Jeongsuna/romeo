package C9049_UNUSEDMIDSTREAM;

public class UNUSEDMIDSTREAM_GOOD {


  public static void main(String[] args) {
    int sum = widgets.stream()
                      .filter(w -> w.getColor() == BLUE)
                      .mapToInt(w -> w.getWeight())
                      .sum();
    Stream<Widget> widgetPipeline = widgets.stream()
                                    .filter(w -> w.getColor() == RED)
                                    .mapToInt(w -> w.getWeight());
    sum = pipeline.sum();
  }

}