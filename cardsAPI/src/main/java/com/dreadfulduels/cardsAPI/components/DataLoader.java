package com.dreadfulduels.cardsAPI.components;


import com.dreadfulduels.cardsAPI.models.Card;
import com.dreadfulduels.cardsAPI.repositories.CardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    CardRepository cardRepository;

    public DataLoader() {
    }

    @Override
    public void run(ApplicationArguments args) throws Exception{
        Card card1 = new Card("FlareClaw", 75, 50,"The Five Tailed Dragon Beast", "https://i.postimg.cc/TPrQjJkb/flareclaw.png");
        cardRepository.save(card1);

        Card card2 = new Card("FrostBite", 60, 70, "The Ice Dragon-Pegasus Hybrid", "https://i.postimg.cc/mDmYVX7P/frostbite.png");
        cardRepository.save(card2);

        Card card3 = new Card("ThornBack", 85, 45, "The Thorn Demon Beast From Hell", "https://i.postimg.cc/90TGVWv7/thornback.png");
        cardRepository.save(card3);

        Card card4 = new Card("VenomFang", 70,60, "The Holy Snake From The Top Of Heavens", "https://i.postimg.cc/3wRmNjs7/venomfang.png");
        cardRepository.save(card4);

        Card card5 = new Card("BoulderBeast", 90, 40 , "The Boulder Crasher That Throws Mountains", "https://i.postimg.cc/FHkTz43D/boulderbeast.png");
        cardRepository.save(card5);

        Card card6 = new Card("GaleWing", 55, 75,  "The Storm God", "https://i.postimg.cc/xjFGzZ07/galewing.png");
        cardRepository.save(card6);

        Card card7 = new Card("LavaLurker", 80, 50, "The Chicky Lurker", "https://i.postimg.cc/d0BrtHH5/lavalurker.png");
        cardRepository.save(card7);

        Card card8 = new Card("ShadowClaw", 65,65 , "The Whiskers Of Doom", "https://i.postimg.cc/9X4bJ2NV/shadowclaw.png");
        cardRepository.save(card8);

        Card card9 = new Card("ThunderHoof", 85, 45 , "Zeus Thunderous Creation", "https://i.postimg.cc/RZGwvpbX/thunderhoof.png");
        cardRepository.save(card9);

        Card card10 = new Card("AquaShell", 60,70, "The Mermaid's Nutcracker", "https://i.postimg.cc/J7K6dKRc/aquashell.png");
        cardRepository.save(card10);

        Card card11 = new Card("IronHide", 70,60 , "The King's Bouncer", "https://i.postimg.cc/Cxbb9LjT/ironhide.png");
        cardRepository.save(card11);

        Card card12 = new Card("EmberWing", 95,35, "The Phoenix Of Cleansing", "https://i.postimg.cc/ydsjL35b/emberwing.png");
        cardRepository.save(card12);

        Card card13 = new Card("NightShade", 50 , 80 , "The Man Sized Bat", "https://i.postimg.cc/8P6vrPXJ/nightshade.png");
        cardRepository.save(card13);

        Card card14 = new Card("MagmaClaw", 80 , 50 , "Born In The Bottom Of The Volcanoes", "https://i.postimg.cc/c1jYH8hG/magmaclaw.png");
        cardRepository.save(card14);

        Card card15 = new Card("ThornSpike", 65, 65, "Don't Get Fooled Of His Cuteness", "https://i.postimg.cc/jd0Hc77Q/thornspike.png");
        cardRepository.save(card15);

        Card card16 = new Card("FrostClaw", 75, 65 , "The Polar Bear Monster Born In Ice", "https://i.postimg.cc/HnjQNwtB/frostclaw.png");
        cardRepository.save(card16);

        Card card17 = new Card("VenomSpike", 55, 75 , "The Cloud Slither", "https://i.postimg.cc/50Qzq49R/venomspike.png");
        cardRepository.save(card17);

        Card card18 = new Card("RockHide", 90,40, "The Rock Hiding Fox", "https://i.postimg.cc/RhnWfXd5/rockhide.png");
        cardRepository.save(card18);

        Card card19 = new Card("CycloneBeak", 70,40 , "Wind Breaker Of The Ages", "https://i.postimg.cc/Gp0qs5jr/cyclonebeak.png");
        cardRepository.save(card19);

        Card card20 = new Card("InfernoFang", 85, 45 , "The Abomination Of Earth's Crater", "https://i.postimg.cc/pdxKvbZ9/infernofang.png");
        cardRepository.save(card20);

        Card card21 = new Card("GloomWing", 60, 70 , "Worst Hades Creation", "https://i.postimg.cc/KjVnh1qF/gloomwing.png");
        cardRepository.save(card21);

        Card card22 = new Card("StormShell", 75, 55 , "The Floating Turtle", "https://i.postimg.cc/1tbpLgYS/stormshell.png");
        cardRepository.save(card22);

        Card card23 = new Card("BeetleJuice", 65,65 , "The Little Beetle", "https://i.postimg.cc/0jtVM5VH/acidclaw.png");
        cardRepository.save(card23);

        Card card24 = new Card("ThunderClaw", 80, 50 , "White Tiger Of Thunders", "https://i.postimg.cc/8zThQgw7/thunderclaw.png");
        cardRepository.save(card24);

        Card card25 = new Card("RazorFin", 50, 60 , "The WarLock Of The Sea", "https://i.postimg.cc/nzWsC6vG/razorfin.png");
        cardRepository.save(card25);

        Card card26 = new Card("QuakeBeast", 95, 35 , "The Earth Shaker", "https://i.postimg.cc/P5b82Vjd/quakebeast.png");
        cardRepository.save(card26);

        Card card27 = new Card("SolarFlare", 70,60, "Solar Forged Orca", "https://i.postimg.cc/Sx4GSMQN/solarflare.png");
        cardRepository.save(card27);

        Card card28 = new Card("FrostSpike", 75, 55 , "The Valhalla's Myth", "https://i.postimg.cc/Qx2p6WKJ/frostspike.png");
        cardRepository.save(card28);

        Card card29 = new Card("VenomScale", 55,75 , "Lord Of Toxic Reptiles", "https://i.postimg.cc/CKQDqB08/venomscale.png");
        cardRepository.save(card29);

        Card card30 = new Card("StoneHide", 40, 90, "The Rock Defence Of Mountains", "https://i.postimg.cc/HLZ09vwV/stonehide.png");
        cardRepository.save(card30);

        Card card31 = new Card("ZephyrWraith", 60 , 75 , "Human Like Wraith", "https://i.postimg.cc/44ttYxSK/zephyrwraith.png");
        cardRepository.save(card31);

        Card card32 = new Card("LavaSpire", 85, 45, "Living Tower Containing Entrance To Hell", "https://i.postimg.cc/MT3B1c8R/lavaspire.png");
        cardRepository.save(card32);

        Card card33 = new Card("StarDust", 65,65 , "The Perfectly Balanced Creation", "https://i.postimg.cc/rpFCW2tB/stardust.png");
        cardRepository.save(card33);

        Card card34 = new Card("AcidFang",80,50 ,"The Non Electric Eel", "https://i.postimg.cc/BQ6YWD6W/acidfang.png" );
        cardRepository.save(card34);

        Card card35 = new Card("NightStalker", 50, 80 , "The Demon Lord", "https://i.postimg.cc/8zg6dQxy/nightstalker.png");
        cardRepository.save(card35);

        Card card36 = new Card("EmberClaw", 75, 55 , "The Fire Bender", "https://i.postimg.cc/1tBH2515/emberclaw.png");
        cardRepository.save(card36);

        Card card37 = new Card("FrostThorn", 60, 70 , "The Queen Of Ice", "https://i.postimg.cc/gkXVqKj0/frostthorn.png");
        cardRepository.save(card37);

        Card card38 = new Card("ThornScale", 70, 60 , "The Mountain and Sea Hybrid", "https://i.postimg.cc/jqJ6yXLS/thornscale.png");
        cardRepository.save(card38);

        Card card39 = new Card("QuickSilver", 95,35, "The Snow Mountain Myth", "https://i.postimg.cc/XvQB0Zqh/quicksilver.png");
        cardRepository.save(card39);

        Card card40 = new Card("StormClaw", 85,45 , "The Lost Messenger", "https://i.postimg.cc/DZSrjQ65/stormclaw.png");
        cardRepository.save(card40);

        Card card41 = new Card("QuackWing", 130, 130 , "Don't Try To Mess With It", "https://i.postimg.cc/YSpLVNrY/quackwing.png");
        cardRepository.save(card41);

        Card card42 = new Card("BoulderHide", 90 , 40 , "The Guardian Of The Gates of Valhalla", "https://i.postimg.cc/VLV7z6rJ/boulderhide.png");
        cardRepository.save(card42);

        Card card43 = new Card("ShadowSpine", 70 , 60 , "The Undying Knight", "https://i.postimg.cc/65n0x0Xm/shadowspine.png");
        cardRepository.save(card43);

        Card card44 = new Card("SeaNightmare", 75,55 , "Poseidon's Mistake", "https://i.postimg.cc/8sQjbMXF/seanightmare.png");
        cardRepository.save(card44);

        Card card45 = new Card("ThunderBeak", 80 , 50 , "The Gate Keeper Of the Thunder Gods", "https://i.postimg.cc/bNxQBw0X/thunderbeak.png");
        cardRepository.save(card45);

        Card card46 = new Card("RazorBack", 65, 65 , "The Last Dinosaur", "https://i.postimg.cc/k4G6Mnt5/razorback.png");
        cardRepository.save(card46);

        Card card47 = new Card("SolarWing", 60, 70 , "Solar Eclipse Creation", "https://i.postimg.cc/Z5LxC50P/solarwing.png");
        cardRepository.save(card47);

        Card card48 = new Card("LavaThorn", 85, 45 , "The Lava Ant Eater", "https://i.postimg.cc/zv9RP9vG/lavathorn.png");
        cardRepository.save(card48);

        Card card49 = new Card("VortexClaw", 90,40 , "The Vortex Annihilator", "https://i.postimg.cc/zvnR6xgw/vortexclaw.png");
        cardRepository.save(card49);

        Card card50 = new Card("VenomSpike", 75,55 , "It Might Pop On You", "https://i.postimg.cc/50Qzq49R/venomspike.png");
        cardRepository.save(card50);
    }



}
