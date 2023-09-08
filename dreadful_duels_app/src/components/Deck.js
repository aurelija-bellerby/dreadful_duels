import styled from "styled-components";

const StyledDeck = styled.div`
    position: relative;
`

function Deck({handlePlayCard}) {

    const playCard = ()=>{
        handlePlayCard()
    }

    return (
      <StyledDeck>
        <button onClick={playCard}><img src="https://i.postimg.cc/gjncM9G0/back-Ground-Card-Finale.png" alt="dreadful duels deck"></img></button>
      </StyledDeck>
    );
  }

  export default Deck;
