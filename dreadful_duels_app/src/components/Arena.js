import Card from "./Card";

function Arena({playerSelection, computerSelection, handleWinner, roundCounter, deck}){

    const handleDuel = ()=>{

        if(playerSelection != null && computerSelection != null) {
            const playerHealth = playerSelection.defence - computerSelection.attack
            const computerHealth = computerSelection.defence - playerSelection.attack

            if (playerHealth > computerHealth) {
                handleWinner(playerSelection)
            } else if (computerHealth > playerHealth) {
                handleWinner(computerSelection)
            } else {
                handleWinner(null)
            }
        }
    }

        return(
         <div>
            {deck ?<div>Round: {roundCounter + 1}</div>: null}
            {computerSelection ? <Card card={computerSelection}></Card> : null}
            {playerSelection ? <Card card={playerSelection}></Card> : null}
            {playerSelection ?<button onClick={handleDuel}>Start Duel</button>: null}
         </div>
        );
    }

export default Arena;