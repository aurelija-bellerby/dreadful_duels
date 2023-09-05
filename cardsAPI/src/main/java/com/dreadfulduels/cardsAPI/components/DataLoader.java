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
        Card card1 = new Card("FlareClaw", 75, 50,"The Five Tailed Dragon Beast", "imgUrl");
        cardRepository.save(card1);

        Card card2 = new Card("FrostBite", 60, 70, "The Ice Dragon-Pegasus Hybrid", "imgUrl");
        cardRepository.save(card2);

        Card card3 = new Card("ThornBack", 85, 45, "The Thorn Demon Beast From Hell", "imgUrl");
        cardRepository.save(card3);

        Card card4 = new Card("VenomFang", 70,60, "The Holy Snake From The Top Of Heavens", "imgUrl");
        cardRepository.save(card4);

        Card card5 = new Card("BoulderBeast", 90, 40 , "The Boulder Crasher That Throws Mountains", "imgUrl");
        cardRepository.save(card5);

        Card card6 = new Card("GaleWing", 55, 75,  "The Storm God", "imgUrl");
        cardRepository.save(card6);

        Card card7 = new Card("LavaLurker", 80, 50, "The Chicky Lurker", "imgUrl");
        cardRepository.save(card7);

        Card card8 = new Card("ShowClaw", 65,65 , "The Whiskers Of Doom", "imgUrl");
        cardRepository.save(card8);

        Card card9 = new Card("ThunderHoof", 85, 45 , "Zeus Thunderus Creation", "imgUrl");
        cardRepository.save(card9);

        Card card10 = new Card("AquaShell", 60,70, "The Mermaid's Nutcracker", "imgUrl");
        cardRepository.save(card10);

        Card card11 = new Card("IronHide", 70,60 , "The King's Bouncer", "imgUrl");
        cardRepository.save(card11);

        Card card12 = new Card("EmberWing", 95,35, "The Phoenix Of Cleansing", "imgUrl");
        cardRepository.save(card12);

        Card card13 = new Card("NightShade", 50 , 80 , "The Man Sized Bat", "imgUrl");
        cardRepository.save(card13);

        Card card14 = new Card("MagmaClaw", 80 , 50 , "Born In The Bottom Of The Volcanoes", "imgUrl");
        cardRepository.save(card14);

        Card card15 = new Card("ThornSpike", 65, 65, "Don't Get Fooled Of His Cutenes", "imgUrl");
        cardRepository.save(card15);

        Card card16 = new Card("FrostClaw", 75, 65 , "The Polar Bear Monster Born In Ice", "imgUrl");
        cardRepository.save(card16);

        Card card17 = new Card("VenomSpike", 55, 75 , "The Cloud Slither", "imgUrl");
        cardRepository.save(card17);

        Card card18 = new Card("RockHide", 90,40, "The Rock Hiding Fox", "imgUrl");
        cardRepository.save(card18);

        Card card19 = new Card("CycloneBeak", 70,40 , "Wind Breaker Of The Ages", "imgUrl");
        cardRepository.save(card19);

        Card card20 = new Card("InfernoFang", 85, 45 , "The Abomination Of Earth's Crater", "imgUrl");
        cardRepository.save(card20);

        Card card21 = new Card("GloomWing", 60, 70 , "Worst Hades Creation", "imgUrl");
        cardRepository.save(card21);

        Card card22 = new Card("StormShell", 75, 55 , "The Floating Turtle", "imgUrl");
        cardRepository.save(card22);

        Card card23 = new Card("AcidClaw", 65,65 , "The Little Beetle", "imgUrl");
        cardRepository.save(card23);

        Card card24 = new Card("ThunderClaw", 80, 50 , "White Tiger Of Thunders", "imgUrl");
        cardRepository.save(card24);

        Card card25 = new Card("RazorFin", 50, 60 , "The WarLock Of The Sea", "imgUrl");
        cardRepository.save(card25);

        Card card26 = new Card("QuakeBeast", 95, 35 , "The Earth Shaker", "imgUrl");
        cardRepository.save(card26);

        Card card27 = new Card("SolarFlare", 70,60, "Solar Forged Orca", "imgUrl");
        cardRepository.save(card27);

        Card card28 = new Card("FrostSpike", 75, 55 , "The Valhalla's Myth", "imgUrl");
        cardRepository.save(card28);

        Card card29 = new Card("VenomScale", 55,75 , "Lord Of Toxic Reptiles", "imgUrl");
        cardRepository.save(card29);

        Card card30 = new Card("StoneHide", 40, 90, "The Rock Defence Of Mountains", "imgUrl");
        cardRepository.save(card30);

        Card card31 = new Card("ZephyrWraith", 60 , 75 , "Human Like Wraith", "imgUrl");
        cardRepository.save(card31);

        Card card32 = new Card("LavaSpire", 85, 45, "Living Tower Containing Entrance To Hell", "imgUrl");
        cardRepository.save(card32);

        Card card33 = new Card("StarDust", 65,65 , "The Perfectly Balanced Creation", "imgUrl");
        cardRepository.save(card33);

        Card card34 = new Card("AcidFang",80,50 ,"The Non Electric Eel", "imgUrl" );
        cardRepository.save(card34);

        Card card35 = new Card("NightStalker", 50, 80 , "The Demon Lord", "imgUrl");
        cardRepository.save(card35);

        Card card36 = new Card("EmberClaw", 75, 55 , "The Fire Bender", "imgUrl");
        cardRepository.save(card36);

        Card card37 = new Card("FrostThorn", 60, 70 , "The Queen Of Ice", "imgUrl");
        cardRepository.save(card37);

        Card card38 = new Card("ThornScale", 70, 60 , "The Mountain and Sea Hybrid", "imgUrl");
        cardRepository.save(card38);

        Card card39 = new Card("QuickSilver", 95,35, "The Snow Mountain Myth", "imgUrl");
        cardRepository.save(card39);

        Card card40 = new Card("StormClaw", 85,45 , "The Lost Messenger", "imgUrl");
        cardRepository.save(card40);

        Card card41 = new Card("QuackWing", 130, 130 , "Don't Try To Mess With It", "imgUrl");
        cardRepository.save(card41);

        Card card42 = new Card("BoulderHide", 90 , 40 , "The Guardian Of The Gates of Valhalla", "imgUrl");
        cardRepository.save(card42);

        Card card43 = new Card("ShadowSpine", 70 , 60 , "The Undying Knight", "imgUrl");
        cardRepository.save(card43);

        Card card44 = new Card("SeaNightmare", 75,55 , "Poseidon's Mistake", "imgUrl");
        cardRepository.save(card44);

        Card card45 = new Card("ThunderPeak", 80 , 50 , "The Gate Keeper Of the Thunder Gods", "imgUrl");
        cardRepository.save(card45);

        Card card46 = new Card("RazorBack", 65, 65 , "The Last Dinosaur", "imgUrl");
        cardRepository.save(card46);

        Card card47 = new Card("SolarWing", 60, 70 , "Solar Eclipse Creation", "imgUrl");
        cardRepository.save(card47);

        Card card48 = new Card("LavaThorn", 85, 45 , "The Lava Ant Eater", "imgUrl");
        cardRepository.save(card48);

        Card card49 = new Card("VortexClaw", 90,40 , "The Vortex Annihilator", "imgUrl");
        cardRepository.save(card49);

        Card card50 = new Card("VenomSpike", 75,55 , "It Might Pop On You", "imgUrl");
        cardRepository.save(card50);
    }



}
