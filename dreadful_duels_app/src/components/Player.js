function Player({score, name}){

     return(
        <div id="player" className="w-96 relative leading-normal">
            <img src="https://i.postimg.cc/1RwNnQzV/finalplayer-Background.png" className="absolute w-96 rotate-180"/>
            <div className="absolute top-8 left-14">
                <p className="drop-shadow-[0_3px_3px_rgba(0,0,0,5)]">{name}</p>
                <p className="drop-shadow-[0_3px_3px_rgba(0,0,0,5)]">Score:{score}</p>
            </div>
        </div>
)}
export default Player;