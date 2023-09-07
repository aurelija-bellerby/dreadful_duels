import Card from "./Card"
function Deck({handlePlayCard}) {

    // const deck = deck.map((card)=>{
    //     return (<Card card={card} key={card.id}></Card>);
    // })

    

    const playCard = ()=>{
        handlePlayCard()
        
    }
    

    return (
      <div>
        <a onClick={playCard}><img src="https://i.postimg.cc/gjncM9G0/back-Ground-Card-Finale.png"></img></a>
        
      </div>
    );
  }
  
  export default Deck;
  