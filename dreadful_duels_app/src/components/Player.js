function Player({score, name}){
     
     const legends = ["Porko The Tamer", "Kagke The War Troll", "Aurelijon From The Cosmic Dawn", "Roberto Of The 7 Seas", "Rainer The Paladin", "Yismin From The Shadow Isles"]
     
     return<>
     <div>
        <ul>
            <li>
                Name: {name}
            </li>
            <li>
                Score:{score}
            </li>
        </ul>
     </div>
     </>
}
export default Player;