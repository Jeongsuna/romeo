package C809E_AvoidMultipleUnaryOperators;

public class AvoidMultipleUnaryOperators_BAD {
    int i = - -1;
    int j = + - +1;
    int z = ~~2;
    boolean b = !!true;
    boolean c = !!!true;
}
