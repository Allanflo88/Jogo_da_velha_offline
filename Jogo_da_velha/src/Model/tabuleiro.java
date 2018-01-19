package Model;

/**
 *
 * @author allan
 */
public class tabuleiro {

    char[][] tab = new char[3][3];
    int cont = 0;

    public tabuleiro() {
        for (int c1 = 0; c1 < 3; c1++) {
            for (int c2 = 0; c2 < 3; c2++) {
                tab[c1][c2] = ' ';
            }
        }
    }

    public void insert(char x, int l, int c) {
        cont++;
        tab[l][c] = x;
        
    }

    public int Verifica() {
        int x;
        int y;
        for (int c1 = 0; c1 < 3; c1++) {
            x = y = 0;
            for (int c2 = 0; c2 < 3; c2++) {
                if (tab[c1][c2] != ' ') {
                    if (tab[c1][c2] == 'X') {
                        x += 1;
                    } else {
                        y += 1;
                    }
                }
                if (x == 3) {
                    return 1;
                } else if (y == 3) {
                    return 0;
                }
            }

        }
        for (int c2 = 0; c2 < 3; c2++) {
            x = y = 0;
            for (int c1 = 0; c1 < 3; c1++) {
                if (tab[c1][c2] != ' ') {
                    if (tab[c1][c2] == 'X') {
                        x += 1;
                    } else {
                        y += 1;
                    }
                }
                if (x == 3) {
                    return 1;
                } else if (y == 3) {
                    return 0;
                }
            }

        }
        if (tab[0][0] == 'X' && tab[1][1] == 'X' && tab[2][2] == 'X') {
            return 1;
        } else if (tab[0][0] == 'O' && tab[1][1] == 'O' && tab[2][2] == 'O') {
            return 0;
        }
        if (tab[0][2] == 'X' && tab[1][1] == 'X' && tab[2][0] == 'X') {
            return 1;
        } else if (tab[0][2] == 'O' && tab[1][1] == 'O' && tab[2][0] == 'O') {
            return 0;
        }
        if(cont == 9){
            return 3;
        }
        return 2;
    }

}
