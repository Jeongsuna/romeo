package C9035_CONTRACTSCHANGE;


import com.sun.istack.NotNull;
import org.springframework.lang.Nullable;

public class C9035_CONTRACTSCHANGE_bad {
    public class Season {}

    public class Vegetable {

        private Season grow;
        private String color;

        public void setGrow(@Nullable Season grow) {
            this.grow = grow;
        }

        public @NotNull
        Integer getProtein() {
            return 12;
        }
    }

    public class Tomato extends Vegetable {

        Season grow;

        public void setGrow(@NotNull Season grow) {  // Noncompliant
            this.grow = grow;
        }

        public @Nullable Integer getProtein() {  // Noncompliant
            return null;
        }
    }
}
