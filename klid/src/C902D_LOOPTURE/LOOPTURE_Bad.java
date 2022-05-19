package C902D_LOOPTURE;

public class LOOPTURE_Bad {
    public static void main(String[] args) {
//region a>=0 , b>=0
        for(int i = 10; i < 10; i++) {  // Nocompliant

        }

        for(int i = 10; i > 10; i++) {  // Nocompliant

        }

        for(int i = 10; 10 < i; i++) {  // Nocompliant

        }

        for(int i = 10; 10 > i; i++) {  // Nocompliant

        }

        for(int i = 11; i < 10; i++) {  // Nocompliant

        }

        for(int i = 11; i <= 10; i++) {  // Nocompliant

        }

        for(int i = 11; 10 > i; i++) {  // Nocompliant

        }

        for(int i = 11; 10 >= i; i++) {  // Nocompliant

        }

        for(int i = 9; i > 10; i++) {  // Nocompliant

        }

        for(int i = 9; i >= 10; i++) {  // Nocompliant

        }

        for(int i = 9; 10 < i; i++) {  // Nocompliant

        }

        for(int i = 9; 10 <= i; i++) {  // Nocompliant

        }
        //endregion

        //region a>=0, b<0
        for(int i = 10; i < -10; i++) {  // Nocompliant

        }

        for(int i = 10; i <= -10; i++) {  // Nocompliant

        }

        for(int i = 10; -10 > i; i++) {  // Nocompliant

        }

        for(int i = 10; -10 >= i; i++) {  // Nocompliant

        }
        //endregion

        //region a<0, b>=0
        for(int i = -10; i > 10; i++) {  // Nocompliant

        }

        for(int i = -10; i >= 10; i++) {  // Nocompliant

        }

        for(int i = -10; 10 < i; i++) {  // Nocompliant

        }

        for(int i = -10; 10 <= i; i++) {  // Nocompliant

        }
        //endregion

        //region a<0,b<0
        for(int i = -10; i < -10; i++) {  // Nocompliant

        }

        for(int i = -10; i > -10; i++) {  // Nocompliant

        }

        for(int i = -10; -10 < i; i++) {  // Nocompliant

        }

        for(int i = -10; -10 > i; i++) {  // Nocompliant

        }

        for(int i = -9; i < -10; i++) {  // Nocompliant

        }

        for(int i = -9; i <= -10; i++) {  // Nocompliant

        }

        for(int i = -9; -10 > i; i++) {  // Nocompliant

        }

        for(int i = -9; -10 >= i; i++) {  // Nocompliant

        }

        for(int i = -11; i > -10; i++) {  // Nocompliant

        }

        for(int i = -11; i >= -10; i++) {  // Nocompliant

        }

        for(int i = -11; -10 < i; i++) {  // Nocompliant

        }

        for(int i = -11; -10 <= i; i++) {  // Nocompliant

        }
        
    }
}
