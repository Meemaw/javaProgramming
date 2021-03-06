
import java.util.Arrays;
import java.util.Comparator;

public class Test47 {
    
    public static void main(String[] args) {
        
        Oseba[][] os = new Oseba[25][];
        os[0] = new Oseba[3];
        os[0][0] = new Oseba("a b", 'M', 7375);
        os[0][1] = new Oseba("a b", 'M', 9561);
        os[0][2] = new Oseba("a b", 'M', 4181);
        os[1] = new Oseba[7];
        os[1][0] = new Oseba("a b", 'Z', 9782);
        os[1][1] = new Oseba("a b", 'Z', 948);
        os[1][2] = new Oseba("a b", 'Z', 7755);
        os[1][3] = new Oseba("a b", 'Z', 2622);
        os[1][4] = new Oseba("a b", 'Z', 3682);
        os[1][5] = new Oseba("a b", 'Z', 5288);
        os[1][6] = new Oseba("a b", 'Z', 1686);
        os[2] = new Oseba[10];
        os[2][0] = new Oseba("a b", 'M', 3697);
        os[2][1] = new Oseba("a b", 'M', 5469);
        os[2][2] = new Oseba("a b", 'Z', 3399);
        os[2][3] = new Oseba("a b", 'Z', 98);
        os[2][4] = new Oseba("a b", 'M', 5388);
        os[2][5] = new Oseba("a b", 'Z', 3709);
        os[2][6] = new Oseba("a b", 'M', 488);
        os[2][7] = new Oseba("a b", 'M', 4306);
        os[2][8] = new Oseba("a b", 'M', 485);
        os[2][9] = new Oseba("a b", 'M', 8366);
        os[3] = new Oseba[1];
        os[3][0] = new Oseba("a b", 'M', 4340);
        os[4] = new Oseba[3];
        os[4][0] = new Oseba("a b", 'Z', 7088);
        os[4][1] = new Oseba("a b", 'M', 9726);
        os[4][2] = new Oseba("a b", 'Z', 4629);
        os[5] = new Oseba[9];
        os[5][0] = new Oseba("a b", 'M', 3026);
        os[5][1] = new Oseba("a b", 'Z', 3396);
        os[5][2] = new Oseba("a b", 'M', 6435);
        os[5][3] = new Oseba("a b", 'Z', 3810);
        os[5][4] = new Oseba("a b", 'M', 7590);
        os[5][5] = new Oseba("a b", 'Z', 6963);
        os[5][6] = new Oseba("a b", 'M', 1701);
        os[5][7] = new Oseba("a b", 'M', 4769);
        os[5][8] = new Oseba("a b", 'Z', 2967);
        os[6] = new Oseba[4];
        os[6][0] = new Oseba("a b", 'Z', 6422);
        os[6][1] = new Oseba("a b", 'Z', 1589);
        os[6][2] = new Oseba("a b", 'Z', 4542);
        os[6][3] = new Oseba("a b", 'M', 4402);
        os[7] = new Oseba[3];
        os[7][0] = new Oseba("a b", 'Z', 3413);
        os[7][1] = new Oseba("a b", 'M', 4157);
        os[7][2] = new Oseba("a b", 'M', 9139);
        os[8] = new Oseba[8];
        os[8][0] = new Oseba("a b", 'M', 6480);
        os[8][1] = new Oseba("a b", 'Z', 8577);
        os[8][2] = new Oseba("a b", 'Z', 2983);
        os[8][3] = new Oseba("a b", 'Z', 3617);
        os[8][4] = new Oseba("a b", 'Z', 4743);
        os[8][5] = new Oseba("a b", 'M', 9207);
        os[8][6] = new Oseba("a b", 'M', 771);
        os[8][7] = new Oseba("a b", 'Z', 3710);
        os[9] = new Oseba[4];
        os[9][0] = new Oseba("a b", 'Z', 8267);
        os[9][1] = new Oseba("a b", 'Z', 1866);
        os[9][2] = new Oseba("a b", 'M', 369);
        os[9][3] = new Oseba("a b", 'M', 3096);
        os[10] = new Oseba[9];
        os[10][0] = new Oseba("a b", 'Z', 7754);
        os[10][1] = new Oseba("a b", 'M', 3335);
        os[10][2] = new Oseba("a b", 'Z', 2995);
        os[10][3] = new Oseba("a b", 'Z', 7352);
        os[10][4] = new Oseba("a b", 'Z', 8258);
        os[10][5] = new Oseba("a b", 'M', 8732);
        os[10][6] = new Oseba("a b", 'Z', 422);
        os[10][7] = new Oseba("a b", 'M', 1400);
        os[10][8] = new Oseba("a b", 'M', 3634);
        os[11] = new Oseba[4];
        os[11][0] = new Oseba("a b", 'M', 839);
        os[11][1] = new Oseba("a b", 'Z', 3232);
        os[11][2] = new Oseba("a b", 'M', 3590);
        os[11][3] = new Oseba("a b", 'Z', 1985);
        os[12] = new Oseba[9];
        os[12][0] = new Oseba("a b", 'M', 9643);
        os[12][1] = new Oseba("a b", 'M', 3704);
        os[12][2] = new Oseba("a b", 'Z', 2616);
        os[12][3] = new Oseba("a b", 'Z', 3730);
        os[12][4] = new Oseba("a b", 'Z', 8072);
        os[12][5] = new Oseba("a b", 'M', 4153);
        os[12][6] = new Oseba("a b", 'Z', 1136);
        os[12][7] = new Oseba("a b", 'Z', 2748);
        os[12][8] = new Oseba("a b", 'Z', 7969);
        os[13] = new Oseba[10];
        os[13][0] = new Oseba("a b", 'Z', 7364);
        os[13][1] = new Oseba("a b", 'M', 6875);
        os[13][2] = new Oseba("a b", 'M', 5055);
        os[13][3] = new Oseba("a b", 'Z', 7168);
        os[13][4] = new Oseba("a b", 'M', 4183);
        os[13][5] = new Oseba("a b", 'Z', 3254);
        os[13][6] = new Oseba("a b", 'Z', 9229);
        os[13][7] = new Oseba("a b", 'Z', 1940);
        os[13][8] = new Oseba("a b", 'Z', 1539);
        os[13][9] = new Oseba("a b", 'Z', 8965);
        os[14] = new Oseba[8];
        os[14][0] = new Oseba("a b", 'Z', 2442);
        os[14][1] = new Oseba("a b", 'Z', 9483);
        os[14][2] = new Oseba("a b", 'M', 3825);
        os[14][3] = new Oseba("a b", 'M', 835);
        os[14][4] = new Oseba("a b", 'Z', 7148);
        os[14][5] = new Oseba("a b", 'Z', 601);
        os[14][6] = new Oseba("a b", 'M', 2138);
        os[14][7] = new Oseba("a b", 'Z', 7602);
        os[15] = new Oseba[7];
        os[15][0] = new Oseba("a b", 'Z', 3947);
        os[15][1] = new Oseba("a b", 'M', 6357);
        os[15][2] = new Oseba("a b", 'Z', 1881);
        os[15][3] = new Oseba("a b", 'M', 7261);
        os[15][4] = new Oseba("a b", 'M', 4578);
        os[15][5] = new Oseba("a b", 'M', 2013);
        os[15][6] = new Oseba("a b", 'M', 4878);
        os[16] = new Oseba[1];
        os[16][0] = new Oseba("a b", 'M', 2066);
        os[17] = new Oseba[4];
        os[17][0] = new Oseba("a b", 'M', 3685);
        os[17][1] = new Oseba("a b", 'Z', 7615);
        os[17][2] = new Oseba("a b", 'M', 9753);
        os[17][3] = new Oseba("a b", 'M', 9376);
        os[18] = new Oseba[10];
        os[18][0] = new Oseba("a b", 'M', 6370);
        os[18][1] = new Oseba("a b", 'Z', 1615);
        os[18][2] = new Oseba("a b", 'M', 4611);
        os[18][3] = new Oseba("a b", 'Z', 6457);
        os[18][4] = new Oseba("a b", 'M', 5610);
        os[18][5] = new Oseba("a b", 'M', 3054);
        os[18][6] = new Oseba("a b", 'Z', 1662);
        os[18][7] = new Oseba("a b", 'M', 4421);
        os[18][8] = new Oseba("a b", 'M', 6401);
        os[18][9] = new Oseba("a b", 'M', 3058);
        os[19] = new Oseba[4];
        os[19][0] = new Oseba("a b", 'M', 6049);
        os[19][1] = new Oseba("a b", 'M', 5688);
        os[19][2] = new Oseba("a b", 'M', 7946);
        os[19][3] = new Oseba("a b", 'Z', 9453);
        os[20] = new Oseba[6];
        os[20][0] = new Oseba("a b", 'M', 1473);
        os[20][1] = new Oseba("a b", 'Z', 487);
        os[20][2] = new Oseba("a b", 'Z', 2881);
        os[20][3] = new Oseba("a b", 'Z', 1265);
        os[20][4] = new Oseba("a b", 'Z', 821);
        os[20][5] = new Oseba("a b", 'M', 2140);
        os[21] = new Oseba[2];
        os[21][0] = new Oseba("a b", 'Z', 425);
        os[21][1] = new Oseba("a b", 'M', 7756);
        os[22] = new Oseba[1];
        os[22][0] = new Oseba("a b", 'Z', 8084);
        os[23] = new Oseba[7];
        os[23][0] = new Oseba("a b", 'M', 4563);
        os[23][1] = new Oseba("a b", 'Z', 6365);
        os[23][2] = new Oseba("a b", 'Z', 9086);
        os[23][3] = new Oseba("a b", 'Z', 148);
        os[23][4] = new Oseba("a b", 'Z', 5168);
        os[23][5] = new Oseba("a b", 'M', 6978);
        os[23][6] = new Oseba("a b", 'M', 1994);
        os[24] = new Oseba[5];
        os[24][0] = new Oseba("a b", 'Z', 2223);
        os[24][1] = new Oseba("a b", 'M', 6753);
        os[24][2] = new Oseba("a b", 'Z', 1501);
        os[24][3] = new Oseba("a b", 'M', 5178);
        os[24][4] = new Oseba("a b", 'Z', 8950);
        
        Stanovanje[] st = new Stanovanje[25];
        st[0] = new Stanovanje(os[0]);
        st[1] = new Stanovanje(os[1]);
        st[2] = new Stanovanje(os[2]);
        st[3] = new Stanovanje(os[3]);
        st[4] = new Stanovanje(os[4]);
        st[5] = new Stanovanje(os[5]);
        st[6] = new Stanovanje(os[6]);
        st[7] = new Stanovanje(os[7]);
        st[8] = new Stanovanje(os[8]);
        st[9] = new Stanovanje(os[9]);
        st[10] = new Stanovanje(os[10]);
        st[11] = new Stanovanje(os[11]);
        st[12] = new Stanovanje(os[12]);
        st[13] = new Stanovanje(os[13]);
        st[14] = new Stanovanje(os[14]);
        st[15] = new Stanovanje(os[15]);
        st[16] = new Stanovanje(os[16]);
        st[17] = new Stanovanje(os[17]);
        st[18] = new Stanovanje(os[18]);
        st[19] = new Stanovanje(os[19]);
        st[20] = new Stanovanje(os[20]);
        st[21] = new Stanovanje(os[21]);
        st[22] = new Stanovanje(os[22]);
        st[23] = new Stanovanje(os[23]);
        st[24] = new Stanovanje(os[24]);
        st[0].nastaviSosede(null, st[8], st[22], null);
        st[1].nastaviSosede(st[14], st[11], st[9], st[17]);
        st[2].nastaviSosede(null, st[22], st[5], st[12]);
        st[3].nastaviSosede(null, null, st[24], st[6]);
        st[4].nastaviSosede(st[23], st[18], st[20], st[13]);
        st[5].nastaviSosede(st[2], st[23], st[13], st[7]);
        st[6].nastaviSosede(null, st[3], st[18], st[23]);
        st[7].nastaviSosede(st[12], st[5], st[14], st[19]);
        st[8].nastaviSosede(null, null, null, st[0]);
        st[9].nastaviSosede(st[1], st[16], null, null);
        st[10].nastaviSosede(null, null, st[12], null);
        st[11].nastaviSosede(st[13], st[20], st[16], st[1]);
        st[12].nastaviSosede(st[10], st[2], st[7], null);
        st[13].nastaviSosede(st[5], st[4], st[11], st[14]);
        st[14].nastaviSosede(st[7], st[13], st[1], st[15]);
        st[15].nastaviSosede(st[19], st[14], st[17], null);
        st[16].nastaviSosede(st[11], null, null, st[9]);
        st[17].nastaviSosede(st[15], st[1], null, st[21]);
        st[18].nastaviSosede(st[6], st[24], null, st[4]);
        st[19].nastaviSosede(null, st[7], st[15], null);
        st[20].nastaviSosede(st[4], null, null, st[11]);
        st[21].nastaviSosede(null, st[17], null, null);
        st[22].nastaviSosede(st[0], null, st[23], st[2]);
        st[23].nastaviSosede(st[22], st[6], st[4], st[5]);
        st[24].nastaviSosede(st[3], null, null, st[18]);
        
        Blok blok = new Blok(st[14]);
        int[][] razpored = new int[7][6];
        razpored[0][0] = -1;
        razpored[0][1] = -1;
        razpored[0][2] = 1;
        razpored[0][3] = 5;
        razpored[0][4] = -1;
        razpored[0][5] = -1;
        razpored[1][0] = 8;
        razpored[1][1] = -1;
        razpored[1][2] = 4;
        razpored[1][3] = 10;
        razpored[1][4] = -1;
        razpored[1][5] = -1;
        razpored[2][0] = 3;
        razpored[2][1] = 1;
        razpored[2][2] = 7;
        razpored[2][3] = 3;
        razpored[2][4] = 6;
        razpored[2][5] = -1;
        razpored[3][0] = -1;
        razpored[3][1] = 10;
        razpored[3][2] = 9;
        razpored[3][3] = 10;
        razpored[3][4] = 4;
        razpored[3][5] = 1;
        razpored[4][0] = 9;
        razpored[4][1] = 9;
        razpored[4][2] = 3;
        razpored[4][3] = 8;
        razpored[4][4] = 7;
        razpored[4][5] = 4;
        razpored[5][0] = -1;
        razpored[5][1] = -1;
        razpored[5][2] = 4;
        razpored[5][3] = 7;
        razpored[5][4] = 4;
        razpored[5][5] = -1;
        razpored[6][0] = -1;
        razpored[6][1] = -1;
        razpored[6][2] = -1;
        razpored[6][3] = -1;
        razpored[6][4] = 2;
        razpored[6][5] = -1;
        int[][] rezultat = blok.razporeditev();
        TestSkupno.preveri(Arrays.deepEquals(razpored, rezultat));
    }
}
