package C900F_ABSTRACTCLASS;

public class ABSTRACTCLASS_GOOD {
    public class Palette {
        private int Red = 0;
        private int Green = 0;
        private int Blue = 0;

        private Palette() {
        }

        public int getRed() {
            return Red;
        }
    }

    public abstract class Brush {
        private boolean Brushswitch = false;

        public abstract void Glow();

        public void flipSwitch() {
            Brushswitch = !Brushswitch;
            if (Brushswitch) {
                Glow();
            }
        }
    }
}
