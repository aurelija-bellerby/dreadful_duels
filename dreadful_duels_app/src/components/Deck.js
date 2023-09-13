function Deck({handlePlayCard}) {

    const playCard = ()=>{
        handlePlayCard()
    }

    return (
        <button onClick={playCard}><img className="w-2/3 rounded-lg pt-24 pl-10" src="https://i.postimg.cc/gjncM9G0/back-Ground-Card-Finale.png" alt="dreadful duels deck"></img></button>
    );
  }

  export default Deck;
