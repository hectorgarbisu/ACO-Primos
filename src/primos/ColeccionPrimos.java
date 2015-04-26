package primos;
public class ColeccionPrimos {
    public static final int[] primos = {2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89,97,101,103,107,109,113,
        127,131,137,139,149,151,157,163,167,173,179,181,191,193,197,199,211,223,227,229,233,239,241,251,257,263,
        269,271,277,281,283,293,307,311,313,317,331,337,347,349,353,359,367,373,379,383,389,397,401,409,419,421,431,433,
        439,443,449,457,461,463,467,479,487,491,499,503,509,521,523,541,547,557,563,569,571,577,587,593,599,601,607,613,
        617,619,631,641,643,647,653,659,661,673,677,683,691,701,709,719,727,733,739,743,751,757,761,769,773,787,797,809,
        811,821,823,827,829,839,853,857,859,863,877,881,883,887,907,911,919,929,937,941,947,953,967,971,977,983,991,997,
        //1K
        1009,1013,1019,1021,1031,1033,1039,1049,1051,1061,1063,1069,1087,1091,1093,1097,1103,1109,1117,1123,1129,1151,1153,1163,1171,1181,1187,1193,1201,1213,1217,1223,1229,1231,1237,1249,1259,1277,1279,1283,1289,1291,1297,1301,1303,1307,1319,1321,1327,1361,1367,1373,1381,1399,1409,1423,1427,1429,1433,1439,1447,1451,1453,1459,1471,1481,1483,1487,1489,1493,1499,1511,1523,1531,1543,1549,1553,1559,1567,1571,1579,1583,1597,1601,1607,1609,1613,1619,1621,1627,1637,1657,1663,1667,1669,1693,1697,1699,1709,1721,1723,1733,1741,1747,1753,1759,1777,1783,1787,1789,1801,1811,1823,1831,1847,1861,1867,1871,1873,1877,1879,1889,1901,1907,1913,1931,1933,1949,1951,1973,1979,1987,1993,1997,1999,
        //2K
        2003,2011,2017,2027,2029,2039,2053,2063,2069,2081,2083,2087,2089,2099,2111,2113,2129,2131,2137,2141,2143,2153,2161,2179,2203,2207,2213,2221,2237,2239,2243,2251,2267,2269,2273,2281,2287,2293,2297,2309,2311,2333,2339,2341,2347,2351,2357,2371,2377,2381,2383,2389,2393,2399,2411,2417,2423,2437,2441,2447,2459,2467,2473,2477,2503,2521,2531,2539,2543,2549,2551,2557,2579,2591,2593,2609,2617,2621,2633,2647,2657,2659,2663,2671,2677,2683,2687,2689,2693,2699,2707,2711,2713,2719,2729,2731,2741,2749,2753,2767,2777,2789,2791,2797,2801,2803,2819,2833,2837,2843,2851,2857,2861,2879,2887,2897,2903,2909,2917,2927,2939,2953,2957,2963,2969,2971,2999,
        //3K
        3001,3011,3019,3023,3037,3041,3049,3061,3067,3079,3083,3089,3109,3119,3121,3137,3163,3167,3169,3181,3187,3191,3203,3209,3217,3221,3229,3251,3253,3257,3259,3271,3299,3301,3307,3313,3319,3323,3329,3331,3343,3347,3359,3361,3371,3373,3389,3391,3407,3413,3433,3449,3457,3461,3463,3467,3469,3491,3499,3511,3517,3527,3529,3533,3539,3541,3547,3557,3559,3571,3581,3583,3593,3607,3613,3617,3623,3631,3637,3643,3659,3671,3673,3677,3691,3697,3701,3709,3719,3727,3733,3739,3761,3767,3769,3779,3793,3797,3803,3821,3823,3833,3847,3851,3853,3863,3877,3881,3889,3907,3911,3917,3919,3923,3929,3931,3943,3947,3967,3989,
        //4K
        4001,4003,4007,4013,4019,4021,4027,4049,4051,4057,4073,4079,4091,4093,4099,4111,4127,4129,4133,4139,4153,4157,4159,4177,4201,4211,4217,4219,4229,4231,4241,4243,4253,4259,4261,4271,4273,4283,4289,4297,4327,4337,4339,4349,4357,4363,4373,4391,4397,4409,4421,4423,4441,4447,4451,4457,4463,4481,4483,4493,4507,4513,4517,4519,4523,4547,4549,4561,4567,4583,4591,4597,4603,4621,4637,4639,4643,4649,4651,4657,4663,4673,4679,4691,4703,4721,4723,4729,4733,4751,4759,4783,4787,4789,4793,4799,4801,4813,4817,4831,4861,4871,4877,4889,4903,4909,4919,4931,4933,4937,4943,4951,4957,4967,4969,4973,4987,4993,4999,
        //5K
        5003,5009,5011,5021,5023,5039,5051,5059,5077,5081,5087,5099,5101,5107,5113,5119,5147,5153,5167,5171,5179,5189,5197,5209,5227,5231,5233,5237,5261,5273,5279,5281,5297,5303,5309,5323,5333,5347,5351,5381,5387,5393,5399,5407,5413,5417,5419,5431,5437,5441,5443,5449,5471,5477,5479,5483,5501,5503,5507,5519,5521,5527,5531,5557,5563,5569,5573,5581,5591,5623,5639,5641,5647,5651,5653,5657,5659,5669,5683,5689,5693,5701,5711,5717,5737,5741,5743,5749,5779,5783,5791,5801,5807,5813,5821,5827,5839,5843,5849,5851,5857,5861,5867,5869,5879,5881,5897,5903,5923,5927,5939,5953,5981,5987,
        //6K
        6007,6011,6029,6037,6043,6047,6053,6067,6073,6079,6089,6091,6101,6113,6121,6131,6133,6143,6151,6163,6173,6197,6199,6203,6211,6217,6221,6229,6247,6257,6263,6269,6271,6277,6287,6299,6301,6311,6317,6323,6329,6337,6343,6353,6359,6361,6367,6373,6379,6389,6397,6421,6427,6449,6451,6469,6473,6481,6491,6521,6529,6547,6551,6553,6563,6569,6571,6577,6581,6599,6607,6619,6637,6653,6659,6661,6673,6679,6689,6691,6701,6703,6709,6719,6733,6737,6761,6763,6779,6781,6791,6793,6803,6823,6827,6829,6833,6841,6857,6863,6869,6871,6883,6899,6907,6911,6917,6947,6949,6959,6961,6967,6971,6977,6983,6991,6997,
        //7K
        7001,7013,7019,7027,7039,7043,7057,7069,7079,7103,7109,7121,7127,7129,7151,7159,7177,7187,7193,7207,7211,7213,7219,7229,7237,7243,7247,7253,7283,7297,7307,7309,7321,7331,7333,7349,7351,7369,7393,7411,7417,7433,7451,7457,7459,7477,7481,7487,7489,7499,7507,7517,7523,7529,7537,7541,7547,7549,7559,7561,7573,7577,7583,7589,7591,7603,7607,7621,7639,7643,7649,7669,7673,7681,7687,7691,7699,7703,7717,7723,7727,7741,7753,7757,7759,7789,7793,7817,7823,7829,7841,7853,7867,7873,7877,7879,7883,7901,7907,7919
        //40K
        ,40009,40013,40031,40037,40039,40063,40087,40093,40099,40111,40123,40127,40129,40151,40153,40163,40169,40177,40189,40193,40213,40231,40237,40241,40253,40277,40283,40289,40343,40351,40357,40361,40387,40423,40427,40429,40433,40459,40471,40483,40487,40493,40499,40507,40519,40529,40531,40543,40559,40577,40583,40591,40597,40609,40627,40637,40639,40693,40697,40699,40709,40739,40751,40759,40763,40771,40787,40801,40813,40819,40823,40829,40841,40847,40849,40853,40867,40879,40883,40897,40903,40927,40933,40939,40949,40961,40973,40993
        //55k-56k
        ,55001,55009,55021,55049,55051,55057,55061,55073,55079,55103,55109,55117,55127,55147,55163,55171,55201,55207,55213,55217,55219,55229,55243,55249,55259,55291,55313,55331,55333,55337,55339,55343,55351,55373,55381,55399,55411,55439,55441,55457,55469,55487,55501,55511,55529,55541,55547,55579,55589,55603,55609,55619,55621,55631,55633,55639,55661,55663,55667,55673,55681,55691,55697,55711,55717,55721,55733,55763,55787,55793,55799,55807,55813,55817,55819,55823,55829,55837,55843,55849,55871,55889,55897,55901,55903,55921,55927,55931,55933,55949,55967,55987,55997    
        //70K-71K
        ,70001,70003,70009,70019,70039,70051,70061,70067,70079,70099,70111,70117,70121,70123,70139,70141,70157,70163,70177,70181,70183,70199,70201,70207,70223,70229,70237,70241,70249,70271,70289,70297,70309,70313,70321,70327,70351,70373,70379,70381,70393,70423,70429,70439,70451,70457,70459,70481,70487,70489,70501,70507,70529,70537,70549,70571,70573,70583,70589,70607,70619,70621,70627,70639,70657,70663,70667,70687,70709,70717,70729,70753,70769,70783,70793,70823,70841,70843,70849,70853,70867,70877,70879,70891,70901,70913,70919,70921,70937,70949,70951,70957,70969,70979,70981,70991,70997,70999 
        //100K-101K
        ,100003,100019,100043,100049,100057,100069,100103,100109,100129,100151,100153,100169,100183,100189,100193,100207,100213,100237,100267,100271,100279,100291,100297,100313,100333,100343,100357,100361,100363,100379,100391,100393,100403,100411,100417,100447,100459,100469,100483,100493,100501,100511,100517,100519,100523,100537,100547,100549,100559,100591,100609,100613,100621,100649,100669,100673,100693,100699,100703,100733,100741,100747,100769,100787,100799,100801,100811,100823,100829,100847,100853,100907,100913,100927,100931,100937,100943,100957,100981,100987,100999    
        //220K-221K
        ,220009,220013,220019,220021,220057,220063,220123,220141,220147,220151,220163,220169,220177,220189,220217,220243,220279,220291,220301,220307,220327,220333,220351,220357,220361,220369,220373,220391,220399,220403,220411,220421,220447,220469,220471,220511,220513,220529,220537,220543,220553,220559,220573,220579,220589,220613,220663,220667,220673,220681,220687,220699,220709,220721,220747,220757,220771,220783,220789,220793,220807,220811,220841,220859,220861,220873,220877,220879,220889,220897,220901,220903,220907,220919,220931,220933,220939,220973
        //400K-401K
        ,400009,400031,400033,400051,400067,400069,400087,400093,400109,400123,400151,400157,400187,400199,400207,400217,400237,400243,400247,400249,400261,400277,400291,400297,400307,400313,400321,400331,400339,400381,400391,400409,400417,400429,400441,400457,400471,400481,400523,400559,400579,400597,400601,400607,400619,400643,400651,400657,400679,400681,400703,400711,400721,400723,400739,400753,400759,400823,400837,400849,400853,400859,400871,400903,400927,400931,400943,400949,400963,400997
        //
    };
}

