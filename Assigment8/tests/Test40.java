
import java.util.Arrays;
import java.util.Comparator;

public class Test40 {
    
    public static void main(String[] args) {
        
        Oseba[][] os = new Oseba[58][];
        os[0] = new Oseba[10];
        os[0][0] = new Oseba("a b", 'Z', 1931);
        os[0][1] = new Oseba("a b", 'Z', 226);
        os[0][2] = new Oseba("a b", 'M', 5769);
        os[0][3] = new Oseba("a b", 'Z', 5013);
        os[0][4] = new Oseba("a b", 'M', 9513);
        os[0][5] = new Oseba("a b", 'M', 1604);
        os[0][6] = new Oseba("a b", 'M', 494);
        os[0][7] = new Oseba("a b", 'M', 4746);
        os[0][8] = new Oseba("a b", 'Z', 3763);
        os[0][9] = new Oseba("a b", 'Z', 9397);
        os[1] = new Oseba[8];
        os[1][0] = new Oseba("a b", 'Z', 1778);
        os[1][1] = new Oseba("a b", 'M', 4055);
        os[1][2] = new Oseba("a b", 'Z', 3761);
        os[1][3] = new Oseba("a b", 'M', 5548);
        os[1][4] = new Oseba("a b", 'Z', 8714);
        os[1][5] = new Oseba("a b", 'M', 3968);
        os[1][6] = new Oseba("a b", 'Z', 2557);
        os[1][7] = new Oseba("a b", 'M', 4791);
        os[2] = new Oseba[8];
        os[2][0] = new Oseba("a b", 'Z', 9280);
        os[2][1] = new Oseba("a b", 'M', 2216);
        os[2][2] = new Oseba("a b", 'M', 2793);
        os[2][3] = new Oseba("a b", 'M', 9129);
        os[2][4] = new Oseba("a b", 'Z', 5115);
        os[2][5] = new Oseba("a b", 'Z', 9546);
        os[2][6] = new Oseba("a b", 'M', 9486);
        os[2][7] = new Oseba("a b", 'Z', 8036);
        os[3] = new Oseba[7];
        os[3][0] = new Oseba("a b", 'M', 4457);
        os[3][1] = new Oseba("a b", 'M', 7396);
        os[3][2] = new Oseba("a b", 'M', 1306);
        os[3][3] = new Oseba("a b", 'Z', 6055);
        os[3][4] = new Oseba("a b", 'M', 1461);
        os[3][5] = new Oseba("a b", 'Z', 1267);
        os[3][6] = new Oseba("a b", 'M', 2142);
        os[4] = new Oseba[9];
        os[4][0] = new Oseba("a b", 'Z', 437);
        os[4][1] = new Oseba("a b", 'Z', 5332);
        os[4][2] = new Oseba("a b", 'Z', 4666);
        os[4][3] = new Oseba("a b", 'M', 8007);
        os[4][4] = new Oseba("a b", 'Z', 7779);
        os[4][5] = new Oseba("a b", 'M', 3179);
        os[4][6] = new Oseba("a b", 'M', 1622);
        os[4][7] = new Oseba("a b", 'M', 1905);
        os[4][8] = new Oseba("a b", 'Z', 7305);
        os[5] = new Oseba[2];
        os[5][0] = new Oseba("a b", 'Z', 2130);
        os[5][1] = new Oseba("a b", 'M', 132);
        os[6] = new Oseba[6];
        os[6][0] = new Oseba("a b", 'M', 912);
        os[6][1] = new Oseba("a b", 'Z', 210);
        os[6][2] = new Oseba("a b", 'M', 3138);
        os[6][3] = new Oseba("a b", 'M', 2113);
        os[6][4] = new Oseba("a b", 'Z', 2274);
        os[6][5] = new Oseba("a b", 'M', 7438);
        os[7] = new Oseba[10];
        os[7][0] = new Oseba("a b", 'Z', 9811);
        os[7][1] = new Oseba("a b", 'Z', 1918);
        os[7][2] = new Oseba("a b", 'M', 2023);
        os[7][3] = new Oseba("a b", 'M', 8881);
        os[7][4] = new Oseba("a b", 'M', 9959);
        os[7][5] = new Oseba("a b", 'M', 5261);
        os[7][6] = new Oseba("a b", 'Z', 2081);
        os[7][7] = new Oseba("a b", 'Z', 8694);
        os[7][8] = new Oseba("a b", 'M', 5453);
        os[7][9] = new Oseba("a b", 'Z', 1514);
        os[8] = new Oseba[9];
        os[8][0] = new Oseba("a b", 'M', 5268);
        os[8][1] = new Oseba("a b", 'M', 373);
        os[8][2] = new Oseba("a b", 'Z', 7325);
        os[8][3] = new Oseba("a b", 'M', 1339);
        os[8][4] = new Oseba("a b", 'Z', 9126);
        os[8][5] = new Oseba("a b", 'M', 6019);
        os[8][6] = new Oseba("a b", 'Z', 7541);
        os[8][7] = new Oseba("a b", 'M', 3790);
        os[8][8] = new Oseba("a b", 'Z', 9796);
        os[9] = new Oseba[4];
        os[9][0] = new Oseba("a b", 'M', 5373);
        os[9][1] = new Oseba("a b", 'M', 7048);
        os[9][2] = new Oseba("a b", 'Z', 5906);
        os[9][3] = new Oseba("a b", 'Z', 102);
        os[10] = new Oseba[7];
        os[10][0] = new Oseba("a b", 'Z', 7942);
        os[10][1] = new Oseba("a b", 'Z', 4325);
        os[10][2] = new Oseba("a b", 'M', 3871);
        os[10][3] = new Oseba("a b", 'M', 4929);
        os[10][4] = new Oseba("a b", 'Z', 7136);
        os[10][5] = new Oseba("a b", 'Z', 3629);
        os[10][6] = new Oseba("a b", 'Z', 1078);
        os[11] = new Oseba[4];
        os[11][0] = new Oseba("a b", 'M', 9696);
        os[11][1] = new Oseba("a b", 'M', 2445);
        os[11][2] = new Oseba("a b", 'M', 830);
        os[11][3] = new Oseba("a b", 'Z', 1698);
        os[12] = new Oseba[2];
        os[12][0] = new Oseba("a b", 'Z', 7996);
        os[12][1] = new Oseba("a b", 'M', 4346);
        os[13] = new Oseba[7];
        os[13][0] = new Oseba("a b", 'M', 3465);
        os[13][1] = new Oseba("a b", 'M', 7545);
        os[13][2] = new Oseba("a b", 'M', 1038);
        os[13][3] = new Oseba("a b", 'Z', 1130);
        os[13][4] = new Oseba("a b", 'M', 3991);
        os[13][5] = new Oseba("a b", 'M', 4670);
        os[13][6] = new Oseba("a b", 'Z', 8875);
        os[14] = new Oseba[0];
        os[15] = new Oseba[10];
        os[15][0] = new Oseba("a b", 'M', 3432);
        os[15][1] = new Oseba("a b", 'M', 4039);
        os[15][2] = new Oseba("a b", 'M', 6886);
        os[15][3] = new Oseba("a b", 'Z', 2524);
        os[15][4] = new Oseba("a b", 'Z', 2756);
        os[15][5] = new Oseba("a b", 'M', 4987);
        os[15][6] = new Oseba("a b", 'M', 8023);
        os[15][7] = new Oseba("a b", 'Z', 4662);
        os[15][8] = new Oseba("a b", 'Z', 852);
        os[15][9] = new Oseba("a b", 'M', 8132);
        os[16] = new Oseba[0];
        os[17] = new Oseba[6];
        os[17][0] = new Oseba("a b", 'M', 544);
        os[17][1] = new Oseba("a b", 'Z', 3831);
        os[17][2] = new Oseba("a b", 'Z', 3736);
        os[17][3] = new Oseba("a b", 'M', 6725);
        os[17][4] = new Oseba("a b", 'Z', 702);
        os[17][5] = new Oseba("a b", 'Z', 7032);
        os[18] = new Oseba[9];
        os[18][0] = new Oseba("a b", 'Z', 8613);
        os[18][1] = new Oseba("a b", 'M', 843);
        os[18][2] = new Oseba("a b", 'M', 5923);
        os[18][3] = new Oseba("a b", 'M', 5928);
        os[18][4] = new Oseba("a b", 'Z', 4732);
        os[18][5] = new Oseba("a b", 'M', 7329);
        os[18][6] = new Oseba("a b", 'M', 4040);
        os[18][7] = new Oseba("a b", 'M', 5756);
        os[18][8] = new Oseba("a b", 'Z', 8204);
        os[19] = new Oseba[8];
        os[19][0] = new Oseba("a b", 'Z', 6790);
        os[19][1] = new Oseba("a b", 'M', 8847);
        os[19][2] = new Oseba("a b", 'M', 7037);
        os[19][3] = new Oseba("a b", 'M', 5751);
        os[19][4] = new Oseba("a b", 'Z', 424);
        os[19][5] = new Oseba("a b", 'Z', 275);
        os[19][6] = new Oseba("a b", 'M', 6322);
        os[19][7] = new Oseba("a b", 'Z', 954);
        os[20] = new Oseba[10];
        os[20][0] = new Oseba("a b", 'Z', 8700);
        os[20][1] = new Oseba("a b", 'Z', 4345);
        os[20][2] = new Oseba("a b", 'M', 2991);
        os[20][3] = new Oseba("a b", 'M', 3471);
        os[20][4] = new Oseba("a b", 'Z', 5941);
        os[20][5] = new Oseba("a b", 'M', 3058);
        os[20][6] = new Oseba("a b", 'M', 1333);
        os[20][7] = new Oseba("a b", 'Z', 7257);
        os[20][8] = new Oseba("a b", 'M', 7995);
        os[20][9] = new Oseba("a b", 'M', 5472);
        os[21] = new Oseba[3];
        os[21][0] = new Oseba("a b", 'M', 8471);
        os[21][1] = new Oseba("a b", 'Z', 8015);
        os[21][2] = new Oseba("a b", 'M', 7923);
        os[22] = new Oseba[9];
        os[22][0] = new Oseba("a b", 'Z', 1320);
        os[22][1] = new Oseba("a b", 'M', 3959);
        os[22][2] = new Oseba("a b", 'Z', 1703);
        os[22][3] = new Oseba("a b", 'M', 8807);
        os[22][4] = new Oseba("a b", 'Z', 82);
        os[22][5] = new Oseba("a b", 'M', 8347);
        os[22][6] = new Oseba("a b", 'Z', 6395);
        os[22][7] = new Oseba("a b", 'M', 6692);
        os[22][8] = new Oseba("a b", 'Z', 9355);
        os[23] = new Oseba[1];
        os[23][0] = new Oseba("a b", 'Z', 9638);
        os[24] = new Oseba[7];
        os[24][0] = new Oseba("a b", 'M', 7707);
        os[24][1] = new Oseba("a b", 'Z', 9817);
        os[24][2] = new Oseba("a b", 'Z', 5441);
        os[24][3] = new Oseba("a b", 'M', 5836);
        os[24][4] = new Oseba("a b", 'M', 1296);
        os[24][5] = new Oseba("a b", 'Z', 8897);
        os[24][6] = new Oseba("a b", 'M', 5564);
        os[25] = new Oseba[1];
        os[25][0] = new Oseba("a b", 'M', 9298);
        os[26] = new Oseba[5];
        os[26][0] = new Oseba("a b", 'Z', 9105);
        os[26][1] = new Oseba("a b", 'Z', 779);
        os[26][2] = new Oseba("a b", 'M', 3015);
        os[26][3] = new Oseba("a b", 'M', 7588);
        os[26][4] = new Oseba("a b", 'Z', 5917);
        os[27] = new Oseba[9];
        os[27][0] = new Oseba("a b", 'M', 8046);
        os[27][1] = new Oseba("a b", 'M', 679);
        os[27][2] = new Oseba("a b", 'M', 9244);
        os[27][3] = new Oseba("a b", 'Z', 8356);
        os[27][4] = new Oseba("a b", 'Z', 9019);
        os[27][5] = new Oseba("a b", 'Z', 1638);
        os[27][6] = new Oseba("a b", 'Z', 5144);
        os[27][7] = new Oseba("a b", 'M', 5176);
        os[27][8] = new Oseba("a b", 'Z', 8590);
        os[28] = new Oseba[4];
        os[28][0] = new Oseba("a b", 'M', 8988);
        os[28][1] = new Oseba("a b", 'M', 4682);
        os[28][2] = new Oseba("a b", 'Z', 2266);
        os[28][3] = new Oseba("a b", 'Z', 8201);
        os[29] = new Oseba[1];
        os[29][0] = new Oseba("a b", 'M', 2465);
        os[30] = new Oseba[0];
        os[31] = new Oseba[5];
        os[31][0] = new Oseba("a b", 'M', 2886);
        os[31][1] = new Oseba("a b", 'Z', 5335);
        os[31][2] = new Oseba("a b", 'M', 9026);
        os[31][3] = new Oseba("a b", 'M', 3750);
        os[31][4] = new Oseba("a b", 'M', 1241);
        os[32] = new Oseba[10];
        os[32][0] = new Oseba("a b", 'Z', 5233);
        os[32][1] = new Oseba("a b", 'Z', 6733);
        os[32][2] = new Oseba("a b", 'Z', 1701);
        os[32][3] = new Oseba("a b", 'M', 7207);
        os[32][4] = new Oseba("a b", 'Z', 8637);
        os[32][5] = new Oseba("a b", 'M', 4255);
        os[32][6] = new Oseba("a b", 'Z', 6627);
        os[32][7] = new Oseba("a b", 'M', 3996);
        os[32][8] = new Oseba("a b", 'Z', 5663);
        os[32][9] = new Oseba("a b", 'M', 4524);
        os[33] = new Oseba[8];
        os[33][0] = new Oseba("a b", 'Z', 144);
        os[33][1] = new Oseba("a b", 'Z', 6156);
        os[33][2] = new Oseba("a b", 'M', 5442);
        os[33][3] = new Oseba("a b", 'M', 3183);
        os[33][4] = new Oseba("a b", 'Z', 8812);
        os[33][5] = new Oseba("a b", 'M', 1201);
        os[33][6] = new Oseba("a b", 'Z', 9328);
        os[33][7] = new Oseba("a b", 'M', 3846);
        os[34] = new Oseba[1];
        os[34][0] = new Oseba("a b", 'M', 7110);
        os[35] = new Oseba[5];
        os[35][0] = new Oseba("a b", 'Z', 8888);
        os[35][1] = new Oseba("a b", 'Z', 2120);
        os[35][2] = new Oseba("a b", 'M', 765);
        os[35][3] = new Oseba("a b", 'M', 7275);
        os[35][4] = new Oseba("a b", 'Z', 2301);
        os[36] = new Oseba[7];
        os[36][0] = new Oseba("a b", 'Z', 2175);
        os[36][1] = new Oseba("a b", 'M', 4180);
        os[36][2] = new Oseba("a b", 'M', 4876);
        os[36][3] = new Oseba("a b", 'M', 6317);
        os[36][4] = new Oseba("a b", 'Z', 4674);
        os[36][5] = new Oseba("a b", 'Z', 5236);
        os[36][6] = new Oseba("a b", 'Z', 822);
        os[37] = new Oseba[4];
        os[37][0] = new Oseba("a b", 'Z', 8662);
        os[37][1] = new Oseba("a b", 'Z', 9911);
        os[37][2] = new Oseba("a b", 'M', 5603);
        os[37][3] = new Oseba("a b", 'M', 2635);
        os[38] = new Oseba[4];
        os[38][0] = new Oseba("a b", 'Z', 530);
        os[38][1] = new Oseba("a b", 'M', 8769);
        os[38][2] = new Oseba("a b", 'Z', 3022);
        os[38][3] = new Oseba("a b", 'Z', 1177);
        os[39] = new Oseba[8];
        os[39][0] = new Oseba("a b", 'Z', 3751);
        os[39][1] = new Oseba("a b", 'Z', 6712);
        os[39][2] = new Oseba("a b", 'M', 2998);
        os[39][3] = new Oseba("a b", 'Z', 6016);
        os[39][4] = new Oseba("a b", 'Z', 3448);
        os[39][5] = new Oseba("a b", 'Z', 5661);
        os[39][6] = new Oseba("a b", 'Z', 3384);
        os[39][7] = new Oseba("a b", 'Z', 8764);
        os[40] = new Oseba[4];
        os[40][0] = new Oseba("a b", 'M', 6059);
        os[40][1] = new Oseba("a b", 'M', 7);
        os[40][2] = new Oseba("a b", 'Z', 2407);
        os[40][3] = new Oseba("a b", 'Z', 2650);
        os[41] = new Oseba[9];
        os[41][0] = new Oseba("a b", 'M', 7689);
        os[41][1] = new Oseba("a b", 'Z', 4988);
        os[41][2] = new Oseba("a b", 'Z', 7281);
        os[41][3] = new Oseba("a b", 'Z', 6647);
        os[41][4] = new Oseba("a b", 'Z', 9093);
        os[41][5] = new Oseba("a b", 'Z', 7336);
        os[41][6] = new Oseba("a b", 'M', 656);
        os[41][7] = new Oseba("a b", 'M', 9732);
        os[41][8] = new Oseba("a b", 'M', 1147);
        os[42] = new Oseba[7];
        os[42][0] = new Oseba("a b", 'Z', 340);
        os[42][1] = new Oseba("a b", 'M', 1325);
        os[42][2] = new Oseba("a b", 'Z', 1294);
        os[42][3] = new Oseba("a b", 'Z', 481);
        os[42][4] = new Oseba("a b", 'M', 6942);
        os[42][5] = new Oseba("a b", 'M', 3221);
        os[42][6] = new Oseba("a b", 'M', 9781);
        os[43] = new Oseba[0];
        os[44] = new Oseba[5];
        os[44][0] = new Oseba("a b", 'Z', 9301);
        os[44][1] = new Oseba("a b", 'M', 8684);
        os[44][2] = new Oseba("a b", 'M', 558);
        os[44][3] = new Oseba("a b", 'M', 2943);
        os[44][4] = new Oseba("a b", 'M', 2051);
        os[45] = new Oseba[7];
        os[45][0] = new Oseba("a b", 'Z', 8227);
        os[45][1] = new Oseba("a b", 'Z', 1309);
        os[45][2] = new Oseba("a b", 'Z', 571);
        os[45][3] = new Oseba("a b", 'Z', 547);
        os[45][4] = new Oseba("a b", 'Z', 5526);
        os[45][5] = new Oseba("a b", 'M', 589);
        os[45][6] = new Oseba("a b", 'M', 4150);
        os[46] = new Oseba[3];
        os[46][0] = new Oseba("a b", 'M', 1411);
        os[46][1] = new Oseba("a b", 'Z', 5907);
        os[46][2] = new Oseba("a b", 'M', 4175);
        os[47] = new Oseba[9];
        os[47][0] = new Oseba("a b", 'M', 2420);
        os[47][1] = new Oseba("a b", 'Z', 3989);
        os[47][2] = new Oseba("a b", 'M', 6964);
        os[47][3] = new Oseba("a b", 'M', 157);
        os[47][4] = new Oseba("a b", 'M', 5419);
        os[47][5] = new Oseba("a b", 'M', 3502);
        os[47][6] = new Oseba("a b", 'Z', 4872);
        os[47][7] = new Oseba("a b", 'M', 8257);
        os[47][8] = new Oseba("a b", 'M', 2841);
        os[48] = new Oseba[10];
        os[48][0] = new Oseba("a b", 'Z', 6307);
        os[48][1] = new Oseba("a b", 'Z', 4851);
        os[48][2] = new Oseba("a b", 'M', 7084);
        os[48][3] = new Oseba("a b", 'Z', 2882);
        os[48][4] = new Oseba("a b", 'M', 9519);
        os[48][5] = new Oseba("a b", 'Z', 8244);
        os[48][6] = new Oseba("a b", 'Z', 6799);
        os[48][7] = new Oseba("a b", 'M', 8425);
        os[48][8] = new Oseba("a b", 'Z', 9224);
        os[48][9] = new Oseba("a b", 'M', 1509);
        os[49] = new Oseba[3];
        os[49][0] = new Oseba("a b", 'Z', 2290);
        os[49][1] = new Oseba("a b", 'Z', 9646);
        os[49][2] = new Oseba("a b", 'Z', 485);
        os[50] = new Oseba[10];
        os[50][0] = new Oseba("a b", 'M', 5521);
        os[50][1] = new Oseba("a b", 'M', 7093);
        os[50][2] = new Oseba("a b", 'M', 9508);
        os[50][3] = new Oseba("a b", 'M', 3010);
        os[50][4] = new Oseba("a b", 'Z', 4482);
        os[50][5] = new Oseba("a b", 'M', 5190);
        os[50][6] = new Oseba("a b", 'M', 4452);
        os[50][7] = new Oseba("a b", 'M', 5556);
        os[50][8] = new Oseba("a b", 'Z', 7455);
        os[50][9] = new Oseba("a b", 'M', 7540);
        os[51] = new Oseba[5];
        os[51][0] = new Oseba("a b", 'M', 1646);
        os[51][1] = new Oseba("a b", 'Z', 3802);
        os[51][2] = new Oseba("a b", 'M', 7775);
        os[51][3] = new Oseba("a b", 'Z', 3055);
        os[51][4] = new Oseba("a b", 'M', 269);
        os[52] = new Oseba[0];
        os[53] = new Oseba[5];
        os[53][0] = new Oseba("a b", 'M', 706);
        os[53][1] = new Oseba("a b", 'Z', 6819);
        os[53][2] = new Oseba("a b", 'Z', 9406);
        os[53][3] = new Oseba("a b", 'M', 5804);
        os[53][4] = new Oseba("a b", 'Z', 9234);
        os[54] = new Oseba[7];
        os[54][0] = new Oseba("a b", 'M', 3657);
        os[54][1] = new Oseba("a b", 'M', 2699);
        os[54][2] = new Oseba("a b", 'Z', 4082);
        os[54][3] = new Oseba("a b", 'M', 4804);
        os[54][4] = new Oseba("a b", 'Z', 8743);
        os[54][5] = new Oseba("a b", 'M', 2617);
        os[54][6] = new Oseba("a b", 'Z', 541);
        os[55] = new Oseba[7];
        os[55][0] = new Oseba("a b", 'Z', 3209);
        os[55][1] = new Oseba("a b", 'M', 1818);
        os[55][2] = new Oseba("a b", 'Z', 8510);
        os[55][3] = new Oseba("a b", 'Z', 3530);
        os[55][4] = new Oseba("a b", 'Z', 5051);
        os[55][5] = new Oseba("a b", 'Z', 3408);
        os[55][6] = new Oseba("a b", 'M', 7650);
        os[56] = new Oseba[10];
        os[56][0] = new Oseba("a b", 'M', 5498);
        os[56][1] = new Oseba("a b", 'M', 228);
        os[56][2] = new Oseba("a b", 'Z', 2642);
        os[56][3] = new Oseba("a b", 'M', 384);
        os[56][4] = new Oseba("a b", 'Z', 51);
        os[56][5] = new Oseba("a b", 'Z', 2963);
        os[56][6] = new Oseba("a b", 'M', 9603);
        os[56][7] = new Oseba("a b", 'M', 1122);
        os[56][8] = new Oseba("a b", 'M', 1491);
        os[56][9] = new Oseba("a b", 'M', 3910);
        os[57] = new Oseba[8];
        os[57][0] = new Oseba("a b", 'Z', 3130);
        os[57][1] = new Oseba("a b", 'M', 1368);
        os[57][2] = new Oseba("a b", 'M', 2749);
        os[57][3] = new Oseba("a b", 'M', 7946);
        os[57][4] = new Oseba("a b", 'M', 927);
        os[57][5] = new Oseba("a b", 'Z', 7817);
        os[57][6] = new Oseba("a b", 'M', 432);
        os[57][7] = new Oseba("a b", 'M', 773);
        
        Stanovanje[] st = new Stanovanje[58];
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
        st[47] = new Stanovanje(os[47]);
        st[48] = new Stanovanje(os[48]);
        st[49] = new Stanovanje(os[49]);
        st[50] = new Stanovanje(os[50]);
        st[51] = new Stanovanje(os[51]);
        st[52] = new Stanovanje(os[52]);
        st[53] = new Stanovanje(os[53]);
        st[54] = new Stanovanje(os[54]);
        st[55] = new Stanovanje(os[55]);
        st[56] = new Stanovanje(os[56]);
        st[57] = new Stanovanje(os[57]);
        st[0].nastaviSosede(st[30], st[10], st[54], st[13]);
        st[1].nastaviSosede(null, st[26], st[37], st[10]);
        st[2].nastaviSosede(st[16], null, null, null);
        st[3].nastaviSosede(st[44], st[16], null, null);
        st[4].nastaviSosede(st[57], st[7], st[20], st[49]);
        st[5].nastaviSosede(st[48], st[18], st[16], st[44]);
        st[6].nastaviSosede(st[40], st[45], st[31], st[11]);
        st[7].nastaviSosede(st[11], st[31], st[48], st[4]);
        st[8].nastaviSosede(st[52], st[23], st[35], st[29]);
        st[9].nastaviSosede(st[39], st[40], st[11], st[46]);
        st[10].nastaviSosede(null, st[1], st[17], st[0]);
        st[11].nastaviSosede(st[9], st[6], st[7], st[57]);
        st[12].nastaviSosede(st[55], st[28], st[19], st[42]);
        st[13].nastaviSosede(null, st[0], st[43], st[27]);
        st[14].nastaviSosede(null, null, null, st[56]);
        st[15].nastaviSosede(st[18], null, null, st[16]);
        st[16].nastaviSosede(st[5], st[15], st[2], st[3]);
        st[17].nastaviSosede(st[10], st[37], st[38], st[54]);
        st[18].nastaviSosede(st[36], null, st[15], st[5]);
        st[19].nastaviSosede(st[12], st[49], st[32], st[33]);
        st[20].nastaviSosede(st[4], st[48], st[44], st[53]);
        st[21].nastaviSosede(null, null, st[40], st[39]);
        st[22].nastaviSosede(null, null, st[45], st[40]);
        st[23].nastaviSosede(st[43], st[55], st[42], st[8]);
        st[24].nastaviSosede(null, null, null, st[45]);
        st[25].nastaviSosede(st[35], st[33], null, null);
        st[26].nastaviSosede(null, null, st[39], st[1]);
        st[27].nastaviSosede(null, st[13], st[52], null);
        st[28].nastaviSosede(st[38], st[57], st[49], st[12]);
        st[29].nastaviSosede(null, st[8], null, null);
        st[30].nastaviSosede(null, null, st[0], null);
        st[31].nastaviSosede(st[6], st[50], st[36], st[7]);
        st[32].nastaviSosede(st[19], st[53], st[51], st[41]);
        st[33].nastaviSosede(st[42], st[19], st[41], st[25]);
        st[34].nastaviSosede(st[53], st[44], null, st[51]);
        st[35].nastaviSosede(st[8], st[42], st[25], null);
        st[36].nastaviSosede(st[31], st[56], st[18], st[48]);
        st[37].nastaviSosede(st[1], st[39], st[46], st[17]);
        st[38].nastaviSosede(st[17], st[46], st[28], st[55]);
        st[39].nastaviSosede(st[26], st[21], st[9], st[37]);
        st[40].nastaviSosede(st[21], st[22], st[6], st[9]);
        st[41].nastaviSosede(st[33], st[32], st[47], null);
        st[42].nastaviSosede(st[23], st[12], st[33], st[35]);
        st[43].nastaviSosede(st[13], st[54], st[23], st[52]);
        st[44].nastaviSosede(st[20], st[5], st[3], st[34]);
        st[45].nastaviSosede(st[22], st[24], st[50], st[6]);
        st[46].nastaviSosede(st[37], st[9], st[57], st[38]);
        st[47].nastaviSosede(st[41], st[51], null, null);
        st[48].nastaviSosede(st[7], st[36], st[5], st[20]);
        st[49].nastaviSosede(st[28], st[4], st[53], st[19]);
        st[50].nastaviSosede(st[45], null, st[56], st[31]);
        st[51].nastaviSosede(st[32], st[34], null, st[47]);
        st[52].nastaviSosede(st[27], st[43], st[8], null);
        st[53].nastaviSosede(st[49], st[20], st[34], st[32]);
        st[54].nastaviSosede(st[0], st[17], st[55], st[43]);
        st[55].nastaviSosede(st[54], st[38], st[12], st[23]);
        st[56].nastaviSosede(st[50], st[14], null, st[36]);
        st[57].nastaviSosede(st[46], st[11], st[4], st[28]);
        
        Oseba[] oss = new Oseba[40];
        oss[0] = os[0][0];
        oss[1] = os[0][1];
        oss[2] = os[0][2];
        oss[3] = os[0][3];
        oss[4] = os[0][4];
        oss[5] = os[0][5];
        oss[6] = os[0][6];
        oss[7] = os[0][7];
        oss[8] = os[0][8];
        oss[9] = os[0][9];
        oss[10] = os[1][0];
        oss[11] = os[1][1];
        oss[12] = os[1][2];
        oss[13] = os[1][3];
        oss[14] = os[1][4];
        oss[15] = os[1][5];
        oss[16] = os[1][6];
        oss[17] = os[1][7];
        oss[18] = os[39][0];
        oss[19] = os[39][1];
        oss[20] = os[39][2];
        oss[21] = os[39][3];
        oss[22] = os[39][4];
        oss[23] = os[39][5];
        oss[24] = os[39][6];
        oss[25] = os[39][7];
        oss[26] = os[46][0];
        oss[27] = os[46][1];
        oss[28] = os[46][2];
        oss[29] = os[55][0];
        oss[30] = os[55][1];
        oss[31] = os[55][2];
        oss[32] = os[55][3];
        oss[33] = os[55][4];
        oss[34] = os[55][5];
        oss[35] = os[55][6];
        oss[36] = os[28][0];
        oss[37] = os[28][1];
        oss[38] = os[28][2];
        oss[39] = os[28][3];
        Comparator<Oseba> comp = new Comparator<Oseba>() { public int compare(Oseba a, Oseba b) { return a.hashCode() - b.hashCode(); } };
        Arrays.sort(oss, comp);
        Oseba[] rezultat = st[17].sosedjeSosedov();
        Arrays.sort(rezultat, comp);
        TestSkupno.preveri(Arrays.equals(oss, rezultat));
    }
}
