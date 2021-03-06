
import java.util.Arrays;
import java.util.Comparator;

public class Test49 {
    
    public static void main(String[] args) {
        
        Oseba[][] os = new Oseba[47][];
        os[0] = new Oseba[9];
        os[0][0] = new Oseba("a b", 'Z', 6944);
        os[0][1] = new Oseba("a b", 'M', 5654);
        os[0][2] = new Oseba("a b", 'Z', 7619);
        os[0][3] = new Oseba("a b", 'Z', 439);
        os[0][4] = new Oseba("a b", 'Z', 9063);
        os[0][5] = new Oseba("a b", 'M', 834);
        os[0][6] = new Oseba("a b", 'Z', 8611);
        os[0][7] = new Oseba("a b", 'M', 8440);
        os[0][8] = new Oseba("a b", 'M', 8271);
        os[1] = new Oseba[10];
        os[1][0] = new Oseba("a b", 'Z', 8725);
        os[1][1] = new Oseba("a b", 'M', 935);
        os[1][2] = new Oseba("a b", 'M', 2552);
        os[1][3] = new Oseba("a b", 'Z', 8815);
        os[1][4] = new Oseba("a b", 'M', 4219);
        os[1][5] = new Oseba("a b", 'M', 4360);
        os[1][6] = new Oseba("a b", 'M', 989);
        os[1][7] = new Oseba("a b", 'M', 2159);
        os[1][8] = new Oseba("a b", 'Z', 657);
        os[1][9] = new Oseba("a b", 'M', 5349);
        os[2] = new Oseba[8];
        os[2][0] = new Oseba("a b", 'M', 2433);
        os[2][1] = new Oseba("a b", 'M', 3448);
        os[2][2] = new Oseba("a b", 'M', 2462);
        os[2][3] = new Oseba("a b", 'M', 4336);
        os[2][4] = new Oseba("a b", 'Z', 4631);
        os[2][5] = new Oseba("a b", 'Z', 6342);
        os[2][6] = new Oseba("a b", 'M', 934);
        os[2][7] = new Oseba("a b", 'M', 4477);
        os[3] = new Oseba[6];
        os[3][0] = new Oseba("a b", 'Z', 8171);
        os[3][1] = new Oseba("a b", 'M', 3895);
        os[3][2] = new Oseba("a b", 'M', 3264);
        os[3][3] = new Oseba("a b", 'Z', 3273);
        os[3][4] = new Oseba("a b", 'Z', 5842);
        os[3][5] = new Oseba("a b", 'M', 2967);
        os[4] = new Oseba[7];
        os[4][0] = new Oseba("a b", 'Z', 4538);
        os[4][1] = new Oseba("a b", 'M', 6547);
        os[4][2] = new Oseba("a b", 'Z', 6586);
        os[4][3] = new Oseba("a b", 'M', 3487);
        os[4][4] = new Oseba("a b", 'M', 1687);
        os[4][5] = new Oseba("a b", 'Z', 4479);
        os[4][6] = new Oseba("a b", 'Z', 6852);
        os[5] = new Oseba[8];
        os[5][0] = new Oseba("a b", 'M', 1555);
        os[5][1] = new Oseba("a b", 'Z', 1248);
        os[5][2] = new Oseba("a b", 'M', 5206);
        os[5][3] = new Oseba("a b", 'Z', 5056);
        os[5][4] = new Oseba("a b", 'M', 7839);
        os[5][5] = new Oseba("a b", 'Z', 7094);
        os[5][6] = new Oseba("a b", 'M', 4732);
        os[5][7] = new Oseba("a b", 'Z', 5291);
        os[6] = new Oseba[1];
        os[6][0] = new Oseba("a b", 'M', 5062);
        os[7] = new Oseba[9];
        os[7][0] = new Oseba("a b", 'M', 2854);
        os[7][1] = new Oseba("a b", 'Z', 4088);
        os[7][2] = new Oseba("a b", 'Z', 5737);
        os[7][3] = new Oseba("a b", 'Z', 3351);
        os[7][4] = new Oseba("a b", 'Z', 674);
        os[7][5] = new Oseba("a b", 'Z', 6837);
        os[7][6] = new Oseba("a b", 'M', 9913);
        os[7][7] = new Oseba("a b", 'Z', 4498);
        os[7][8] = new Oseba("a b", 'M', 148);
        os[8] = new Oseba[6];
        os[8][0] = new Oseba("a b", 'M', 910);
        os[8][1] = new Oseba("a b", 'Z', 6161);
        os[8][2] = new Oseba("a b", 'Z', 2171);
        os[8][3] = new Oseba("a b", 'Z', 8937);
        os[8][4] = new Oseba("a b", 'Z', 1414);
        os[8][5] = new Oseba("a b", 'M', 8122);
        os[9] = new Oseba[1];
        os[9][0] = new Oseba("a b", 'Z', 1632);
        os[10] = new Oseba[5];
        os[10][0] = new Oseba("a b", 'Z', 6478);
        os[10][1] = new Oseba("a b", 'M', 7748);
        os[10][2] = new Oseba("a b", 'M', 8213);
        os[10][3] = new Oseba("a b", 'M', 2863);
        os[10][4] = new Oseba("a b", 'Z', 3716);
        os[11] = new Oseba[9];
        os[11][0] = new Oseba("a b", 'M', 8004);
        os[11][1] = new Oseba("a b", 'M', 1386);
        os[11][2] = new Oseba("a b", 'Z', 2716);
        os[11][3] = new Oseba("a b", 'M', 4865);
        os[11][4] = new Oseba("a b", 'M', 5175);
        os[11][5] = new Oseba("a b", 'Z', 6504);
        os[11][6] = new Oseba("a b", 'Z', 3874);
        os[11][7] = new Oseba("a b", 'M', 8124);
        os[11][8] = new Oseba("a b", 'M', 7585);
        os[12] = new Oseba[1];
        os[12][0] = new Oseba("a b", 'Z', 4181);
        os[13] = new Oseba[3];
        os[13][0] = new Oseba("a b", 'M', 4309);
        os[13][1] = new Oseba("a b", 'M', 5957);
        os[13][2] = new Oseba("a b", 'M', 3204);
        os[14] = new Oseba[1];
        os[14][0] = new Oseba("a b", 'Z', 4809);
        os[15] = new Oseba[9];
        os[15][0] = new Oseba("a b", 'M', 9056);
        os[15][1] = new Oseba("a b", 'M', 2401);
        os[15][2] = new Oseba("a b", 'Z', 9320);
        os[15][3] = new Oseba("a b", 'M', 7658);
        os[15][4] = new Oseba("a b", 'M', 7216);
        os[15][5] = new Oseba("a b", 'Z', 243);
        os[15][6] = new Oseba("a b", 'Z', 698);
        os[15][7] = new Oseba("a b", 'M', 6134);
        os[15][8] = new Oseba("a b", 'Z', 776);
        os[16] = new Oseba[5];
        os[16][0] = new Oseba("a b", 'M', 3952);
        os[16][1] = new Oseba("a b", 'M', 9330);
        os[16][2] = new Oseba("a b", 'Z', 4067);
        os[16][3] = new Oseba("a b", 'Z', 9055);
        os[16][4] = new Oseba("a b", 'M', 2578);
        os[17] = new Oseba[10];
        os[17][0] = new Oseba("a b", 'M', 1038);
        os[17][1] = new Oseba("a b", 'Z', 7645);
        os[17][2] = new Oseba("a b", 'Z', 3055);
        os[17][3] = new Oseba("a b", 'Z', 1358);
        os[17][4] = new Oseba("a b", 'M', 5459);
        os[17][5] = new Oseba("a b", 'Z', 2788);
        os[17][6] = new Oseba("a b", 'Z', 6913);
        os[17][7] = new Oseba("a b", 'M', 4665);
        os[17][8] = new Oseba("a b", 'M', 5219);
        os[17][9] = new Oseba("a b", 'Z', 4158);
        os[18] = new Oseba[9];
        os[18][0] = new Oseba("a b", 'M', 5277);
        os[18][1] = new Oseba("a b", 'Z', 5997);
        os[18][2] = new Oseba("a b", 'Z', 9837);
        os[18][3] = new Oseba("a b", 'Z', 5658);
        os[18][4] = new Oseba("a b", 'M', 4874);
        os[18][5] = new Oseba("a b", 'M', 394);
        os[18][6] = new Oseba("a b", 'M', 1644);
        os[18][7] = new Oseba("a b", 'Z', 7765);
        os[18][8] = new Oseba("a b", 'M', 1928);
        os[19] = new Oseba[2];
        os[19][0] = new Oseba("a b", 'M', 3222);
        os[19][1] = new Oseba("a b", 'M', 2699);
        os[20] = new Oseba[2];
        os[20][0] = new Oseba("a b", 'Z', 8615);
        os[20][1] = new Oseba("a b", 'Z', 1554);
        os[21] = new Oseba[0];
        os[22] = new Oseba[1];
        os[22][0] = new Oseba("a b", 'Z', 7018);
        os[23] = new Oseba[6];
        os[23][0] = new Oseba("a b", 'M', 701);
        os[23][1] = new Oseba("a b", 'M', 9057);
        os[23][2] = new Oseba("a b", 'M', 9427);
        os[23][3] = new Oseba("a b", 'M', 5186);
        os[23][4] = new Oseba("a b", 'M', 9254);
        os[23][5] = new Oseba("a b", 'Z', 3367);
        os[24] = new Oseba[10];
        os[24][0] = new Oseba("a b", 'M', 2249);
        os[24][1] = new Oseba("a b", 'M', 7308);
        os[24][2] = new Oseba("a b", 'Z', 5675);
        os[24][3] = new Oseba("a b", 'Z', 884);
        os[24][4] = new Oseba("a b", 'M', 9034);
        os[24][5] = new Oseba("a b", 'Z', 5940);
        os[24][6] = new Oseba("a b", 'M', 8682);
        os[24][7] = new Oseba("a b", 'Z', 4937);
        os[24][8] = new Oseba("a b", 'Z', 6772);
        os[24][9] = new Oseba("a b", 'Z', 2750);
        os[25] = new Oseba[10];
        os[25][0] = new Oseba("a b", 'Z', 854);
        os[25][1] = new Oseba("a b", 'M', 92);
        os[25][2] = new Oseba("a b", 'Z', 1646);
        os[25][3] = new Oseba("a b", 'M', 404);
        os[25][4] = new Oseba("a b", 'Z', 4518);
        os[25][5] = new Oseba("a b", 'Z', 2306);
        os[25][6] = new Oseba("a b", 'Z', 4197);
        os[25][7] = new Oseba("a b", 'M', 4619);
        os[25][8] = new Oseba("a b", 'M', 1745);
        os[25][9] = new Oseba("a b", 'M', 1221);
        os[26] = new Oseba[0];
        os[27] = new Oseba[3];
        os[27][0] = new Oseba("a b", 'Z', 5642);
        os[27][1] = new Oseba("a b", 'M', 6960);
        os[27][2] = new Oseba("a b", 'Z', 2444);
        os[28] = new Oseba[10];
        os[28][0] = new Oseba("a b", 'M', 7276);
        os[28][1] = new Oseba("a b", 'M', 3890);
        os[28][2] = new Oseba("a b", 'M', 1178);
        os[28][3] = new Oseba("a b", 'Z', 553);
        os[28][4] = new Oseba("a b", 'Z', 1469);
        os[28][5] = new Oseba("a b", 'Z', 8451);
        os[28][6] = new Oseba("a b", 'M', 5641);
        os[28][7] = new Oseba("a b", 'M', 3438);
        os[28][8] = new Oseba("a b", 'M', 4955);
        os[28][9] = new Oseba("a b", 'M', 1005);
        os[29] = new Oseba[7];
        os[29][0] = new Oseba("a b", 'M', 8364);
        os[29][1] = new Oseba("a b", 'M', 5456);
        os[29][2] = new Oseba("a b", 'M', 1853);
        os[29][3] = new Oseba("a b", 'M', 8142);
        os[29][4] = new Oseba("a b", 'M', 4006);
        os[29][5] = new Oseba("a b", 'Z', 927);
        os[29][6] = new Oseba("a b", 'M', 6242);
        os[30] = new Oseba[2];
        os[30][0] = new Oseba("a b", 'M', 4981);
        os[30][1] = new Oseba("a b", 'Z', 363);
        os[31] = new Oseba[1];
        os[31][0] = new Oseba("a b", 'M', 764);
        os[32] = new Oseba[9];
        os[32][0] = new Oseba("a b", 'M', 4086);
        os[32][1] = new Oseba("a b", 'M', 2151);
        os[32][2] = new Oseba("a b", 'Z', 5365);
        os[32][3] = new Oseba("a b", 'M', 2754);
        os[32][4] = new Oseba("a b", 'Z', 8880);
        os[32][5] = new Oseba("a b", 'Z', 8901);
        os[32][6] = new Oseba("a b", 'M', 8485);
        os[32][7] = new Oseba("a b", 'M', 3653);
        os[32][8] = new Oseba("a b", 'M', 7637);
        os[33] = new Oseba[0];
        os[34] = new Oseba[2];
        os[34][0] = new Oseba("a b", 'Z', 1903);
        os[34][1] = new Oseba("a b", 'M', 4494);
        os[35] = new Oseba[1];
        os[35][0] = new Oseba("a b", 'M', 9734);
        os[36] = new Oseba[4];
        os[36][0] = new Oseba("a b", 'Z', 6001);
        os[36][1] = new Oseba("a b", 'Z', 4339);
        os[36][2] = new Oseba("a b", 'M', 9230);
        os[36][3] = new Oseba("a b", 'M', 5001);
        os[37] = new Oseba[1];
        os[37][0] = new Oseba("a b", 'M', 4312);
        os[38] = new Oseba[4];
        os[38][0] = new Oseba("a b", 'Z', 9290);
        os[38][1] = new Oseba("a b", 'Z', 2737);
        os[38][2] = new Oseba("a b", 'Z', 9873);
        os[38][3] = new Oseba("a b", 'M', 7563);
        os[39] = new Oseba[1];
        os[39][0] = new Oseba("a b", 'M', 8642);
        os[40] = new Oseba[5];
        os[40][0] = new Oseba("a b", 'Z', 1060);
        os[40][1] = new Oseba("a b", 'Z', 9436);
        os[40][2] = new Oseba("a b", 'M', 6834);
        os[40][3] = new Oseba("a b", 'M', 8785);
        os[40][4] = new Oseba("a b", 'M', 8972);
        os[41] = new Oseba[9];
        os[41][0] = new Oseba("a b", 'Z', 6518);
        os[41][1] = new Oseba("a b", 'M', 6040);
        os[41][2] = new Oseba("a b", 'Z', 8817);
        os[41][3] = new Oseba("a b", 'Z', 4713);
        os[41][4] = new Oseba("a b", 'M', 1403);
        os[41][5] = new Oseba("a b", 'Z', 6794);
        os[41][6] = new Oseba("a b", 'M', 5597);
        os[41][7] = new Oseba("a b", 'M', 494);
        os[41][8] = new Oseba("a b", 'M', 7565);
        os[42] = new Oseba[2];
        os[42][0] = new Oseba("a b", 'Z', 265);
        os[42][1] = new Oseba("a b", 'M', 527);
        os[43] = new Oseba[0];
        os[44] = new Oseba[8];
        os[44][0] = new Oseba("a b", 'M', 1003);
        os[44][1] = new Oseba("a b", 'M', 2082);
        os[44][2] = new Oseba("a b", 'Z', 3381);
        os[44][3] = new Oseba("a b", 'M', 5209);
        os[44][4] = new Oseba("a b", 'Z', 5884);
        os[44][5] = new Oseba("a b", 'M', 4992);
        os[44][6] = new Oseba("a b", 'Z', 9684);
        os[44][7] = new Oseba("a b", 'M', 885);
        os[45] = new Oseba[10];
        os[45][0] = new Oseba("a b", 'Z', 9339);
        os[45][1] = new Oseba("a b", 'Z', 1294);
        os[45][2] = new Oseba("a b", 'Z', 1846);
        os[45][3] = new Oseba("a b", 'M', 6421);
        os[45][4] = new Oseba("a b", 'M', 7154);
        os[45][5] = new Oseba("a b", 'M', 4366);
        os[45][6] = new Oseba("a b", 'Z', 7359);
        os[45][7] = new Oseba("a b", 'Z', 4917);
        os[45][8] = new Oseba("a b", 'M', 2325);
        os[45][9] = new Oseba("a b", 'M', 4295);
        os[46] = new Oseba[6];
        os[46][0] = new Oseba("a b", 'Z', 9213);
        os[46][1] = new Oseba("a b", 'Z', 3050);
        os[46][2] = new Oseba("a b", 'Z', 4847);
        os[46][3] = new Oseba("a b", 'M', 6789);
        os[46][4] = new Oseba("a b", 'M', 7354);
        os[46][5] = new Oseba("a b", 'M', 12);
        
        Stanovanje[] st = new Stanovanje[47];
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
        st[25] = new Stanovanje(os[25]);
        st[26] = new Stanovanje(os[26]);
        st[27] = new Stanovanje(os[27]);
        st[28] = new Stanovanje(os[28]);
        st[29] = new Stanovanje(os[29]);
        st[30] = new Stanovanje(os[30]);
        st[31] = new Stanovanje(os[31]);
        st[32] = new Stanovanje(os[32]);
        st[33] = new Stanovanje(os[33]);
        st[34] = new Stanovanje(os[34]);
        st[35] = new Stanovanje(os[35]);
        st[36] = new Stanovanje(os[36]);
        st[37] = new Stanovanje(os[37]);
        st[38] = new Stanovanje(os[38]);
        st[39] = new Stanovanje(os[39]);
        st[40] = new Stanovanje(os[40]);
        st[41] = new Stanovanje(os[41]);
        st[42] = new Stanovanje(os[42]);
        st[43] = new Stanovanje(os[43]);
        st[44] = new Stanovanje(os[44]);
        st[45] = new Stanovanje(os[45]);
        st[46] = new Stanovanje(os[46]);
        st[0].nastaviSosede(st[32], st[38], st[25], st[5]);
        st[1].nastaviSosede(st[29], st[30], null, st[31]);
        st[2].nastaviSosede(null, st[14], st[6], st[34]);
        st[3].nastaviSosede(null, st[17], st[39], null);
        st[4].nastaviSosede(st[45], null, null, st[37]);
        st[5].nastaviSosede(null, st[0], st[11], null);
        st[6].nastaviSosede(st[2], st[40], st[36], st[22]);
        st[7].nastaviSosede(st[17], st[16], st[9], st[39]);
        st[8].nastaviSosede(st[13], st[31], null, st[10]);
        st[9].nastaviSosede(st[7], st[12], null, null);
        st[10].nastaviSosede(st[12], st[8], null, null);
        st[11].nastaviSosede(st[5], st[25], st[41], st[44]);
        st[12].nastaviSosede(st[16], st[13], st[10], st[9]);
        st[13].nastaviSosede(st[36], st[24], st[8], st[12]);
        st[14].nastaviSosede(st[44], st[41], st[40], st[2]);
        st[15].nastaviSosede(st[41], st[37], st[35], st[40]);
        st[16].nastaviSosede(st[22], st[36], st[12], st[7]);
        st[17].nastaviSosede(st[42], st[22], st[7], st[3]);
        st[18].nastaviSosede(st[33], null, null, st[45]);
        st[19].nastaviSosede(st[28], null, st[30], st[29]);
        st[20].nastaviSosede(st[40], st[35], st[24], st[36]);
        st[21].nastaviSosede(st[25], st[45], st[37], st[41]);
        st[22].nastaviSosede(st[34], st[6], st[16], st[17]);
        st[23].nastaviSosede(null, null, st[34], st[43]);
        st[24].nastaviSosede(st[20], st[29], st[31], st[13]);
        st[25].nastaviSosede(st[0], st[46], st[21], st[11]);
        st[26].nastaviSosede(null, st[43], null, null);
        st[27].nastaviSosede(null, null, st[43], null);
        st[28].nastaviSosede(st[37], null, st[19], st[35]);
        st[29].nastaviSosede(st[35], st[19], st[1], st[24]);
        st[30].nastaviSosede(st[19], null, null, st[1]);
        st[31].nastaviSosede(st[24], st[1], null, st[8]);
        st[32].nastaviSosede(null, null, st[0], null);
        st[33].nastaviSosede(null, null, st[18], st[46]);
        st[34].nastaviSosede(st[23], st[2], st[22], st[42]);
        st[35].nastaviSosede(st[15], st[28], st[29], st[20]);
        st[36].nastaviSosede(st[6], st[20], st[13], st[16]);
        st[37].nastaviSosede(st[21], st[4], st[28], st[15]);
        st[38].nastaviSosede(null, null, st[46], st[0]);
        st[39].nastaviSosede(st[3], st[7], null, null);
        st[40].nastaviSosede(st[14], st[15], st[20], st[6]);
        st[41].nastaviSosede(st[11], st[21], st[15], st[14]);
        st[42].nastaviSosede(st[43], st[34], st[17], null);
        st[43].nastaviSosede(st[27], st[23], st[42], st[26]);
        st[44].nastaviSosede(null, st[11], st[14], null);
        st[45].nastaviSosede(st[46], st[18], st[4], st[21]);
        st[46].nastaviSosede(st[38], st[33], st[45], st[25]);
        
        Blok blok = new Blok(st[39]);
        int[][] razpored = new int[9][8];
        razpored[0][0] = -1;
        razpored[0][1] = -1;
        razpored[0][2] = 0;
        razpored[0][3] = 9;
        razpored[0][4] = -1;
        razpored[0][5] = -1;
        razpored[0][6] = -1;
        razpored[0][7] = -1;
        razpored[1][0] = -1;
        razpored[1][1] = 4;
        razpored[1][2] = 6;
        razpored[1][3] = 10;
        razpored[1][4] = 7;
        razpored[1][5] = -1;
        razpored[1][6] = -1;
        razpored[1][7] = -1;
        razpored[2][0] = 9;
        razpored[2][1] = 9;
        razpored[2][2] = 10;
        razpored[2][3] = 0;
        razpored[2][4] = 1;
        razpored[2][5] = 10;
        razpored[2][6] = 2;
        razpored[2][7] = 2;
        razpored[3][0] = -1;
        razpored[3][1] = 8;
        razpored[3][2] = 9;
        razpored[3][3] = 9;
        razpored[3][4] = 9;
        razpored[3][5] = 1;
        razpored[3][6] = 7;
        razpored[3][7] = 10;
        razpored[4][0] = -1;
        razpored[4][1] = -1;
        razpored[4][2] = 8;
        razpored[4][3] = 1;
        razpored[4][4] = 5;
        razpored[4][5] = 2;
        razpored[4][6] = 10;
        razpored[4][7] = 1;
        razpored[5][0] = -1;
        razpored[5][1] = -1;
        razpored[5][2] = -1;
        razpored[5][3] = 8;
        razpored[5][4] = 1;
        razpored[5][5] = 4;
        razpored[5][6] = 3;
        razpored[5][7] = 6;
        razpored[6][0] = -1;
        razpored[6][1] = -1;
        razpored[6][2] = 6;
        razpored[6][3] = 2;
        razpored[6][4] = 1;
        razpored[6][5] = 5;
        razpored[6][6] = 1;
        razpored[6][7] = 5;
        razpored[7][0] = -1;
        razpored[7][1] = 3;
        razpored[7][2] = 0;
        razpored[7][3] = 2;
        razpored[7][4] = 10;
        razpored[7][5] = 9;
        razpored[7][6] = 1;
        razpored[7][7] = -1;
        razpored[8][0] = -1;
        razpored[8][1] = -1;
        razpored[8][2] = 0;
        razpored[8][3] = -1;
        razpored[8][4] = 6;
        razpored[8][5] = 1;
        razpored[8][6] = -1;
        razpored[8][7] = -1;
        int[][] rezultat = blok.razporeditev();
        TestSkupno.preveri(Arrays.deepEquals(razpored, rezultat));
    }
}
